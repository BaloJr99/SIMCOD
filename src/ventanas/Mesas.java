
package ventanas;

import cl.model.dao.MesasDao;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import jpa.TblMesas;




public class Mesas extends javax.swing.JFrame {
 public String estado = "Ocupado";

  
    public Mesas() {
        initComponents();
        mostrarDisponibilidad();
        setLocationRelativeTo(null);
    }
    
    public void actualizarPantalla(){
        SwingUtilities.updateComponentTreeUI(this);
        this.validateTree();
    }
    
    public void mostrarDisponibilidad(){
        try{
            
            Query qf;
            Component[] componentes = Croquis.getComponents();
            Component[] paneles = new Component[15];
            int cont = 0;
            for(int i = 0; i < componentes.length; i++){
                if(componentes[i] instanceof JPanel){
                    paneles[cont] = componentes[i];
                    cont++;
                }
            }
            
            for(int i = 0; i < 15; i++){
                qf = entma.createNamedQuery("TblMesas.findByIdMesas");
                qf.setParameter("idMesas", i + 1);
                TblMesas tblmesas = (TblMesas)qf.getSingleResult();
                if("Disponible".equals(tblmesas.getEstado())){ 
                    ((JPanel)paneles[i]).setBackground(Color.GREEN);
                }else{
                    ((JPanel)paneles[i]).setBackground(Color.RED);
                }
            }
                        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entma = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ProyectoFinal6PU").createEntityManager();
        jPanel1 = new javax.swing.JPanel();
        Croquis = new javax.swing.JPanel();
        lblMesa13 = new javax.swing.JLabel();
        lblMesa14 = new javax.swing.JLabel();
        lblMesa15 = new javax.swing.JLabel();
        lblMesa12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblMesa1 = new javax.swing.JLabel();
        lblMesa3 = new javax.swing.JLabel();
        lblMesa2 = new javax.swing.JLabel();
        lblMesa4 = new javax.swing.JLabel();
        lblMesa5 = new javax.swing.JLabel();
        lblMesa7 = new javax.swing.JLabel();
        lblMesa6 = new javax.swing.JLabel();
        lblMesa11 = new javax.swing.JLabel();
        lblMesa8 = new javax.swing.JLabel();
        lblMesa10 = new javax.swing.JLabel();
        lblMesa9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pEstadoMesa0 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        pEstadoMesa1 = new javax.swing.JPanel();
        pEstadoMesa2 = new javax.swing.JPanel();
        pEstadoMesa3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        pEstadoMesa6 = new javax.swing.JPanel();
        pEstadoMesa12 = new javax.swing.JPanel();
        pEstadoMesa5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        pEstadoMesa4 = new javax.swing.JPanel();
        pEstadoMesa7 = new javax.swing.JPanel();
        pEstadoMesa8 = new javax.swing.JPanel();
        pEstadoMesa9 = new javax.swing.JPanel();
        pEstadoMesa10 = new javax.swing.JPanel();
        pEstadoMesa11 = new javax.swing.JPanel();
        pEstadoMesa13 = new javax.swing.JPanel();
        pEstadoMesa14 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(211, 202, 177));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Croquis.setBackground(new java.awt.Color(255, 255, 255));
        Croquis.setForeground(new java.awt.Color(0, 0, 51));
        Croquis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMesa13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesa10-12.png"))); // NOI18N
        lblMesa13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesa13MouseClicked(evt);
            }
        });
        Croquis.add(lblMesa13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, -1));

        lblMesa14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesa8-10.png"))); // NOI18N
        lblMesa14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesa14MouseClicked(evt);
            }
        });
        Croquis.add(lblMesa14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, -1, -1));

        lblMesa15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesa2-4.png"))); // NOI18N
        lblMesa15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesa15MouseClicked(evt);
            }
        });
        Croquis.add(lblMesa15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, -1, -1));

        lblMesa12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesa4-6.png"))); // NOI18N
        lblMesa12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesa12MouseClicked(evt);
            }
        });
        Croquis.add(lblMesa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SALON");
        Croquis.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 11, 223, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Croquis.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 41, 10, 388));

        lblMesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesa2-4.png"))); // NOI18N
        lblMesa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesa1MouseClicked(evt);
            }
        });
        Croquis.add(lblMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lblMesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesa6-8v.png"))); // NOI18N
        lblMesa3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesa3MouseClicked(evt);
            }
        });
        Croquis.add(lblMesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        lblMesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesa10-12 v.png"))); // NOI18N
        lblMesa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesa2MouseClicked(evt);
            }
        });
        Croquis.add(lblMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        lblMesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesa2-4.png"))); // NOI18N
        lblMesa4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesa4MouseClicked(evt);
            }
        });
        Croquis.add(lblMesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        lblMesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesa6-8v.png"))); // NOI18N
        lblMesa5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesa5MouseClicked(evt);
            }
        });
        Croquis.add(lblMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        lblMesa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesa10-12 v.png"))); // NOI18N
        lblMesa7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesa7MouseClicked(evt);
            }
        });
        Croquis.add(lblMesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, 100));

        lblMesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesa4-6v.png"))); // NOI18N
        lblMesa6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesa6MouseClicked(evt);
            }
        });
        Croquis.add(lblMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        lblMesa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesa2-4.png"))); // NOI18N
        lblMesa11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesa11MouseClicked(evt);
            }
        });
        Croquis.add(lblMesa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, -1));

        lblMesa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesa4-6v.png"))); // NOI18N
        lblMesa8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesa8MouseClicked(evt);
            }
        });
        Croquis.add(lblMesa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        lblMesa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesa6-8v.png"))); // NOI18N
        lblMesa10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesa10MouseClicked(evt);
            }
        });
        Croquis.add(lblMesa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        lblMesa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mesa2-4.png"))); // NOI18N
        lblMesa9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMesa9MouseClicked(evt);
            }
        });
        Croquis.add(lblMesa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("MESA 15");
        Croquis.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, -1, -1));

        javax.swing.GroupLayout pEstadoMesa0Layout = new javax.swing.GroupLayout(pEstadoMesa0);
        pEstadoMesa0.setLayout(pEstadoMesa0Layout);
        pEstadoMesa0Layout.setHorizontalGroup(
            pEstadoMesa0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        pEstadoMesa0Layout.setVerticalGroup(
            pEstadoMesa0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Croquis.add(pEstadoMesa0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 20));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("MESA 7");
        Croquis.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("MESA 2");
        Croquis.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("MESA 3");
        Croquis.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        javax.swing.GroupLayout pEstadoMesa1Layout = new javax.swing.GroupLayout(pEstadoMesa1);
        pEstadoMesa1.setLayout(pEstadoMesa1Layout);
        pEstadoMesa1Layout.setHorizontalGroup(
            pEstadoMesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        pEstadoMesa1Layout.setVerticalGroup(
            pEstadoMesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Croquis.add(pEstadoMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 170, 20));

        javax.swing.GroupLayout pEstadoMesa2Layout = new javax.swing.GroupLayout(pEstadoMesa2);
        pEstadoMesa2.setLayout(pEstadoMesa2Layout);
        pEstadoMesa2Layout.setHorizontalGroup(
            pEstadoMesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        pEstadoMesa2Layout.setVerticalGroup(
            pEstadoMesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Croquis.add(pEstadoMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 130, 20));

        javax.swing.GroupLayout pEstadoMesa3Layout = new javax.swing.GroupLayout(pEstadoMesa3);
        pEstadoMesa3.setLayout(pEstadoMesa3Layout);
        pEstadoMesa3Layout.setHorizontalGroup(
            pEstadoMesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pEstadoMesa3Layout.setVerticalGroup(
            pEstadoMesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Croquis.add(pEstadoMesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, 20));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("MESA 1");
        Croquis.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("MESA 11");
        Croquis.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("MESA 6");
        Croquis.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        javax.swing.GroupLayout pEstadoMesa6Layout = new javax.swing.GroupLayout(pEstadoMesa6);
        pEstadoMesa6.setLayout(pEstadoMesa6Layout);
        pEstadoMesa6Layout.setHorizontalGroup(
            pEstadoMesa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        pEstadoMesa6Layout.setVerticalGroup(
            pEstadoMesa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Croquis.add(pEstadoMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 190, 20));

        javax.swing.GroupLayout pEstadoMesa12Layout = new javax.swing.GroupLayout(pEstadoMesa12);
        pEstadoMesa12.setLayout(pEstadoMesa12Layout);
        pEstadoMesa12Layout.setHorizontalGroup(
            pEstadoMesa12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pEstadoMesa12Layout.setVerticalGroup(
            pEstadoMesa12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Croquis.add(pEstadoMesa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, 100, 20));

        javax.swing.GroupLayout pEstadoMesa5Layout = new javax.swing.GroupLayout(pEstadoMesa5);
        pEstadoMesa5.setLayout(pEstadoMesa5Layout);
        pEstadoMesa5Layout.setHorizontalGroup(
            pEstadoMesa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        pEstadoMesa5Layout.setVerticalGroup(
            pEstadoMesa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Croquis.add(pEstadoMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 110, 20));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("MESA 5");
        Croquis.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("MESA 8");
        Croquis.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("MESA 9");
        Croquis.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, 20));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("MESA 10");
        Croquis.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        javax.swing.GroupLayout pEstadoMesa4Layout = new javax.swing.GroupLayout(pEstadoMesa4);
        pEstadoMesa4.setLayout(pEstadoMesa4Layout);
        pEstadoMesa4Layout.setHorizontalGroup(
            pEstadoMesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        pEstadoMesa4Layout.setVerticalGroup(
            pEstadoMesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Croquis.add(pEstadoMesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 130, 20));

        javax.swing.GroupLayout pEstadoMesa7Layout = new javax.swing.GroupLayout(pEstadoMesa7);
        pEstadoMesa7.setLayout(pEstadoMesa7Layout);
        pEstadoMesa7Layout.setHorizontalGroup(
            pEstadoMesa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        pEstadoMesa7Layout.setVerticalGroup(
            pEstadoMesa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Croquis.add(pEstadoMesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 110, 20));

        javax.swing.GroupLayout pEstadoMesa8Layout = new javax.swing.GroupLayout(pEstadoMesa8);
        pEstadoMesa8.setLayout(pEstadoMesa8Layout);
        pEstadoMesa8Layout.setHorizontalGroup(
            pEstadoMesa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        pEstadoMesa8Layout.setVerticalGroup(
            pEstadoMesa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Croquis.add(pEstadoMesa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 80, 20));

        javax.swing.GroupLayout pEstadoMesa9Layout = new javax.swing.GroupLayout(pEstadoMesa9);
        pEstadoMesa9.setLayout(pEstadoMesa9Layout);
        pEstadoMesa9Layout.setHorizontalGroup(
            pEstadoMesa9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        pEstadoMesa9Layout.setVerticalGroup(
            pEstadoMesa9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Croquis.add(pEstadoMesa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 120, 20));

        javax.swing.GroupLayout pEstadoMesa10Layout = new javax.swing.GroupLayout(pEstadoMesa10);
        pEstadoMesa10.setLayout(pEstadoMesa10Layout);
        pEstadoMesa10Layout.setHorizontalGroup(
            pEstadoMesa10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        pEstadoMesa10Layout.setVerticalGroup(
            pEstadoMesa10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Croquis.add(pEstadoMesa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 80, 20));

        javax.swing.GroupLayout pEstadoMesa11Layout = new javax.swing.GroupLayout(pEstadoMesa11);
        pEstadoMesa11.setLayout(pEstadoMesa11Layout);
        pEstadoMesa11Layout.setHorizontalGroup(
            pEstadoMesa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pEstadoMesa11Layout.setVerticalGroup(
            pEstadoMesa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Croquis.add(pEstadoMesa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 100, 20));

        javax.swing.GroupLayout pEstadoMesa13Layout = new javax.swing.GroupLayout(pEstadoMesa13);
        pEstadoMesa13.setLayout(pEstadoMesa13Layout);
        pEstadoMesa13Layout.setHorizontalGroup(
            pEstadoMesa13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pEstadoMesa13Layout.setVerticalGroup(
            pEstadoMesa13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Croquis.add(pEstadoMesa13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 100, 20));

        javax.swing.GroupLayout pEstadoMesa14Layout = new javax.swing.GroupLayout(pEstadoMesa14);
        pEstadoMesa14.setLayout(pEstadoMesa14Layout);
        pEstadoMesa14Layout.setHorizontalGroup(
            pEstadoMesa14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pEstadoMesa14Layout.setVerticalGroup(
            pEstadoMesa14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Croquis.add(pEstadoMesa14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 100, 20));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("MESA 4");
        Croquis.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("MESA 12");
        Croquis.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("MESA 13");
        Croquis.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, -1));

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("MESA 14");
        Croquis.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, -1));

        jPanel1.add(Croquis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 900, 470));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logosolo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 120, 120));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(70, 76, 84));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("C E N T E N A R I O    R E S T A U R A N T  ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 400, 60));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(70, 76, 84));
        jLabel3.setText("DISTRIBUCION DE MESAS ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnRegresar.setText("R E G R E S A R");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMesa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesa1MouseClicked
       try {
            Query qf;
            qf = entma.createNamedQuery("TblMesas.findByIdMesas");
                qf.setParameter("idMesas",1);
                TblMesas tblmesas = (TblMesas)qf.getSingleResult();
                if("Disponible".equals(tblmesas.getEstado())&& pEstadoMesa0.getBackground()== Color.GREEN){
                    int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea ocupar esta mesa?");
                        if (JOptionPane.OK_OPTION == confirmado){
                            pEstadoMesa0.setBackground(Color.RED);
                            MesasDao mdao = new MesasDao();
                            cl.model.bd.Mesas me=new cl.model.bd.Mesas(1,estado); 
                            mdao.editar(me);
                        };
                }else{
                    JOptionPane.showMessageDialog(null, "Esta mesa ya se encuentra ocupada");
                }
                
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se encontro el proveedor");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_lblMesa1MouseClicked

    private void lblMesa2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesa2MouseClicked
        try {
            Query qf;
            qf = entma.createNamedQuery("TblMesas.findByIdMesas");
                qf.setParameter("idMesas",2);
                TblMesas tblmesas = (TblMesas)qf.getSingleResult();
                if("Disponible".equals(tblmesas.getEstado())&& pEstadoMesa1.getBackground()== Color.GREEN){
                    int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea ocupar esta mesa?");
                        if (JOptionPane.OK_OPTION == confirmado){
                            pEstadoMesa1.setBackground(Color.RED);
                            MesasDao mdao = new MesasDao();
                            cl.model.bd.Mesas me=new cl.model.bd.Mesas(2,estado); 
                            mdao.editar(me);
                        };
                }else{
                    JOptionPane.showMessageDialog(null, "Esta mesa ya se encuentra ocupada");
                }
                
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se encontro el proveedor");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_lblMesa2MouseClicked

    private void lblMesa3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesa3MouseClicked
        try {
            Query qf;
            qf = entma.createNamedQuery("TblMesas.findByIdMesas");
                qf.setParameter("idMesas",3);
                TblMesas tblmesas = (TblMesas)qf.getSingleResult();
                if("Disponible".equals(tblmesas.getEstado())&& pEstadoMesa2.getBackground()== Color.GREEN){
                    int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea ocupar esta mesa?");
                        if (JOptionPane.OK_OPTION == confirmado){
                            pEstadoMesa2.setBackground(Color.RED);
                            MesasDao mdao = new MesasDao();
                            cl.model.bd.Mesas me=new cl.model.bd.Mesas(3,estado); 
                            mdao.editar(me);
                        };
                }else{
                    JOptionPane.showMessageDialog(null, "Esta mesa ya se encuentra ocupada");
                }
                
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se encontro el proveedor");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_lblMesa3MouseClicked

    private void lblMesa4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesa4MouseClicked
        try {
            Query qf;
            qf = entma.createNamedQuery("TblMesas.findByIdMesas");
                qf.setParameter("idMesas",4);
                TblMesas tblmesas = (TblMesas)qf.getSingleResult();
                if("Disponible".equals(tblmesas.getEstado())&& pEstadoMesa3.getBackground()== Color.GREEN){
                    int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea ocupar esta mesa?");
                        if (JOptionPane.OK_OPTION == confirmado){
                            pEstadoMesa3.setBackground(Color.RED);
                            MesasDao mdao = new MesasDao();
                            cl.model.bd.Mesas me=new cl.model.bd.Mesas(4,estado); 
                            mdao.editar(me);
                        };
                }else{
                    JOptionPane.showMessageDialog(null, "Esta mesa ya se encuentra ocupada");
                }
                
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se encontro el proveedor");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_lblMesa4MouseClicked

    private void lblMesa5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesa5MouseClicked
       try {
            Query qf;
            qf = entma.createNamedQuery("TblMesas.findByIdMesas");
                qf.setParameter("idMesas",5);
                TblMesas tblmesas = (TblMesas)qf.getSingleResult();
                if("Disponible".equals(tblmesas.getEstado())&& pEstadoMesa4.getBackground()== Color.GREEN){
                    int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea ocupar esta mesa?");
                        if (JOptionPane.OK_OPTION == confirmado){
                            pEstadoMesa4.setBackground(Color.RED);
                            MesasDao mdao = new MesasDao();
                            cl.model.bd.Mesas me=new cl.model.bd.Mesas(5,estado); 
                            mdao.editar(me);
                        };
                }else{
                    JOptionPane.showMessageDialog(null, "Esta mesa ya se encuentra ocupada");
                }
                
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se encontro el proveedor");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_lblMesa5MouseClicked

    private void lblMesa6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesa6MouseClicked
        try {
            Query qf;
            qf = entma.createNamedQuery("TblMesas.findByIdMesas");
                qf.setParameter("idMesas",1);
                TblMesas tblmesas = (TblMesas)qf.getSingleResult();
                if("Disponible".equals(tblmesas.getEstado())&& pEstadoMesa5.getBackground()== Color.GREEN){
                    int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea ocupar esta mesa?");
                        if (JOptionPane.OK_OPTION == confirmado){
                            pEstadoMesa5.setBackground(Color.RED);
                            MesasDao mdao = new MesasDao();
                            cl.model.bd.Mesas me=new cl.model.bd.Mesas(1,estado); 
                            mdao.editar(me);
                        };
                }else{
                    JOptionPane.showMessageDialog(null, "Esta mesa ya se encuentra ocupada");
                }
                
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se encontro el proveedor");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_lblMesa6MouseClicked

    private void lblMesa7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesa7MouseClicked
       try {
            Query qf;
            qf = entma.createNamedQuery("TblMesas.findByIdMesas");
                qf.setParameter("idMesas",7);
                TblMesas tblmesas = (TblMesas)qf.getSingleResult();
                if("Disponible".equals(tblmesas.getEstado())&& pEstadoMesa6.getBackground()== Color.GREEN){
                    int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea ocupar esta mesa?");
                        if (JOptionPane.OK_OPTION == confirmado){
                            pEstadoMesa6.setBackground(Color.RED);
                            MesasDao mdao = new MesasDao();
                            cl.model.bd.Mesas me=new cl.model.bd.Mesas(7,estado); 
                            mdao.editar(me);
                        };
                }else{
                    JOptionPane.showMessageDialog(null, "Esta mesa ya se encuentra ocupada");
                }
                
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se encontro el proveedor");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_lblMesa7MouseClicked

    private void lblMesa8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesa8MouseClicked
       try {
            Query qf;
            qf = entma.createNamedQuery("TblMesas.findByIdMesas");
                qf.setParameter("idMesas",8);
                TblMesas tblmesas = (TblMesas)qf.getSingleResult();
                if("Disponible".equals(tblmesas.getEstado())&& pEstadoMesa7.getBackground()== Color.GREEN){
                    int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea ocupar esta mesa?");
                        if (JOptionPane.OK_OPTION == confirmado){
                            pEstadoMesa7.setBackground(Color.RED);
                            MesasDao mdao = new MesasDao();
                            cl.model.bd.Mesas me=new cl.model.bd.Mesas(8,estado); 
                            mdao.editar(me);
                        };
                }else{
                    JOptionPane.showMessageDialog(null, "Esta mesa ya se encuentra ocupada");
                }
                
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se encontro el proveedor");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_lblMesa8MouseClicked

    private void lblMesa9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesa9MouseClicked
       try {
            Query qf;
            qf = entma.createNamedQuery("TblMesas.findByIdMesas");
                qf.setParameter("idMesas",9);
                TblMesas tblmesas = (TblMesas)qf.getSingleResult();
                if("Disponible".equals(tblmesas.getEstado())&& pEstadoMesa8.getBackground()== Color.GREEN){
                    int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea ocupar esta mesa?");
                        if (JOptionPane.OK_OPTION == confirmado){
                            pEstadoMesa8.setBackground(Color.RED);
                            MesasDao mdao = new MesasDao();
                            cl.model.bd.Mesas me=new cl.model.bd.Mesas(9,estado); 
                            mdao.editar(me);
                        };
                }else{
                    JOptionPane.showMessageDialog(null, "Esta mesa ya se encuentra ocupada");
                }
                
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se encontro el proveedor");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
    }//GEN-LAST:event_lblMesa9MouseClicked

    private void lblMesa10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesa10MouseClicked
        try {
            Query qf;
            qf = entma.createNamedQuery("TblMesas.findByIdMesas");
                qf.setParameter("idMesas",10);
                TblMesas tblmesas = (TblMesas)qf.getSingleResult();
                if("Disponible".equals(tblmesas.getEstado())&& pEstadoMesa9.getBackground()== Color.GREEN){
                    int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea ocupar esta mesa?");
                        if (JOptionPane.OK_OPTION == confirmado){
                            pEstadoMesa9.setBackground(Color.RED);
                            MesasDao mdao = new MesasDao();
                            cl.model.bd.Mesas me=new cl.model.bd.Mesas(10,estado); 
                            mdao.editar(me);
                        };
                }else{
                    JOptionPane.showMessageDialog(null, "Esta mesa ya se encuentra ocupada");
                }
                
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se encontro el proveedor");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_lblMesa10MouseClicked

    private void lblMesa11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesa11MouseClicked
        try {
            Query qf;
            qf = entma.createNamedQuery("TblMesas.findByIdMesas");
                qf.setParameter("idMesas",11);
                TblMesas tblmesas = (TblMesas)qf.getSingleResult();
                if("Disponible".equals(tblmesas.getEstado())&& pEstadoMesa10.getBackground()== Color.GREEN){
                    int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea ocupar esta mesa?");
                        if (JOptionPane.OK_OPTION == confirmado){
                            pEstadoMesa10.setBackground(Color.RED);
                            MesasDao mdao = new MesasDao();
                            cl.model.bd.Mesas me=new cl.model.bd.Mesas(11,estado); 
                            mdao.editar(me);
                        };
                }else{
                    JOptionPane.showMessageDialog(null, "Esta mesa ya se encuentra ocupada");
                }
                
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se encontro el proveedor");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_lblMesa11MouseClicked

    private void lblMesa12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesa12MouseClicked
        try {
            Query qf;
            qf = entma.createNamedQuery("TblMesas.findByIdMesas");
                qf.setParameter("idMesas",12);
                TblMesas tblmesas = (TblMesas)qf.getSingleResult();
                if("Disponible".equals(tblmesas.getEstado())&& pEstadoMesa11.getBackground()== Color.GREEN){
                    int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea ocupar esta mesa?");
                        if (JOptionPane.OK_OPTION == confirmado){
                            pEstadoMesa11.setBackground(Color.RED);
                            MesasDao mdao = new MesasDao();
                            cl.model.bd.Mesas me=new cl.model.bd.Mesas(12,estado); 
                            mdao.editar(me);
                        };
                }else{
                    JOptionPane.showMessageDialog(null, "Esta mesa ya se encuentra ocupada");
                }
                
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se encontro el proveedor");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_lblMesa12MouseClicked

    private void lblMesa13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesa13MouseClicked
       try {
            Query qf;
            qf = entma.createNamedQuery("TblMesas.findByIdMesas");
                qf.setParameter("idMesas",13);
                TblMesas tblmesas = (TblMesas)qf.getSingleResult();
                if("Disponible".equals(tblmesas.getEstado())&& pEstadoMesa12.getBackground()== Color.GREEN){
                    int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea ocupar esta mesa?");
                        if (JOptionPane.OK_OPTION == confirmado){
                            pEstadoMesa12.setBackground(Color.RED);
                            MesasDao mdao = new MesasDao();
                            cl.model.bd.Mesas me=new cl.model.bd.Mesas(13,estado); 
                            mdao.editar(me);
                        };
                }else{
                    JOptionPane.showMessageDialog(null, "Esta mesa ya se encuentra ocupada");
                }
                
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se encontro el proveedor");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_lblMesa13MouseClicked

    private void lblMesa14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesa14MouseClicked
        try {
            Query qf;
            qf = entma.createNamedQuery("TblMesas.findByIdMesas");
                qf.setParameter("idMesas",14);
                TblMesas tblmesas = (TblMesas)qf.getSingleResult();
                if("Disponible".equals(tblmesas.getEstado())&& pEstadoMesa13.getBackground()== Color.GREEN){
                    int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea ocupar esta mesa?");
                        if (JOptionPane.OK_OPTION == confirmado){
                            pEstadoMesa13.setBackground(Color.RED);
                            MesasDao mdao = new MesasDao();
                            cl.model.bd.Mesas me=new cl.model.bd.Mesas(14,estado); 
                            mdao.editar(me);
                        };
                }else{
                    JOptionPane.showMessageDialog(null, "Esta mesa ya se encuentra ocupada");
                }
                
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se encontro el proveedor");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_lblMesa14MouseClicked

    private void lblMesa15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMesa15MouseClicked
       try {
            Query qf;
            qf = entma.createNamedQuery("TblMesas.findByIdMesas");
                qf.setParameter("idMesas",15);
                TblMesas tblmesas = (TblMesas)qf.getSingleResult();
                if("Disponible".equals(tblmesas.getEstado())&& pEstadoMesa14.getBackground()== Color.GREEN){
                    int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea ocupar esta mesa?");
                        if (JOptionPane.OK_OPTION == confirmado){
                            pEstadoMesa14.setBackground(Color.RED);
                            MesasDao mdao = new MesasDao();
                            cl.model.bd.Mesas me=new cl.model.bd.Mesas(15,estado); 
                            mdao.editar(me);
                        };
                }else{
                    JOptionPane.showMessageDialog(null, "Esta mesa ya se encuentra ocupada");
                }
                
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(this, "No se encontro el proveedor");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_lblMesa15MouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Mesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Croquis;
    private javax.swing.JButton btnRegresar;
    private javax.persistence.EntityManager entma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblMesa1;
    private javax.swing.JLabel lblMesa10;
    private javax.swing.JLabel lblMesa11;
    private javax.swing.JLabel lblMesa12;
    private javax.swing.JLabel lblMesa13;
    private javax.swing.JLabel lblMesa14;
    private javax.swing.JLabel lblMesa15;
    private javax.swing.JLabel lblMesa2;
    private javax.swing.JLabel lblMesa3;
    private javax.swing.JLabel lblMesa4;
    private javax.swing.JLabel lblMesa5;
    private javax.swing.JLabel lblMesa6;
    private javax.swing.JLabel lblMesa7;
    private javax.swing.JLabel lblMesa8;
    private javax.swing.JLabel lblMesa9;
    private javax.swing.JPanel pEstadoMesa0;
    private javax.swing.JPanel pEstadoMesa1;
    private javax.swing.JPanel pEstadoMesa10;
    private javax.swing.JPanel pEstadoMesa11;
    private javax.swing.JPanel pEstadoMesa12;
    private javax.swing.JPanel pEstadoMesa13;
    private javax.swing.JPanel pEstadoMesa14;
    private javax.swing.JPanel pEstadoMesa2;
    private javax.swing.JPanel pEstadoMesa3;
    private javax.swing.JPanel pEstadoMesa4;
    private javax.swing.JPanel pEstadoMesa5;
    private javax.swing.JPanel pEstadoMesa6;
    private javax.swing.JPanel pEstadoMesa7;
    private javax.swing.JPanel pEstadoMesa8;
    private javax.swing.JPanel pEstadoMesa9;
    // End of variables declaration//GEN-END:variables
}
