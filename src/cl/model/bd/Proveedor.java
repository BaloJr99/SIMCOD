package cl.model.bd;

public class Proveedor {
    private int idProveedor;
    private String proveedor, nombreContacto, apellidoPContacto, apellidoMContacto, telefono, direccionWeb;

    public Proveedor(int idProveedor, String proveedor, String nombreContacto, String apellidoPContacto, String apellidoMContacto, String telefono, String direccionWeb) {
        this.idProveedor = idProveedor;
        this.proveedor = proveedor;
        this.nombreContacto = nombreContacto;
        this.apellidoPContacto = apellidoPContacto;
        this.apellidoMContacto = apellidoMContacto;
        this.telefono = telefono;
        this.direccionWeb = direccionWeb;
    }

    public Proveedor(String proveedor, String nombreContacto, String apellidoPContacto, String apellidoMContacto, String telefono, String direccionWeb) {
        this.proveedor = proveedor;
        this.nombreContacto = nombreContacto;
        this.apellidoPContacto = apellidoPContacto;
        this.apellidoMContacto = apellidoMContacto;
        this.telefono = telefono;
        this.direccionWeb = direccionWeb;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getApellidoPContacto() {
        return apellidoPContacto;
    }

    public void setApellidoPContacto(String apellidoPContacto) {
        this.apellidoPContacto = apellidoPContacto;
    }

    public String getApellidoMContacto() {
        return apellidoMContacto;
    }

    public void setApellidoMContacto(String apellidoMContacto) {
        this.apellidoMContacto = apellidoMContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccionWeb() {
        return direccionWeb;
    }

    public void setDireccionWeb(String direccionWeb) {
        this.direccionWeb = direccionWeb;
    }
    
    
}
