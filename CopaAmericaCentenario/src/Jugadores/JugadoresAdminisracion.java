
package Jugadores;
import Gui_Administrador.MenuAdministrador;
import LogicaCopaCentenario.Copa;
import static LogicaCopaCentenario.ProyectoCopaCentenario.guardarArchivo;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
public class JugadoresAdminisracion extends javax.swing.JFrame {
    Copa copa;
    public JugadoresAdminisracion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Administrador");
        this.setVisible(true);
        copa = Copa.getInstance();
        cargarDatos();
        
        
    }
    
    private void cargarDatos(){
        for(int i = 0; i < copa.getSelecciones().size(); i++){
            modelo.addElement(copa.getSelecciones().get(i).getNombre());
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        modelo = new DefaultListModel();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        modelo2 = new DefaultListModel();
        jList2 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        agregarJug = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        modificarJug = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        this.jList1.setModel(modelo);
        jList1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, 232, 450));

        this.jList2.setModel(modelo2);
        jList2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(jList2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 67, 350, 450));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Selección");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Jugadores");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        agregarJug.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregarJug.setText("Agregar Jugador");
        agregarJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarJugActionPerformed(evt);
            }
        });
        getContentPane().add(agregarJug, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 209, -1));

        eliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eliminar.setText("Eliminar Jugador");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 209, -1));

        modificarJug.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modificarJug.setText("Modificar Jugador");
        modificarJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarJugActionPerformed(evt);
            }
        });
        getContentPane().add(modificarJug, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 209, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Imagenes/ss-1-1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        atras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 486, 103, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aaaaaaaaaaaaaaa.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarJugActionPerformed
        
        if(this.jList1.getSelectedIndex() < 0){
            JOptionPane.showMessageDialog(null, "Debes seleccionar una Seleccion para poder agregarle jugadores",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }        
        else if(copa.getSelecciones().size() == 0){
             JOptionPane.showMessageDialog(null, "Debes crear una selección para poder usar esta opción",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }        
        else if(copa.getSelecciones().get(jList1.getSelectedIndex()).getJugadores().size() == 23){
             
            String nomb = copa.getSelecciones().get(jList1.getSelectedIndex()).getNombre();
            JOptionPane.showMessageDialog(null, "La Selección de "+ nomb +" ya tiene los 23 jugdores registrados",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }        
        else if(this.jList1.getSelectedIndex() >= 0){
            AgregarJugador agreg = new AgregarJugador(this.jList1.getSelectedIndex());
            dispose();
        }
    }//GEN-LAST:event_agregarJugActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        MenuAdministrador atras = new MenuAdministrador();
        dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void modificarJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarJugActionPerformed
        
        if(jList1.getSelectedIndex() < 0){
            JOptionPane.showMessageDialog(null, "Debes seleccionar una Seleccion para poder modificar sus jugadores",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }        
        else if(jList2.getSelectedIndex() < 0){
            JOptionPane.showMessageDialog(null, "Debes seleccionar un Jugador para poder modificarlo",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }        
        else{
            guardarArchivo(copa);
            ModifiarJugador mod = new ModifiarJugador(jList1.getSelectedIndex(), jList2.getSelectedIndex());
            dispose();
        }
    }//GEN-LAST:event_modificarJugActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        modelo2.clear();
        int size = copa.getSelecciones().get(this.jList1.getSelectedIndex()).getJugadores().size();
        
        for(int i = 0; i < size; i++){
            modelo2.addElement(copa.getSelecciones().get(this.jList1.getSelectedIndex())
                    .getJugadores().get(i).getNombre());
        }
        
        
        
        
        
    }//GEN-LAST:event_jList1MouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if(jList1.getSelectedIndex() < 0){
            JOptionPane.showMessageDialog(null, "Debes seleccionar una Seleccion para poder eliminar sus jugadores",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
        
        else if(jList2.getSelectedIndex() < 0){
            JOptionPane.showMessageDialog(null, "Debes seleccionar un Jugador para poder eliminarlo",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
        else{
            copa.eliminarJugador(this.jList1.getSelectedIndex(), this.jList2.getSelectedIndex());
            modelo2.clear();
            int size = copa.getSelecciones().get(this.jList1.getSelectedIndex()).getJugadores().size();
        
            for(int i = 0; i < size; i++){
                modelo2.addElement(copa.getSelecciones().get(this.jList1.getSelectedIndex())
                        .getJugadores().get(i).getNombre());
            }  
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void salir(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_salir
        guardarArchivo(copa);
    }//GEN-LAST:event_salir

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarJug;
    private javax.swing.JButton atras;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private DefaultListModel modelo;
    private javax.swing.JList<String> jList2;
    private DefaultListModel modelo2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modificarJug;
    // End of variables declaration//GEN-END:variables
}
