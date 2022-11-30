/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.bd.sp_actualizaEmpleado;
import cl.model.bd.sp_insertaEmpleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Angel
 */
public class sp_actualizaEmpleadoDao {
    public void actalizaEmpleado(sp_actualizaEmpleado ae) throws SQLException{
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
        //Usando el autoincremento de la tabla Persona
        if(con!=null){
            cadSQL="{call  SP_ActualizaEmp (?,?,?,?,?,?,?,?,?)}";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            System.out.println("Hasta aqui vamos -1");
            pstm.setString(1,ae.getNombre());
            pstm.setString(2,ae.getApellidoP());
            pstm.setString(3,ae.getApellidoM());
            pstm.setInt(4,ae.getCargo());
            pstm.setFloat(5,ae.getSalario());
            pstm.setString(6,ae.getCurp());
            pstm.setInt(7,ae.getTiempoExp());
            pstm.setString(8,ae.getCorreo());
            pstm.setInt(9,ae.getIdEmpleado());
            System.out.println("Hasta aqui vamos -2");
            pstm.execute();
            System.out.println("Hasta aqui vamos -3");
            con.close();
            pstm.close();
        }
    }
}
