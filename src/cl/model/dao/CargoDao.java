/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.bd.Cargo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class CargoDao {
     Cargo ca;
     public ArrayList<Cargo>consultaId (String cargo) throws SQLException {
       ArrayList<Cargo> ca2=new ArrayList();
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
if(con!=null){
           cadSQL="select idCargo from tblCargo where cargo=?";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            pstm.setString(1,cargo);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                ca=new Cargo(rs.getInt(1));
                 ca2.add(ca);
            }
            rs.close();
            con.close();
            pstm.close();
}
        return ca2;
    }
     public ArrayList<Cargo>consultaCargo (int id) throws SQLException {
       ArrayList<Cargo> ca2=new ArrayList();
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
if(con!=null){
           cadSQL="select cargo from tblCargo where idCargo=?";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            pstm.setInt(1,id);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                ca=new Cargo(rs.getString(1));
                 ca2.add(ca);
            }
            rs.close();
            con.close();
            pstm.close();
}
        return ca2;
    }
}
