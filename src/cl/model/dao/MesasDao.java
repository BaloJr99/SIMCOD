/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.bd.Mesas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MesasDao {
    public void editar(Mesas mes) throws SQLException{
       Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        con = new Conexion().getCon();
        try {
             cadSQL="UPDATE tblMesas SET estado=? WHERE idMesas=?;";
             pstm=(PreparedStatement)con.prepareStatement(cadSQL);
             pstm.setString(1,mes.getEstado());
             pstm.setInt(2,mes.getIdMesas());
             pstm.execute();
             con.close();
            pstm.close();
        }catch(SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }
    
    
    public void actualizaEstado(Mesas mes) throws SQLException{
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
        //Usando el autoincremento de la tabla Persona
        if(con!=null){
            cadSQL="update tblMesas set estado='Ocupado' where idMesas=?;";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            System.out.println("Hasta aqui vamos -1");
            pstm.setInt(1,mes.getIdMesas());
            System.out.println("Hasta aqui vamos -2");
            pstm.execute();
            System.out.println("Hasta aqui vamos -3");
            con.close();
            pstm.close();
        }
    }
}
