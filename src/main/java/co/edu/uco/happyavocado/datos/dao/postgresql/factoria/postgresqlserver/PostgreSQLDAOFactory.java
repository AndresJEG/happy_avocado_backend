package co.edu.uco.happyavocado.datos.dao.postgresql.factoria.postgresqlserver;

import co.edu.uco.happyavocado.datos.dao.AbonoArbolAguacateDAO;
import co.edu.uco.happyavocado.datos.dao.AbonoDAO;
import co.edu.uco.happyavocado.datos.dao.postgresql.factoria.DAOFactory;
import co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver.AbonoArbolAguacatePostgreSqlDAO;
import co.edu.uco.happyavocado.datos.dao.postgresql.postgresqlserver.AbonoPostgreSqlDAO;
import co.edu.uco.happyavocado.transversal.utilitario.excepcion.HappyAvocadoExcepcion;

import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLDAOFactory extends DAOFactory {

    public PostgreSQLDAOFactory() {
        abrirConexion();
    }

    @Override
    protected void abrirConexion() {
        try {
            // Nota: En un proyecto real, estos datos se leen de un archivo properties
            String url = "jdbc:postgresql://localhost:5432/happyavocado_db";
            String usuario = "postgres";
            String clave = "tu_contraseña";

            // Llenamos la variable 'conexion' que heredamos de DAOFactory
            this.conexion = DriverManager.getConnection(url, usuario, clave);
        } catch (SQLException e) {
            throw new HappyAvocadoExcepcion("Error técnico al intentar abrir la conexión con PostgreSQL", e);
        }
    }

    @Override
    public void cerrarConexion() {
        try {
            if (this.conexion != null && !this.conexion.isClosed()) {
                this.conexion.close();
            }
        } catch (SQLException e) {
            throw new HappyAvocadoExcepcion("Error al intentar cerrar la conexión", e);
        }
    }

    @Override
    public void iniciarTransaccion() {
        try {
            if (this.conexion != null) {
                this.conexion.setAutoCommit(false);
            }
        } catch (SQLException e) {
            throw new HappyAvocadoExcepcion("Error al intentar iniciar la transacción", e);
        }
    }

    @Override
    public void confirmarTransaccion() {
        try {
            if (this.conexion != null) {
                this.conexion.commit();
                this.conexion.setAutoCommit(true);
            }
        } catch (SQLException e) {
            throw new HappyAvocadoExcepcion("Error al intentar confirmar (commit) la transacción", e);
        }
    }

    @Override
    public void cancelarTransaccion() {
        try {
            if (this.conexion != null) {
                this.conexion.rollback();
                this.conexion.setAutoCommit(true);
            }
        } catch (SQLException e) {
            throw new HappyAvocadoExcepcion("Error al intentar cancelar (rollback) la transacción", e);
        }
    }

    @Override
    public AbonoArbolAguacateDAO getAbonoArbolAguacateDAO() {
        // Aquí conectamos con tu código maestro:
        // Creamos tu DAO y le inyectamos la conexión que ya abrimos
        return new AbonoArbolAguacatePostgreSqlDAO(this.conexion);
    }

    @Override
    public AbonoDAO getAbonoDAO() {
        return new AbonoPostgreSqlDAO(this.conexion);
    }
}