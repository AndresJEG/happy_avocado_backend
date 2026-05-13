package co.edu.uco.happyavocado.datos.dao.postgresql;

import co.edu.uco.happyavocado.transversal.utilitario.excepcion.HappyAvocadoExcepcion;

import java.sql.Connection;

public abstract class PostgreSQLDAO {
    private Connection conexion;

    protected PostgreSQLDAO(Connection conexion) {
        super();
        if (conexion == null) {
            throw new HappyAvocadoExcepcion("No se puede inicializar el DAO de PostgreSQL: La conexión recibida es nula.");
        }
        this.conexion = conexion;
    }

    protected Connection getConexion() {
        return conexion;
    }
}
