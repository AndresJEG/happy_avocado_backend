package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.PodaArbolAguacateDAO;
import co.edu.uco.happyavocado.entidad.PodaArbolAguacateEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class PodaArbolAguacatePostgreSqlDAO implements PodaArbolAguacateDAO {
    private final Connection conexion;
    public PodaArbolAguacatePostgreSqlDAO(final Connection conexion) { this.conexion = conexion; }

    @Override public void crear(final PodaArbolAguacateEntidad entidad) {}
    @Override public void actualizar(final PodaArbolAguacateEntidad entidad) {}
    @Override public void eliminar(final PodaArbolAguacateEntidad entidad) {}
    @Override public List<PodaArbolAguacateEntidad> consultarPorFiltro(PodaArbolAguacateEntidad entidad) { return new ArrayList<>(); }

    @Override
    public PodaArbolAguacateEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<PodaArbolAguacateEntidad> consultarTodos() {
        return List.of();
    }
}