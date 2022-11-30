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
public class Mesas {
    private int idMesas;
    private int idSucursal;
    private int capacidad;
    private String estado;

    public Mesas(int idMesas, String estado) {
        this.idMesas = idMesas;
        this.estado = estado;
    }

    public Mesas(int idMesas) {
        this.idMesas = idMesas;
    }

    public Mesas(String estado) {
        this.estado = estado;
    }
    

    public int getIdMesas() {
        return idMesas;
    }

    public void setIdMesas(int idMesas) {
        this.idMesas = idMesas;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
