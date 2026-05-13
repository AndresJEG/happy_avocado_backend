package co.edu.uco.happyavocado.datos.dao;

import co.edu.uco.happyavocado.datos.*;
import co.edu.uco.happyavocado.entidad.AbonoArbolAguacateEntidad;
import co.edu.uco.happyavocado.entidad.PodaArbolAguacateEntidad;

import java.util.UUID;

public interface PodaArbolAguacateDAO extends
        ConsultarPorIdDAO<PodaArbolAguacateEntidad, UUID>,
        ConsultarTodosDAO<PodaArbolAguacateEntidad>,
        ConsultarPorFiltroDAO<PodaArbolAguacateEntidad>,
        CrearDAO<PodaArbolAguacateEntidad>,
        ActualizarDAO<PodaArbolAguacateEntidad>,
        EliminarDAO<PodaArbolAguacateEntidad> {
}
