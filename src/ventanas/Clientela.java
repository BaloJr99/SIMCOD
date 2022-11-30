package ventanas;

import javax.swing.JOptionPane;
import misExcepciones.MisExcepciones;
import cl.model.dao.ClientesDao;
import cl.model.bd.Clientes;
import java.awt.HeadlessException;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import jpa.TblClientes;


public class Clientela extends javax.swing.JFrame {

    public TblClientes tblClientes;
    public Clientela() {
        
        initComponents();
        setLocationRelativeTo(null);
    }

private boolean camposVaciosInserta(){
        boolean flag = false;
        try {
            if(txtNombre.getText().trim().isEmpty()){
                flag = true;
                throw new MisExcepciones(16); 
            }else if(txtApellidoP.getText().trim().isEmpty()){
                flag = true;
                throw new MisExcepciones(17); 
            }else if(txtApellidoM.getText().trim().isEmpty()){
                flag = true;
                throw new MisExcepciones(18); 
            }else if(txtNumero.getText().trim().isEmpty()){
                flag = true;
                throw new MisExcepciones(19); 
            }
                } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return flag;
}

private boolean camposVaciosEdita(){
        boolean flag = false;
        try {
            if(txtNombre.getText().trim().isEmpty()){
                flag = true;
                throw new MisExcepciones(16); 
            }else if(txtApellidoP.getText().trim().isEmpty()){
                flag = true;
                throw new MisExcepciones(17); 
            }else if(txtApellidoM.getText().trim().isEmpty()){
                flag = true;
                throw new MisExcepciones(18); 
            }else if(txtNumero.getText().trim().isEmpty()){
                flag = true;
                throw new MisExcepciones(19); 
            }
                } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return flag;
}
private void limpiar(){
    txtIdCliente.setText("");
    txtNombre.setText("");
    txtApellidoP.setText("");
    txtApellidoM.setText("");
    txtNumero.setText("");
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entmaClientes = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ProyectoFinal6PU").createEntityManager();
        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtUltimoRegistro = new javax.swing.JTextArea();
        txtNumero = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(211, 202, 177));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anadir.png"))); // NOI18N
        btnAgregar.setText("A G R E G A R");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, 40));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel10.setText("Telefono del Cliente:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(70, 76, 84));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("C E N T E N A R I O    R E S T A U R A N T  ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 350, 60));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(70, 76, 84));
        jLabel14.setText("Ultima accion");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));
        jPanel1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 120, -1));

        jLabel1.setText("Busqueda por ID de Cliente:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        btnBuscar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnBuscar.setText("B U S C A R");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        btnEditar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnEditar.setText("E D I T A R");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 120, 40));

        btnEliminar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnEliminar.setText("E L I M I N A R");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 270, 130, 40));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel11.setText("Nombre del Cliente:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel15.setText("Apellido Paterno del Cliente:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel16.setText("Apellido Materno del Cliente:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 150, -1));
        jPanel1.add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 150, -1));
        jPanel1.add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 150, -1));

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(70, 76, 84));
        jLabel17.setText("Ingresar a un cliente");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        txtUltimoRegistro.setEditable(false);
        txtUltimoRegistro.setColumns(20);
        txtUltimoRegistro.setRows(5);
        txtUltimoRegistro.setEnabled(false);
        jScrollPane1.setViewportView(txtUltimoRegistro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 230, 120));

        try {
            txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 150, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logosolo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 120, 120));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(70, 76, 84));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AGREGAR CLIENTE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 340, -1));

        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 540, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if(!camposVaciosInserta()){
                ClientesDao CliDao = new ClientesDao();

                Clientes cli = new Clientes(txtNombre.getText(),txtApellidoP.getText(),txtApellidoM.getText(),txtNumero.getText());
                CliDao.insertaClientes(cli);
                JOptionPane.showMessageDialog(this, "Ingresado exitosamente");
                txtUltimoRegistro.setText(
                "Ultimo evento: Nuevo elemento"+"\n"+
                "Nombre: "+txtNombre.getText()+"\n"+
                "Apellido Paterno: "+txtApellidoP.getText()+"\n"+
                "Apellido Materno: "+txtApellidoM.getText()+"\n"+
                "Telefono: "+txtNumero.getText()       
                );
                limpiar();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            Query qf = entmaClientes.createNamedQuery("TblClientes.findByIdCliente");
            qf.setParameter("idCliente", Integer.valueOf(txtIdCliente.getText()));
            tblClientes = (TblClientes)qf.getSingleResult();
            txtNombre.setText(tblClientes.getNombre());
            txtApellidoP.setText(tblClientes.getApellidoP());
            txtApellidoM.setText(tblClientes.getApellidoM());
            txtNumero.setText(tblClientes.getTelefono());
            
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se encontro el cliente");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            if(!camposVaciosEdita()){
                ClientesDao CliDao = new ClientesDao();

                Clientes cli = new Clientes(Integer.valueOf(txtIdCliente.getText()),txtNombre.getText(),txtApellidoP.getText(),txtApellidoM.getText(),txtNumero.getText());
                CliDao.editaClientes(cli);
                JOptionPane.showMessageDialog(this, "Ingresado exitosamente");
                txtUltimoRegistro.setText(
                "Ultimo evento: Elemento editado"+"\n"+
                "Nombre: "+txtNombre.getText()+"\n"+
                "Apellido Paterno: "+txtApellidoP.getText()+"\n"+
                "Apellido Materno: "+txtApellidoM.getText()+"\n"+
                "Telefono: "+txtNumero.getText()       
                );
                limpiar();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            Query qf = entmaClientes.createNamedQuery("TblClientes.findByIdCliente");
            qf.setParameter("idCliente", Integer.valueOf(txtIdCliente.getText()));
            tblClientes = (TblClientes)qf.getSingleResult();
        }catch(NoResultException ex){
            JOptionPane.showMessageDialog(null, "ID no existente o erroneo!");
        }catch(NullPointerException ex){
            System.out.println("ID ingresado vacio");
        }
        entmaClientes.getTransaction().begin();
        entmaClientes.remove(tblClientes);
        entmaClientes.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Reservacion eliminada!");
        txtUltimoRegistro.setText(
        "Ultimo evento: Elemento eliminado"+"\n"+
        "Nombre: "+txtNombre.getText()+"\n"+
        "Apellido Paterno: "+txtApellidoP.getText()+"\n"+
        "Apellido Materno: "+txtApellidoM.getText()+"\n"+
        "Telefono: "+txtNumero.getText()       
        );
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.persistence.EntityManager entmaClientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JTextArea txtUltimoRegistro;
    // End of variables declaration//GEN-END:variables
}
