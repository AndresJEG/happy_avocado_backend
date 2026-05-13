package co.edu.uco.happyavocado.datos.dao;

import co.edu.uco.happyavocado.datos.*;
import co.edu.uco.happyavocado.entidad.AbonoArbolAguacateEntidad;
import co.edu.uco.happyavocado.entidad.SintomaPlagaEntidad;

import java.util.UUID;

public interface SintomaPlagaDAO extends
        ConsultarPorIdDAO<SintomaPlagaEntidad, UUID>,
        ConsultarTodosDAO<SintomaPlagaEntidad>,
        ConsultarPorFiltroDAO<SintomaPlagaEntidad>,
        CrearDAO<SintomaPlagaEntidad>,
        ActualizarDAO<SintomaPlagaEntidad> {
}
