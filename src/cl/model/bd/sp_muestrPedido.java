/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.bd;

/**
 *
 * @author Angel
 */
public class sp_muestrPedido {
    private String cantidad;
    private String nombre;
    private String precioU;
    private String precioT;

    public sp_muestrPedido(String cantidad, String nombre, String precioU, String precioT) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precioU = precioU;
        this.precioT = precioT;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecioU() {
        return precioU;
    }

    public void setPrecioU(String precioU) {
        this.precioU = precioU;
    }

    public String getPrecioT() {
        return precioT;
    }

    public void setPrecioT(String precioT) {
        this.precioT = precioT;
    }

    
    
}
