package cl.model.dao;

import cl.model.bd.Ingredientes;
import cl.model.bd.Pedido;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class IngredientesDao {
    Connection con = null;
    Ingredientes ing;
    public void insertaIngrediente(Ingredientes ing){
        try {
            Connection con = new Conexion().getCon();
            CallableStatement csta = con.prepareCall("{CALL SP_INSERTA_ING(?, ?, ?, ?, ?, ?, ?)}");
            csta.setString(1, ing.getIngrediente());
            csta.setString(2, ing.getPresentacion());
            csta.setString(3, ing.getMarca());
            csta.setDate(4, ing.getFechaVencimiento());
            csta.setInt(5, ing.getExistencia());
            csta.setString(6, ing.getUnidad());
            csta.setInt(7, ing.getIdProveedor());
            csta.execute();
            csta.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void modificaIngrediente(Ingredientes ing, int idIngrediente){
        try {
            Connection con = new Conexion().getCon();
            CallableStatement csta = con.prepareCall("{CALL SP_MODIFICA_ING(?, ?, ?, ?, ?, ?, ?, ?)}");
            csta.setString(1, ing.getIngrediente());
            csta.setString(2, ing.getPresentacion());
            csta.setString(3, ing.getMarca());
            csta.setDate(4, ing.getFechaVencimiento());
            csta.setInt(5, ing.getExistencia());
            csta.setString(6, ing.getUnidad());
            csta.setInt(7, ing.getIdProveedor());
            csta.setInt(8, idIngrediente);
            csta.execute();
            csta.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public ArrayList<String> unidades(){
        ArrayList<String> listaUnidades = new ArrayList<>();
        
        try {
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("SELECT unidad FROM tblIngredientes group by unidad");
            ResultSet re = pe.executeQuery();
            while(re.next()){
                listaUnidades.add(re.getString("unidad"));
            }
            re.close();
            pe.close();
            con.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return listaUnidades;
    }
    
    public ArrayList<IngredienteProveedor> vistaIngPro(){
        ArrayList<IngredienteProveedor> lista = new ArrayList();
        
        try {
            Connection con = new Conexion().getCon();
            PreparedStatement pe = con.prepareStatement("SELECT * FROM VW_Ingredientes");
            ResultSet re = pe.executeQuery();
            
            while(re.next()){
                lista.add(new IngredienteProveedor(re.getString(1), re.getString(2), re.getString(3), re.getString(6), re.getString(7), re.getDate(4), re.getInt(5)));
            }
            con.close();
            pe.close();
            re.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return lista;
    }
    
    public ArrayList<Ingredientes>muestraIngrediente (int id) throws SQLException {
       ArrayList<Ingredientes> ing2=new ArrayList();
        Connection con=null;
        PreparedStatement pstm=null;
        String cadSQL=null;
        //con=Conexion2.getConexion();
        con=new Conexion().getCon();
if(con!=null){
           cadSQL="select i.ingrediente,ixp.cantidad,ixp.medida from tblProductos as pr \n" +
"inner join tblIngreXProd as ixp on ixp.idProductos=pr.idProductos inner join tblIngredientes as i\n" +
"on i.idIngrediente=ixp.idIngrediente where pr.idProductos=?;";
            pstm=(PreparedStatement)con.prepareStatement(cadSQL);
            pstm.setInt(1,id);
            //pstm.setInt(2,producto);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                ing=new Ingredientes(rs.getString(1),rs.getInt(2),rs.getString(3));
                 ing2.add(ing);
            }
            rs.close();
            con.close();
            pstm.close();
}
        return ing2;
    }
    public class IngredienteProveedor {
        private String ingrediente, presentacion, marca, unidad, proveedor;
        private Date fechaVencimiento;
        private int existencia;

        public IngredienteProveedor(String ingrediente, String presentacion, String marca, String unidad, String proveedor, Date fechaVencimiento, int existencia) {
            this.ingrediente = ingrediente;
            this.presentacion = presentacion;
            this.marca = marca;
            this.unidad = unidad;
            this.proveedor = proveedor;
            this.fechaVencimiento = fechaVencimiento;
            this.existencia = existencia;
        }

        public String getIngrediente() {
            return ingrediente;
        }

        public void setIngrediente(String ingrediente) {
            this.ingrediente = ingrediente;
        }

        public String getPresentacion() {
            return presentacion;
        }

        public void setPresentacion(String presentacion) {
            this.presentacion = presentacion;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getUnidad() {
            return unidad;
        }

        public void setUnidad(String unidad) {
            this.unidad = unidad;
        }

        public String getProveedor() {
            return proveedor;
        }

        public void setProveedor(String proveedor) {
            this.proveedor = proveedor;
        }

        public Date getFechaVencimiento() {
            return fechaVencimiento;
        }

        public void setFechaVencimiento(Date fechaVencimiento) {
            this.fechaVencimiento = fechaVencimiento;
        }

        public int getExistencia() {
            return existencia;
        }

        public void setExistencia(int existencia) {
            this.existencia = existencia;
        }

        
    }
    
}
