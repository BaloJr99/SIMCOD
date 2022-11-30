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
public class sp_insertaReserva {
    
        private Integer idCliente;
        private Timestamp fechaHora;

    public sp_insertaReserva(Integer idCliente, Timestamp fechaHora) {
        this.idCliente = idCliente;
        this.fechaHora = fechaHora;
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
