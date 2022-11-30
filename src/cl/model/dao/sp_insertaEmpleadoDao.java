/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.bd.sp_insertaEmpleado;
import cl.model.bd.sp_insertaOrden;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Angel
 */
public class sp_insertaEmpleadoDao {
    public void insertaOEmpleado(sp_insertaEmpleado ie) throws SQLException{
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
        //Usando el autoincremento de la tabla Persona
        if(con!=null){
            cadSQL="{call sp_insertaEmpleado (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            System.out.println("Hasta aqui vamos -1");
            pstm.setInt(1,ie.getIdEmpleado());
            pstm.setString(2,ie.getNombre());
            pstm.setString(3,ie.getApellidoP());
            pstm.setString(4,ie.getApellidoM());
            pstm.setInt(5,ie.getCargo());
            pstm.setFloat(6,ie.getSalario());
            pstm.setString(7,ie.getCurp());
            pstm.setInt(8,ie.getTiempoExp());
            pstm.setString(9,ie.getCorreo());
            pstm.setString(10,ie.getCalle());
            pstm.setInt(11,ie.getNumero());
            pstm.setString(12,ie.getColonia());
            pstm.setString(13,ie.getCodigoPostal());
            pstm.setString(14,ie.getCiudad());
            pstm.setString(15,ie.getTelefono());
            pstm.setString(16,ie.getUsuario());
            pstm.setString(17,ie.getContrasenia());
            System.out.println("Hasta aqui vamos -2");
            pstm.execute();
            System.out.println("Hasta aqui vamos -3");
            con.close();
            pstm.close();
        }
    }
}
