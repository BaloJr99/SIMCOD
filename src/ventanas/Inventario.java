package ventanas;

import cl.model.bd.Ingredientes;
import cl.model.dao.IngredientesDao;
import cl.model.dao.ProveedorDao;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import misExcepciones.MisExcepciones;

public class Inventario extends javax.swing.JFrame {

    public Inventario() {
        initComponents();
        setLocationRelativeTo(null);
        alinearTabla();
        llenarComboUnidadProveedor();
        llenarTabla();
    }
    
    public Inventario(String datos[]) {
        initComponents();
        setLocationRelativeTo(null);
        try {
            alinearTabla();
            llenarComboUnidadProveedor();
            llenarTabla();
            txtIngrediente.setText(datos[0]);
            txtPresentacion.setText(datos[1]);
            txtMarca.setText(datos[2]);
            if(!datos[3].isEmpty()){
                txtFecha.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(datos[3]));
            }
            txtExistencia.setText(datos[4]);
            cbUnidad.setSelectedItem(datos[5]);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }
    
    private void llenarTabla(){
        try {
            DefaultTableModel dm = (DefaultTableModel)tblIngredientes.getModel();
            dm.setRowCount(0);
            ArrayList<IngredientesDao.IngredienteProveedor> listaIP = new IngredientesDao().vistaIngPro();
            Object datosllenado[] = new Object[7];
            
            for(IngredientesDao.IngredienteProveedor ing: listaIP){
                datosllenado[0] = ing.getIngrediente();
                datosllenado[1] = ing.getPresentacion();
                datosllenado[2] = ing.getMarca();
                datosllenado[3] = ing.getExistencia();
                datosllenado[4] = ing.getUnidad();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                datosllenado[5] = sdf.format(ing.getFechaVencimiento());
                datosllenado[6] = ing.getProveedor();
                dm.addRow(datosllenado);
            }
            tblIngredientes.setModel(dm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void alinearTabla(){
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for(int i = 0; i < tblIngredientes.getColumnCount(); i++){
            tblIngredientes.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }

    private void llenarComboUnidadProveedor(){
        try {
            IngredientesDao ingDao = new IngredientesDao();
            ProveedorDao proDao = new ProveedorDao();
            
            cbUnidad.removeAll();
            cbUnidad.addItem("Seleccione...");
            for(String dato: ingDao.unidades()){
                cbUnidad.addItem(dato);
            }
            cbUnidad.addItem("+ Nuevo");
            
            cbProveedor.removeAll();
            cbProveedor.addItem("Seleccione...");
            for(String dato: proDao.proveedor()){
                cbProveedor.addItem(dato);
            }
            cbProveedor.addItem("+ Nuevo");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ProyectoFinal6PU").createEntityManager();
        tblIngredientesQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM TblIngredientes t");
        tblIngredientesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tblIngredientesQuery.getResultList();
        tblIngredientesQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM TblIngredientes t");
        tblIngredientesList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tblIngredientesQuery1.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtIngrediente = new javax.swing.JTextField();
        txtPresentacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtExistencia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbUnidad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbProveedor = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblIngredientes = new javax.swing.JTable();
        lblLimpiar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(211, 202, 177));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel2.setText("Ingrediente");

        btnNuevo.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnNuevo.setText("INGRESAR COMPRA");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnModificar.setText("MODIFICAR CAMPO");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        txtIngrediente.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        txtPresentacion.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel3.setText("Presentacion");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel4.setText("Marca");

        txtMarca.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel5.setText("Fecha Vencimiento");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel6.setText("Existencia");

        txtExistencia.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtExistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExistenciaKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel7.setText("Unidad");

        cbUnidad.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        cbUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUnidadActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel8.setText("Proveedor");

        cbProveedor.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        cbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProveedorActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnSalir.setText("S A L I R ");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tblIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingrediente", "Presentación", "Marca", "Existencia", "Unidad", "Fecha Vencimiento", "Proveedor"
            }
        ));
        tblIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIngredientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblIngredientes);

        lblLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpiar.png"))); // NOI18N
        lblLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLimpiarMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logosolo.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(70, 76, 84));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("C E N T E N A R I O    R E S T A U R A N T  ");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(70, 76, 84));
        jLabel10.setText("INVENTARIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel10))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPresentacion)
                            .addComponent(txtMarca)
                            .addComponent(txtIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtExistencia)
                            .addComponent(cbUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(210, 210, 210)
                        .addComponent(lblLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel10))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(cbUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnModificar)
                                    .addComponent(btnNuevo)))
                            .addComponent(lblLimpiar)))
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUnidadActionPerformed
        try {
            if(cbUnidad.getItemCount() != 1){
                if(cbUnidad.getSelectedIndex() == cbUnidad.getItemCount() - 1){
                    String nueva = JOptionPane.showInputDialog("Ingrese nueva unidad");
                    if(nueva != null){
                        cbUnidad.removeItemAt(cbUnidad.getItemCount() - 1);
                        cbUnidad.addItem(nueva);
                        cbUnidad.addItem("+ Nuevo");
                        cbUnidad.setSelectedItem(nueva);
                    }else{
                        cbUnidad.setSelectedIndex(0);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_cbUnidadActionPerformed

    private boolean camposVacios(){
        boolean flag = false;
        
        try {
            if(txtIngrediente.getText().trim().isEmpty()){
                flag = true;
                throw new MisExcepciones(1);
            }else if(txtPresentacion.getText().trim().isEmpty()){
                flag = true;
                throw new MisExcepciones(2);
            }else if(txtMarca.getText().trim().isEmpty()){
                flag = true;
                throw new MisExcepciones(3);
            }else if(txtFecha.getDate() == null){
                flag = true;
                throw new MisExcepciones(4);
            }else if(txtExistencia.getText().trim().isEmpty()){
                flag = true;
                throw new MisExcepciones(5);
            }else if(cbUnidad.getSelectedIndex() == 0){
                flag = true;
                throw new MisExcepciones(6);
            }else if(cbProveedor.getSelectedIndex() == 0){
                flag = true;
                throw new MisExcepciones(7);
            }
        } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        return flag;       
    }
    
    private void limpiarCampos(){
        txtIngrediente.setText("");
        txtMarca.setText("");
        txtPresentacion.setText("");
        txtExistencia.setText("");
        cbUnidad.setSelectedIndex(0);
        cbProveedor.setSelectedIndex(0);
        txtFecha.setDate(null);
    }
    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        try {
            if(!camposVacios()){
                IngredientesDao ingDao = new IngredientesDao();
                
                Ingredientes ing = new Ingredientes(txtIngrediente.getText(), txtPresentacion.getText(), txtMarca.getText(), cbUnidad.getSelectedItem().toString(), new Date(txtFecha.getDate().getTime()), Integer.valueOf(txtExistencia.getText()), cbProveedor.getSelectedIndex() + 1);
                ingDao.insertaIngrediente(ing);
                limpiarCampos();
                llenarTabla();
                JOptionPane.showMessageDialog(this, "Ingresado exitosamente");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            if(!camposVacios()){
                IngredientesDao ingDao = new IngredientesDao();
                Ingredientes ing = new Ingredientes(txtIngrediente.getText(), txtPresentacion.getText(), txtMarca.getText(), cbUnidad.getSelectedItem().toString(), new Date(txtFecha.getDate().getTime()), Integer.valueOf(txtExistencia.getText()), cbProveedor.getSelectedIndex() + 1);
                ingDao.modificaIngrediente(ing, tblIngredientes.getSelectedRow() + 1);
                limpiarCampos();
                llenarTabla();
                JOptionPane.showMessageDialog(this, "Modificado exitosamente");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tblIngredientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIngredientesMouseClicked
        try {
            if(tblIngredientes.getSelectedRows().length != 0){
                int fila = tblIngredientes.getSelectedRow();
                txtIngrediente.setText(tblIngredientes.getValueAt(fila, 0).toString());
                txtPresentacion.setText(tblIngredientes.getValueAt(fila, 1).toString());
                txtMarca.setText(tblIngredientes.getValueAt(fila, 2).toString());
                txtExistencia.setText(tblIngredientes.getValueAt(fila, 3).toString());
                cbUnidad.setSelectedItem(tblIngredientes.getValueAt(fila, 4).toString());
                txtFecha.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(tblIngredientes.getValueAt(fila, 5).toString()));
                cbProveedor.setSelectedItem(tblIngredientes.getValueAt(fila, 6).toString());
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tblIngredientesMouseClicked

    private void cbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedorActionPerformed
        try {
            if(cbProveedor.getItemCount() != 1){
                if(cbProveedor.getSelectedIndex() == cbProveedor.getItemCount() - 1){
                    String datos[] = new String[7];
                    
                    if(!txtIngrediente.getText().trim().isEmpty()){
                        datos[0] = txtIngrediente.getText();
                    }else{
                        datos[0] = "";
                    }
                        
                    if(!txtPresentacion.getText().trim().isEmpty()){
                        datos[1] = txtPresentacion.getText();
                    }else{
                        datos[1] = "";
                    }
                    
                    if(!txtMarca.getText().trim().isEmpty()){
                        datos[2] = txtMarca.getText();
                    }else{
                        datos[2] = "";
                    }
                    
                    if(txtFecha.getDate() != null){
                        datos[3] = new SimpleDateFormat("dd/MM/yyyy").format(txtFecha.getDate());
                    }else{
                        datos[3] = "";
                    }
                    
                    if(!txtExistencia.getText().trim().isEmpty()){
                        datos[4] = txtExistencia.getText();
                    }else{
                        datos[4] = "";
                    }
                    
                    if(cbUnidad.getSelectedIndex() != 0){
                        datos[5] = cbUnidad.getSelectedItem().toString();
                    }else{
                        datos[5] = "";
                    }
                    
                    Proveedores prov = new Proveedores(datos);
                    prov.setVisible(true);
                    this.dispose();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_cbProveedorActionPerformed

    private void txtExistenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExistenciaKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c) && (c != '.' || txtExistencia.getText().contains("."))){
            evt.consume();
        }
    }//GEN-LAST:event_txtExistenciaKeyTyped

    private void lblLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarMouseClicked
        limpiarCampos();
    }//GEN-LAST:event_lblLimpiarMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbProveedor;
    private javax.swing.JComboBox<String> cbUnidad;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLimpiar;
    private javax.swing.JTable tblIngredientes;
    private java.util.List<jpa.TblIngredientes> tblIngredientesList;
    private java.util.List<jpa.TblIngredientes> tblIngredientesList1;
    private javax.persistence.Query tblIngredientesQuery;
    private javax.persistence.Query tblIngredientesQuery1;
    private javax.swing.JTextField txtExistencia;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtIngrediente;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPresentacion;
    // End of variables declaration//GEN-END:variables
}
