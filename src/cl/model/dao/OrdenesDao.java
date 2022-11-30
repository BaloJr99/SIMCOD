/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.bd.Ordenes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class OrdenesDao {
    Ordenes ord;
     public ArrayList<Ordenes>muestraId (int cantidad) throws SQLException {
       ArrayList<Ordenes> ord2=new ArrayList();
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
if(con!=null){
           cadSQL="select MAX(idOrden) from tblOrdenes";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            //pstm.setInt(1,cantidad);
            //pstm.setInt(2,producto);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                ord=new Ordenes(rs.getInt(1));
                 ord2.add(ord);
            }
            rs.close();
            con.close();
            pstm.close();
}
        return ord2;
    }
     
     public ArrayList<Ordenes>muestraIdOrden (int cantidad) throws SQLException {
       ArrayList<Ordenes> ord2=new ArrayList();
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
if(con!=null){
           cadSQL="SELECT idOrden FROM tblOrdenes where fecha=CONVERT(DATE,GETDATE())";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            //pstm.setInt(1,cantidad);
            //pstm.setInt(2,producto);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                ord=new Ordenes(rs.getInt(1));
                 ord2.add(ord);
            }
            rs.close();
            con.close();
            pstm.close();
}
        return ord2;
    }
   
     
    
}
