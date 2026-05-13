package co.edu.uco.happyavocado.datos.dao;

import co.edu.uco.happyavocado.datos.ActualizarDAO;
import co.edu.uco.happyavocado.datos.ConsultarPorFiltroDAO;
import co.edu.uco.happyavocado.datos.ConsultarPorIdDAO;
import co.edu.uco.happyavocado.datos.ConsultarTodosDAO;
import co.edu.uco.happyavocado.entidad.AbonoArbolAguacateEntidad;
import co.edu.uco.happyavocado.entidad.SintomaEntidad;

import java.util.UUID;

public interface SintomaDAO extends
        ConsultarPorIdDAO<SintomaEntidad, UUID>,
        ConsultarTodosDAO<SintomaEntidad>,
        ConsultarPorFiltroDAO<SintomaEntidad>,
        ActualizarDAO<SintomaEntidad> {
}