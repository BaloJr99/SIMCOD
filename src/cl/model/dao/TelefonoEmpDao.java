/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.bd.DireccionEmp;
import cl.model.bd.TelefonoEmp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class TelefonoEmpDao {
    TelefonoEmp te;
     public ArrayList<TelefonoEmp>consultaTel (int id) throws SQLException {
       ArrayList<TelefonoEmp> te2=new ArrayList();
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
if(con!=null){
           cadSQL="select numero from tblTelefonoEmpleado where idEmpleado=?;";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            pstm.setInt(1,id);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                te=new TelefonoEmp(rs.getString(1));
                 te2.add(te);
            }
            rs.close();
            con.close();
            pstm.close();
}
        return te2;
    }
     public void insertaTelefonoEm(TelefonoEmp tel) throws SQLException{
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        con=new Conexion().getCon();
        if(con!=null){
            cadSQL="INSERT INTO tblTelefonoEmpleado(numero,idEmpleado)VALUES(?,?);";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            System.out.println("Hasta aqui vamos -1");
            pstm.setString(1, tel.getTelefono());
            pstm.setInt(2, tel.getId());
            System.out.println("Hasta aqui vamos -2");
            pstm.execute();
            System.out.println("Hasta aqui vamos -3");
            con.close();
            pstm.close();
        }
    }
}
