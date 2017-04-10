
package Tecnicos;

import LogicaCopaCentenario.Copa;
import static LogicaCopaCentenario.ProyectoCopaCentenario.guardarArchivo;
import javax.swing.JOptionPane;

public class AgregarTecnico extends javax.swing.JFrame {
    int posSeleccion;
    Copa copa;
    public AgregarTecnico(int posSeleccion) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Administrador");
        this.setVisible(true);
        copa = Copa.getInstance();
        this.posSeleccion = posSeleccion;
        guardarArchivo(copa);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nacionalidad = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        crearTecnico = new javax.swing.JButton();
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
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 158, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nacionalidad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 198, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Crear Técnico");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        nacionalidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidadActionPerformed(evt);
            }
        });
        getContentPane().add(nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 198, 600, 29));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 158, 600, 29));

        crearTecnico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        crearTecnico.setText("Crear");
        crearTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTecnicoActionPerformed(evt);
            }
        });
        getContentPane().add(crearTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 105, 39));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/....................1.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 810, 500));

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

    private void crearTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTecnicoActionPerformed

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
            copa.CrearTecnico(this.posSeleccion, nombre.getText(), nacionalidad.getText());
            JOptionPane.showMessageDialog(null, "Técnico Creado",
                    "Accion Completada", JOptionPane.INFORMATION_MESSAGE);
            TecnicosAdministracon atras = new TecnicosAdministracon();
            dispose();
        }
        guardarArchivo(copa);
    }//GEN-LAST:event_crearTecnicoActionPerformed

    private void guardar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_guardar
        guardarArchivo(copa);
    }//GEN-LAST:event_guardar

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton crearTecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nacionalidad;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
