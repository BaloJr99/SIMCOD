/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.bd.sp_insertaOrden;
import cl.model.bd.sp_insertaPedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Angel
 */
public class sp_insertaOrdenDao {
      public void insertaOrden(sp_insertaOrden io) throws SQLException{
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
        //Usando el autoincremento de la tabla Persona
        if(con!=null){
            cadSQL="{call sp_insertaOrden (?,?,?)}";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            System.out.println("Hasta aqui vamos -1");
            pstm.setInt(1,io.getIdOrden());
            pstm.setInt(2,io.getIdMesa());
            pstm.setInt(3,io.getIdReserva());
            System.out.println("Hasta aqui vamos -2");
            pstm.execute();
            System.out.println("Hasta aqui vamos -3");
            con.close();
            pstm.close();
        }
    }
}
