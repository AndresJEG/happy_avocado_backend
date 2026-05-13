package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.RegistroCosechaDAO;
import co.edu.uco.happyavocado.entidad.RegistroCosechaEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class RegistroCosechaPostgreSqlDAO implements RegistroCosechaDAO {
    private final Connection conexion;
    public RegistroCosechaPostgreSqlDAO(final Connection conexion) { this.conexion = conexion; }

    @Override public void crear(final RegistroCosechaEntidad entidad) {}
    @Override public void actualizar(final RegistroCosechaEntidad entidad) {}
    @Override public void eliminar(final RegistroCosechaEntidad entidad) {}
    @Override public List<RegistroCosechaEntidad> consultarPorFiltro(RegistroCosechaEntidad entidad) { return new ArrayList<>(); }

    @Override
    public RegistroCosechaEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<RegistroCosechaEntidad> consultarTodos() {
        return List.of();
    }
}