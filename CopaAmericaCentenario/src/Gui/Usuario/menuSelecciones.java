
package Gui.Usuario;
import GUI.Usuario.jugadoresMenu;
import LogicaCopaCentenario.Copa;
import static LogicaCopaCentenario.ProyectoCopaCentenario.guardarArchivo;
import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class menuSelecciones extends javax.swing.JFrame {

    Copa copa;
    public menuSelecciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Bienvenido a la copa America Centenario 2016");
        this.setVisible(true);
        copa = Copa.getInstance();
        bloquearObjetos();
        cargarSelecciones();
    }
    public void bloquearObjetos(){
        campoNombre.setEditable(false);
        campoGrupo.setEditable(false);
        campoTecnico.setEditable(false);
        botonJugadores.setEnabled(false);
    }
    
    private void cargarSelecciones(){
        for(int i = 0; i < copa.getSelecciones().size(); i++){
            modelo.addElement(copa.getSelecciones().get(i).getNombre());            
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
        jLabel4 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        bandera = new javax.swing.JLabel();
        campoGrupo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoTecnico = new javax.swing.JTextField();
        botonJugadores = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

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
        jLabel1.setText("Menú Selecciones");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 35, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 487, -1, 23));

        this.jList1.setModel(modelo);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 109, 190, 331));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Lista de Selecciones");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 81, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Grupo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        jLabel4.setText("Bandera");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 144, -1, -1));

        campoNombre.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 252, 182, -1));

        bandera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bandera.setText("Bandera");
        bandera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(bandera, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 109, 182, 118));

        campoGrupo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(campoGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 313, 184, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Técnico");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        campoTecnico.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(campoTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 369, 184, -1));

        botonJugadores.setText("Ver Jugadores");
        botonJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugadoresActionPerformed(evt);
            }
        });
        jPanel1.add(botonJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 120, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ggg.jpeg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 821, 539));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menuUsuario menu = new menuUsuario();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        guardarArchivo(copa);        
    }//GEN-LAST:event_formWindowClosing

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        ImageIcon icon = new ImageIcon(copa.getSelecciones().get(jList1.getSelectedIndex()).getBandera());                
        Icon icono = new ImageIcon(icon.getImage().
        getScaledInstance(bandera.getWidth(), bandera.getHeight(),
                Image.SCALE_DEFAULT));
        bandera.setText(null);
        bandera.setIcon(icono);
        campoNombre.setText(copa.getSelecciones().get(jList1.getSelectedIndex()).getNombre());
        campoGrupo.setText(copa.getSelecciones().get(jList1.getSelectedIndex()).getGrupo());
        if(copa.getSelecciones().get(jList1.getSelectedIndex()).getTecnico()==null){
            campoTecnico.setText("No tiene técnico asignado.");
        }else{
            campoTecnico.setText(copa.getSelecciones().get(jList1.getSelectedIndex()).getTecnico().getNombre());
        }       
        botonJugadores.setEnabled(true);
        
    }//GEN-LAST:event_jList1MouseClicked

    private void botonJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugadoresActionPerformed
        //menuJugadores menu = new menuJugadores(jList1.getSelectedIndex());
        jugadoresMenu menu = new jugadoresMenu(jList1.getSelectedIndex());
        dispose();
    }//GEN-LAST:event_botonJugadoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bandera;
    private javax.swing.JButton botonJugadores;
    private javax.swing.JTextField campoGrupo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTecnico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private DefaultListModel modelo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
