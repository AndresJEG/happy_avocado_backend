package co.edu.uco.happyavocado.datos.dao.postgresql.factoria;

import co.edu.uco.happyavocado.datos.dao.AbonoArbolAguacateDAO;
import co.edu.uco.happyavocado.datos.dao.AbonoDAO;
import co.edu.uco.happyavocado.datos.dao.postgresql.factoria.postgresqlserver.PostgreSQLDAOFactory;
import co.edu.uco.happyavocado.transversal.utilitario.excepcion.HappyAvocadoExcepcion;
import java.sql.Connection;

public abstract class DAOFactory {

    // Conexión protegida para que las fábricas concretas puedan inicializarla y usarla
    protected Connection conexion;

    // Centralizamos qué base de datos usa todo el sistema
    private static TipoFactoriaEnum FACTORIA_ACTUAL = TipoFactoriaEnum.POSTGRESQL;

    public static DAOFactory getFactory() {
        switch (FACTORIA_ACTUAL) {
            case POSTGRESQL: {
                return new PostgreSQLDAOFactory();
            }
            case SQLSERVER: {
                // return new SQLServerDAOFactory();
                throw new HappyAvocadoExcepcion("La fábrica de SQL Server aún no está implementada.");
            }
            default :
                throw new HappyAvocadoExcepcion("Fábrica de datos no soportada o inexistente.");
        }
    }

    protected abstract void abrirConexion();
    public abstract void cerrarConexion();
    public abstract void iniciarTransaccion();
    public abstract void confirmarTransaccion();
    public abstract void cancelarTransaccion();

    // Métodos para entregar los DAOs (Reemplazamos PaisDAO por tu AbonoArbolAguacateDAO)
    public abstract AbonoArbolAguacateDAO getAbonoArbolAguacateDAO();

    public abstract AbonoDAO getAbonoDAO();

    // Si tuvieras otros DAOs, los listarías aquí:
    // public abstract ArbolAguacateDAO getArbolAguacateDAO();
}