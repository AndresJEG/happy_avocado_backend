package co.edu.uco.happyavocado.datos.dao;

import co.edu.uco.happyavocado.datos.*;
import co.edu.uco.happyavocado.entidad.AbonoArbolAguacateEntidad;

import java.util.UUID;

public interface AbonoArbolAguacateDAO extends
        ConsultarPorIdDAO<AbonoArbolAguacateEntidad, UUID>,
        ConsultarTodosDAO<AbonoArbolAguacateEntidad>,
        ConsultarPorFiltroDAO<AbonoArbolAguacateEntidad>,
        CrearDAO<AbonoArbolAguacateEntidad>,
        ActualizarDAO<AbonoArbolAguacateEntidad>,
        EliminarDAO<AbonoArbolAguacateEntidad> {
}