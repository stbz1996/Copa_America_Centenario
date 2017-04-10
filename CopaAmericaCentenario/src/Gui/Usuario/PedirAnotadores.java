
package Gui.Usuario;

import LogicaCopaCentenario.Copa;
import static LogicaCopaCentenario.ProyectoCopaCentenario.guardarArchivo;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PedirAnotadores extends javax.swing.JFrame {
    Copa copa;
    int golesLocal;
    int golesVisita;
    int indicePartido;
    public PedirAnotadores(int pIndicePartido, int pGolesLocal, int pGolesVisita) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Bienvenido a la copa America Centenario 2016");
        this.setVisible(true);
        golesLocal = pGolesLocal;
        golesVisita = pGolesVisita;
        indicePartido = pIndicePartido;
        copa = Copa.getInstance(); 
        btnGuardar.setEnabled(false);
        cargarBanderas();
        cargarJugadores();
        asignarTitulos();
        verificarCantidadGoles();
    }

    public void cargarBanderas(){
        ImageIcon icon = new ImageIcon(copa.getPartidos().get(indicePartido).getLocal().getBandera().toString());                
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(bandera.getWidth(), bandera.getHeight(),Image.SCALE_DEFAULT));
            bandera.setText(null);
            bandera.setIcon(icono);
        icon = new ImageIcon(copa.getPartidos().get(indicePartido).getVisitante().getBandera().toString());                
        icono = new ImageIcon(icon.getImage().getScaledInstance(bandera1.getWidth(), bandera1.getHeight(),Image.SCALE_DEFAULT));
            bandera1.setText(null);
            bandera1.setIcon(icono);
            bandera.setText("");
            bandera1.setText("");
    }
    
    public void verificarCantidadGoles(){
        if(golesLocal == 0 && golesVisita == 0){
            btnGuardar.setEnabled(true);
        }
    }
    public boolean validarCamposTexto1(){
        try{
             int golesLocal = Integer.parseInt(this.txtGolesLocal.getText());

             if(golesLocal < 0){
                 JOptionPane.showMessageDialog(null, "Los goles del local no pueden ser números negativos",
                 "Accion no completada",JOptionPane.WARNING_MESSAGE);
                 return false;
                 
             }
             if(golesLocal == 0){
                    JOptionPane.showMessageDialog(null, "Debe colocar números mayores que cero.",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
                    return false;
             }else{           
                 return true;
             }
         }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Debe colocar números en los marcadores",
                "Accion no completada",JOptionPane.WARNING_MESSAGE);         
            return false;
        }
    }
    public boolean validarCamposTexto2(){
        try{
             int golesVisita = Integer.parseInt(this.txtGolesVisita.getText());

             if(golesVisita < 0){
                 JOptionPane.showMessageDialog(null, "Los goles del visitante no pueden ser números negativos",
                 "Accion no completada",JOptionPane.WARNING_MESSAGE);
                 return false;
             } 
            if( golesVisita == 0){
               JOptionPane.showMessageDialog(null, "Debe colocar números mayores que cero.",
               "Accion no completada",JOptionPane.WARNING_MESSAGE);
               return false;
             }else{            
                 return true;
             }
         }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Debe colocar números en los marcadores",
                "Accion no completada",JOptionPane.WARNING_MESSAGE);         
            return false;
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listaJugadoresLocal = new javax.swing.JComboBox<>();
        listaJugadoresVisita = new javax.swing.JComboBox<>();
        bandera = new javax.swing.JLabel();
        bandera1 = new javax.swing.JLabel();
        txtGolesLocal = new javax.swing.JTextField();
        txtGolesVisita = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrando los Goles del Partido");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jPanel1.add(listaJugadoresLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 225, 268, -1));

        jPanel1.add(listaJugadoresVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 225, 268, -1));
        jPanel1.add(bandera, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 280, 150));
        jPanel1.add(bandera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 280, 160));
        jPanel1.add(txtGolesLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 80, -1));

        txtGolesVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGolesVisitaActionPerformed(evt);
            }
        });
        jPanel1.add(txtGolesVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 80, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad de goles:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 110, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cantidad de goles:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 110, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 463, 83, 34));

        jButton2.setText("Anotar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 80, -1));

        jButton3.setText("Anotar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 80, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wembley.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 779, 538));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void cargarJugadores(){
        //Carga los jugadores del equipo LOCAL
        for(int i = 0; i<copa.getPartidos().get(indicePartido).getLocal().getJugadores().size();i++){
            listaJugadoresLocal.addItem(copa.getPartidos().get(indicePartido).getLocal().getJugadores().get(i).getNombre());
        }
        //Carga los jugadores del equipo VISITANTE
        for(int i = 0; i<copa.getPartidos().get(indicePartido).getVisitante().getJugadores().size();i++){
            listaJugadoresVisita.addItem(copa.getPartidos().get(indicePartido).getVisitante().getJugadores().get(i).getNombre());
        }
    }
    public void asignarTitulos(){
        
    }
    private void txtGolesVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGolesVisitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGolesVisitaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(validarCamposTexto1()){
            if(txtGolesLocal.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Debe digitar los goles del jugador", "Aviso", JOptionPane.WARNING_MESSAGE );
            }else{
                if(golesLocal>0){

                    int posJugador = listaJugadoresLocal.getSelectedIndex();
                    int posSeleccion = 0;
                    String nombreSeleccion = copa.getPartidos().get(indicePartido).getLocal().getNombre();
                    for(int i = 0; i< copa.getSelecciones().size(); i++){
                        if(copa.getSelecciones().get(i).getNombre().equals(nombreSeleccion)){
                            posSeleccion = i;
                        }
                    }
                    if(Integer.parseInt(txtGolesLocal.getText())<=golesLocal){
                        for(int j = 0; j<Integer.parseInt(txtGolesLocal.getText()); j++){
                            copa.crearGol(copa.getPartidos().get(indicePartido).getFecha(), posSeleccion, posJugador, indicePartido, 1);
                        }
                        JOptionPane.showMessageDialog(this, "Goles registrados", "Información", JOptionPane.INFORMATION_MESSAGE);
                        golesLocal-=Integer.parseInt(txtGolesLocal.getText());
                        verificarCantidadGoles();
                    }else{
                        JOptionPane.showMessageDialog(this, "La cantidad de goles ingresados no es válido", "Aviso", JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "No tiene goles por registrar.", "Aviso", JOptionPane.WARNING_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(validarCamposTexto2()){
            if(txtGolesVisita.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Debe digitar los goles del jugador", "Aviso", JOptionPane.WARNING_MESSAGE );
            }else{
                if(golesVisita>0){

                    int posJugador = listaJugadoresVisita.getSelectedIndex();
                    int posSeleccion = 0;
                    String nombreSeleccion = copa.getPartidos().get(indicePartido).getVisitante().getNombre();
                    for(int i = 0; i< copa.getSelecciones().size(); i++){
                        if(copa.getSelecciones().get(i).getNombre().equals(nombreSeleccion)){
                            posSeleccion = i;
                        }
                    }
                    if(Integer.parseInt(txtGolesVisita.getText())<=golesVisita){
                        for(int j = 0; j<Integer.parseInt(txtGolesVisita.getText()); j++){
                            copa.crearGol(copa.getPartidos().get(indicePartido).getFecha(), posSeleccion, posJugador, indicePartido, 2);
                        }                    
                        JOptionPane.showMessageDialog(this, "Goles registrados", "Información", JOptionPane.INFORMATION_MESSAGE);
                        golesVisita-=Integer.parseInt(txtGolesVisita.getText());
                        verificarCantidadGoles();
                    }else{
                        JOptionPane.showMessageDialog(this, "La cantidad de goles ingresados no es válido", "Aviso", JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "No tiene goles por registrar.", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void salir(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_salir
        guardarArchivo(copa);
    }//GEN-LAST:event_salir

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        copa.ordenarGrupos();
        copa.getPartidos().get(indicePartido).setYajugaron(true);
        
        boolean verificar = true;
        for(int i = 0; i < copa.getPartidos().size(); i++){
            if(copa.getPartidos().get(i).getYajugaron() == false){
                verificar = false;
            }
        }
        
        if(verificar == true && "cuartos".equals(copa.getControl())){
            copa.CrearCuartosFinal();
            copa.ColocarCuartosFinal();
            copa.setControl("semifinal");
            JOptionPane.showMessageDialog(this, "Se acaban de crear los partidos de"
                    + " los cuartos de final, ya puede editarlos en el menú "
                    + "de partidos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(verificar == true && "semifinal".equals(copa.getControl())){
            copa.cargarSemifinales();
            copa.setControl("tercer lugar");
            JOptionPane.showMessageDialog(this, "Se acaban de crear los partidos de"
                    + " las semifinales, ya puede editarlos en el menú "
                    + "de partidos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(verificar == true && "tercer lugar".equals(copa.getControl())){
            copa.cargartercerLugar_y_laGranFinal();
            copa.setControl("final");
            JOptionPane.showMessageDialog(this, "Se acaba de crear el partidos por"
                    + " el tercer lugar de la copa, ya puede editarlos en el menú "
                    + "de partidos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(verificar == true && "final".equals(copa.getControl())){
            copa.cargarFinal();
            copa.setControl("congratulation");
            JOptionPane.showMessageDialog(this, "Se acaba de crear el partidos por"
                    + " LA GRAN FINAL de la copa, ya puede editarlos en el menú "
                    + "de partidos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        else if(verificar == true && "congratulation".equals(copa.getControl())){
            // se llama la pantalla para felicitar el campeon
            String campeon = copa.getCampeon();
            copa.setControl("congratulation");
            JOptionPane.showMessageDialog(this, "Felicidades " + campeon + " "
                    + "Nuevo Campeón de la Copa América Centenario", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        
        menuUsuario ventana = new menuUsuario();
        dispose();
        
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bandera;
    private javax.swing.JLabel bandera1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listaJugadoresLocal;
    private javax.swing.JComboBox<String> listaJugadoresVisita;
    private javax.swing.JTextField txtGolesLocal;
    private javax.swing.JTextField txtGolesVisita;
    // End of variables declaration//GEN-END:variables
}
