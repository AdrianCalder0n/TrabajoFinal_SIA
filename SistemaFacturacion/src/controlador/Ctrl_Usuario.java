/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexion.Conexion;
import modelo.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author ADRIAN
 */
public class Ctrl_Usuario {

    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        if (cn != null) {
            String sql = "SELECT usuario, password FROM MAE_USUARIO WHERE usuario = '" + objeto.getUsuario() + "' AND password = '" + objeto.getPassword() + "';";
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    respuesta = true;
                }

            } catch (SQLException e) {
                System.out.println("Error al iniciar sesión");
                JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
            } finally {
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión");
                }
            }
        } else {
            System.out.println("No se pudo establecer la conexión a la base de datos");
        }

        return respuesta;
    }

}
