
package Gui.Usuario;

import LogicaCopaCentenario.Copa;
import static LogicaCopaCentenario.ProyectoCopaCentenario.guardarArchivo;
import java.awt.Image;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class menuPartido extends javax.swing.JFrame {
    Copa copa ;
    public menuPartido() {
        initComponents();
         this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Bienvenido a la copa America Centenario 2016");
        this.setVisible(true);
        copa = Copa.getInstance(); 
        cargarDatos();
    }
    
    private void cargarDatos(){
        for(int i = 0; i < copa.getPartidos().size(); i++){
            this.modelo.addElement(copa.getPartidos().get(i).toString());
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bandera1 = new javax.swing.JLabel();
        bandera2 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();
        marcador2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        modelo = new DefaultListModel();
        jList1 = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        fecha = new javax.swing.JLabel();
        visita = new javax.swing.JLabel();
        local = new javax.swing.JLabel();
        gv = new javax.swing.JLabel();
        gl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú de Partido");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        bandera1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bandera1.setText("SELECCION 1");
        bandera1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(bandera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 122, 198, 152));

        bandera2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bandera2.setText("SELECCION 2");
        bandera2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(bandera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 122, 198, 152));

        nombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(894, 353, 196, 25));

        marcador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(marcador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 270, 22, 27));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("VS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 187, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(872, 477, -1, -1));

        this.jList1.setModel(modelo);
        jList1.setOpaque(false);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 122, 310, 361));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Lista de Partidos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 89, -1, -1));

        jButton3.setText("Atras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 470, -1, -1));

        fecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 379, 122, 45));

        visita.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        visita.setForeground(new java.awt.Color(255, 255, 255));
        visita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(visita, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 327, 198, 34));

        local.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        local.setForeground(new java.awt.Color(255, 255, 255));
        local.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(local, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 327, 198, 34));

        gv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gv.setForeground(new java.awt.Color(255, 255, 255));
        gv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(gv, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 285, 51, 31));

        gl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gl.setForeground(new java.awt.Color(255, 255, 255));
        gl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(gl, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 285, 51, 31));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wwqq.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 801, 508));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        menuUsuario atras = new menuUsuario();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        //fecha.setText("jajaja hola");
        if (copa.getPartidos().size() > 0){
            
            if(copa.getPartidos().get(jList1.getSelectedIndex()).getYajugaron() == true){
                ImageIcon icon = new ImageIcon(copa.getPartidos().get(jList1.getSelectedIndex()).getLocal().getBandera());                
                Icon icono = new ImageIcon(icon.getImage().
                getScaledInstance(bandera1.getWidth(), bandera1.getHeight(), 
                Image.SCALE_DEFAULT));
                bandera1.setText(null);
                bandera1.setIcon(icono);
                icon = new ImageIcon(copa.getPartidos().get(jList1.getSelectedIndex()).getVisitante().getBandera());                
                icono = new ImageIcon(icon.getImage().
                getScaledInstance(bandera1.getWidth(), bandera1.getHeight(), 
                Image.SCALE_DEFAULT));
                bandera2.setText(null);
                bandera2.setIcon(icono);
                
                local.setText(copa.getPartidos().get(jList1.getSelectedIndex()).getLocal().getNombre());
                visita.setText(copa.getPartidos().get(jList1.getSelectedIndex()).getVisitante().getNombre());
                fecha.setText(copa.getPartidos().get(jList1.getSelectedIndex()).getFecha().toString());
                gl.setText(copa.getPartidos().get(jList1.getSelectedIndex()).getGolesLocal().size()+"");
                gv.setText(copa.getPartidos().get(jList1.getSelectedIndex()).getGolesVisita().size()+"");
            
            }else{
                JOptionPane.showMessageDialog(null, "Estos equipos no han jugado aún",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            }
            
            
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menuUsuario menu = new menuUsuario();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        guardarArchivo(copa);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bandera1;
    private javax.swing.JLabel bandera2;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel gl;
    private javax.swing.JLabel gv;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private DefaultListModel modelo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel local;
    private javax.swing.JLabel marcador2;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel visita;
    // End of variables declaration//GEN-END:variables
}
