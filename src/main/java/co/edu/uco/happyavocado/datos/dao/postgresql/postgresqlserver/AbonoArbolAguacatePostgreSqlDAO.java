package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.AbonoArbolAguacateDAO;
import co.edu.uco.happyavocado.datos.dao.postgresql.PostgreSQLDAO;
import co.edu.uco.happyavocado.entidad.AbonoArbolAguacateEntidad;
import co.edu.uco.happyavocado.entidad.AbonoEntidad;
import co.edu.uco.happyavocado.entidad.ArbolAguacateEntidad;
import co.edu.uco.happyavocado.entidad.UnidadEntidad;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;
import co.edu.uco.happyavocado.transversal.utilitario.excepcion.HappyAvocadoExcepcion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public class AbonoArbolAguacatePostgreSqlDAO extends PostgreSQLDAO implements AbonoArbolAguacateDAO {

    public AbonoArbolAguacatePostgreSqlDAO(Connection conexion) {
        super(conexion);
    }

    @Override
    public void eliminar(AbonoArbolAguacateEntidad entidad) {

        UtilObjeto.validarNoNulo(entidad, "No se puede eliminar porque la entidad recibida es nula.");
        UtilId.validarIdValido(entidad.getId(), "La entidad no tiene un ID válido para poder ser eliminada.");

        String sql = "DELETE FROM abono_arbol_aguacate WHERE id = ?";

        try (PreparedStatement sentencia = getConexion().prepareStatement(sql)) {

            sentencia.setObject(1, entidad.getId());
            int filasAfectadas = sentencia.executeUpdate();

            if (filasAfectadas == 0) {
                throw new HappyAvocadoExcepcion("No se encontró el registro con ID: " + entidad.getId());
            }

        } catch (SQLException e) {
            throw new HappyAvocadoExcepcion("Error al intentar eliminar el abono de aguacate en la base de datos", e);
        }
    }

    @Override
    public void crear(AbonoArbolAguacateEntidad entidad) {
        UtilObjeto.validarNoNulo(entidad, "No se puede crear  porque la entidad recibida es nula.");
        UtilId.validarIdValido(entidad.getId(), "La entidad debe tener un ID válido para ser creada.");

        String sql = "INSERT INTO abono_arbol_aguacate (id, id_arbol, id_abono, fecha_abono, cantidad, id_unidad) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement sentencia = getConexion().prepareStatement(sql)) {

            UUID idArbol = !UtilObjeto.esNula(entidad.getArbolAguacate()) ? entidad.getArbolAguacate().getId() : null;
            UUID idAbono = !UtilObjeto.esNula(entidad.getAbono()) ? entidad.getAbono().getId() : null;
            UUID idUnidad = !UtilObjeto.esNula(entidad.getUnidad()) ? entidad.getUnidad().getId() : null;

            sentencia.setObject(1, entidad.getId());
            sentencia.setObject(2, idArbol);
            sentencia.setObject(3, idAbono);
            sentencia.setDate(4, java.sql.Date.valueOf(entidad.getFechaAbono()));
            sentencia.setFloat(5, entidad.getCantidad());
            sentencia.setObject(6, idUnidad);

            sentencia.executeUpdate();

        } catch (SQLException e) {
            throw new HappyAvocadoExcepcion("Error al intentar insertar un nuevo registro", e);
        }
    }
    @Override
    public AbonoArbolAguacateEntidad consultarPorId(UUID uuid) {
        UtilId.validarIdValido(uuid, "El id no concuerda con la estructura del tipo de dato.");

        String sql = "SELECT id, id_arbol, id_abono, fecha_abono, cantidad, id_unidad FROM abono_arbol_aguacate WHERE id = ?";

        try (PreparedStatement sentencia = getConexion().prepareStatement(sql)) {
            sentencia.setObject(1, uuid);

            try (ResultSet rs = sentencia.executeQuery()) {
                if (rs.next()) {
                     return construirEntidadDesdeRS(rs);
                } else {
                    throw new HappyAvocadoExcepcion("No se encontró el abono con ID: " + uuid);
                }
            }
        } catch (SQLException e) {
            throw new HappyAvocadoExcepcion("Error técnico al consultar en PostgreSQL", e);
        }
    }

    @Override
    public void actualizar(AbonoArbolAguacateEntidad entidad) {
        UtilObjeto.validarNoNulo(entidad, "No se puede actualizar una entidad nula.");

        String sql = "UPDATE abono_arbol_aguacate SET id_arbol = ?, id_abono = ?, fecha_abono = ?, cantidad = ?, id_unidad = ? WHERE id = ?";

        try (PreparedStatement sentencia = getConexion().prepareStatement(sql)) {

            UUID idArbol = !UtilObjeto.esNula(entidad.getArbolAguacate()) ? entidad.getArbolAguacate().getId() : null;
            UUID idAbono = !UtilObjeto.esNula(entidad.getAbono()) ? entidad.getAbono().getId() : null;
            UUID idUnidad = !UtilObjeto.esNula(entidad.getUnidad()) ? entidad.getUnidad().getId() : null;

            sentencia.setObject(1, idArbol);
            sentencia.setObject(2, idAbono);
            sentencia.setDate(3, java.sql.Date.valueOf(entidad.getFechaAbono()));
            sentencia.setFloat(4, entidad.getCantidad());
            sentencia.setObject(5, idUnidad);
            sentencia.setObject(6, entidad.getId());

            int filasAfectadas = sentencia.executeUpdate();

            if (filasAfectadas == 0) {
                throw new HappyAvocadoExcepcion("No se encontró el registro para actualizar con el ID: " + entidad.getId());
            }

        } catch (SQLException e) {
            throw new HappyAvocadoExcepcion("Error técnico al intentar actualizar en PostgreSQL", e);
        }
    }

    @Override
    public List<AbonoArbolAguacateEntidad> consultarPorFiltro(AbonoArbolAguacateEntidad filtro) {
        List<AbonoArbolAguacateEntidad> listaResultados = new ArrayList<>();

        StringBuilder sql = new StringBuilder("SELECT id, id_arbol, id_abono, fecha_abono, cantidad, id_unidad FROM abono_arbol_aguacate WHERE 1=1");
        List<Object> parametros = new ArrayList<>();

        if (!UtilObjeto.esNula(filtro)) {

            if (!UtilObjeto.esNula(filtro.getArbolAguacate()) && UtilId.esIdValido(filtro.getArbolAguacate().getId())) {
                sql.append(" AND id_arbol = ?");
                parametros.add(filtro.getArbolAguacate().getId());
            }

            if (!UtilObjeto.esNula(filtro.getFechaAbono())) {
                sql.append(" AND fecha_abono = ?");
                parametros.add(java.sql.Date.valueOf(filtro.getFechaAbono()));
            }

            if (!UtilObjeto.esNula(filtro.getAbono()) && UtilId.esIdValido(filtro.getAbono().getId())) {
                sql.append(" AND id_abono = ?");
                parametros.add(filtro.getAbono().getId());
            }

            if (filtro.getCantidad() > 0) {
                sql.append(" AND cantidad = ?");
                parametros.add(filtro.getCantidad());
            }

            if (!UtilObjeto.esNula(filtro.getUnidad()) && UtilId.esIdValido(filtro.getUnidad().getId())) {
                sql.append(" AND id_unidad = ?");
                parametros.add(filtro.getUnidad().getId());
            }
        }


        sql.append(" ORDER BY id_arbol ASC, fecha_abono DESC, id_abono ASC");

        try (PreparedStatement sentencia = getConexion().prepareStatement(sql.toString())) {

            for (int i = 0; i < parametros.size(); i++) {
                sentencia.setObject(i + 1, parametros.get(i));
            }

            try (ResultSet rs = sentencia.executeQuery()) {
                while (rs.next()) {
                    listaResultados.add(construirEntidadDesdeRS(rs));
                }
            }
        } catch (SQLException e) {
            throw new HappyAvocadoExcepcion("Error al ejecutar filtro dinámico en la base de datos", e);
        }

        return listaResultados;
    }

    @Override
    public List<AbonoArbolAguacateEntidad> consultarTodos() {

        List<AbonoArbolAguacateEntidad> listaResultados = new ArrayList<>();

        String sql = "SELECT id, id_arbol, id_abono, fecha_abono, cantidad, id_unidad FROM abono_arbol_aguacate ORDER BY id_arbol ASC, fecha_abono DESC, id_abono ASC";


        try (PreparedStatement sentencia = getConexion().prepareStatement(sql);
             ResultSet rs = sentencia.executeQuery()) {

            while (rs.next()) {
                listaResultados.add(construirEntidadDesdeRS(rs));
            }

        } catch (SQLException e) {
            throw new HappyAvocadoExcepcion("Error al intentar obtener todos los registros de abonos", e);
        }

        return listaResultados;
    }

    private AbonoArbolAguacateEntidad construirEntidadDesdeRS(ResultSet rs) throws SQLException {
        return new AbonoArbolAguacateEntidad.Builder()
                .id(rs.getObject("id", UUID.class))
                .fechaAbono(rs.getDate("fecha_abono") != null ? rs.getDate("fecha_abono").toLocalDate() : null)
                .cantidad(rs.getFloat("cantidad"))

                .abono(
                        new AbonoEntidad.Builder()
                                .id(rs.getObject("id_abono", UUID.class))
                                .build()
                )
                .arbolAguacate(
                        new ArbolAguacateEntidad.Builder()
                                .id(rs.getObject("id_arbol", UUID.class)) // Asegúrate de que este nombre coincida con tu base de datos
                                .build()
                )
                .unidad(
                        new UnidadEntidad.Builder()
                                .id(rs.getObject("id_unidad", UUID.class))
                                .build()
                )
                .build();
    }
}