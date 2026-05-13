package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.PlagaDAO;
import co.edu.uco.happyavocado.entidad.PlagaEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class PlagaPostgreSqlDAO implements PlagaDAO {

    private final Connection conexion;

    public PlagaPostgreSqlDAO(final Connection conexion) {
        this.conexion = conexion;
    }


    @Override
    public List<PlagaEntidad> consultarPorFiltro(final PlagaEntidad entidad) {
        return new ArrayList<>();
    }

    @Override
    public PlagaEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<PlagaEntidad> consultarTodos() {
        return List.of();
    }
}