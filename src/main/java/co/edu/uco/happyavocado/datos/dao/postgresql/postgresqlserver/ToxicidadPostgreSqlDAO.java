package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.ToxicidadDAO;
import co.edu.uco.happyavocado.entidad.ToxicidadEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class ToxicidadPostgreSqlDAO implements ToxicidadDAO {
    private final Connection conexion;
    public ToxicidadPostgreSqlDAO(final Connection conexion) { this.conexion = conexion; }
    @Override public List<ToxicidadEntidad> consultarPorFiltro(ToxicidadEntidad entidad) { return new ArrayList<>(); }

    @Override
    public ToxicidadEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<ToxicidadEntidad> consultarTodos() {
        return List.of();
    }
}