
package Selecciones;

import LogicaCopaCentenario.Copa;
import static LogicaCopaCentenario.ProyectoCopaCentenario.guardarArchivo;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class agregarSeleccion extends javax.swing.JFrame {
    Copa copa;
    File rutaBandera;    
    String nombre;
    public agregarSeleccion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Administrador");
        this.setVisible(true);
        copa = Copa.getInstance();
        guardarArchivo(copa);
        cargarListaBanderas();
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFoto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        listaBanderas = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setText("Bandera");
        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 51, 340, 189));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Crear Selección");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 258, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Imagenes/ss-1-2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 11, 390, -1));

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 467, -1, -1));

        listaBanderas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaBanderasActionPerformed(evt);
            }
        });
        getContentPane().add(listaBanderas, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 266, 162, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/...........................3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        guardarArchivo(copa);
        SeleccionesAdminisrador atras = new SeleccionesAdminisrador();
        dispose();
    }//GEN-LAST:event_atrasActionPerformed
    public void cargarListaBanderas(){
        listaBanderas.addItem("Estados Unidos");
        listaBanderas.addItem("Colombia");
        listaBanderas.addItem("Costa Rica");
        listaBanderas.addItem("Paraguay");
        
        listaBanderas.addItem("Brasil");
        listaBanderas.addItem("Ecuador");
        listaBanderas.addItem("Haití");
        listaBanderas.addItem("Perú");
        
        listaBanderas.addItem("México");
        listaBanderas.addItem("Uruguay");
        listaBanderas.addItem("Jamaica");
        listaBanderas.addItem("Venezuela");
        
        listaBanderas.addItem("Argentina");
        listaBanderas.addItem("Chile");
        listaBanderas.addItem("Panamá");
        listaBanderas.addItem("Bolivia");
        
        listaBanderas.addItem("Trinidad y Tobago");
        listaBanderas.addItem("Belice");
        listaBanderas.addItem("El Salvador");
        listaBanderas.addItem("Honduras");
        listaBanderas.addItem("Surinam");
        listaBanderas.addItem("Guatemala");
        listaBanderas.addItem("Nicaragua");
        listaBanderas.addItem("Curazao");
        listaBanderas.addItem("Canadá");
        listaBanderas.addItem("Cuba");
        
    }
    public void crearSeleccion(String pNombre, String pRutaBandera){        
        try{
            copa.crearSeleccion(pNombre, pRutaBandera);
            JOptionPane.showMessageDialog(null, "Selección Creada",
                "Accion Completada", JOptionPane.INFORMATION_MESSAGE);                             
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(),
                "Accion incompletada", JOptionPane.WARNING_MESSAGE);
        }        
    }
    private void salir(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_salir
        guardarArchivo(copa);
    }//GEN-LAST:event_salir

    private void listaBanderasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaBanderasActionPerformed
        ImageIcon icon;
        Icon icono;
        
        switch(listaBanderas.getSelectedIndex()){
            case 0:
                rutaBandera = new File("src\\imagenes\\selecciones\\usa.gif");                
                break;

            case 1:
                rutaBandera = new File("src\\imagenes\\selecciones\\colombia.png");
                break;

            case 2:
                rutaBandera = new File("src\\imagenes\\selecciones\\costaRica.jpg");                
                break;
            case 3:
                rutaBandera = new File("src\\imagenes\\selecciones\\paraguay.png");                
                break;

            case 4:
                rutaBandera = new File("src\\imagenes\\selecciones\\brasil.gif");                
                break;

            case 5:
                rutaBandera = new File("src\\imagenes\\selecciones\\ecuador.png");               
                break;

            case 6:
                rutaBandera = new File("src\\imagenes\\selecciones\\haiti.png");               
                break;

            case 7:
                rutaBandera = new File("src\\imagenes\\selecciones\\peru.png");                
                break;

            case 8:
                rutaBandera = new File("src\\imagenes\\selecciones\\mexico.jpg");               
                break;

            case 9:
                rutaBandera = new File("src\\imagenes\\selecciones\\uruguay.png");               
                break;

            case 10:
                rutaBandera = new File("src\\imagenes\\selecciones\\jamaica.png");                
                break;

            case 11:
                rutaBandera = new File("src\\imagenes\\selecciones\\venezuela.jpg");                
                break;

            case 12:
                rutaBandera = new File("src\\imagenes\\selecciones\\argentina.png");                
                break;

            case 13:
                rutaBandera = new File("src\\imagenes\\selecciones\\chile.jpg");                
                break;

            case 14:
                rutaBandera = new File("src\\imagenes\\selecciones\\panama.png");                
                break;

            case 15:
                rutaBandera = new File("src\\imagenes\\selecciones\\bolivia.jpg");                
                break;

            case 16:
                rutaBandera = new File("src\\imagenes\\selecciones\\trinidadytobago.gif");               
                break;

            case 17:
                rutaBandera = new File("src\\imagenes\\selecciones\\belice.gif");                
                break;

            case 18:
                rutaBandera = new File("src\\imagenes\\selecciones\\salvador.jpg");               
                break;

            case 19:
                rutaBandera = new File("src\\imagenes\\selecciones\\honduras.jpg");               
                break;

            case 20:
                rutaBandera = new File("src\\imagenes\\selecciones\\surinam.png");                
                break;

            case 21:
                rutaBandera = new File("src\\imagenes\\selecciones\\guatemala.png");                
                break;

            case 22:
                rutaBandera = new File("src\\imagenes\\selecciones\\nicaragua.png");                
                break;

            case 23:
                rutaBandera = new File("src\\imagenes\\selecciones\\curazao.jpg");                
                break;

            case 24:
                rutaBandera = new File("src\\imagenes\\selecciones\\canada.jpg");                
                break;

            case 25:
                rutaBandera = new File("src\\imagenes\\selecciones\\cuba.png");                
                break;

        }
        nombre = listaBanderas.getSelectedItem().toString();
        icon = new ImageIcon(rutaBandera.toString());                
        icono = new ImageIcon(icon.getImage().
        getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), 
        Image.SCALE_DEFAULT));
        lblFoto.setText(null);
        lblFoto.setIcon(icono);
    }//GEN-LAST:event_listaBanderasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(copa.getSelecciones().size()<16){ 
            crearSeleccion(nombre, rutaBandera.toString());
        }else{
            JOptionPane.showMessageDialog(null, "Ya no puede agregar más selecciones a la copa." ,
                    "Accion no completada", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JComboBox listaBanderas;
    // End of variables declaration//GEN-END:variables
}
