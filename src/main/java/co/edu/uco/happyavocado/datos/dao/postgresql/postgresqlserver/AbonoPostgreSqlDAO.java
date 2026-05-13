package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.AbonoDAO;
import co.edu.uco.happyavocado.datos.dao.postgresql.PostgreSQLDAO;
import co.edu.uco.happyavocado.entidad.*;
import co.edu.uco.happyavocado.transversal.utilitario.UtilId;
import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;
import co.edu.uco.happyavocado.transversal.utilitario.UtilTexto;
import co.edu.uco.happyavocado.transversal.utilitario.excepcion.HappyAvocadoExcepcion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public class AbonoPostgreSqlDAO extends PostgreSQLDAO implements AbonoDAO {

    public AbonoPostgreSqlDAO(Connection conexion) { super(conexion); }

    @Override
    public void crear(AbonoEntidad entidad) {
        UtilObjeto.validarNoNulo(entidad, "No se puede crear  porque la entidad recibida es nula.");
        UtilId.validarIdValido(entidad.getId(), "La entidad debe tener un ID válido para ser creada.");

        String sql = "INSERT INTO abono_arbol_aguacate (id, nombre, es_organico, toxicidad, descripcion, metodo_aplicacion) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement sentencia = getConexion().prepareStatement(sql)) {

            UUID idToxicidad = !UtilObjeto.esNula(entidad.getToxicidad()) ? entidad.getToxicidad().getId() : null;
            UUID idMetodoAplicacion = !UtilObjeto.esNula(entidad.getMetodoAplicacion()) ? entidad.getMetodoAplicacion().getId() : null;

            sentencia.setObject(1, entidad.getId());
            sentencia.setString(2, entidad.getNombre());
            sentencia.setBoolean(3, entidad.EsOrganico());
            sentencia.setObject(4, idToxicidad);
            sentencia.setString(5, entidad.getDescripcion());
            sentencia.setObject(6, idMetodoAplicacion);

            sentencia.executeUpdate();

        } catch (SQLException e) {
            throw new HappyAvocadoExcepcion("Error al intentar insertar un nuevo registro", e);
        }
    }

    @Override
    public void actualizar(AbonoEntidad entidad) {
        UtilObjeto.validarNoNulo(entidad, "No se puede actualizar una entidad nula.");

        String sql = "UPDATE abono_arbol_aguacate SET nombre = ?, es_organico = ?, toxicidad = ?, descripcion = ?, metodo_aplicacion = ? WHERE id = ?";

        try (PreparedStatement sentencia = getConexion().prepareStatement(sql)) {

            UUID idToxicidad = !UtilObjeto.esNula(entidad.getToxicidad()) ? entidad.getToxicidad().getId() : null;
            UUID idMetodoAplicacion = !UtilObjeto.esNula(entidad.getMetodoAplicacion()) ? entidad.getMetodoAplicacion().getId() : null;

            sentencia.setString(1, entidad.getNombre());
            sentencia.setBoolean(2, entidad.EsOrganico());
            sentencia.setObject(3, idToxicidad);
            sentencia.setString(4, entidad.getDescripcion());
            sentencia.setObject(5, idMetodoAplicacion);
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
    public List<AbonoEntidad> consultarPorFiltro(AbonoEntidad filtro) {
        List<AbonoEntidad> listaResultados = new ArrayList<>();

        StringBuilder sql = new StringBuilder("SELECT id, nombre, es_organico, toxicidad, descripcion, metodo_aplicacion FROM abono WHERE 1=1");
        List<Object> parametros = new ArrayList<>();

        if (!UtilObjeto.esNula(filtro)) {

            if (!UtilTexto.esNula(filtro.getNombre())) {
                sql.append(" AND nombre ILIKE = ?");
                parametros.add("%" + filtro.getNombre() + "%" );
            }

            if (!UtilObjeto.esNula(filtro.EsOrganico())) {
                sql.append(" AND es_organico = ?");
                parametros.add(filtro.EsOrganico());
            }

            if (!UtilObjeto.esNula(filtro.getToxicidad()) && UtilId.esIdValido(filtro.getToxicidad().getId())) {
                sql.append(" AND toxicidad = ?");
                parametros.add(filtro.getToxicidad().getId());
            }

            if (!UtilTexto.esNula(filtro.getDescripcion())) {
                sql.append(" AND descripcion ILIKE = ?");
                parametros.add("%" + filtro.getDescripcion() + "%");
            }

            if (!UtilObjeto.esNula(filtro.getMetodoAplicacion()) && UtilId.esIdValido(filtro.getMetodoAplicacion().getId())) {
                sql.append(" AND metodo_aplicacion = ?");
                parametros.add(filtro.getMetodoAplicacion().getId());
            }
        }


        sql.append(" ORDER BY nombre ASC, toxicidad ASC, metodo_aplicacion ASC");

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
    public AbonoEntidad consultarPorId(UUID uuid) {
        UtilId.validarIdValido(uuid, "El id no concuerda con la estructura del tipo de dato.");

        String sql = "SELECT id, nombre, es_organico, toxicidad, descripcion, metodo_aplicacion FROM abono WHERE id = ?";

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
    public List<AbonoEntidad> consultarTodos() {

        List<AbonoEntidad> listaResultados = new ArrayList<>();

        String sql = "SELECT id, nombre, es_organico, toxicidad, descripcion, metodo_aplicacion FROM abono ORDER BY nombre ASC, toxicidad ASC, metodo_aplicacion ASC";


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

    private AbonoEntidad construirEntidadDesdeRS(ResultSet rs) throws SQLException {
        return new AbonoEntidad.Builder()
                .id(rs.getObject("id", UUID.class))
                .nombre(rs.getString("nombre"))
                .esOrganico(rs.getBoolean("es_organico"))

                .toxicidad(
                        new ToxicidadEntidad.Builder()
                                .id(rs.getObject("id_toxicidad", UUID.class))
                                .build()
                )
                .descripcion(rs.getString("descripcion"))
                .metodoAplicacion(
                        new MetodoAplicacionEntidad.Builder()
                                .id(rs.getObject("metodo_aplicacion", UUID.class))
                                .build()
                )
                .build();
    }
}