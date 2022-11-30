/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.bd.DireccionEmp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class DireccionEmpDao {
    DireccionEmp de;
     public ArrayList<DireccionEmp>consultaDatos (int id) throws SQLException {
       ArrayList<DireccionEmp> de2=new ArrayList();
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
if(con!=null){
           cadSQL="select calle,numero,colonia,codPost,ciudad from tblDireccionEmpleado where idEmpleado=?;";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            pstm.setInt(1,id);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                de=new DireccionEmp(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4),rs.getString(5));
                 de2.add(de);
            }
            rs.close();
            con.close();
            pstm.close();
}
        return de2;
    }
     public void insertaDireccionEm(DireccionEmp dir) throws SQLException{
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        con=new Conexion().getCon();
        if(con!=null){
            cadSQL="INSERT INTO tblDireccionEmpleado(calle,numero,colonia,codPost,ciudad,idEmpleado)VALUES(?,?,?,?,?,?);";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            System.out.println("Hasta aqui vamos -1");
            pstm.setString(1, dir.getCalle());
            pstm.setInt(2, dir.getNumero());
            pstm.setString(3, dir.getColonia());
            pstm.setString(4, dir.getCp());
            pstm.setString(5, dir.getCiudad());
            pstm.setInt(6, dir.getIdEmplado());
            System.out.println("Hasta aqui vamos -2");
            pstm.execute();
            System.out.println("Hasta aqui vamos -3");
            con.close();
            pstm.close();
        }
    }
}
