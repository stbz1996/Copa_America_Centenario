
package Tecnicos;

import LogicaCopaCentenario.Copa;
import static LogicaCopaCentenario.ProyectoCopaCentenario.guardarArchivo;
import javax.swing.JOptionPane;

public class modificarTecnico extends javax.swing.JFrame {
    Copa copa;
    int posSeleccion;
    public modificarTecnico(int posSeleccion) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Administrador");
        this.setVisible(true);
        copa = Copa.getInstance();
        this.posSeleccion = posSeleccion;
        cargarDatos();
        guardarArchivo(copa);
    }
    
    private void cargarDatos(){
        nombre.setText(copa.getSelecciones().get(this.posSeleccion).getTecnico().getNombre());
        nacionalidad.setText(copa.getSelecciones().get(this.posSeleccion).getTecnico().getNacionalidad());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nacionalidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                guardar(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 458, 71, 31));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nacionalidad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        nacionalidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidadActionPerformed(evt);
            }
        });
        getContentPane().add(nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 591, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modificar Técnico");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 591, 29));

        Modificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aqw.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 830, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        TecnicosAdministracon atras = new TecnicosAdministracon();
        dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void nacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalidadActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        if("".equals(this.nombre.getText()) && "".equals(this.nacionalidad.getText())){
            JOptionPane.showMessageDialog(null, "Debes ingresar los datos del Técnico",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
        
        else if("".equals(this.nombre.getText())){
            JOptionPane.showMessageDialog(null, "Debes ingresar el nombre del Técnico",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(this.nacionalidad.getText())){
            JOptionPane.showMessageDialog(null, "Debes ingresar la nacionalidad del Técnico",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
        else{
            copa.getSelecciones().get(this.posSeleccion).getTecnico().setNombre(this.nombre.getText());
            copa.getSelecciones().get(this.posSeleccion).getTecnico().setNacionalidad(this.nacionalidad.getText());
            guardarArchivo(copa);
            JOptionPane.showMessageDialog(null, "Técnico Creado",
                    "Accion Completada", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void guardar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_guardar
        guardarArchivo(copa);
    }//GEN-LAST:event_guardar
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar;
    private javax.swing.JButton atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nacionalidad;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
