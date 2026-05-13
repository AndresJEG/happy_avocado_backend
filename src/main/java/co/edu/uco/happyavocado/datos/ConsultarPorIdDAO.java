package co.edu.uco.happyavocado.datos;

import java.util.List;
import java.util.Optional;

public interface ConsultarPorIdDAO<E, ID> {
    E  consultarPorId(ID id);
}
