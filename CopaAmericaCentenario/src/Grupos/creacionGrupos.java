
package Grupos;

import Gui_Administrador.MenuAdministrador;
import LogicaCopaCentenario.Copa;
import static LogicaCopaCentenario.ProyectoCopaCentenario.guardarArchivo;
import javax.swing.JOptionPane;

public class creacionGrupos extends javax.swing.JFrame {
    Copa copa;
    public creacionGrupos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Administrador");
        this.setVisible(true);
        copa = Copa.getInstance();
        cargarDatos();
        completarDatos();
    }
    
    private void completarDatos(){
        if(copa.getGrupo1().get(0)==0 && copa.getGrupo1().get(1)==0 ){
            System.out.println("Están vacios"); 
        }else{
            grupo1_1.setSelectedIndex(copa.getGrupo1().get(0)+1);
            grupo1_2.setSelectedIndex(copa.getGrupo1().get(1)+1);
            grupo1_3.setSelectedIndex(copa.getGrupo1().get(2)+1);
            grupo1_4.setSelectedIndex(copa.getGrupo1().get(3)+1);

            grupo2_1.setSelectedIndex(copa.getGrupo2().get(0)+1);
            grupo2_2.setSelectedIndex(copa.getGrupo2().get(1)+1);
            grupo2_3.setSelectedIndex(copa.getGrupo2().get(2)+1);
            grupo2_4.setSelectedIndex(copa.getGrupo2().get(3)+1);

            grupo3_1.setSelectedIndex(copa.getGrupo3().get(0)+1);
            grupo3_2.setSelectedIndex(copa.getGrupo3().get(1)+1);
            grupo3_3.setSelectedIndex(copa.getGrupo3().get(2)+1);
            grupo3_4.setSelectedIndex(copa.getGrupo3().get(3)+1);

            grupo4_1.setSelectedIndex(copa.getGrupo4().get(0)+1);
            grupo4_2.setSelectedIndex(copa.getGrupo4().get(1)+1);
            grupo4_3.setSelectedIndex(copa.getGrupo4().get(2)+1);
            grupo4_4.setSelectedIndex(copa.getGrupo4().get(3)+1);
        }
    }
    
    private void verificaGrupo(int index) throws Exception{
        int conteo = 0;
        if(grupo1_1.getSelectedIndex() == index && index != 0){conteo++;}
        if(grupo1_2.getSelectedIndex() == index && index != 0){conteo++;}
        if(grupo1_3.getSelectedIndex() == index && index != 0){conteo++;}
        if(grupo1_4.getSelectedIndex() == index && index != 0){conteo++;}
        if(grupo2_1.getSelectedIndex() == index && index != 0){conteo++;}
        if(grupo2_2.getSelectedIndex() == index && index != 0){conteo++;}
        if(grupo2_3.getSelectedIndex() == index && index != 0){conteo++;}
        if(grupo2_4.getSelectedIndex() == index && index != 0){conteo++;}
        if(grupo3_1.getSelectedIndex() == index && index != 0){conteo++;}
        if(grupo3_2.getSelectedIndex() == index && index != 0){conteo++;}
        if(grupo3_3.getSelectedIndex() == index && index != 0){conteo++;}
        if(grupo3_4.getSelectedIndex() == index && index != 0){conteo++;}
        if(grupo4_1.getSelectedIndex() == index && index != 0){conteo++;}
        if(grupo4_2.getSelectedIndex() == index && index != 0){conteo++;}
        if(grupo4_3.getSelectedIndex() == index && index != 0){conteo++;}
        if(grupo4_4.getSelectedIndex() == index && index != 0){conteo++;}
        
        if(conteo > 1){
            throw new Exception("La selección de " + copa.getSelecciones().get(index-1).getNombre() + " ya tiene asignado un grupo");
        }
    }    

    
    private void cargarDatos(){
        for(int i = -1; i < copa.getSelecciones().size(); i++){
            String e;
            if(i == -1){e = "";}
            else{ e = copa.getSelecciones().get(i).getNombre();}
            this.grupo1_1.addItem(e); this.grupo1_2.addItem(e);
            this.grupo1_3.addItem(e); this.grupo1_4.addItem(e);
            this.grupo2_1.addItem(e); this.grupo2_2.addItem(e);
            this.grupo2_3.addItem(e); this.grupo2_4.addItem(e);
            this.grupo3_1.addItem(e); this.grupo3_2.addItem(e);
            this.grupo3_3.addItem(e); this.grupo3_4.addItem(e);
            this.grupo4_1.addItem(e); this.grupo4_2.addItem(e);
            this.grupo4_3.addItem(e); this.grupo4_4.addItem(e);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        grupo3_1 = new javax.swing.JComboBox<>();
        grupo1_3 = new javax.swing.JComboBox<>();
        grupo1_1 = new javax.swing.JComboBox<>();
        grupo1_2 = new javax.swing.JComboBox<>();
        grupo1_4 = new javax.swing.JComboBox<>();
        grupo4_1 = new javax.swing.JComboBox<>();
        grupo3_4 = new javax.swing.JComboBox<>();
        grupo4_2 = new javax.swing.JComboBox<>();
        grupo4_3 = new javax.swing.JComboBox<>();
        grupo3_2 = new javax.swing.JComboBox<>();
        grupo2_2 = new javax.swing.JComboBox<>();
        grupo4_4 = new javax.swing.JComboBox<>();
        grupo2_3 = new javax.swing.JComboBox<>();
        grupo2_4 = new javax.swing.JComboBox<>();
        grupo3_3 = new javax.swing.JComboBox<>();
        grupo2_1 = new javax.swing.JComboBox<>();
        guardarDatosGrupos = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                salir(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Grupo 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 28, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Grupo 4");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 314, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Grupo 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 28, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Grupo 3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 314, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("1.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 78, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("2.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 113, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("4.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 183, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("3.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 148, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("4.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 183, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("3.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 153, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("2.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 118, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("1.");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 83, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("4.");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 468, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("1.");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 369, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("3.");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 434, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("2.");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 404, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("3.");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 439, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("2.");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 404, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("4.");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 469, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("1.");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 369, -1, -1));

        grupo3_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grupo3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo3_1ActionPerformed(evt);
            }
        });
        getContentPane().add(grupo3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 370, 266, -1));

        grupo1_3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grupo1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo1_3ActionPerformed(evt);
            }
        });
        getContentPane().add(grupo1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 149, 266, -1));

        grupo1_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grupo1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grupo1_1MouseClicked(evt);
            }
        });
        grupo1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo1_1ActionPerformed(evt);
            }
        });
        getContentPane().add(grupo1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 79, 266, -1));

        grupo1_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grupo1_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grupo1_2MouseClicked(evt);
            }
        });
        grupo1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo1_2ActionPerformed(evt);
            }
        });
        getContentPane().add(grupo1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 114, 266, -1));

        grupo1_4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grupo1_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo1_4ActionPerformed(evt);
            }
        });
        getContentPane().add(grupo1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 184, 266, -1));

        grupo4_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grupo4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo4_1ActionPerformed(evt);
            }
        });
        getContentPane().add(grupo4_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 370, 266, -1));

        grupo3_4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grupo3_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo3_4ActionPerformed(evt);
            }
        });
        getContentPane().add(grupo3_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 468, 266, -1));

        grupo4_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grupo4_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo4_2ActionPerformed(evt);
            }
        });
        getContentPane().add(grupo4_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 405, 266, -1));

        grupo4_3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grupo4_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo4_3ActionPerformed(evt);
            }
        });
        getContentPane().add(grupo4_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 440, 266, -1));

        grupo3_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grupo3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo3_2ActionPerformed(evt);
            }
        });
        getContentPane().add(grupo3_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 405, 266, -1));

        grupo2_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grupo2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo2_2ActionPerformed(evt);
            }
        });
        getContentPane().add(grupo2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 119, 266, -1));

        grupo4_4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grupo4_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo4_4ActionPerformed(evt);
            }
        });
        getContentPane().add(grupo4_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 470, 266, -1));

        grupo2_3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grupo2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo2_3ActionPerformed(evt);
            }
        });
        getContentPane().add(grupo2_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 154, 266, -1));

        grupo2_4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grupo2_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo2_4ActionPerformed(evt);
            }
        });
        getContentPane().add(grupo2_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 184, 266, -1));

        grupo3_3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grupo3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo3_3ActionPerformed(evt);
            }
        });
        getContentPane().add(grupo3_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 434, 266, -1));

        grupo2_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grupo2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupo2_1ActionPerformed(evt);
            }
        });
        getContentPane().add(grupo2_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 84, 266, -1));

        guardarDatosGrupos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        guardarDatosGrupos.setText("Guardar los Grupos");
        guardarDatosGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDatosGruposActionPerformed(evt);
            }
        });
        getContentPane().add(guardarDatosGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 234, -1, 62));

        atras.setText("atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 503, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/..ima.jpg"))); // NOI18N
        jLabel22.setText("jLabel22");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salir(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_salir
        guardarArchivo(copa);
    }//GEN-LAST:event_salir

    private void grupo4_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo4_3ActionPerformed
         try{
            verificaGrupo(grupo4_3.getSelectedIndex());
        }
        catch(Exception e){
            grupo4_3.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_grupo4_3ActionPerformed

    private void grupo1_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grupo1_1MouseClicked
        
        try{
            verificaGrupo(grupo1_1.getSelectedIndex());
        }
        catch(Exception e){
            System.out.println("djfahkjahkfjhdkjfhsdkjfhsdkjfhsdkjfhsdkj");
        }
    }//GEN-LAST:event_grupo1_1MouseClicked

    private void grupo1_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grupo1_2MouseClicked
        
    }//GEN-LAST:event_grupo1_2MouseClicked

    private void grupo1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo1_2ActionPerformed
        try{
            verificaGrupo(grupo1_2.getSelectedIndex());
        }
        catch(Exception e){
            grupo1_2.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_grupo1_2ActionPerformed

    private void grupo1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo1_1ActionPerformed
        try{
            verificaGrupo(grupo1_1.getSelectedIndex());
        }
        catch(Exception e){
            grupo1_1.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_grupo1_1ActionPerformed

    private void grupo1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo1_3ActionPerformed
        try{
            verificaGrupo(grupo1_3.getSelectedIndex());
        }
        catch(Exception e){
            grupo1_3.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_grupo1_3ActionPerformed

    private void grupo1_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo1_4ActionPerformed
        try{
            verificaGrupo(grupo1_4.getSelectedIndex());
        }
        catch(Exception e){
            grupo1_4.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_grupo1_4ActionPerformed

    private void grupo2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo2_1ActionPerformed
        try{
            verificaGrupo(grupo2_1.getSelectedIndex());
        }
        catch(Exception e){
            grupo2_1.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_grupo2_1ActionPerformed

    private void grupo2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo2_2ActionPerformed
        try{
            verificaGrupo(grupo2_2.getSelectedIndex());
        }
        catch(Exception e){
            grupo2_2.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_grupo2_2ActionPerformed

    private void grupo2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo2_3ActionPerformed
        try{
            verificaGrupo(grupo2_3.getSelectedIndex());
        }
        catch(Exception e){
            grupo2_3.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_grupo2_3ActionPerformed

    private void grupo2_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo2_4ActionPerformed
        try{
            verificaGrupo(grupo2_4.getSelectedIndex());
        }
        catch(Exception e){
            grupo2_4.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_grupo2_4ActionPerformed

    private void grupo3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo3_1ActionPerformed
        try{
            verificaGrupo(grupo3_1.getSelectedIndex());
        }
        catch(Exception e){
            grupo3_1.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_grupo3_1ActionPerformed

    private void grupo3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo3_2ActionPerformed
        try{
            verificaGrupo(grupo3_2.getSelectedIndex());
        }
        catch(Exception e){
            grupo3_2.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_grupo3_2ActionPerformed

    private void grupo3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo3_3ActionPerformed
        try{
            verificaGrupo(grupo3_3.getSelectedIndex());
        }
        catch(Exception e){
            grupo3_3.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_grupo3_3ActionPerformed

    private void grupo3_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo3_4ActionPerformed
        try{
            verificaGrupo(grupo3_4.getSelectedIndex());
        }
        catch(Exception e){
            grupo3_4.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_grupo3_4ActionPerformed

    private void grupo4_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo4_1ActionPerformed
        try{
            verificaGrupo(grupo4_1.getSelectedIndex());
        }
        catch(Exception e){
            grupo4_1.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_grupo4_1ActionPerformed

    private void grupo4_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo4_2ActionPerformed
         try{
            verificaGrupo(grupo4_2.getSelectedIndex());
        }
        catch(Exception e){
            grupo4_2.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_grupo4_2ActionPerformed

    private void grupo4_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupo4_4ActionPerformed
         try{
            verificaGrupo(grupo4_4.getSelectedIndex());
        }
        catch(Exception e){
            grupo4_4.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_grupo4_4ActionPerformed

    private void guardarDatosGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDatosGruposActionPerformed
        int conteo = 0;
        if(grupo1_1.getSelectedIndex() == 0 ){conteo++;}
        if(grupo1_2.getSelectedIndex() == 0 ){conteo++;}
        if(grupo1_3.getSelectedIndex() == 0 ){conteo++;}
        if(grupo1_4.getSelectedIndex() == 0 ){conteo++;}
        if(grupo2_1.getSelectedIndex() == 0 ){conteo++;}
        if(grupo2_2.getSelectedIndex() == 0 ){conteo++;}
        if(grupo2_3.getSelectedIndex() == 0 ){conteo++;}
        if(grupo2_4.getSelectedIndex() == 0 ){conteo++;}
        if(grupo3_1.getSelectedIndex() == 0 ){conteo++;}
        if(grupo3_2.getSelectedIndex() == 0 ){conteo++;}
        if(grupo3_3.getSelectedIndex() == 0 ){conteo++;}
        if(grupo3_4.getSelectedIndex() == 0 ){conteo++;}
        if(grupo4_1.getSelectedIndex() == 0 ){conteo++;}
        if(grupo4_2.getSelectedIndex() == 0 ){conteo++;}
        if(grupo4_3.getSelectedIndex() == 0 ){conteo++;}
        if(grupo4_4.getSelectedIndex() == 0 ){conteo++;}
        
        if(conteo == 0){
            copa.completarGrupos(grupo1_1.getSelectedIndex()-1, grupo1_2.getSelectedIndex()-1,
                    grupo1_3.getSelectedIndex()-1, grupo1_4.getSelectedIndex()-1,
                    grupo2_1.getSelectedIndex()-1, grupo2_2.getSelectedIndex()-1,
                    grupo2_3.getSelectedIndex()-1, grupo2_4.getSelectedIndex()-1,
                    grupo3_1.getSelectedIndex()-1, grupo3_2.getSelectedIndex()-1,
                    grupo3_3.getSelectedIndex()-1, grupo3_4.getSelectedIndex()-1,
                    grupo4_1.getSelectedIndex()-1, grupo4_2.getSelectedIndex()-1,
                    grupo4_3.getSelectedIndex()-1, grupo4_4.getSelectedIndex()-1);
            
            
            copa.crearPartidos();
            copa.asignarGrupoASelecciones();
            JOptionPane.showMessageDialog(null, "Grupos guardados correctamente",
                    "Accion no completada",JOptionPane.INFORMATION_MESSAGE);
                                    
            MenuAdministrador atras = new MenuAdministrador();
            dispose();
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Debes llenar todos los grupos para poder guardarlos",
                    "Accion no completada",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_guardarDatosGruposActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        MenuAdministrador atras = new MenuAdministrador();
        dispose();
    }//GEN-LAST:event_atrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JComboBox<String> grupo1_1;
    private javax.swing.JComboBox<String> grupo1_2;
    private javax.swing.JComboBox<String> grupo1_3;
    private javax.swing.JComboBox<String> grupo1_4;
    private javax.swing.JComboBox<String> grupo2_1;
    private javax.swing.JComboBox<String> grupo2_2;
    private javax.swing.JComboBox<String> grupo2_3;
    private javax.swing.JComboBox<String> grupo2_4;
    private javax.swing.JComboBox<String> grupo3_1;
    private javax.swing.JComboBox<String> grupo3_2;
    private javax.swing.JComboBox<String> grupo3_3;
    private javax.swing.JComboBox<String> grupo3_4;
    private javax.swing.JComboBox<String> grupo4_1;
    private javax.swing.JComboBox<String> grupo4_2;
    private javax.swing.JComboBox<String> grupo4_3;
    private javax.swing.JComboBox<String> grupo4_4;
    private javax.swing.JButton guardarDatosGrupos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
