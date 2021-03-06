
package Jugadores;

import LogicaCopaCentenario.Copa;
import static LogicaCopaCentenario.ProyectoCopaCentenario.guardarArchivo;
import javax.swing.JOptionPane;

public class AgregarJugador extends javax.swing.JFrame {
    Copa copa;
    int posSeleccion;
    public AgregarJugador(int pos) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Administrador");
        this.setVisible(true);
        posSeleccion = pos;
        copa = Copa.getInstance();
        guardarArchivo(copa);
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        posicion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edad = new javax.swing.JComboBox<>();
        peso = new javax.swing.JTextField();
        estatura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        crear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear Jugador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, -1, -1));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 142, 700, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Posición");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 185, -1, -1));

        posicion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        posicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delantero", "Defensa", "Mediocampista", "Portero" }));
        getContentPane().add(posicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 182, 147, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 239, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Peso");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 285, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estatura");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 331, -1, -1));

        edad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 236, -1, -1));

        peso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 282, 82, -1));

        estatura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(estatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 328, 82, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("m");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 331, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Kg");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 285, -1, -1));

        atras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 468, -1, -1));

        crear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        crear.setText("Crear");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 374, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aqw.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        JugadoresAdminisracion atras = new JugadoresAdminisracion();
        dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        // bloque para verificar la consistenci de los datos
        if("".equals(this.nombre.getText()) && "".equals(this.peso.getText()) 
                && "".equals(this.estatura.getText())){
            JOptionPane.showMessageDialog(null, "Debes ingresar los datos del Jugador",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
        
        else if("".equals(this.nombre.getText())){
            JOptionPane.showMessageDialog(null, "Debes ingresar el nombre del Jugador",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(this.peso.getText())){
            JOptionPane.showMessageDialog(null, "Debes ingresar el peso del Jugador",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(this.estatura.getText())){
            JOptionPane.showMessageDialog(null, "Debes ingresar la estatura del Jugador",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
        }
        // verifica los datos
        
        else if(!"".equals(this.peso.getText()) && !"".equals(this.estatura.getText())){
            try{
                double pesoFinal = Double.parseDouble(this.peso.getText());
                double estaturaFinal = Double.parseDouble(this.estatura.getText());
                
                if(pesoFinal < 0){
                    JOptionPane.showMessageDialog(null, "El peso no puede ser un número negativo",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
                }
                else if(estaturaFinal < 0){
                    JOptionPane.showMessageDialog(null, "La estatura no puede ser un número negativo",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    estaturaFinal = (estaturaFinal*1e2)/1e2;
                    copa.crearJugador(nombre.getText(), pesoFinal, estaturaFinal, (16 + edad.getSelectedIndex()), 
                            posicion.getSelectedIndex(), 
                            this.posSeleccion);

                    guardarArchivo(copa);
                    JOptionPane.showMessageDialog(null, "Jugador Creado",
                        "Accion Completada", JOptionPane.INFORMATION_MESSAGE);
                    JugadoresAdminisracion atras = new JugadoresAdminisracion();
                    dispose();
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "El peso y la estatura deben ser valores numéricos",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            } 
        }                
    }//GEN-LAST:event_crearActionPerformed

    private void salir(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_salir
        guardarArchivo(copa);
    }//GEN-LAST:event_salir

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton crear;
    private javax.swing.JComboBox<String> edad;
    private javax.swing.JTextField estatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField peso;
    private javax.swing.JComboBox<String> posicion;
    // End of variables declaration//GEN-END:variables
}
