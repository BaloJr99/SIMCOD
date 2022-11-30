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
public class TelefonoEmp {
    private String telefono;
    private int id;

    public TelefonoEmp(String telefono, int id) {
        this.telefono = telefono;
        this.id = id;
    }

    public TelefonoEmp(String telefono) {
        this.telefono = telefono;
    }
    

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
