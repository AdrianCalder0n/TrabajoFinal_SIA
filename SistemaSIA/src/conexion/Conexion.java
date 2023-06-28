package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author ADRIAN
 */
public class Conexion {

    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_sistema_facturacion", "root", "Soldadito12");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexión" + e);
        }
        return null;
    }
}
