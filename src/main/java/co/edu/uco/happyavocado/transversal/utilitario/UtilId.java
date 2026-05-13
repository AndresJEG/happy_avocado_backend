package co.edu.uco.happyavocado.transversal.utilitario;

import co.edu.uco.happyavocado.transversal.utilitario.excepcion.HappyAvocadoExcepcion;

import java.util.UUID;

public final class UtilId {

    public static final UUID UUID_DEFECTO = new UUID(0L, 0L);

    private UtilId() { super(); }

    public static UUID obtenerValorDefecto(final UUID id) {
        return UtilObjeto.obtenerValorDefecto(id, UUID_DEFECTO);
    }

    public static boolean esIdValido(final UUID id) {
        return !UtilObjeto.esNula(id) && !id.equals(UUID_DEFECTO);
    }

    public static void validarIdValido(final UUID id, final String mensajeError) {
        if (!esIdValido(id)) {
            throw new HappyAvocadoExcepcion(mensajeError);
        }
    }

}
