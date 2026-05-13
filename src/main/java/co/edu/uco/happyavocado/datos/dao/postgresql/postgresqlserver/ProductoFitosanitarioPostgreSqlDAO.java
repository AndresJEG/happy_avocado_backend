package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.ProductoFitosanitarioDAO;
import co.edu.uco.happyavocado.entidad.ProductoFitosanitarioEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class ProductoFitosanitarioPostgreSqlDAO implements ProductoFitosanitarioDAO {
    private final Connection conexion;
    public ProductoFitosanitarioPostgreSqlDAO(final Connection conexion) { this.conexion = conexion; }

    @Override public void crear(final ProductoFitosanitarioEntidad entidad) {}
    @Override public void actualizar(final ProductoFitosanitarioEntidad entidad) {}
    @Override public void eliminar(final ProductoFitosanitarioEntidad entidad) {}
    @Override public List<ProductoFitosanitarioEntidad> consultarPorFiltro(ProductoFitosanitarioEntidad entidad) { return new ArrayList<>(); }

    @Override
    public ProductoFitosanitarioEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<ProductoFitosanitarioEntidad> consultarTodos() {
        return List.of();
    }
}