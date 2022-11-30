/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.bd.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ClientesDao {
        public void insertaClientes(Clientes cliente) throws SQLException{
       Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        con = new Conexion().getCon();
        try {
             cadSQL="insert into tblClientes(nombre,apellidoP,apellidoM,telefono) values(?,?,?,?);";
             pstm=(PreparedStatement)con.prepareStatement(cadSQL);
             pstm.setString(1,cliente.getNombre());
             pstm.setString(2,cliente.getApellidoP());
             pstm.setString(3,cliente.getApellidoM());
             pstm.setString(4,cliente.getTelefono());
             pstm.execute();
             con.close();
            pstm.close();
    }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}
    
        public void editaClientes(Clientes cliente) throws SQLException{
       Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        con = new Conexion().getCon();
        try {
             cadSQL="UPDATE tblClientes SET nombre=?, apellidoP=?, apellidoM=?, telefono=? WHERE idCliente=?;";
             pstm=(PreparedStatement)con.prepareStatement(cadSQL);
             System.out.println("Hasta aqui vamos -1");
             pstm.setString(1,cliente.getNombre());
             pstm.setString(2,cliente.getApellidoP());
             pstm.setString(3,cliente.getApellidoM());
             pstm.setString(4,cliente.getTelefono());
             pstm.setInt(5,cliente.getIdCliente());
             System.out.println("Hasta aqui vamos -2");
             pstm.execute();
             System.out.println("Hasta aqui vamos -3");
             con.close();
            pstm.close();
    }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}
}
