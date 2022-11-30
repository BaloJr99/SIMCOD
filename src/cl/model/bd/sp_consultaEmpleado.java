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
public class sp_consultaEmpleado {
    //private int idEmpleado;
    private String nombre,apellidoP,apellidoM;
    private String cargo;
    private String salario;
    private String curp;
    private String tiempoExp;
    private String correo;

    public sp_consultaEmpleado(String nombre, String apellidoP, String apellidoM, String cargo, String salario, String curp, String tiempoExp, String correo) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.cargo = cargo;
        this.salario = salario;
        this.curp = curp;
        this.tiempoExp = tiempoExp;
        this.correo = correo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getTiempoExp() {
        return tiempoExp;
    }

    public void setTiempoExp(String tiempoExp) {
        this.tiempoExp = tiempoExp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    
}
