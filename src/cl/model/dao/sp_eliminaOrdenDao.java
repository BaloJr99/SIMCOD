/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.bd.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Angel
 */
public class sp_eliminaOrdenDao {
    public void elimina(int producto,int orden) throws SQLException{
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
if(con!=null){
            cadSQL="{call sp_eliminaPedido(?,?)}";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            pstm.setInt(1,producto);
            pstm.setInt(2, orden);
            pstm.execute();
            con.close();
            pstm.close();
        }
}
    }

