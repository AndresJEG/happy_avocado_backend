package co.edu.uco.happyavocado.transversal.utilitario;

public class UtilTexto {

    public static final String VACIO = "";

    private UtilTexto() {
        super();
    }

    public static boolean esNula(final String texto) {
        return UtilObjeto.esNula(texto);
    }

    public static String obtenerValorDefecto(final String texto, final String valorDefecto) {
        return UtilObjeto.obtenerValorDefecto(texto, valorDefecto);
    }

    public static String obtenerValorDefecto(final String texto) {
        return obtenerValorDefecto(texto, VACIO);
    }

    public static String aplicarTrim(final String texto) {
        return obtenerValorDefecto(texto, "".trim());

    }
    public static String colapsarEspaciosInternos(final String texto) {
        return aplicarTrim(texto).replaceAll("\\s+", " ");
    }
}