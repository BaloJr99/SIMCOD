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
public class sp_actualizaEmpleado {
    private String nombre,apellidoP,apellidoM;
    private int cargo;
    private float salario;
    private String curp;
    private int tiempoExp;
    private String correo;
    private int idEmpleado;

    public sp_actualizaEmpleado(String nombre, String apellidoP, String apellidoM, int cargo, float salario, String curp, int tiempoExp, String correo, int idEmpleado) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.cargo = cargo;
        this.salario = salario;
        this.curp = curp;
        this.tiempoExp = tiempoExp;
        this.correo = correo;
        this.idEmpleado = idEmpleado;
    }

    
    
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public int getTiempoExp() {
        return tiempoExp;
    }

    public void setTiempoExp(int tiempoExp) {
        this.tiempoExp = tiempoExp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
