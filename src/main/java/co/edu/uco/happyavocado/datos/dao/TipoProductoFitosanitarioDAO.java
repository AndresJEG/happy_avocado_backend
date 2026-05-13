package co.edu.uco.happyavocado.datos.dao;

import co.edu.uco.happyavocado.datos.ConsultarPorFiltroDAO;
import co.edu.uco.happyavocado.datos.ConsultarPorIdDAO;
import co.edu.uco.happyavocado.datos.ConsultarTodosDAO;
import co.edu.uco.happyavocado.entidad.AbonoArbolAguacateEntidad;
import co.edu.uco.happyavocado.entidad.TipoProductoFitosanitarioEntidad;

import java.util.UUID;

public interface TipoProductoFitosanitarioDAO extends ConsultarPorIdDAO<TipoProductoFitosanitarioEntidad, UUID>, ConsultarTodosDAO<TipoProductoFitosanitarioEntidad>,
        ConsultarPorFiltroDAO<TipoProductoFitosanitarioEntidad> {
}