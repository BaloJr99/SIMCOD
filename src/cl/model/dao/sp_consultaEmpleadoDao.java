/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model.dao;

import cl.model.bd.sp_consultaEmpleado;
import cl.model.bd.sp_muestrPedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class sp_consultaEmpleadoDao {
    sp_consultaEmpleado cem;
     public ArrayList<sp_consultaEmpleado>consultaDatos (int id) throws SQLException {
       ArrayList<sp_consultaEmpleado> cem2=new ArrayList();
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
if(con!=null){
           cadSQL="{call  SP_ConsultaEmp(?)}";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            pstm.setInt(1,id);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                cem=new sp_consultaEmpleado(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
                 cem2.add(cem);
            }
            rs.close();
            con.close();
            pstm.close();
}
        return cem2;
    }
}
