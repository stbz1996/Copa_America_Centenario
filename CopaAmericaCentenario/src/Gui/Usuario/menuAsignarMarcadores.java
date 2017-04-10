
package Gui.Usuario;

import Jugadores.JugadoresAdminisracion;
import LogicaCopaCentenario.Copa;
import LogicaCopaCentenario.Gol;
import static LogicaCopaCentenario.ProyectoCopaCentenario.guardarArchivo;
import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class menuAsignarMarcadores extends javax.swing.JFrame {
    Copa copa;
    public menuAsignarMarcadores() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Bienvenido a la copa America Centenario 2016");
        this.setVisible(true);
        copa = Copa.getInstance();
        cargarDatosEnLista();
        jButton2.setEnabled(false);
        gl.setEnabled(false);
        gv.setEnabled(false);
    }
    
    private void cargarDatosEnLista(){
        for(int i = 0; i < copa.getPartidos().size(); i++){
            this.modelo.addElement(copa.getPartidos().get(i).toString());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        gl = new javax.swing.JTextField();
        gv = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        bandera1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(bandera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 122, 198, 152));

        bandera2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(bandera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 122, 198, 152));

        nombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(925, 353, 196, 25));

        marcador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(marcador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 270, 22, 27));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 477, -1, -1));

        this.jList1.setModel(modelo);
        jList1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(716, 475, -1, -1));

        fecha.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 170, 45));

        visita.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        visita.setForeground(new java.awt.Color(255, 255, 255));
        visita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(visita, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 330, 198, 34));

        local.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        local.setForeground(new java.awt.Color(255, 255, 255));
        local.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(local, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 330, 198, 34));

        gl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glActionPerformed(evt);
            }
        });
        jPanel1.add(gl, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 285, 34, 27));

        gv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(gv, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 285, 33, 27));

        jButton2.setText("Asignar Goles");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 445, -1, 38));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ja1.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 801, 508));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menuUsuario menu = new menuUsuario();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if(copa.getPartidos().get(jList1.getSelectedIndex()).getYajugaron() == true){
            JOptionPane.showMessageDialog(null, "A este partido ya se le asigno un marcador",
                "Accion no completada",JOptionPane.WARNING_MESSAGE);         
        }
        
        else if (copa.getPartidos().size() > 0){
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
            gl.requestFocus();
            jButton2.setEnabled(true);
            gl.setEnabled(true);
            gv.setEnabled(true);
            
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        menuUsuario atras = new menuUsuario();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void glActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_glActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
                int golesLocal = Integer.parseInt(this.gl.getText());
                int golesVisita = Integer.parseInt(this.gv.getText());
                
                if(golesLocal < 0){
                    JOptionPane.showMessageDialog(null, "Los goles del local no pueden ser números negativos",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
                }
                else if(golesVisita < 0){
                    JOptionPane.showMessageDialog(null, "Los goles del visitante no pueden ser números negativos",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    
                    int indicePartido = jList1.getSelectedIndex();
                    
                    copa.getPartidos().get(indicePartido).getGolesLocal().clear();
                    copa.getPartidos().get(indicePartido).getGolesVisita().clear();
                    
                    //GANA LOCAL
                    if (golesLocal>golesVisita){
                        copa.getPartidos().get(indicePartido).getLocal().ganoPartido();
                        copa.getPartidos().get(indicePartido).getVisitante().perdioPartido();
                    }
                    //GANA VISITANTE
                    if(golesLocal<golesVisita){
                        copa.getPartidos().get(indicePartido).getVisitante().ganoPartido();
                        copa.getPartidos().get(indicePartido).getLocal().perdioPartido();
                    }
                    //EMPATE
                    if(golesLocal==golesVisita){
                        copa.getPartidos().get(indicePartido).getLocal().empatoPartido();
                        copa.getPartidos().get(indicePartido).getVisitante().empatoPartido();
                        
                    }                    
                    PedirAnotadores ventanaAnotaciones = new PedirAnotadores(indicePartido, golesLocal,golesVisita);
                    this.dispose();                                       
        
                }
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Debes colocar números en los marcadores",
                "Accion no completada",JOptionPane.WARNING_MESSAGE);
            gl.requestFocus();
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        guardarArchivo(copa);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(menuAsignarMarcadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuAsignarMarcadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuAsignarMarcadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuAsignarMarcadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuAsignarMarcadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bandera1;
    private javax.swing.JLabel bandera2;
    private javax.swing.JLabel fecha;
    private javax.swing.JTextField gl;
    private javax.swing.JTextField gv;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private DefaultListModel modelo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel local;
    private javax.swing.JLabel marcador2;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel visita;
    // End of variables declaration//GEN-END:variables
}
