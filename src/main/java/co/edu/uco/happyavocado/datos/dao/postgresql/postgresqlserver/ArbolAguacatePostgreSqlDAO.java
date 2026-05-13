package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.ArbolAguacateDAO;
import co.edu.uco.happyavocado.entidad.ArbolAguacateEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class ArbolAguacatePostgreSqlDAO implements ArbolAguacateDAO {

    private final Connection conexion;

    public ArbolAguacatePostgreSqlDAO(final Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public void crear(final ArbolAguacateEntidad entidad) {
        // Aquí irá el INSERT INTO arbol_aguacate...
    }

    @Override
    public void actualizar(final ArbolAguacateEntidad entidad) {
        // Aquí irá el UPDATE arbol_aguacate...
    }


    @Override
    public List<ArbolAguacateEntidad> consultarPorFiltro(final ArbolAguacateEntidad entidad) {
        // Aquí irá el SELECT con filtros dinámicos
        return new ArrayList<>();
    }

    @Override
    public ArbolAguacateEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<ArbolAguacateEntidad> consultarTodos() {
        return List.of();
    }
}