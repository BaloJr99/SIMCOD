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
public class Cargo {
    private int idCargo;
    private String cargo;

    public Cargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public Cargo(String cargo) {
        this.cargo = cargo;
    }

    
    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
