/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.bd.sp_insertaPedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Angel
 */
public class sp_insertaPedidoDao {
    public void insertaPedido(sp_insertaPedido ip) throws SQLException{
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
        //Usando el autoincremento de la tabla Persona
        if(con!=null){
            cadSQL="{call sp_insertaPedido (?,?,?)}";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            System.out.println("Hasta aqui vamos -1");
            pstm.setInt(1,ip.getCantidad());
            pstm.setInt(2,ip.getIdProducto());
            pstm.setInt(3,ip.getIdOrden());
            System.out.println("Hasta aqui vamos -2");
            pstm.execute();
            System.out.println("Hasta aqui vamos -3");
            con.close();
            pstm.close();
        }
    }
}
