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
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class ProductosDao {
   Productos producto,producto2,producto3;
    public ArrayList<Productos>listCategoria (int id) throws SQLException {
       ArrayList<Productos> prod=new ArrayList();
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
if(con!=null){
            cadSQL="SELECT DISTINCT categoria FROM tblProductos;";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            //pstm.setString(1,semestre);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                 producto=new Productos(rs.getString(1));
                 prod.add(producto);
            }
            rs.close();
            con.close();
            pstm.close();
}
        return prod;
    }
    public ArrayList<Productos>listNombre (String categoria) throws SQLException {
       ArrayList<Productos> prod2=new ArrayList();
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
if(con!=null){
            cadSQL="SELECT nombre FROM tblProductos WHERE categoria=?;";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            pstm.setString(1,categoria);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                 producto2=new Productos(rs.getString(1));
                 prod2.add(producto2);
            }
            rs.close();
            con.close();
            pstm.close();
}
        return prod2;
    }
public ArrayList<Productos>listId (String nombre) throws SQLException {
       ArrayList<Productos> prod3=new ArrayList();
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
if(con!=null){
            cadSQL="SELECT IdProductos FROM tblProductos WHERE nombre=?;";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            pstm.setString(1,nombre);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                 producto3=new Productos(rs.getInt(1));
                 prod3.add(producto3);
            }
            rs.close();
            con.close();
            pstm.close();
}
        return prod3;
    }

public int maxProductos(int idProducto){
        int max = 0;
        
        try {
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("SELECT dbo.FT_MAX(?)");
            pe.setInt(1, idProducto);
            ResultSet re = pe.executeQuery();
            
            if(re.next()){
                max = re.getInt(1);
            }
            re.close();
            pe.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return max;
    }
}

