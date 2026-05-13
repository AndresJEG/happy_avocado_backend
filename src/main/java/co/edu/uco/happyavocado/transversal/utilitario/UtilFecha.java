package co.edu.uco.happyavocado.transversal.utilitario;

import java.time.LocalDate;

public final class UtilFecha {

    public static final LocalDate FECHA_DEFECTO = LocalDate.of(2700, 12, 31);

    private UtilFecha() { super(); }

    public static LocalDate obtenerValorDefecto(final LocalDate fecha) {
        return UtilObjeto.obtenerValorDefecto(fecha, FECHA_DEFECTO);
    }
}