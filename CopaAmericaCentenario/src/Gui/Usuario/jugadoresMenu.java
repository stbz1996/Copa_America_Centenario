
package GUI.Usuario;
import Gui.Usuario.menuUsuario;
import LogicaCopaCentenario.Copa;
import static LogicaCopaCentenario.ProyectoCopaCentenario.guardarArchivo;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class jugadoresMenu extends javax.swing.JFrame {
    Copa copa;
    int indiceSeleccion;    
    public jugadoresMenu(int pIndiceSeleccion) {
        initComponents();
        bloquearObjetos();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Bienvenido a la copa America Centenario 2016");
        this.setVisible(true);
        indiceSeleccion = pIndiceSeleccion;
        copa = Copa.getInstance();
        cargarJugadores();
    }
    
    public void bloquearObjetos(){
        campoNombre.setEditable(false);
        campoPeso.setEditable(false);
        campoEstatura.setEditable(false);
        campoEdad.setEditable(false);
        campoPosicion.setEditable(false);
        campoGoles.setEditable(false);
    }
    
    private void cargarJugadores(){
        for(int i = 0; i < copa.getSelecciones().get(indiceSeleccion).getJugadores().size(); i++){
            modelo.addElement(copa.getSelecciones().get(indiceSeleccion).getJugadores().get(i).getNombre());            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo = new DefaultListModel();
        jList1 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoPosicion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoGoles = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoPeso = new javax.swing.JTextField();
        campoEstatura = new javax.swing.JTextField();
        campoEdad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

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
        jLabel1.setText("Menú Jugadores");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 466, -1, -1));

        jScrollPane1.setBackground(java.awt.Color.orange);
        jScrollPane1.setOpaque(false);

        this.jList1.setModel(modelo);
        jList1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jList1.setOpaque(false);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 105, 190, 278));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lista de Jugadores");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 50, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Posición");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 50, 20));

        campoNombre.setBackground(java.awt.Color.orange);
        campoNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoNombre.setOpaque(false);
        jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 182, -1));

        campoPosicion.setBackground(java.awt.Color.orange);
        campoPosicion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoPosicion.setOpaque(false);
        jPanel1.add(campoPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 184, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Goles anotados");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 110, 20));

        campoGoles.setBackground(java.awt.Color.orange);
        campoGoles.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoGoles.setOpaque(false);
        jPanel1.add(campoGoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 184, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Peso");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 40, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Estatura");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 70, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Edad");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 40, 20));

        campoPeso.setBackground(java.awt.Color.orange);
        campoPeso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoPeso.setOpaque(false);
        campoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesoActionPerformed(evt);
            }
        });
        jPanel1.add(campoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 182, -1));

        campoEstatura.setBackground(java.awt.Color.orange);
        campoEstatura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoEstatura.setOpaque(false);
        jPanel1.add(campoEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 182, -1));

        campoEdad.setBackground(java.awt.Color.orange);
        campoEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoEdad.setOpaque(false);
        jPanel1.add(campoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 182, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/steven.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 767, 504));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menuUsuario menu = new menuUsuario();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campoPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        guardarArchivo(copa);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        
        ArrayList<String> posiciones = new ArrayList();
        posiciones.add("Delantero");
        posiciones.add("Defensa");
        posiciones.add("Mediocampista");        
        posiciones.add("Portero");            
        double estatura = Math.rint(copa.getSelecciones().get(indiceSeleccion).getJugadores().get(jList1.getSelectedIndex()).getEstatura()*100)/100;
        campoNombre.setText(copa.getSelecciones().get(indiceSeleccion).getJugadores().get(jList1.getSelectedIndex()).getNombre());
        campoPeso.setText(Double.toString(copa.getSelecciones().get(indiceSeleccion).getJugadores().get(jList1.getSelectedIndex()).getPeso()));
        campoEstatura.setText(Double.toString(estatura));
        campoEdad.setText(Integer.toString(copa.getSelecciones().get(indiceSeleccion).getJugadores().get(jList1.getSelectedIndex()).getEdad()));                
        campoPosicion.setText(posiciones.get(copa.getSelecciones().get(indiceSeleccion).getJugadores().get(jList1.getSelectedIndex()).getPosicion()));
        campoGoles.setText(Integer.toString(copa.getSelecciones().get(indiceSeleccion).getJugadores().get(jList1.getSelectedIndex()).getCantGoles()));
    }//GEN-LAST:event_jList1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoEdad;
    private javax.swing.JTextField campoEstatura;
    private javax.swing.JTextField campoGoles;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPeso;
    private javax.swing.JTextField campoPosicion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private DefaultListModel modelo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
