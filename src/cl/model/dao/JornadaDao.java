/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.bd.Jornada;
import cl.model.bd.sp_consultaEmpleado;
import cl.model.bd.sp_insertaEmpleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class JornadaDao {
     public void insertaJornada(Jornada j) throws SQLException{
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
        if(con!=null){
            cadSQL="{call sp_insertaJornada (?,?,?,?)}";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            System.out.println("Hasta aqui vamos -1");
            pstm.setString(1,j.getDia());
            pstm.setString(2,j.getHoraEntrada());
            pstm.setString(3,j.getHoraSalida());
            pstm.setInt(4,j.getIdEmpleado());
            System.out.println("Hasta aqui vamos -2");
            pstm.execute();
            System.out.println("Hasta aqui vamos -3");
            con.close();
            pstm.close();
        }
    }
     Jornada jor;
     public ArrayList<Jornada>consultaDatos (int id) throws SQLException {
       ArrayList<Jornada> jor2=new ArrayList();
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
if(con!=null){
           cadSQL="{call  sp_muestraJornada(?)}";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            pstm.setInt(1,id);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                jor=new Jornada(rs.getString(1), rs.getString(2), rs.getString(3));
                jor2.add(jor);
            }
            rs.close();
            con.close();
            pstm.close();
}
        return jor2;
    }
     public void eliminaJornada(Jornada j) throws SQLException{
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        con=new Conexion().getCon();
        if(con!=null){
            cadSQL="DELETE FROM tblRegistroJornadaTrabajo WHERE idEmpleado=?;";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            pstm.setInt(1,j.getIdEmpleado());
            pstm.execute();
            con.close();
            pstm.close();
        }
    }
}
