package modelo;

/**
 *
 * @author Adrian
 */
public class DetalleFacturacion {

    private int idDetalleFacturacion;
    private int idVentaFacturacion;
    private int idProducto;
    private String nombre;
    private int cantidad;
    private double precioUnitario;
    private double subTotal;
    private double descuento;
    private double IGV;
    private double totalPagar;
    private int estado;

    public DetalleFacturacion() {
        this.idDetalleFacturacion = 0;
        this.idVentaFacturacion = 0;
        this.idProducto = 0;
        this.nombre = "";
        this.cantidad = 0;
        this.precioUnitario = 0.0;
        this.subTotal = 0.0;
        this.descuento = 0.0;
        this.IGV = 0.0;
        this.totalPagar = 0.0;
        this.estado = 0;
    }
    
    public DetalleFacturacion(int idDetalleFacturacion, int idVentaFacturacion, int idProducto, String nombre, int cantidad, double precioUnitario, double subTotal, double descuento, double IGV, double totalPagar, int estado) {
        this.idDetalleFacturacion = idDetalleFacturacion;
        this.idVentaFacturacion = idVentaFacturacion;
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subTotal = subTotal;
        this.descuento = descuento;
        this.IGV = IGV;
        this.totalPagar = totalPagar;
        this.estado = estado;
    }


    public int getIdDetalleFacturacion() {
        return idDetalleFacturacion;
    }

    public void setIdDetalleFacturacion(int idDetalleFacturacion) {
        this.idDetalleFacturacion = idDetalleFacturacion;
    }

    public int getIdVentaFacturacion() {
        return idVentaFacturacion;
    }

    public void setIdVentaFacturacion(int idVentaFacturacion) {
        this.idVentaFacturacion = idVentaFacturacion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIGV() {
        return IGV;
    }

    public void setIGV(double IGV) {
        this.IGV = IGV;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
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
        return "DetalleFactura{" + "idDetalleFacturacion=" + idDetalleFacturacion + ", idVentaFacturacion=" + idVentaFacturacion + ", idProducto=" + idProducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", subTotal=" + subTotal + ", descuento=" + descuento + ", IGV=" + IGV + ", totalPagar=" + totalPagar + ", estado=" + estado + '}';
    }
    

}
