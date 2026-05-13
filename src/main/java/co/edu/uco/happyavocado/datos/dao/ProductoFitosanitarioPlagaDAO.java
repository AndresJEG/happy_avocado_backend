package co.edu.uco.happyavocado.datos.dao;

import co.edu.uco.happyavocado.datos.*;
import co.edu.uco.happyavocado.entidad.AbonoArbolAguacateEntidad;
import co.edu.uco.happyavocado.entidad.ProductoFitosanitarioPlagaEntidad;

import java.util.UUID;

public interface ProductoFitosanitarioPlagaDAO extends
        ConsultarPorIdDAO<ProductoFitosanitarioPlagaEntidad, UUID>,
        ConsultarTodosDAO<ProductoFitosanitarioPlagaEntidad>,
        ConsultarPorFiltroDAO<ProductoFitosanitarioPlagaEntidad>,
        CrearDAO<ProductoFitosanitarioPlagaEntidad>,
        ActualizarDAO<ProductoFitosanitarioPlagaEntidad>,
        EliminarDAO<ProductoFitosanitarioPlagaEntidad> {
}
