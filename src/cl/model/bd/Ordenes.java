/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.bd;

import java.sql.Date;

/**
 *
 * @author Angel
 */
public class Ordenes {
    private int idOrden;
    private float total;
    private int idMesa;
    private int idReserva;
    private int idCombo;
    private String estado;
    private String formaPago;
    private Date fecha;
    private int banco;

    public Ordenes() {
    }

    public Ordenes(int idOrden) {
        this.idOrden = idOrden;
    }

   
    public Ordenes(String estado, String formaPago, Date fecha) {
        this.estado = estado;
        this.formaPago = formaPago;
        this.fecha = fecha;
    }

    public Ordenes(String estado, String formaPago, Date fecha, int banco) {
        this.estado = estado;
        this.formaPago = formaPago;
        this.fecha = fecha;
        this.banco = banco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdCombo() {
        return idCombo;
    }

    public void setIdCombo(int idCombo) {
        this.idCombo = idCombo;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

   
    
}
