/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LATITUD
 */
public class CorteDao {
    
    public float corteEfectivo(Date fecha){
        float efectivo = 0;
        
        try {
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("SELECT dbo.FN_CORTE_Efectivo(?)");
            pe.setDate(1, fecha);
            ResultSet re = pe.executeQuery();
            if(re.next()){
                efectivo=re.getFloat(1);
            }
            re.close();
            pe.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return efectivo;
    }
    
    public float corteTarjeta(Date fecha){
        float tarjeta = 0;
        
        try {
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("SELECT dbo.FN_CORTE_Tarjeta(?)");
            pe.setDate(1, fecha);
            ResultSet re = pe.executeQuery();
            if(re.next()){
                tarjeta=re.getFloat(1);
            }
            re.close();
            pe.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return tarjeta;
    }
}
