package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.SintomaDAO;
import co.edu.uco.happyavocado.entidad.SintomaEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class SintomaPostgreSqlDAO implements SintomaDAO {
    private final Connection conexion;
    public SintomaPostgreSqlDAO(final Connection conexion) { this.conexion = conexion; }

    @Override public void actualizar(final SintomaEntidad entidad) {}
    @Override public List<SintomaEntidad> consultarPorFiltro(SintomaEntidad entidad) { return new ArrayList<>(); }

    @Override
    public SintomaEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<SintomaEntidad> consultarTodos() {
        return List.of();
    }
}