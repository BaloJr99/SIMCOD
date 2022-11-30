/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.bd;

import java.sql.Timestamp;


/**
 *
 * @author Admin
 */
public class Reservaciones {
        private Integer idReserva,idCliente;
        private Timestamp fechaHora;

    public Reservaciones(Integer idReserva, Integer idCliente, Timestamp fechaHora) {
        this.idReserva = idReserva;
        this.idCliente = idCliente;
        this.fechaHora = fechaHora;
    }

    public Reservaciones(Integer idCliente, Timestamp fechaHora) {
        this.idCliente = idCliente;
        this.fechaHora = fechaHora;
    }
    

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Timestamp getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Timestamp fechaHora) {
        this.fechaHora = fechaHora;
    }

}
