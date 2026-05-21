package co.edu.uco.happyavocado.transversal.utilitario.excepcion;

import co.edu.uco.happyavocado.transversal.utilitario.UtilObjeto;
import co.edu.uco.happyavocado.transversal.utilitario.UtilTexto;

public final class HappyAvocadoExcepcion extends RuntimeException {

    private static final long serialVersionUID = -4242131241L;

    private final Throwable excepcionRaiz;
    private final String mensajeUsuario;
    private final String mensajeTecnico;
    // El constructor es privado para forzar el uso de los métodos de fábrica estáticos
    private HappyAvocadoExcepcion(final Throwable excepcionRaiz, final String mensajeUsuario, final String mensajeTecnico) {
        super(mensajeTecnico);
        this.excepcionRaiz = UtilObjeto.obtenerValorDefecto(excepcionRaiz, new Exception());
        this.mensajeUsuario = UtilTexto.obtenerValorDefecto(mensajeUsuario);
        this.mensajeTecnico = UtilTexto.obtenerValorDefecto(mensajeTecnico);
    }

    // Metodos estáticos para crear instancias de la excepción con diferentes niveles de detalle
    public static HappyAvocadoExcepcion crear(final String mensajeUsuario) {
        return new HappyAvocadoExcepcion(new Exception(), mensajeUsuario, mensajeUsuario);
    }

    public static HappyAvocadoExcepcion crear(final String mensajeUsuario, final String mensajeTecnico) {
        return new HappyAvocadoExcepcion(new Exception(), mensajeUsuario, mensajeTecnico);
    }

    public static HappyAvocadoExcepcion crear(final Throwable excepcionRaiz, final String mensajeUsuario, final String mensajeTecnico) {
        return new HappyAvocadoExcepcion(excepcionRaiz, mensajeUsuario, mensajeTecnico);
    }

    public Throwable getExcepcionRaiz() {
        return excepcionRaiz;
    }

    public String getMensajeUsuario() {
        return mensajeUsuario;
    }

    public String getMensajeTecnico() {
        return mensajeTecnico;
    }

}
