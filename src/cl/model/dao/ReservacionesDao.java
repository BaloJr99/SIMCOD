
package cl.model.dao;

import cl.model.bd.Reservaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ReservacionesDao {
    
    
    public void editaReservacion(Reservaciones reserva) throws SQLException{
       Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        con = new Conexion().getCon();
        try {
             cadSQL="UPDATE tblReservaciones SET idCliente=?, fechaHora=? WHERE idReserva=?;";
             pstm=(PreparedStatement)con.prepareStatement(cadSQL);
             pstm.setInt(1,reserva.getIdCliente());
             pstm.setTimestamp(2,reserva.getFechaHora());
             pstm.setInt(3,reserva.getIdReserva());
             pstm.execute();
             con.close();
            pstm.close();
    }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}
}
