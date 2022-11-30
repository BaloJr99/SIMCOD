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
public class sp_insertaOrden {
    private int idOrden;
    private int idMesa;
    private int idReserva;

    public sp_insertaOrden(int idOrden, int idMesa, int idReserva) {
        this.idOrden = idOrden;
        this.idMesa = idMesa;
        this.idReserva = idReserva;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
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
    
    
}
