/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.bd.Ordenes;
import cl.model.bd.Pedido;
import cl.model.bd.sp_actualizaEmpleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class PedidoDao {
    Pedido ped;
    public void borraPedido(Pedido p) throws SQLException{
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        con=new Conexion().getCon();
        if(con!=null){
            cadSQL="DELETE FROM tblPedido WHERE tblProducto_idProducto=? and tblOrden_idOrden=?;";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            pstm.setInt(1,p.getProducto_idProducto());
            pstm.setInt(2,p.getOrden_idOrden());
            pstm.execute();
            con.close();
            pstm.close();
        }
    }
    public ArrayList<Pedido>muestraNombre (int orden) throws SQLException {
       ArrayList<Pedido> ped2=new ArrayList();
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
if(con!=null){
           cadSQL="select pr.nombre from tblPedido as p inner join tblProductos as pr on p.tblProducto_idProducto=pr.idProductos where tblOrden_idOrden=?;";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            pstm.setInt(1,orden);
            //pstm.setInt(2,producto);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                ped=new Pedido(rs.getString(1));
                 ped2.add(ped);
            }
            rs.close();
            con.close();
            pstm.close();
}
        return ped2;
    }
     public ArrayList<Pedido>muestraPedido (String nombre) throws SQLException {
       ArrayList<Pedido> ped2=new ArrayList();
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
if(con!=null){
           cadSQL="select p.tblProducto_idProducto,p.cantidad,p.estado from tblPedido as p inner join tblProductos as pr on p.tblProducto_idProducto=pr.idProductos where pr.nombre=?;";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            pstm.setString(1,nombre);
            //pstm.setInt(2,producto);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                ped=new Pedido(rs.getInt(1),rs.getInt(2),rs.getString(3));
                 ped2.add(ped);
            }
            rs.close();
            con.close();
            pstm.close();
}
        return ped2;
    }
     public void actualizaEstado(Pedido pe) throws SQLException{
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
        //Usando el autoincremento de la tabla Persona
        if(con!=null){
            cadSQL="update tblPedido set estado='Listo' where tblProducto_idProducto=? and tblOrden_idOrden=?;";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            System.out.println("Hasta aqui vamos -1");
            pstm.setInt(1,pe.getProducto_idProducto());
            pstm.setInt(2,pe.getOrden_idOrden());
            System.out.println("Hasta aqui vamos -2");
            pstm.execute();
            System.out.println("Hasta aqui vamos -3");
            con.close();
            pstm.close();
        }
    }
}
