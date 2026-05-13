package co.edu.uco.happyavocado.transversal.utilitario;

import co.edu.uco.happyavocado.transversal.utilitario.excepcion.HappyAvocadoExcepcion;

public final class UtilObjeto {

    private UtilObjeto() {
        super();
    }

    public static <O> boolean esNula(final O objeto) {
        return objeto == null;
    }

    public static <O> O obtenerValorDefecto(final O objeto, final O valorDefecto) {
        return esNula(objeto) ? valorDefecto : objeto;
    }

    public static <O> void validarNoNulo(final O objeto, final String mensajeError) {
        if (esNula(objeto)) {
            throw new HappyAvocadoExcepcion(mensajeError);
        }
    }

}