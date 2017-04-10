
package Tecnicos;
import Gui_Administrador.MenuAdministrador;
import LogicaCopaCentenario.Copa;
import static LogicaCopaCentenario.ProyectoCopaCentenario.guardarArchivo;
import LogicaCopaCentenario.Tecnico;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
public class TecnicosAdministracon extends javax.swing.JFrame {
    Copa copa;
    public TecnicosAdministracon() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Administrador");
        this.setVisible(true);
        copa = Copa.getInstance();
        cargarDatos();
        guardarArchivo(copa);
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        agragar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        modfi = new javax.swing.JButton();
        nomb = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        modelo = new DefaultListModel();
        jList1 = new javax.swing.JList<>();
        atras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selección");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 19, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Técnico");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        agragar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agragar.setText("Crear el técnco de la seleccion");
        agragar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agragarActionPerformed(evt);
            }
        });
        getContentPane().add(agragar, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 127, -1, -1));

        eliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eliminar.setText("Eliminar Técnicos");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 214, 269, -1));

        modfi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modfi.setText("Modificar Técnicos");
        modfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modfiActionPerformed(evt);
            }
        });
        getContentPane().add(modfi, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 172, 269, -1));

        nomb.setEditable(false);
        nomb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nomb.setForeground(new java.awt.Color(255, 255, 255));
        nomb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomb.setText("nombre del tecnico");
        nomb.setOpaque(false);
        nomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombActionPerformed(evt);
            }
        });
        getContentPane().add(nomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 71, 258, 38));

        this.jList1.setModel(modelo);
        jList1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, 170, 400));

        atras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/......................2.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 750, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void cargarDatos(){
        for (int i = 0; i < copa.getSelecciones().size(); i++){
            modelo.addElement(copa.getSelecciones().get(i).getNombre());
        }
    }
    
    private void modfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modfiActionPerformed
        if(this.jList1.getSelectedIndex() < 0){
            JOptionPane.showMessageDialog(null, "Debes seleccionar una Selección para poder usar esta opción",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
        
        else if(copa.getSelecciones().get(this.jList1.getSelectedIndex()).getTecnico() == null){
            JOptionPane.showMessageDialog(null, "La selección no cuenta con un técnico",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
        
        else if(this.jList1.getSelectedIndex() >= 0){
            modificarTecnico mod = new modificarTecnico(this.jList1.getSelectedIndex());
            dispose();
        }
       
    }//GEN-LAST:event_modfiActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        MenuAdministrador atras = new MenuAdministrador();
        this.dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void agragarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agragarActionPerformed
        if(copa.getSelecciones().size() == 0){
            JOptionPane.showMessageDialog(null, "Debes seleccionar una Selección para poder usar esta opción",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
        
        if(this.jList1.getSelectedIndex() < 0){
            JOptionPane.showMessageDialog(null, "Debes crear una Selección para poder usar esta opción",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
        else if(copa.getSelecciones().get(this.jList1.getSelectedIndex()).getTecnico() != null){
            JOptionPane.showMessageDialog(null, "La Selección ya tiene un Técnico",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
        else if(this.jList1.getSelectedIndex() >= 0){
            AgregarTecnico agreg = new AgregarTecnico(this.jList1.getSelectedIndex());
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Debes seleccionar una Selección",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_agragarActionPerformed

    private void nombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        Tecnico nombre = copa.getSelecciones().get(this.jList1.getSelectedIndex()).getTecnico();
        if (nombre == null){
            nomb.setText("No tiene un técnico aún");
        }
        else{
             nomb.setText(nombre.getNombre());
        }
        
    }//GEN-LAST:event_jList1MouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        
        if(this.jList1.getSelectedIndex() < 0){
            JOptionPane.showMessageDialog(null, "Debes seleccionar una Selección para poder usar esta opción",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
    
        else if(copa.getSelecciones().get(this.jList1.getSelectedIndex()).getTecnico() == null){
            JOptionPane.showMessageDialog(null, "La selección no tiene un técnico aún",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
        
        else{
            copa.getSelecciones().get(this.jList1.getSelectedIndex()).setTecnico(null);
            copa.ActualizarTecnicos();
            this.nomb.setText("No tiene un técnico aún");
            guardarArchivo(copa);
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void salir(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_salir
        guardarArchivo(copa);
    }//GEN-LAST:event_salir


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agragar;
    private javax.swing.JButton atras;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private DefaultListModel modelo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modfi;
    private javax.swing.JTextField nomb;
    // End of variables declaration//GEN-END:variables
}
