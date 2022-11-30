/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.bd.SP_muestraIng;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class SP_muestraIngDao {
    SP_muestraIng min;
     public ArrayList<SP_muestraIng>consultaDatos (int cantidad,int producto) throws SQLException {
       ArrayList<SP_muestraIng> min2=new ArrayList();
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
if(con!=null){
           cadSQL="{call SP_MuestraIng(?,?)}";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            pstm.setInt(1,cantidad);
            pstm.setInt(2,producto);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                min=new SP_muestraIng(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),
                rs.getString(6),rs.getString(7),rs.getString(8));
                 min2.add(min);
            }
            rs.close();
            con.close();
            pstm.close();
}
        return min2;
    }
}
