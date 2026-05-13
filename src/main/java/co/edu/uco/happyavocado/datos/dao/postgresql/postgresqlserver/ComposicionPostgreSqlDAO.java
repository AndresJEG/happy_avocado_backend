package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.ComposicionDAO;
import co.edu.uco.happyavocado.entidad.ComposicionEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class ComposicionPostgreSqlDAO implements ComposicionDAO {
    private final Connection conexion;
    public ComposicionPostgreSqlDAO(final Connection conexion) { this.conexion = conexion; }

    @Override public void crear(final ComposicionEntidad entidad) {}
    @Override public void actualizar(final ComposicionEntidad entidad) {}
    @Override public void eliminar(final ComposicionEntidad entidad) {}
    @Override public List<ComposicionEntidad> consultarPorFiltro(ComposicionEntidad entidad) { return new ArrayList<>(); }
    @Override
    public ComposicionEntidad consultarPorId(UUID uuid) {
        return null;
    }
    @Override
    public List<ComposicionEntidad> consultarTodos() {
        return List.of();
    }
}