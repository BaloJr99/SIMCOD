/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.bd.SP_muestraIng;
import cl.model.bd.sp_muestrPedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class sp_muestraPedidoDao {
    sp_muestrPedido mpe;
     public ArrayList<sp_muestrPedido>consultaDatos (int orden) throws SQLException {
       ArrayList<sp_muestrPedido> mpe2=new ArrayList();
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
if(con!=null){
           cadSQL="{call SP_MuestraPed(?)}";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            pstm.setInt(1,orden);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                mpe=new sp_muestrPedido(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                 mpe2.add(mpe);
            }
            rs.close();
            con.close();
            pstm.close();
}
        return mpe2;
    }
}
