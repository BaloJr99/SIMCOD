package cl.model.bd;

import java.sql.Date;

public class Ingredientes {
    private String ingrediente, presentacion, marca, unidad;
    private Date fechaVencimiento;
    private int existencia, idProveedor;
    int cantidad;
    String medida;

    public Ingredientes(String ingrediente, int cantidad, String medida) {
        this.ingrediente = ingrediente;
        this.cantidad = cantidad;
        this.medida = medida;
    }

    public Ingredientes(String ingrediente, String presentacion, String marca, String unidad, Date fechaVencimiento, int existencia, int idProveedor) {
        this.ingrediente = ingrediente;
        this.presentacion = presentacion;
        this.marca = marca;
        this.unidad = unidad;
        this.fechaVencimiento = fechaVencimiento;
        this.existencia = existencia;
        this.idProveedor = idProveedor;
    }
 public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }
    
    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    
    
}
