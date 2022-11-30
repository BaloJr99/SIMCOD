package cl.model.dao;

import cl.model.bd.Proveedor;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProveedorDao {
    public ArrayList<String> proveedor(){
        ArrayList<String> listaProveedores = new ArrayList<>();
        
        try {
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("SELECT proveedor FROM tblProveedores");
            ResultSet re = pe.executeQuery();
            while(re.next()){
                listaProveedores.add(re.getString("proveedor"));
            }
            re.close();
            pe.close();
            con.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return listaProveedores;
    }
    
    public void insertaProveedor(Proveedor prov){
        
        try {
            Connection con = new Conexion().getCon();
            CallableStatement cst = con.prepareCall("{CALL SP_INSERTA_PROV(?,?,?,?,?,?)}");
            cst.setString(1, prov.getProveedor());
            cst.setString(2, prov.getNombreContacto());
            cst.setString(3, prov.getApellidoPContacto());
            cst.setString(4, prov.getApellidoMContacto());
            cst.setString(5, prov.getTelefono());
            cst.setString(6, prov.getDireccionWeb());
            cst.execute();
            cst.close();
            con.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void modificaProveedor(Proveedor prov){
        
        try {
            Connection con = new Conexion().getCon();
            CallableStatement cst = con.prepareCall("{CALL SP_MODIFICA_PROV(?,?,?,?,?,?,?)}");
            cst.setString(1, prov.getProveedor());
            cst.setString(2, prov.getNombreContacto());
            cst.setString(3, prov.getApellidoPContacto());
            cst.setString(4, prov.getApellidoMContacto());
            cst.setString(5, prov.getTelefono());
            cst.setString(6, prov.getDireccionWeb());
            cst.setInt(7, prov.getIdProveedor());
            cst.execute();
            cst.close();
            con.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
