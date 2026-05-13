package co.edu.uco.happyavocado.transversal.utilitario.excepcion;

public class HappyAvocadoExcepcion extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public HappyAvocadoExcepcion(String mensajeTecnico) {
        super(mensajeTecnico);
    }

    public HappyAvocadoExcepcion(String mensajeTecnico, Throwable excepcionRaiz) {
        super(mensajeTecnico, excepcionRaiz);
    }
}
