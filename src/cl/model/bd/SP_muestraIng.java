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
public class SP_muestraIng {
    private String idIngrediente;
    private String ingrediente;
    private String existencia;
    private String cantidad;
    private String cantxprod;
    private String cantNecesaria;
    private String idProducto;
    private String descripion;

    public SP_muestraIng(String idIngrediente, String ingrediente, String existencia, String cantidad, String cantxprod, String cantNecesaria, String idProducto, String descripion) {
        this.idIngrediente = idIngrediente;
        this.ingrediente = ingrediente;
        this.existencia = existencia;
        this.cantidad = cantidad;
        this.cantxprod = cantxprod;
        this.cantNecesaria = cantNecesaria;
        this.idProducto = idProducto;
        this.descripion = descripion;
    }

    
    public String getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(String idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getExistencia() {
        return existencia;
    }

    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCantxprod() {
        return cantxprod;
    }

    public void setCantxprod(String cantxprod) {
        this.cantxprod = cantxprod;
    }

    public String getCantNecesaria() {
        return cantNecesaria;
    }

    public void setCantNecesaria(String cantNecesaria) {
        this.cantNecesaria = cantNecesaria;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

       
}
