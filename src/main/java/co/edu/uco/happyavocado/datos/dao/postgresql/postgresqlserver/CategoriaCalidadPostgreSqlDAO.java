package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.CategoriaCalidadDAO;
import co.edu.uco.happyavocado.entidad.CategoriaCalidadEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class CategoriaCalidadPostgreSqlDAO implements CategoriaCalidadDAO {

    private final Connection conexion;

    public CategoriaCalidadPostgreSqlDAO(final Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<CategoriaCalidadEntidad> consultarPorFiltro(final CategoriaCalidadEntidad entidad) {
        return new ArrayList<>();
    }

    @Override
    public CategoriaCalidadEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<CategoriaCalidadEntidad> consultarTodos() {
        return List.of();
    }
}