package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.VentaFacturacion;
import modelo.DetalleFacturacion;

/**
 * @author Adrian
 */
public class Ctrl_RegistrarVenta {
    
    public static int idVentaFacturacion;
    java.math.BigDecimal iDColVar;

    public boolean guardar(VentaFacturacion objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into TRS_VENTA_FACTURACION values(?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            consulta.setInt(1, 0);//id
            consulta.setInt(2, objeto.getIdCliente());
            consulta.setDouble(3, objeto.getValorPagar());
            consulta.setString(4, objeto.getFechaVenta());
            consulta.setInt(5, objeto.getEstado());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            ResultSet rs = consulta.getGeneratedKeys();
            while(rs.next()){
                iDColVar = rs.getBigDecimal(1);
                idVentaFacturacion = iDColVar.intValue();
            }
            
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar factura de facturación: " + e);
        }
        return respuesta;
    }
    
    public boolean guardarDetalle(DetalleFacturacion objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into TRS_DETALLE_FACTURACION values(?,?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setInt(2, idVentaFacturacion);
            consulta.setInt(3, objeto.getIdProducto());
            consulta.setInt(4, objeto.getCantidad());
            consulta.setDouble(5, objeto.getPrecioUnitario());
            consulta.setDouble(6, objeto.getSubTotal());
            consulta.setDouble(7, objeto.getDescuento());
            consulta.setDouble(8, objeto.getIGV());
            consulta.setDouble(9, objeto.getTotalPagar());
            consulta.setInt(10, objeto.getEstado());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar detalle de facturacion: " + e);
        }
        return respuesta;
    }
    
    
         /**
     * **************************************************
     * metodo para actualizar un producto
     * **************************************************
     * @param objeto
     * @param idVentaFacturacion
     */
    public boolean actualizar(VentaFacturacion objeto, int idVentaFacturacion) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "update TRS_VENTA_FACTURACION set idCliente = ?, estado = ? "
                            + "where idVentaFacturacion ='" + idVentaFacturacion + "'");
            consulta.setInt(1, objeto.getIdCliente());
            consulta.setInt(2, objeto.getEstado());
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar factura: " + e);
        }
        return respuesta;
    }
}
