package co.edu.uco.happyavocado.datos.dao;

import co.edu.uco.happyavocado.datos.ConsultarPorFiltroDAO;
import co.edu.uco.happyavocado.datos.ConsultarPorIdDAO;
import co.edu.uco.happyavocado.datos.ConsultarTodosDAO;
import co.edu.uco.happyavocado.entidad.AbonoArbolAguacateEntidad;
import co.edu.uco.happyavocado.entidad.ToxicidadEntidad;

import java.util.UUID;

public interface ToxicidadDAO extends ConsultarPorIdDAO<ToxicidadEntidad, UUID>, ConsultarTodosDAO<ToxicidadEntidad>,
        ConsultarPorFiltroDAO<ToxicidadEntidad> {
}