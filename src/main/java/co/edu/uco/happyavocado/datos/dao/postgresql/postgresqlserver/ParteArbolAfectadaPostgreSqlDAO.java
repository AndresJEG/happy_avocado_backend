package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.ParteArbolAfectadaDAO;
import co.edu.uco.happyavocado.entidad.ParteArbolAfectadaEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class ParteArbolAfectadaPostgreSqlDAO implements ParteArbolAfectadaDAO {

    private final Connection conexion;

    public ParteArbolAfectadaPostgreSqlDAO(final Connection conexion) {
        this.conexion = conexion;
    }


    @Override
    public List<ParteArbolAfectadaEntidad> consultarPorFiltro(final ParteArbolAfectadaEntidad entidad) {
        return new ArrayList<>();
    }

    @Override
    public ParteArbolAfectadaEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<ParteArbolAfectadaEntidad> consultarTodos() {
        return List.of();
    }
}