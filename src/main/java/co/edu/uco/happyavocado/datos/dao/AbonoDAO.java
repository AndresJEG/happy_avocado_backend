package co.edu.uco.happyavocado.datos.dao;

import co.edu.uco.happyavocado.datos.*;
import co.edu.uco.happyavocado.entidad.AbonoArbolAguacateEntidad;
import co.edu.uco.happyavocado.entidad.AbonoEntidad;

import java.util.UUID;

public interface AbonoDAO extends
        ConsultarPorIdDAO<AbonoEntidad, UUID>,
        ConsultarTodosDAO<AbonoEntidad>,
        ConsultarPorFiltroDAO<AbonoEntidad>,
        CrearDAO<AbonoEntidad>,
        ActualizarDAO<AbonoEntidad> {
}