package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.TipoMagnitudDAO;
import co.edu.uco.happyavocado.entidad.TipoMagnitudEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class TipoMagnitudPostgreSqlDAO implements TipoMagnitudDAO {

    private final Connection conexion;

    public TipoMagnitudPostgreSqlDAO(final Connection conexion) {
        this.conexion = conexion;
    }


    @Override
    public List<TipoMagnitudEntidad> consultarPorFiltro(final TipoMagnitudEntidad entidad) {
        return new ArrayList<>();
    }

    @Override
    public TipoMagnitudEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<TipoMagnitudEntidad> consultarTodos() {
        return List.of();
    }
}
