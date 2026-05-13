package co.edu.uco.happyavocado.datos.dao;

import co.edu.uco.happyavocado.datos.*;
import co.edu.uco.happyavocado.entidad.AbonoArbolAguacateEntidad;
import co.edu.uco.happyavocado.entidad.PlagaArbolAguacateEntidad;

import java.util.UUID;

public interface PlagaArbolAguacateDAO extends
        ConsultarPorIdDAO<PlagaArbolAguacateEntidad, UUID>,
        ConsultarTodosDAO<PlagaArbolAguacateEntidad>,
        ConsultarPorFiltroDAO<PlagaArbolAguacateEntidad>,
        CrearDAO<PlagaArbolAguacateEntidad>,
        ActualizarDAO<PlagaArbolAguacateEntidad>,
        EliminarDAO<PlagaArbolAguacateEntidad> {
}