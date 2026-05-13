package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.PlagaArbolAguacateDAO;
import co.edu.uco.happyavocado.entidad.PlagaArbolAguacateEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class PlagaArbolAguacatePostgreSqlDAO implements PlagaArbolAguacateDAO {
    private final Connection conexion;
    public PlagaArbolAguacatePostgreSqlDAO(final Connection conexion) { this.conexion = conexion; }

    @Override public void crear(final PlagaArbolAguacateEntidad entidad) {}
    @Override public void actualizar(final PlagaArbolAguacateEntidad entidad) {}
    @Override public void eliminar(final PlagaArbolAguacateEntidad entidad) {}
    @Override public List<PlagaArbolAguacateEntidad> consultarPorFiltro(PlagaArbolAguacateEntidad entidad) { return new ArrayList<>(); }

    @Override
    public PlagaArbolAguacateEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<PlagaArbolAguacateEntidad> consultarTodos() {
        return List.of();
    }
}