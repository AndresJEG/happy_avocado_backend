package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.PodaDAO;
import co.edu.uco.happyavocado.entidad.PodaEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class PodaPostgreSqlDAO implements PodaDAO {

    private final Connection conexion;

    public PodaPostgreSqlDAO(final Connection conexion) {
        this.conexion = conexion;
    }


    @Override
    public List<PodaEntidad> consultarPorFiltro(final PodaEntidad entidad) {
        return new ArrayList<>();
    }

    @Override
    public PodaEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<PodaEntidad> consultarTodos() {
        return List.of();
    }
}