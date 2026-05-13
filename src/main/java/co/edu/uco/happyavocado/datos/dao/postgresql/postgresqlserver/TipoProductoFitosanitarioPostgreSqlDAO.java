package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.TipoProductoFitosanitarioDAO;
import co.edu.uco.happyavocado.entidad.TipoProductoFitosanitarioEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class TipoProductoFitosanitarioPostgreSqlDAO implements TipoProductoFitosanitarioDAO {

    private final Connection conexion;

    public TipoProductoFitosanitarioPostgreSqlDAO(final Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<TipoProductoFitosanitarioEntidad> consultarPorFiltro(final TipoProductoFitosanitarioEntidad entidad) {
        return new ArrayList<>();
    }

    @Override
    public TipoProductoFitosanitarioEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<TipoProductoFitosanitarioEntidad> consultarTodos() {
        return List.of();
    }
}