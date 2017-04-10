
package Gui.Usuario;

import LogicaCopaCentenario.Copa;
import static LogicaCopaCentenario.ProyectoCopaCentenario.guardarArchivo;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
//import contrib.ch.randelshofer.quaqua.QuaquaIconFactory;
//import static contrib.ch.randelshofer.quaqua.QuaquaIconFactory.getResource;


public class menuTablaPosiciones extends javax.swing.JFrame {
    
    Copa copa;
    public menuTablaPosiciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Bienvenido a la copa America Centenario 2016");
        this.setVisible(true);
        copa = Copa.getInstance();
        copa.ordenarGrupos();
        
    }
    public void cargarDatosTabla(){
        // debo poner todo en blanco
    }
    public void crearRespaldoSeleccion(){
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem6 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dfgs = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        grupos = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        p1 = new javax.swing.JLabel();
        pj1 = new javax.swing.JLabel();
        pg1 = new javax.swing.JLabel();
        pp1 = new javax.swing.JLabel();
        gd1 = new javax.swing.JLabel();
        bandera = new javax.swing.JLabel();
        pe1 = new javax.swing.JLabel();
        gf1 = new javax.swing.JLabel();
        gc1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        p4 = new javax.swing.JLabel();
        pj4 = new javax.swing.JLabel();
        pg4 = new javax.swing.JLabel();
        pp4 = new javax.swing.JLabel();
        gd4 = new javax.swing.JLabel();
        bandera3 = new javax.swing.JLabel();
        pe4 = new javax.swing.JLabel();
        gf4 = new javax.swing.JLabel();
        gc4 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        pu2 = new javax.swing.JLabel();
        pj2 = new javax.swing.JLabel();
        pg2 = new javax.swing.JLabel();
        pp2 = new javax.swing.JLabel();
        gd2 = new javax.swing.JLabel();
        bandera2 = new javax.swing.JLabel();
        pe2 = new javax.swing.JLabel();
        gf2 = new javax.swing.JLabel();
        gc2 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        p7 = new javax.swing.JLabel();
        pj7 = new javax.swing.JLabel();
        pg7 = new javax.swing.JLabel();
        pp7 = new javax.swing.JLabel();
        gd7 = new javax.swing.JLabel();
        bandera6 = new javax.swing.JLabel();
        pe7 = new javax.swing.JLabel();
        gf7 = new javax.swing.JLabel();
        gc7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Tabla de Posiciones");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 11, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setOpaque(false);

        dfgs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dfgs.setForeground(new java.awt.Color(255, 255, 255));
        dfgs.setText("Selección");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PJ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PG");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PP");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PE");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("GF");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GC");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("GD");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PUNTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(dfgs, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel8)
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addGap(43, 43, 43)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfgs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 116, -1, -1));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 161, -1, 0));

        grupos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        grupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UN GRUPO", "GRUPO A", "GRUPO B", "GRUPO C", "GRUPO D" }));
        grupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gruposActionPerformed(evt);
            }
        });
        getContentPane().add(grupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 58, -1, 40));

        jPanel8.setBackground(new java.awt.Color(0, 204, 102));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel8.setOpaque(false);

        p1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p1.setForeground(new java.awt.Color(255, 255, 255));
        p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pj1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pj1.setForeground(new java.awt.Color(255, 255, 255));

        pg1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pg1.setForeground(new java.awt.Color(255, 255, 255));

        pp1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pp1.setForeground(new java.awt.Color(255, 255, 255));

        gd1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gd1.setForeground(new java.awt.Color(255, 255, 255));

        bandera.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bandera.setForeground(new java.awt.Color(255, 255, 255));

        pe1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pe1.setForeground(new java.awt.Color(255, 255, 255));

        gf1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gf1.setForeground(new java.awt.Color(255, 255, 255));

        gc1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gc1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(bandera, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(pj1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pg1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(pp1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(pe1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(gf1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(gc1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(gd1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pj1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pg1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pe1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gf1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gc1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gd1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bandera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 191, -1, -1));

        jPanel14.setBackground(new java.awt.Color(0, 204, 102));
        jPanel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel14.setOpaque(false);

        p4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p4.setForeground(new java.awt.Color(255, 255, 255));
        p4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pj4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pj4.setForeground(new java.awt.Color(255, 255, 255));

        pg4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pg4.setForeground(new java.awt.Color(255, 255, 255));

        pp4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pp4.setForeground(new java.awt.Color(255, 255, 255));

        gd4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gd4.setForeground(new java.awt.Color(255, 255, 255));

        bandera3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bandera3.setForeground(new java.awt.Color(255, 255, 255));

        pe4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pe4.setForeground(new java.awt.Color(255, 255, 255));

        gf4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gf4.setForeground(new java.awt.Color(255, 255, 255));

        gc4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gc4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(bandera3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(pj4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pg4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(pp4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(pe4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(gf4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(gc4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(gd4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pj4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pg4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pe4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gf4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gc4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gd4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bandera3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 461, -1, -1));

        jPanel15.setBackground(new java.awt.Color(0, 204, 102));
        jPanel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel15.setOpaque(false);

        pu2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pu2.setForeground(new java.awt.Color(255, 255, 255));
        pu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pj2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pj2.setForeground(new java.awt.Color(255, 255, 255));

        pg2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pg2.setForeground(new java.awt.Color(255, 255, 255));

        pp2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pp2.setForeground(new java.awt.Color(255, 255, 255));

        gd2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gd2.setForeground(new java.awt.Color(255, 255, 255));

        bandera2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bandera2.setForeground(new java.awt.Color(255, 255, 255));

        pe2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pe2.setForeground(new java.awt.Color(255, 255, 255));

        gf2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gf2.setForeground(new java.awt.Color(255, 255, 255));

        gc2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gc2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(bandera2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(pj2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pg2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(pp2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(pe2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(gf2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(gc2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(gd2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pu2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pj2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pg2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pe2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gf2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gc2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gd2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pu2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bandera2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 281, -1, -1));

        jPanel17.setBackground(new java.awt.Color(0, 204, 102));
        jPanel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel17.setOpaque(false);

        p7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p7.setForeground(new java.awt.Color(255, 255, 255));
        p7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pj7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pj7.setForeground(new java.awt.Color(255, 255, 255));

        pg7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pg7.setForeground(new java.awt.Color(255, 255, 255));

        pp7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pp7.setForeground(new java.awt.Color(255, 255, 255));

        gd7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gd7.setForeground(new java.awt.Color(255, 255, 255));

        bandera6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bandera6.setForeground(new java.awt.Color(255, 255, 255));

        pe7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pe7.setForeground(new java.awt.Color(255, 255, 255));

        gf7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gf7.setForeground(new java.awt.Color(255, 255, 255));

        gc7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gc7.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(bandera6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(pj7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pg7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(pp7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(pe7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(gf7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(gc7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(gd7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pj7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pg7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pe7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gf7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gc7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gd7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bandera6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 371, -1, -1));

        jButton1.setText("atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 591, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 204, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        guardarArchivo(copa);
    }//GEN-LAST:event_formWindowClosing

    private void gruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gruposActionPerformed

        if(grupos.getSelectedIndex() == 1){
            ImageIcon icon = new ImageIcon((copa.getOrdenGrupo1().get(0).getBandera().toString()));                
            ImageIcon icono = new ImageIcon(icon.getImage().
            getScaledInstance(bandera.getWidth(), bandera.getHeight(),
                    Image.SCALE_DEFAULT));
            bandera.setText(null);
            bandera.setIcon(icono);
            pj1.setText(copa.getOrdenGrupo1().get(0).getPartidosJugados()+"");
            pg1.setText(copa.getOrdenGrupo1().get(0).getPartidosGanados()+"");
            pp1.setText(copa.getOrdenGrupo1().get(0).getPartidosPerdidos()+"");
            pe1.setText(copa.getOrdenGrupo1().get(0).getPartidosEmpatados()+"");
            gf1.setText(copa.getOrdenGrupo1().get(0).getGolesAFavor()+"");
            gc1.setText(copa.getOrdenGrupo1().get(0).getGolesEnContra()+"");
            gd1.setText(copa.getOrdenGrupo1().get(0).getGolDiferencia()+"");
            p1.setText(copa.getOrdenGrupo1().get(0).getPuntaje()+"");
            
            icon = new ImageIcon((copa.getOrdenGrupo1().get(1).getBandera().toString()));                
            icono = new ImageIcon(icon.getImage().
            getScaledInstance(bandera.getWidth(), bandera.getHeight(),Image.SCALE_DEFAULT));
            bandera2.setText(null);
            bandera2.setIcon(icono);
            pj2.setText(copa.getOrdenGrupo1().get(1).getPartidosJugados()+"");
            pg2.setText(copa.getOrdenGrupo1().get(1).getPartidosGanados()+"");
            pp2.setText(copa.getOrdenGrupo1().get(1).getPartidosPerdidos()+"");
            pe2.setText(copa.getOrdenGrupo1().get(1).getPartidosEmpatados()+"");
            gf2.setText(copa.getOrdenGrupo1().get(1).getGolesAFavor()+"");
            gc2.setText(copa.getOrdenGrupo1().get(1).getGolesEnContra()+"");
            gd2.setText(copa.getOrdenGrupo1().get(1).getGolDiferencia()+"");
            pu2.setText(copa.getOrdenGrupo1().get(1).getPuntaje()+"");
            
            icon = new ImageIcon((copa.getOrdenGrupo1().get(2).getBandera().toString()));                
            icono = new ImageIcon(icon.getImage().
            getScaledInstance(bandera.getWidth(), bandera.getHeight(),Image.SCALE_DEFAULT));
            bandera6.setText(null);
            bandera6.setIcon(icono);
            pj7.setText(copa.getOrdenGrupo1().get(2).getPartidosJugados()+"");
            pg7.setText(copa.getOrdenGrupo1().get(2).getPartidosGanados()+"");
            pp7.setText(copa.getOrdenGrupo1().get(2).getPartidosPerdidos()+"");
            pe7.setText(copa.getOrdenGrupo1().get(2).getPartidosEmpatados()+"");
            gf7.setText(copa.getOrdenGrupo1().get(2).getGolesAFavor()+"");
            gc7.setText(copa.getOrdenGrupo1().get(2).getGolesEnContra()+"");
            gd7.setText(copa.getOrdenGrupo1().get(2).getGolDiferencia()+"");
            p7.setText(copa.getOrdenGrupo1().get(2).getPuntaje()+"");
            
            icon = new ImageIcon((copa.getOrdenGrupo1().get(3).getBandera().toString()));                
            icono = new ImageIcon(icon.getImage().
            getScaledInstance(bandera.getWidth(), bandera.getHeight(),Image.SCALE_DEFAULT));
            bandera3.setText(null);
            bandera3.setIcon(icono);
            pj4.setText(copa.getOrdenGrupo1().get(3).getPartidosJugados()+"");
            pg4.setText(copa.getOrdenGrupo1().get(3).getPartidosGanados()+"");
            pp4.setText(copa.getOrdenGrupo1().get(3).getPartidosPerdidos()+"");
            pe4.setText(copa.getOrdenGrupo1().get(3).getPartidosEmpatados()+"");
            gf4.setText(copa.getOrdenGrupo1().get(3).getGolesAFavor()+"");
            gc4.setText(copa.getOrdenGrupo1().get(3).getGolesEnContra()+"");
            gd4.setText(copa.getOrdenGrupo1().get(3).getGolDiferencia()+"");
            p4.setText(copa.getOrdenGrupo1().get(3).getPuntaje()+"");
            
        }
        
        if(grupos.getSelectedIndex() == 2){
            ImageIcon icon = new ImageIcon((copa.getOrdenGrupo2().get(0).getBandera().toString()));                
            ImageIcon icono = new ImageIcon(icon.getImage().
                    getScaledInstance(bandera.getWidth(), bandera.getHeight(),Image.SCALE_DEFAULT));
            bandera.setText(null);
            bandera.setIcon(icono);
            pj1.setText(copa.getOrdenGrupo2().get(0).getPartidosJugados()+"");
            pg1.setText(copa.getOrdenGrupo2().get(0).getPartidosGanados()+"");
            pp1.setText(copa.getOrdenGrupo2().get(0).getPartidosPerdidos()+"");
            pe1.setText(copa.getOrdenGrupo2().get(0).getPartidosEmpatados()+"");
            gf1.setText(copa.getOrdenGrupo2().get(0).getGolesAFavor()+"");
            gc1.setText(copa.getOrdenGrupo2().get(0).getGolesEnContra()+"");
            gd1.setText(copa.getOrdenGrupo2().get(0).getGolDiferencia()+"");
            p1.setText(copa.getOrdenGrupo2().get(0).getPuntaje()+"");
            
            icon = new ImageIcon((copa.getOrdenGrupo2().get(1).getBandera().toString()));                
            icono = new ImageIcon(icon.getImage().
            getScaledInstance(bandera.getWidth(), bandera.getHeight(),Image.SCALE_DEFAULT));
            bandera2.setText(null);
            bandera2.setIcon(icono);
            pj2.setText(copa.getOrdenGrupo2().get(1).getPartidosJugados()+"");
            pg2.setText(copa.getOrdenGrupo2().get(1).getPartidosGanados()+"");
            pp2.setText(copa.getOrdenGrupo2().get(1).getPartidosPerdidos()+"");
            pe2.setText(copa.getOrdenGrupo2().get(1).getPartidosEmpatados()+"");
            gf2.setText(copa.getOrdenGrupo2().get(1).getGolesAFavor()+"");
            gc2.setText(copa.getOrdenGrupo2().get(1).getGolesEnContra()+"");
            gd2.setText(copa.getOrdenGrupo2().get(1).getGolDiferencia()+"");
            pu2.setText(copa.getOrdenGrupo2().get(1).getPuntaje()+"");
            
            icon = new ImageIcon((copa.getOrdenGrupo2().get(2).getBandera().toString()));                
            icono = new ImageIcon(icon.getImage().
            getScaledInstance(bandera.getWidth(), bandera.getHeight(),Image.SCALE_DEFAULT));
            bandera6.setText(null);
            bandera6.setIcon(icono);
            pj7.setText(copa.getOrdenGrupo2().get(2).getPartidosJugados()+"");
            pg7.setText(copa.getOrdenGrupo2().get(2).getPartidosGanados()+"");
            pp7.setText(copa.getOrdenGrupo2().get(2).getPartidosPerdidos()+"");
            pe7.setText(copa.getOrdenGrupo2().get(2).getPartidosEmpatados()+"");
            gf7.setText(copa.getOrdenGrupo2().get(2).getGolesAFavor()+"");
            gc7.setText(copa.getOrdenGrupo2().get(2).getGolesEnContra()+"");
            gd7.setText(copa.getOrdenGrupo2().get(2).getGolDiferencia()+"");
            p7.setText(copa.getOrdenGrupo2().get(2).getPuntaje()+"");
            
            icon = new ImageIcon((copa.getOrdenGrupo2().get(3).getBandera().toString()));                
            icono = new ImageIcon(icon.getImage().
            getScaledInstance(bandera.getWidth(), bandera.getHeight(),Image.SCALE_DEFAULT));
            bandera3.setText(null);
            bandera3.setIcon(icono);
            pj4.setText(copa.getOrdenGrupo2().get(3).getPartidosJugados()+"");
            pg4.setText(copa.getOrdenGrupo2().get(3).getPartidosGanados()+"");
            pp4.setText(copa.getOrdenGrupo2().get(3).getPartidosPerdidos()+"");
            pe4.setText(copa.getOrdenGrupo2().get(3).getPartidosEmpatados()+"");
            gf4.setText(copa.getOrdenGrupo2().get(3).getGolesAFavor()+"");
            gc4.setText(copa.getOrdenGrupo2().get(3).getGolesEnContra()+"");
            gd4.setText(copa.getOrdenGrupo2().get(3).getGolDiferencia()+"");
            p4.setText(copa.getOrdenGrupo2().get(3).getPuntaje()+"");
        }
        
        if(grupos.getSelectedIndex() == 3){
            ImageIcon icon = new ImageIcon((copa.getOrdenGrupo3().get(0).getBandera().toString()));                
            ImageIcon icono = new ImageIcon(icon.getImage().
                    getScaledInstance(bandera.getWidth(), bandera.getHeight(),Image.SCALE_DEFAULT));
            bandera.setText(null);
            bandera.setIcon(icono);
            pj1.setText(copa.getOrdenGrupo3().get(0).getPartidosJugados()+"");
            pg1.setText(copa.getOrdenGrupo3().get(0).getPartidosGanados()+"");
            pp1.setText(copa.getOrdenGrupo3().get(0).getPartidosPerdidos()+"");
            pe1.setText(copa.getOrdenGrupo3().get(0).getPartidosEmpatados()+"");
            gf1.setText(copa.getOrdenGrupo3().get(0).getGolesAFavor()+"");
            gc1.setText(copa.getOrdenGrupo3().get(0).getGolesEnContra()+"");
            gd1.setText(copa.getOrdenGrupo3().get(0).getGolDiferencia()+"");
            p1.setText(copa.getOrdenGrupo3().get(0).getPuntaje()+"");
            
            icon = new ImageIcon((copa.getOrdenGrupo3().get(1).getBandera().toString()));                
            icono = new ImageIcon(icon.getImage().
            getScaledInstance(bandera.getWidth(), bandera.getHeight(),Image.SCALE_DEFAULT));
            bandera2.setText(null);
            bandera2.setIcon(icono);
            pj2.setText(copa.getOrdenGrupo3().get(1).getPartidosJugados()+"");
            pg2.setText(copa.getOrdenGrupo3().get(1).getPartidosGanados()+"");
            pp2.setText(copa.getOrdenGrupo3().get(1).getPartidosPerdidos()+"");
            pe2.setText(copa.getOrdenGrupo3().get(1).getPartidosEmpatados()+"");
            gf2.setText(copa.getOrdenGrupo3().get(1).getGolesAFavor()+"");
            gc2.setText(copa.getOrdenGrupo3().get(1).getGolesEnContra()+"");
            gd2.setText(copa.getOrdenGrupo3().get(1).getGolDiferencia()+"");
            pu2.setText(copa.getOrdenGrupo3().get(1).getPuntaje()+"");
            
            icon = new ImageIcon((copa.getOrdenGrupo3().get(2).getBandera().toString()));                
            icono = new ImageIcon(icon.getImage().
            getScaledInstance(bandera.getWidth(), bandera.getHeight(),Image.SCALE_DEFAULT));
            bandera6.setText(null);
            bandera6.setIcon(icono);
            pj7.setText(copa.getOrdenGrupo3().get(2).getPartidosJugados()+"");
            pg7.setText(copa.getOrdenGrupo3().get(2).getPartidosGanados()+"");
            pp7.setText(copa.getOrdenGrupo3().get(2).getPartidosPerdidos()+"");
            pe7.setText(copa.getOrdenGrupo3().get(2).getPartidosEmpatados()+"");
            gf7.setText(copa.getOrdenGrupo3().get(2).getGolesAFavor()+"");
            gc7.setText(copa.getOrdenGrupo3().get(2).getGolesEnContra()+"");
            gd7.setText(copa.getOrdenGrupo3().get(2).getGolDiferencia()+"");
            p7.setText(copa.getOrdenGrupo3().get(2).getPuntaje()+"");
            
            icon = new ImageIcon((copa.getOrdenGrupo3().get(3).getBandera().toString()));                
            icono = new ImageIcon(icon.getImage().
            getScaledInstance(bandera.getWidth(), bandera.getHeight(),Image.SCALE_DEFAULT));
            bandera3.setText(null);
            bandera3.setIcon(icono);
            pj4.setText(copa.getOrdenGrupo3().get(3).getPartidosJugados()+"");
            pg4.setText(copa.getOrdenGrupo3().get(3).getPartidosGanados()+"");
            pp4.setText(copa.getOrdenGrupo3().get(3).getPartidosPerdidos()+"");
            pe4.setText(copa.getOrdenGrupo3().get(3).getPartidosEmpatados()+"");
            gf4.setText(copa.getOrdenGrupo3().get(3).getGolesAFavor()+"");
            gc4.setText(copa.getOrdenGrupo3().get(3).getGolesEnContra()+"");
            gd4.setText(copa.getOrdenGrupo3().get(3).getGolDiferencia()+"");
            p4.setText(copa.getOrdenGrupo3().get(3).getPuntaje()+"");
        }
        
        if(grupos.getSelectedIndex() == 4){
            ImageIcon icon = new ImageIcon((copa.getOrdenGrupo4().get(0).getBandera().toString()));                
            ImageIcon icono = new ImageIcon(icon.getImage().
                    getScaledInstance(bandera.getWidth(), bandera.getHeight(),Image.SCALE_DEFAULT));
            bandera.setText(null);
            bandera.setIcon(icono);
            pj1.setText(copa.getOrdenGrupo4().get(0).getPartidosJugados()+"");
            pg1.setText(copa.getOrdenGrupo4().get(0).getPartidosGanados()+"");
            pp1.setText(copa.getOrdenGrupo4().get(0).getPartidosPerdidos()+"");
            pe1.setText(copa.getOrdenGrupo4().get(0).getPartidosEmpatados()+"");
            gf1.setText(copa.getOrdenGrupo4().get(0).getGolesAFavor()+"");
            gc1.setText(copa.getOrdenGrupo4().get(0).getGolesEnContra()+"");
            gd1.setText(copa.getOrdenGrupo4().get(0).getGolDiferencia()+"");
            p1.setText(copa.getOrdenGrupo4().get(0).getPuntaje()+"");
            
            icon = new ImageIcon((copa.getOrdenGrupo4().get(1).getBandera().toString()));                
            icono = new ImageIcon(icon.getImage().
            getScaledInstance(bandera.getWidth(), bandera.getHeight(),Image.SCALE_DEFAULT));
            bandera2.setText(null);
            bandera2.setIcon(icono);
            pj2.setText(copa.getOrdenGrupo4().get(1).getPartidosJugados()+"");
            pg2.setText(copa.getOrdenGrupo4().get(1).getPartidosGanados()+"");
            pp2.setText(copa.getOrdenGrupo4().get(1).getPartidosPerdidos()+"");
            pe2.setText(copa.getOrdenGrupo4().get(1).getPartidosEmpatados()+"");
            gf2.setText(copa.getOrdenGrupo4().get(1).getGolesAFavor()+"");
            gc2.setText(copa.getOrdenGrupo4().get(1).getGolesEnContra()+"");
            gd2.setText(copa.getOrdenGrupo4().get(1).getGolDiferencia()+"");
            pu2.setText(copa.getOrdenGrupo4().get(1).getPuntaje()+"");
            
            icon = new ImageIcon((copa.getOrdenGrupo4().get(2).getBandera().toString()));                
            icono = new ImageIcon(icon.getImage().
            getScaledInstance(bandera.getWidth(), bandera.getHeight(),Image.SCALE_DEFAULT));
            bandera6.setText(null);
            bandera6.setIcon(icono);
            pj7.setText(copa.getOrdenGrupo4().get(2).getPartidosJugados()+"");
            pg7.setText(copa.getOrdenGrupo4().get(2).getPartidosGanados()+"");
            pp7.setText(copa.getOrdenGrupo4().get(2).getPartidosPerdidos()+"");
            pe7.setText(copa.getOrdenGrupo4().get(2).getPartidosEmpatados()+"");
            gf7.setText(copa.getOrdenGrupo4().get(2).getGolesAFavor()+"");
            gc7.setText(copa.getOrdenGrupo4().get(2).getGolesEnContra()+"");
            gd7.setText(copa.getOrdenGrupo4().get(2).getGolDiferencia()+"");
            p7.setText(copa.getOrdenGrupo4().get(2).getPuntaje()+"");
            
            icon = new ImageIcon((copa.getOrdenGrupo4().get(3).getBandera().toString()));                
            icono = new ImageIcon(icon.getImage().
            getScaledInstance(bandera.getWidth(), bandera.getHeight(),Image.SCALE_DEFAULT));
            bandera3.setText(null);
            bandera3.setIcon(icono);
            pj4.setText(copa.getOrdenGrupo4().get(3).getPartidosJugados()+"");
            pg4.setText(copa.getOrdenGrupo4().get(3).getPartidosGanados()+"");
            pp4.setText(copa.getOrdenGrupo4().get(3).getPartidosPerdidos()+"");
            pe4.setText(copa.getOrdenGrupo4().get(3).getPartidosEmpatados()+"");
            gf4.setText(copa.getOrdenGrupo4().get(3).getGolesAFavor()+"");
            gc4.setText(copa.getOrdenGrupo4().get(3).getGolesEnContra()+"");
            gd4.setText(copa.getOrdenGrupo4().get(3).getGolDiferencia()+"");
            p4.setText(copa.getOrdenGrupo4().get(3).getPuntaje()+"");
        }
            
    }//GEN-LAST:event_gruposActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menuUsuario atras = new menuUsuario();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bandera;
    private javax.swing.JLabel bandera2;
    private javax.swing.JLabel bandera3;
    private javax.swing.JLabel bandera6;
    private javax.swing.JLabel dfgs;
    private javax.swing.JLabel gc1;
    private javax.swing.JLabel gc2;
    private javax.swing.JLabel gc4;
    private javax.swing.JLabel gc7;
    private javax.swing.JLabel gd1;
    private javax.swing.JLabel gd2;
    private javax.swing.JLabel gd4;
    private javax.swing.JLabel gd7;
    private javax.swing.JLabel gf1;
    private javax.swing.JLabel gf2;
    private javax.swing.JLabel gf4;
    private javax.swing.JLabel gf7;
    private javax.swing.JComboBox<String> grupos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel pe1;
    private javax.swing.JLabel pe2;
    private javax.swing.JLabel pe4;
    private javax.swing.JLabel pe7;
    private javax.swing.JLabel pg1;
    private javax.swing.JLabel pg2;
    private javax.swing.JLabel pg4;
    private javax.swing.JLabel pg7;
    private javax.swing.JLabel pj1;
    private javax.swing.JLabel pj2;
    private javax.swing.JLabel pj4;
    private javax.swing.JLabel pj7;
    private javax.swing.JLabel pp1;
    private javax.swing.JLabel pp2;
    private javax.swing.JLabel pp4;
    private javax.swing.JLabel pp7;
    private javax.swing.JLabel pu2;
    // End of variables declaration//GEN-END:variables
}
