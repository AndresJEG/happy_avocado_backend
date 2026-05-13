package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.SintomaPlagaDAO;
import co.edu.uco.happyavocado.entidad.SintomaPlagaEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class SintomaPlagaPostgreSqlDAO implements SintomaPlagaDAO {
    private final Connection conexion;
    public SintomaPlagaPostgreSqlDAO(final Connection conexion) { this.conexion = conexion; }

    @Override public void crear(final SintomaPlagaEntidad entidad) {}
    @Override public void actualizar(final SintomaPlagaEntidad entidad) {}
    @Override public List<SintomaPlagaEntidad> consultarPorFiltro(SintomaPlagaEntidad entidad) { return new ArrayList<>(); }

    @Override
    public SintomaPlagaEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<SintomaPlagaEntidad> consultarTodos() {
        return List.of();
    }
}