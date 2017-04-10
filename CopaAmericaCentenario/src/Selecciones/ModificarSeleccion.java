
package Selecciones;

import LogicaCopaCentenario.Copa;
import static LogicaCopaCentenario.ProyectoCopaCentenario.guardarArchivo;
import javax.swing.JOptionPane;

public class ModificarSeleccion extends javax.swing.JFrame {
    int seleccion;
    Copa copa;
    public ModificarSeleccion(int pSeleccion) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Administrador");
        this.setVisible(true);
        seleccion = pSeleccion;
        copa = Copa.getInstance();
        cargarDatos();
        guardarArchivo(copa);
    }

    private void cargarDatos(){
        this.nombre.setText(copa.getSelecciones().get(seleccion).getNombre());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        atras = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                sali(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 398, 229));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Cargar Bandera");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 296, 29));

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 480, -1, -1));

        mod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mod.setText("Modificar la Seleccion");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });
        getContentPane().add(mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, 58));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/................................4.JPG"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        guardarArchivo(copa);
        SeleccionesAdminisrador atras = new SeleccionesAdminisrador();
        dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        if("".equals(this.nombre.getText())){
            JOptionPane.showMessageDialog(null, "Debes ingresar el nombre de la Selección",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
        else{
            copa.getSelecciones().get(seleccion).setNombre(this.nombre.getText());
            JOptionPane.showMessageDialog(null, "Selección Modificada",
                    "Accion completada",JOptionPane.INFORMATION_MESSAGE);
            guardarArchivo(copa);
        }
    }//GEN-LAST:event_modActionPerformed

    private void sali(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_sali
       guardarArchivo(copa);
    }//GEN-LAST:event_sali


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton mod;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
