package co.edu.uco.happyavocado.datos.dao;

import co.edu.uco.happyavocado.datos.*;
import co.edu.uco.happyavocado.entidad.AbonoArbolAguacateEntidad;
import co.edu.uco.happyavocado.entidad.ProductoFitosanitarioEntidad;

import java.util.UUID;

public interface ProductoFitosanitarioDAO extends
        ConsultarPorIdDAO<ProductoFitosanitarioEntidad, UUID>,
        ConsultarTodosDAO<ProductoFitosanitarioEntidad>,
        ConsultarPorFiltroDAO<ProductoFitosanitarioEntidad>,
        CrearDAO<ProductoFitosanitarioEntidad>,
        ActualizarDAO<ProductoFitosanitarioEntidad>,
        EliminarDAO<ProductoFitosanitarioEntidad> {
}
