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
public class Pedido {
    private int idPedido;
    private int cantidad;
    private int producto_idProducto;
    private int orden_idOrden;
    private String nombre;
    private String estado;

    public Pedido( int producto_idProducto,int cantidad, String estado) {
        this.producto_idProducto = producto_idProducto;
        this.cantidad = cantidad;
        this.estado = estado;
    }
    
    public Pedido(int producto_idProducto, int orden_idOrden) {
        this.producto_idProducto = producto_idProducto;
        this.orden_idOrden = orden_idOrden;
    }

    public Pedido(String nombre) {
        this.nombre = nombre;
    }

    
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
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

    public int getProducto_idProducto() {
        return producto_idProducto;
    }

    public void setProducto_idProducto(int producto_idProducto) {
        this.producto_idProducto = producto_idProducto;
    }

    public int getOrden_idOrden() {
        return orden_idOrden;
    }

    public void setOrden_idOrden(int orden_idOrden) {
        this.orden_idOrden = orden_idOrden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
