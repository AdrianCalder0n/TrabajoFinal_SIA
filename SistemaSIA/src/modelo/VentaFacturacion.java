package modelo;

/**
 *
 * @author Adrian
 */
public class VentaFacturacion {
    
    //Atributos
    private int idVentaFacturacion;
    private int idCliente;
    private double valorPagar;
    private String fechaVenta;
    private int estado;
    
    //constructor
    public VentaFacturacion(){
        this.idVentaFacturacion = 0;
        this.idCliente = 0;
        this.valorPagar = 0.0;
        this.fechaVenta = "";
        this.estado = 0;
    }
    
     //constructor sobrecargado

    public VentaFacturacion(int idVentaFacturacion, int idCliente, double valorPagar, String fechaVenta, int estado) {
        this.idVentaFacturacion = idVentaFacturacion;
        this.idCliente = idCliente;
        this.valorPagar = valorPagar;
        this.fechaVenta = fechaVenta;
        this.estado = estado;
    }
    

    public int getIdVentaFacturacion() {
        return idVentaFacturacion;
    }

    public void setIdVentaFacturacion(int idVentaFacturacion) {
        this.idVentaFacturacion = idVentaFacturacion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    //toString 

    @Override
    public String toString() {
        return "TRS_VENTA_FACTURACION{" + "idVentaFacturacion=" + idVentaFacturacion + ", idCliente=" + idCliente + ", valorPagar=" + valorPagar + ", fechaVenta=" + fechaVenta + ", estado=" + estado + '}';
    }
    
    
    
}
