package co.edu.uco.happyavocado.datos.dao;

import co.edu.uco.happyavocado.datos.*;
import co.edu.uco.happyavocado.entidad.AbonoArbolAguacateEntidad;
import co.edu.uco.happyavocado.entidad.ComposicionEntidad;

import java.util.UUID;

public interface ComposicionDAO extends
        ConsultarPorIdDAO<ComposicionEntidad, UUID>,
        ConsultarTodosDAO<ComposicionEntidad>,
        ConsultarPorFiltroDAO<ComposicionEntidad>,
        CrearDAO<ComposicionEntidad>,
        ActualizarDAO<ComposicionEntidad>,
        EliminarDAO<ComposicionEntidad> {
}