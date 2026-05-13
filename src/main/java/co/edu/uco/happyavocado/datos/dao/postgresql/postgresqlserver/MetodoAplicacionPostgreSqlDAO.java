package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.MetodoAplicacionDAO;
import co.edu.uco.happyavocado.entidad.MetodoAplicacionEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class MetodoAplicacionPostgreSqlDAO implements MetodoAplicacionDAO {

    private final Connection conexion;

    public MetodoAplicacionPostgreSqlDAO(final Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<MetodoAplicacionEntidad> consultarPorFiltro(final MetodoAplicacionEntidad entidad) {
        return new ArrayList<>();
    }

    @Override
    public MetodoAplicacionEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<MetodoAplicacionEntidad> consultarTodos() {
        return List.of();
    }
}