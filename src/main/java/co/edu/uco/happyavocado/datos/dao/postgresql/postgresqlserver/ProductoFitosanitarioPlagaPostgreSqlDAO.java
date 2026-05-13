package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.ProductoFitosanitarioPlagaDAO;
import co.edu.uco.happyavocado.entidad.ProductoFitosanitarioPlagaEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class ProductoFitosanitarioPlagaPostgreSqlDAO implements ProductoFitosanitarioPlagaDAO {
    private final Connection conexion;
    public ProductoFitosanitarioPlagaPostgreSqlDAO(final Connection conexion) { this.conexion = conexion; }

    @Override public void crear(final ProductoFitosanitarioPlagaEntidad entidad) {}
    @Override public void actualizar(final ProductoFitosanitarioPlagaEntidad entidad) {}
    @Override public void eliminar(final ProductoFitosanitarioPlagaEntidad entidad) {}
    @Override public List<ProductoFitosanitarioPlagaEntidad> consultarPorFiltro(ProductoFitosanitarioPlagaEntidad entidad) { return new ArrayList<>(); }

    @Override
    public ProductoFitosanitarioPlagaEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<ProductoFitosanitarioPlagaEntidad> consultarTodos() {
        return List.of();
    }
}