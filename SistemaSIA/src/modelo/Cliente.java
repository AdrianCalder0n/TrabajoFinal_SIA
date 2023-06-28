package modelo;

/**
 *
 * @author Adrian
 */
public class Cliente {

    private int idCliente;
    private String nombre;
    private String apellido;
    private String DNI;
    private String telefono;
    private String direccion;
    private int estado;

    public Cliente() {
        this.idCliente = 0;
        this.nombre = "";
        this.apellido = "";
        this.DNI = "";
        this.telefono = "";
        this.direccion = "";
        this.estado = 0;
    }

    public Cliente(int idCliente, String nombre, String apellido, String DNI, String telefono, String direccion, int estado) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
