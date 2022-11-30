/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import cl.model.bd.sp_muestrPedido;
import cl.model.dao.sp_muestraPedidoDao;
import java.awt.Component;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jpa.TblOrdenes;


/**
 *
 * @author Angel
 */
public class MetodoPago extends javax.swing.JFrame {
   int numOrden;
 public TblOrdenes Orden;
 public String NipGeneral="1234";
 sp_muestraPedidoDao mpdao=new sp_muestraPedidoDao();
    
    public MetodoPago() {
        initComponents();
        if(cbBancos.getSelectedItem().equals("VISA")){
            URL url=this.getClass().getResource("/images/visalogo.png");
            ImageIcon ban= new ImageIcon(url);
            lblImagen.setIcon(ban);
        }
    }
    
    public MetodoPago(int pedidoAPagar,Float total) {
        numOrden=pedidoAPagar;
        initComponents();
        setLocationRelativeTo(null);
        if(cbBancos.getSelectedItem().equals("VISA")){
            URL url=this.getClass().getResource("/images/visalogo.png");
            ImageIcon ban= new ImageIcon(url);
            lblImagen.setIcon(ban);
        } 
        txtOrden.setText(String.valueOf(pedidoAPagar));
        txtTotal.setText(String.valueOf(total));
        //Inhabilitar los componentes
            for (Component component : pDatos.getComponents()) {
             component.setEnabled(false); 
            }
            for (Component component : pEfectivo.getComponents()) {
             component.setEnabled(false); 
            }
            txtTotal.setText(String.valueOf(total));
            for (Component component : pTarjeta.getComponents()) {
             component.setEnabled(false); 
            }
            
    }
public void pedidos() throws SQLException{
    ArrayList<sp_muestrPedido> listPedido;
    try {
    listPedido =mpdao.consultaDatos(Integer.valueOf(txtOrden.getText()));
    //String pedido="";
    float total=0;
    float subtotal=0;
    String pedido=" CENTENARIO RESTAURANTE"+"\n" +"Blvd. Centenario #1360\n"+"Col.Villa de Fuente  PiedrasNegras,Coah.\n"
                + "  -----------------------------------------------------------------------------\n"+ "Orden: " + numOrden +"\n"+"----------------------------------------------------"+"\n";
    for(sp_muestrPedido mp: listPedido){
        //table.addRow(new Object[]{mp.getCantidad(),mp.getNombre(),mp.getPrecioU(),mp.getPrecioT()});
        pedido+="Descripción: "+mp.getNombre()+"\n"+"                                              "+mp.getCantidad()+"X $"+mp.getPrecioU()+"\n"+"Subtotal: "+"                                                                           $"+mp.getPrecioT()+"\n"+"----------------------------------------------------------"+"\n";
        total+=Float.valueOf(mp.getPrecioT());
    }
    pedido+="Total:                                                                                  $"+String.valueOf(total);
    panTicket.setText(pedido);
    } catch (SQLException ex) {
        System.out.println(ex);
    }
}

public void pedidos2() throws SQLException{
    ArrayList<sp_muestrPedido> listPedido;
    try {
    listPedido =mpdao.consultaDatos(Integer.valueOf(txtOrden.getText()));
    //String pedido="";
    float total=0;
    float subtotal=0;
    String pedido=" CENTENARIO RESTAURANTE"+"\n" +"Blvd. Centenario #1360\n"+"Col.Villa de Fuente  PiedrasNegras,Coah.\n"
                + "  -----------------------------------------------------------------------------\n"+ "Orden: " + numOrden +"\n"+"----------------------------------------------------"+"\n";
    for(sp_muestrPedido mp: listPedido){
        //table.addRow(new Object[]{mp.getCantidad(),mp.getNombre(),mp.getPrecioU(),mp.getPrecioT()});
        pedido+="Descripción: "+mp.getNombre()+"\n"+"                                              "+mp.getCantidad()+"X $"+mp.getPrecioU()+"\n"+"Subtotal: "+"                                                                           $"+mp.getPrecioT()+"\n"+"----------------------------------------------------------"+"\n";
        total+=Float.valueOf(mp.getPrecioT());
    }
    pedido+="Total:                                                                                  $"+String.valueOf(total);
    panTicket.setText(pedido);
    } catch (SQLException ex) {
        System.out.println(ex);
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGMetodo = new javax.swing.ButtonGroup();
        bGCantidad = new javax.swing.ButtonGroup();
        entma = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ProyectoFinal6PU").createEntityManager();
        pFondo = new javax.swing.JPanel();
        pMetodo = new javax.swing.JPanel();
        tBtnTarjeta = new javax.swing.JToggleButton();
        tBtnEfectivo = new javax.swing.JToggleButton();
        pEfectivo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtImporteE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEfectivo = new javax.swing.JTextField();
        txtCambio = new javax.swing.JTextField();
        pDatos = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        pTarjeta = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        cbBancos = new javax.swing.JComboBox<>();
        fTxtNumTarjeta = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtImporteT = new javax.swing.JTextField();
        txtEstatus = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPNip = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        txtPagar = new javax.swing.JButton();
        btnTicket = new javax.swing.JButton();
        lblOrden = new javax.swing.JLabel();
        txtOrden = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        panTicket = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pFondo.setBackground(new java.awt.Color(211, 202, 177));

        bGMetodo.add(tBtnTarjeta);
        tBtnTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta-de-debito.png"))); // NOI18N
        tBtnTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBtnTarjetaActionPerformed(evt);
            }
        });

        bGMetodo.add(tBtnEfectivo);
        tBtnEfectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dinero.png"))); // NOI18N
        tBtnEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBtnEfectivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMetodoLayout = new javax.swing.GroupLayout(pMetodo);
        pMetodo.setLayout(pMetodoLayout);
        pMetodoLayout.setHorizontalGroup(
            pMetodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMetodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tBtnEfectivo)
                .addGap(10, 10, 10)
                .addComponent(tBtnTarjeta)
                .addGap(10, 10, 10))
        );
        pMetodoLayout.setVerticalGroup(
            pMetodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMetodoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pMetodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tBtnEfectivo)
                    .addComponent(tBtnTarjeta))
                .addGap(10, 10, 10))
        );

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel1.setText("IMPORTE: ");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel2.setText("EFECTIVO: ");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel3.setText("CAMBIO: ");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel4.setText("$");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel5.setText("$");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel6.setText("$");

        javax.swing.GroupLayout pEfectivoLayout = new javax.swing.GroupLayout(pEfectivo);
        pEfectivo.setLayout(pEfectivoLayout);
        pEfectivoLayout.setHorizontalGroup(
            pEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEfectivoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(pEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(pEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtEfectivo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(txtImporteE, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCambio))
                .addGap(40, 40, 40))
        );
        pEfectivoLayout.setVerticalGroup(
            pEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEfectivoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtImporteE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(pEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(pEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(pEfectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        lblTotal.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        lblTotal.setText("TOTAL A PAGAR:  $");

        txtTotal.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N

        javax.swing.GroupLayout pDatosLayout = new javax.swing.GroupLayout(pDatos);
        pDatos.setLayout(pDatosLayout);
        pDatosLayout.setHorizontalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addContainerGap())
        );
        pDatosLayout.setVerticalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        cbBancos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VISA", "MASTER CARD", "AMERICAN EXPRESS" }));
        cbBancos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbBancosItemStateChanged(evt);
            }
        });

        try {
            fTxtNumTarjeta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("XXXX-XXXXX-X####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fTxtNumTarjeta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fTxtNumTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTxtNumTarjetaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel7.setText("IMPORTE:    $");

        txtImporteT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImporteTActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel8.setText("NUMERO DE TARJETA:   ");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel9.setText("NIP: ");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel10.setText("ESTATUS:");

        javax.swing.GroupLayout pTarjetaLayout = new javax.swing.GroupLayout(pTarjeta);
        pTarjeta.setLayout(pTarjetaLayout);
        pTarjetaLayout.setHorizontalGroup(
            pTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTarjetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbBancos, 0, 215, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(pTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fTxtNumTarjeta)
                    .addGroup(pTarjetaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtImporteT))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pTarjetaLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPNip))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTarjetaLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pTarjetaLayout.setVerticalGroup(
            pTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTarjetaLayout.createSequentialGroup()
                .addGroup(pTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pTarjetaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pTarjetaLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fTxtNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jPNip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtImporteT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBancos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtPagar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        txtPagar.setText("PAGAR");
        txtPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagarActionPerformed(evt);
            }
        });

        btnTicket.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnTicket.setText("IMPRIMIR COMPROBANTE");
        btnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketActionPerformed(evt);
            }
        });

        lblOrden.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        lblOrden.setText("NÚMERO DE ORDEN:");

        txtOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrdenActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(panTicket);

        javax.swing.GroupLayout pFondoLayout = new javax.swing.GroupLayout(pFondo);
        pFondo.setLayout(pFondoLayout);
        pFondoLayout.setHorizontalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pEfectivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pFondoLayout.createSequentialGroup()
                                .addComponent(lblOrden)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(pFondoLayout.createSequentialGroup()
                                .addComponent(btnTicket, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pFondoLayout.setVerticalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pMetodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOrden)
                            .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPagar)
                    .addComponent(btnTicket))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tBtnEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBtnEfectivoActionPerformed
        for (Component component : pEfectivo.getComponents()) {
             component.setEnabled(true); 
            }
        for (Component component : pTarjeta.getComponents()) {
             component.setEnabled(false); 
            }
         try{
            if(tBtnEfectivo.isSelected()){
                Query qf;
                qf = entma.createNamedQuery("TblOrdenes.findByIdOrden");
                qf.setParameter("idOrden",Integer.valueOf(txtOrden.getText()));
                Orden = (TblOrdenes)qf.getSingleResult();
                txtImporteE.setText(txtTotal.getText());
                txtImporteT.setText("");
        }}catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_tBtnEfectivoActionPerformed

    private void tBtnTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBtnTarjetaActionPerformed
        for (Component component : pEfectivo.getComponents()) {
             component.setEnabled(false); 
            }
        for (Component component : pTarjeta.getComponents()) {
             component.setEnabled(true); 
            }
         try{
            if(tBtnTarjeta.isSelected()){
                Query qf;
                qf = entma.createNamedQuery("TblOrdenes.findByIdOrden");
                qf.setParameter("idOrden",Integer.valueOf(txtOrden.getText()));
                Orden= (TblOrdenes)qf.getSingleResult();
                txtImporteT.setText(txtTotal.getText());
                txtImporteE.setText("");
        }}catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_tBtnTarjetaActionPerformed

    private void cbBancosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbBancosItemStateChanged
        if(cbBancos.getSelectedItem().equals("HSBC")){
            URL url=this.getClass().getResource("/images/HSBC.png");
            ImageIcon hsbc= new ImageIcon(url);
            lblImagen.setIcon(hsbc);
        }  if(cbBancos.getSelectedItem().equals("VISA")){
            URL url=this.getClass().getResource("/images/visalogo.png");
            ImageIcon vis= new ImageIcon(url);
            lblImagen.setIcon(vis);
        }  if(cbBancos.getSelectedItem().equals("MASTER CARD")){
            URL url=this.getClass().getResource("/images/mastercardlogo.png");
            ImageIcon mc= new ImageIcon(url);
            lblImagen.setIcon(mc);
        }  if(cbBancos.getSelectedItem().equals("AMERICAN EXPRESS")){
            URL url=this.getClass().getResource("/images/americanexpress.png");
            ImageIcon ae= new ImageIcon(url);
            lblImagen.setIcon(ae);
        }if(cbBancos.getSelectedItem().equals("Banorte")){
            URL url=this.getClass().getResource("/images/banorte.png");
            ImageIcon ban= new ImageIcon(url);
            lblImagen.setIcon(ban);
        }  if(cbBancos.getSelectedItem().equals("Bancomer")){
            URL url=this.getClass().getResource("/images/bancomer.png");
            ImageIcon ban= new ImageIcon(url);
            lblImagen.setIcon(ban);
        }   if(cbBancos.getSelectedItem().equals("Banamex")){
            URL url=this.getClass().getResource("/images/banamex.png");
            ImageIcon ban= new ImageIcon(url);
            lblImagen.setIcon(ban);
        }   if(cbBancos.getSelectedItem().equals("Banco azteca")){
            URL url=this.getClass().getResource("/images/azteca.png");
            ImageIcon ban= new ImageIcon(url);
            lblImagen.setIcon(ban);
        } if(cbBancos.getSelectedItem().equals("Santander")){
            URL url=this.getClass().getResource("/images/santander.png");
            ImageIcon ban= new ImageIcon(url);
            lblImagen.setIcon(ban);
        }if(cbBancos.getSelectedItem().equals("Scotiabank")){
            URL url=this.getClass().getResource("/images/scotiabank.png");
            ImageIcon ban= new ImageIcon(url);
            lblImagen.setIcon(ban);
        }
    }//GEN-LAST:event_cbBancosItemStateChanged

    private void txtPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagarActionPerformed
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); 
            java.util.Date date = new java.util.Date(); 
            if(tBtnEfectivo.isSelected())
            {
                txtCambio.setText(String.valueOf(Float.valueOf(txtEfectivo.getText())-Float.valueOf(txtImporteE.getText()))); 
                JOptionPane.showMessageDialog(null, "Ya puede generar su  ticket");
                entma.getTransaction().begin();
                Orden.setTotal(Double.valueOf(txtImporteE.getText()));
                Orden.setEstado("Pagado");
                Orden.setFormaPago("Efectivo");
                Orden.setFecha(Date.valueOf(formatter.format(date)));
                entma.getTransaction().commit();
            }
            else{
                if( new String(jPNip.getPassword()).equals( NipGeneral) && fTxtNumTarjeta.getText() != ""){
                    txtEstatus.setText("Aprobada");
                    JOptionPane.showMessageDialog(null, "Ya puede generar su  ticket");
                    JOptionPane.showMessageDialog(this,"Begin");
                    entma.getTransaction().begin();
                    JOptionPane.showMessageDialog(this,"Abajo Begin");
                    Orden.setTotal(Double.valueOf(txtImporteT.getText()));
                    JOptionPane.showMessageDialog(this,"1");
                    Orden.setEstado("Pagado");
                    JOptionPane.showMessageDialog(this,"2");
                    Orden.setFormaPago("Tarjeta");
                    JOptionPane.showMessageDialog(this,"3");
                    Orden.setFecha(Date.valueOf(formatter.format(date)));
                    JOptionPane.showMessageDialog(this,"4");
                    Orden.setBanco(cbBancos.getSelectedIndex());
                    entma.getTransaction().commit();
                }else{
                JOptionPane.showMessageDialog(null, "Verifique que el nip sea correcto");
                }
        }}catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
            JOptionPane.showMessageDialog(this,"Errrrrrorrr");
        }
    }//GEN-LAST:event_txtPagarActionPerformed

    private void fTxtNumTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTxtNumTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTxtNumTarjetaActionPerformed

    private void txtOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrdenActionPerformed

    private void btnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketActionPerformed
        if(tBtnEfectivo.isSelected()){
            try {
                pedidos();
            } catch (SQLException ex) {
                Logger.getLogger(MetodoPago.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                pedidos2();
            } catch (SQLException ex) {
                Logger.getLogger(MetodoPago.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnTicketActionPerformed

    private void txtImporteTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImporteTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImporteTActionPerformed

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
            java.util.logging.Logger.getLogger(MetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetodoPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGCantidad;
    private javax.swing.ButtonGroup bGMetodo;
    private javax.swing.JButton btnTicket;
    private javax.swing.JComboBox<String> cbBancos;
    private javax.persistence.EntityManager entma;
    private javax.swing.JFormattedTextField fTxtNumTarjeta;
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
    private javax.swing.JPasswordField jPNip;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblOrden;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pDatos;
    private javax.swing.JPanel pEfectivo;
    private javax.swing.JPanel pFondo;
    private javax.swing.JPanel pMetodo;
    private javax.swing.JPanel pTarjeta;
    private javax.swing.JTextPane panTicket;
    private javax.swing.JToggleButton tBtnEfectivo;
    private javax.swing.JToggleButton tBtnTarjeta;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextField txtEstatus;
    private javax.swing.JTextField txtImporteE;
    private javax.swing.JTextField txtImporteT;
    private javax.swing.JTextField txtOrden;
    private javax.swing.JButton txtPagar;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
