package co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.ElementoQuimicoDAO;
import co.edu.uco.happyavocado.entidad.ElementoQuimicoEntidad;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

public final class ElementoQuimicoPostgreSqlDAO implements ElementoQuimicoDAO {

    private final Connection conexion;

    public ElementoQuimicoPostgreSqlDAO(final Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<ElementoQuimicoEntidad> consultarPorFiltro(final ElementoQuimicoEntidad entidad) {
        return new ArrayList<>();
    }

    @Override
    public ElementoQuimicoEntidad consultarPorId(UUID uuid) {
        return null;
    }

    @Override
    public List<ElementoQuimicoEntidad> consultarTodos() {
        return List.of();
    }
}