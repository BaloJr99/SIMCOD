/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import cl.model.bd.Reservaciones;
import cl.model.bd.sp_insertaReserva;
import cl.model.dao.ReservacionesDao;
import cl.model.dao.sp_insertaReservaDao;
import java.awt.HeadlessException;
import java.sql.Timestamp;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import jpa.TblReservaciones;
import misExcepciones.MisExcepciones;

/**
 *
 * @author Admin
 */
public class Reservas extends javax.swing.JFrame {

    public TblReservaciones tblReservaciones;
    public Reservas() {
        initComponents();
        setLocationRelativeTo(null);
    }
private boolean camposVaciosInserta(){
        boolean flag = false;
        try {
            if(txtFecha.getDate()==null){
                flag = true;
                throw new MisExcepciones(15); 
            }else if(txtIdCliente.getText().trim().isEmpty()){
                flag = true;
                throw new MisExcepciones(14);
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
            if(txtFecha.getDate()==null){
                flag = true;
                throw new MisExcepciones(15); 
            }else if(txtIdCliente.getText().trim().isEmpty()){
                flag = true;
                throw new MisExcepciones(14);
            }
                } catch (MisExcepciones e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return flag;
}
private void limpiar(){
    txtFecha.setDate(null);
    txtIdCliente.setText("");
    txtIdReserva.setText("");
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entmaReservas = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ProyectoFinal6PU").createEntityManager();
        tblReservacionesQuery = java.beans.Beans.isDesignTime() ? null : entmaReservas.createQuery("SELECT t FROM TblReservaciones t");
        tblReservacionesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(tblReservacionesQuery.getResultList());
        tblReservacionesQuery1 = java.beans.Beans.isDesignTime() ? null : entmaReservas.createQuery("SELECT t FROM TblReservaciones t");
        tblReservacionesList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tblReservacionesQuery1.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblReservas = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        txtIdReserva = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(211, 202, 177));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblReservas.setBackground(new java.awt.Color(211, 202, 177));
        tblReservas.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        tblReservas.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblReservacionesList, tblReservas);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idReserva}"));
        columnBinding.setColumnName("ID de Reserva");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCliente.idCliente}"));
        columnBinding.setColumnName("ID del Cliente");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fechaHora}"));
        columnBinding.setColumnName("Fecha y hora");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane4.setViewportView(tblReservas);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 680, 170));

        btnAgregar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnAgregar.setText("A G R E G A R");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 140, 30));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel10.setText("Fecha y hora de la reserva:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        txtIdCliente.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jPanel1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 170, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconobandeja.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 170, 110));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(70, 76, 84));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("C E N T E N A R I O    R E S T A U R A N T  ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 500, 60));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(70, 76, 84));
        jLabel14.setText("Realizar una reserva");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 211, 340, 20));

        txtFecha.setDateFormatString("yyyy-MM-dd hh:mm:ss");
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 180, -1));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel11.setText("ID del cliente:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        txtIdReserva.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jPanel1.add(txtIdReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 150, 20));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel1.setText("Busqueda por ID de Reserva:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        btnBuscar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, -1, -1));

        btnEditar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnEditar.setText("E D I T A R");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 140, 30));

        btnEliminar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnEliminar.setText("E L I M I N A R");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 140, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logosolo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(70, 76, 84));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RESERVA ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 440, -1));

        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 540, -1, -1));

        jButton2.setText("CLIENTES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));

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

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    try {
        if(!camposVaciosInserta()){
                sp_insertaReservaDao spRevDao = new sp_insertaReservaDao();
                
                sp_insertaReserva rev = new sp_insertaReserva(Integer.valueOf(txtIdCliente.getText()),new Timestamp(txtFecha.getDate().getTime()));
                spRevDao.insertaPedido(rev);
                JOptionPane.showMessageDialog(this, "Ingresado exitosamente");
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
            Query qf = entmaReservas.createNamedQuery("TblReservaciones.findByIdReserva");
            qf.setParameter("idReserva", Integer.valueOf(txtIdReserva.getText()));
            TblReservaciones tblReservaciones = (TblReservaciones)qf.getSingleResult();
            txtIdCliente.setText(tblReservaciones.getIdCliente().getIdCliente().toString());
            txtFecha.setDate(tblReservaciones.getFechaHora());

        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se encontro la reserva");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       try {
        if(!camposVaciosEdita()){
                ReservacionesDao RevDao = new ReservacionesDao();
                
                Reservaciones rev = new Reservaciones(Integer.valueOf(txtIdReserva.getText()),Integer.valueOf(txtIdCliente.getText()),new Timestamp(txtFecha.getDate().getTime()));
                RevDao.editaReservacion(rev);
                JOptionPane.showMessageDialog(this, "Ingresado exitosamente");
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
        Query qf = entmaReservas.createNamedQuery("TblReservaciones.findByIdReserva");
        qf.setParameter("idReserva", Integer.valueOf(txtIdReserva.getText()));
        tblReservaciones = (TblReservaciones)qf.getSingleResult();
        }catch(NoResultException ex){
            JOptionPane.showMessageDialog(null, "ID no existente o erroneo!");
        }catch(NullPointerException ex){
            System.out.println("ID ingresado vacio");
        }
        entmaReservas.getTransaction().begin();
        entmaReservas.remove(tblReservaciones);
        entmaReservas.getTransaction().commit();
        JOptionPane.showMessageDialog(null,"Reservacion eliminada!");
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Clientela cli = new Clientela();
        cli.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.persistence.EntityManager entmaReservas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private java.util.List<jpa.TblReservaciones> tblReservacionesList;
    private java.util.List<jpa.TblReservaciones> tblReservacionesList1;
    private javax.persistence.Query tblReservacionesQuery;
    private javax.persistence.Query tblReservacionesQuery1;
    private javax.swing.JTable tblReservas;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdReserva;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
