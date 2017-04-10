
package Gui_Administrador;

import Grupos.creacionGrupos;
import Selecciones.SeleccionesAdminisrador;
import Tecnicos.TecnicosAdministracon;
import Jugadores.JugadoresAdminisracion;
import LogicaCopaCentenario.Copa;
import static LogicaCopaCentenario.ProyectoCopaCentenario.guardarArchivo;

public class MenuAdministrador extends javax.swing.JFrame {
    Copa copa;
    public MenuAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Bienvenido a la copa America Centenario 2016");
        this.setVisible(true);
        copa = Copa.getInstance();
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdministrarJugadores = new javax.swing.JButton();
        AdministrarSelecciones = new javax.swing.JButton();
        AdministrarTécnicos = new javax.swing.JButton();
        grupos = new javax.swing.JButton();
        inicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdministrarJugadores.setBackground(new java.awt.Color(204, 204, 255));
        AdministrarJugadores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AdministrarJugadores.setText("Administrar Jugadores");
        AdministrarJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministrarJugadoresActionPerformed(evt);
            }
        });
        getContentPane().add(AdministrarJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 245, 173, 40));

        AdministrarSelecciones.setBackground(new java.awt.Color(204, 204, 255));
        AdministrarSelecciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AdministrarSelecciones.setText("Ver Selecciones");
        AdministrarSelecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministrarSeleccionesActionPerformed(evt);
            }
        });
        getContentPane().add(AdministrarSelecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 173, 40));

        AdministrarTécnicos.setBackground(new java.awt.Color(204, 204, 255));
        AdministrarTécnicos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AdministrarTécnicos.setText("Administrar Técnicos");
        AdministrarTécnicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministrarTécnicosActionPerformed(evt);
            }
        });
        getContentPane().add(AdministrarTécnicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 173, 40));

        grupos.setBackground(new java.awt.Color(204, 204, 255));
        grupos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grupos.setText("Asignar Grupos ");
        grupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gruposActionPerformed(evt);
            }
        });
        getContentPane().add(grupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 245, 173, 40));

        inicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inicio.setText("Pantalla inicial");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        getContentPane().add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 243, 173, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menú Administrador");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wwqq.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdministrarSeleccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministrarSeleccionesActionPerformed
        SeleccionesAdminisrador seleciones = new SeleccionesAdminisrador();
        dispose();
    }//GEN-LAST:event_AdministrarSeleccionesActionPerformed

    private void AdministrarJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministrarJugadoresActionPerformed
        JugadoresAdminisracion jug = new JugadoresAdminisracion();
        dispose();
    }//GEN-LAST:event_AdministrarJugadoresActionPerformed

    private void AdministrarTécnicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministrarTécnicosActionPerformed
        TecnicosAdministracon tecnicos = new TecnicosAdministracon();
        dispose();
    }//GEN-LAST:event_AdministrarTécnicosActionPerformed

    private void gruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gruposActionPerformed
        creacionGrupos grup = new creacionGrupos();
        dispose();
    }//GEN-LAST:event_gruposActionPerformed

    private void salir(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_salir
        guardarArchivo(copa);
    }//GEN-LAST:event_salir

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        PantallaInicial inicio = new PantallaInicial();
        dispose();
    }//GEN-LAST:event_inicioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdministrarJugadores;
    private javax.swing.JButton AdministrarSelecciones;
    private javax.swing.JButton AdministrarTécnicos;
    private javax.swing.JButton grupos;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
