package co.edu.uco.happyavocado.datos.dao;

import co.edu.uco.happyavocado.datos.*;
import co.edu.uco.happyavocado.entidad.AbonoArbolAguacateEntidad;
import co.edu.uco.happyavocado.entidad.RegistroCosechaEntidad;

import java.util.UUID;

public interface RegistroCosechaDAO extends
        ConsultarPorIdDAO<RegistroCosechaEntidad, UUID>,
        ConsultarTodosDAO<RegistroCosechaEntidad>,
        ConsultarPorFiltroDAO<RegistroCosechaEntidad>,
        CrearDAO<RegistroCosechaEntidad>,
        ActualizarDAO<RegistroCosechaEntidad>,
        EliminarDAO<RegistroCosechaEntidad> {
}
