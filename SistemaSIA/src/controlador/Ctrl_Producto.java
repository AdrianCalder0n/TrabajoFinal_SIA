package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Producto;

/**
 *
 * @author Adrian
 */
public class Ctrl_Producto {

    public boolean guardar(Producto objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into MAE_PRODUCTO values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getPorcentajeIGV());
            consulta.setInt(7, objeto.getIdCategoria());
            consulta.setInt(8, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        }

        return respuesta;
    }

    public boolean existeProducto(String producto) {
        boolean respuesta = false;
        String sql = "select nombre from MAE_PRODUCTO where nombre = '" + producto + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar producto: " + e);
        }
        return respuesta;
    }
    
    public boolean actualizar(Producto objeto, int idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update MAE_PRODUCTO set nombre=?, cantidad = ?, precio = ?, descripcion= ?, porcentajeIGV = ?, idCategoria = ?, estado = ? where idProducto ='" + idProducto + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setInt(2, objeto.getCantidad());
            consulta.setDouble(3, objeto.getPrecio());
            consulta.setString(4, objeto.getDescripcion());
            consulta.setInt(5, objeto.getPorcentajeIGV());
            consulta.setInt(6, objeto.getIdCategoria());
            consulta.setInt(7, objeto.getEstado());
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto: " + e);
        }
        return respuesta;
    }
    
    public boolean eliminar(int idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from MAE_PRODUCTO where idProducto ='" + idProducto + "'");
            consulta.executeUpdate();
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar producto: " + e);
        }
        return respuesta;
    }
    
     public boolean actualizarStock(Producto object, int idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update MAE_PRODUCTO set cantidad=? where idProducto ='" + idProducto + "'");
            consulta.setInt(1, object.getCantidad());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar stock del producto: " + e);
        }
        return respuesta;
    }
}