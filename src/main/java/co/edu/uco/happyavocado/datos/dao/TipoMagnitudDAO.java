package co.edu.uco.happyavocado.datos.dao;

import co.edu.uco.happyavocado.datos.ConsultarPorFiltroDAO;
import co.edu.uco.happyavocado.datos.ConsultarPorIdDAO;
import co.edu.uco.happyavocado.datos.ConsultarTodosDAO;
import co.edu.uco.happyavocado.entidad.AbonoArbolAguacateEntidad;
import co.edu.uco.happyavocado.entidad.TipoMagnitudEntidad;

import java.util.UUID;

public interface TipoMagnitudDAO extends ConsultarPorIdDAO<TipoMagnitudEntidad, UUID>, ConsultarTodosDAO<TipoMagnitudEntidad>,
        ConsultarPorFiltroDAO<TipoMagnitudEntidad> {
}