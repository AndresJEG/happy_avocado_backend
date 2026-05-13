package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.UnidadDAO;
import co.edu.uco.happyavocado.entidad.UnidadEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class UnidadPostgreSqlDAO implements UnidadDAO {

    private final Connection conexion;

    public UnidadPostgreSqlDAO(final Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<UnidadEntidad> consultarPorFiltro(final UnidadEntidad entidad) {
        return new ArrayList<>();
    }

    @Override
    public UnidadEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<UnidadEntidad> consultarTodos() {
        return List.of();
    }
}