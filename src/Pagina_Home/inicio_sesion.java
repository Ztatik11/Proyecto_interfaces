package Pagina_Home;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import static java.lang.Short.toString;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openide.util.Exceptions;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AlvaroCarrascoGarcia
 */
public class inicio_sesion extends javax.swing.JFrame {
    consultas_sql conexion_db;
    Usuario usuario_i;
    /**
     * Creates new form inicio_sesion
     */
    public inicio_sesion(Usuario usuario_tranferido) throws SQLException {
        this.usuario_i=usuario_tranferido;
        initComponents();
        
        comprobarInicioS(usuario_i);
        this.UserLabel.setVisible(false);
        this.UserLabel.setText("");
        this.ajustes.setVisible(false);
        this.miniMenu.setVisible(false);
        this.conexion_db = new consultas_sql("mango_games","root","root");
        
    }
    
     public void comprobarInicioS(Usuario usuario){
        
        if(usuario.getNombre_usuario().equals("")==false){
            esAdmin(usuario_i.getAdmin());
            ajustes.setVisible(true);
            this.UserLabel.setText("Bienvenido "+this.usuario_i.getNombre_usuario());
            UserLabel.setVisible(true);
            botonRegistro.setVisible(false);
        }else{
            ajustes.setVisible(false);
            UserLabel.setVisible(false);
            botonRegistro.setVisible(true);
        }
    }
    
    public void esAdmin(boolean admin){
        if(admin==true){
            botonAdmin.setVisible(true);
        }else{
            botonAdmin.setVisible(false);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menuButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        botonRegistro = new javax.swing.JButton();
        ajustes = new javax.swing.JButton();
        miniMenu = new javax.swing.JPanel();
        botonAdmin = new javax.swing.JButton();
        cerrarSButon = new javax.swing.JButton();
        UserLabel = new javax.swing.JLabel();
        BotonInformacion = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        clave_inicio = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        usuario_correo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        boton_inicion_sesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MANGO GAMES");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 43, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MicrosoftTeams-image (2).png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 15, 126, 125));

        menuButton.setBackground(new java.awt.Color(0, 153, 255));
        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeIcon.png"))); // NOI18N
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        jPanel6.add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 76, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonRegistro.setBackground(new java.awt.Color(0, 153, 255));
        botonRegistro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistro.setText("registro");
        botonRegistro.setToolTipText("");
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        ajustes.setBackground(new java.awt.Color(0, 153, 255));
        ajustes.setForeground(new java.awt.Color(255, 255, 255));
        ajustes.setText("Ajustes");
        ajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajustesActionPerformed(evt);
            }
        });
        jPanel1.add(ajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 90, -1));

        miniMenu.setBackground(new java.awt.Color(0, 102, 204));

        botonAdmin.setText("Admin");
        botonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdminActionPerformed(evt);
            }
        });

        cerrarSButon.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cerrarSButon.setText("Cerrar Sesion");
        cerrarSButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout miniMenuLayout = new javax.swing.GroupLayout(miniMenu);
        miniMenu.setLayout(miniMenuLayout);
        miniMenuLayout.setHorizontalGroup(
            miniMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miniMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(miniMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cerrarSButon, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addContainerGap())
        );
        miniMenuLayout.setVerticalGroup(
            miniMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miniMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cerrarSButon)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(miniMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(miniMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 220, -1));

        UserLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.add(UserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 250, 20));

        BotonInformacion.setBackground(new java.awt.Color(0, 153, 255));
        BotonInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info.png"))); // NOI18N
        BotonInformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonInformacionMouseClicked(evt);
            }
        });
        BotonInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInformacionActionPerformed(evt);
            }
        });
        jPanel6.add(BotonInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 140));

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("CONTRASEÑA:");
        jLabel1.setAutoscrolls(true);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("CONTRASEÑA:");
        jLabel7.setAutoscrolls(true);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        clave_inicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clave_inicio.setMaximumSize(new java.awt.Dimension(880, 560));
        clave_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clave_inicioActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        usuario_correo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuario_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario_correoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jPanel7.setBackground(new java.awt.Color(0, 102, 153));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("INICIO DE SESIÓN");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(183, 183, 183))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("USUARIO/CORREO ELECTRÓNICO:");
        jLabel6.setAutoscrolls(true);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        boton_inicion_sesion.setText("INICIAR SESIÓN");
        boton_inicion_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_inicion_sesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clave_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(244, 244, 244))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(usuario_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_inicion_sesion)
                            .addComponent(jButton2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clave_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(boton_inicion_sesion)
                .addGap(35, 35, 35)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 433, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 880, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuario_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuario_correoActionPerformed

    private void clave_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clave_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clave_inicioActionPerformed

    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
       registro b = null;
        try {
            b = new registro(this.usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
       b.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_botonRegistroActionPerformed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        homeInterface c = null;
        try {
            c = new homeInterface(usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
       c.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jLabel4MousePressed

     
    private void boton_inicion_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_inicion_sesionActionPerformed
        // TODO add your handling code here:
        boolean admin;
        String nombre_usuario;
        String id;
        char [] clave_array = clave_inicio.getPassword();
            String pass = "";
            
            for (int j = 0; j < clave_array.length; j++) {
                pass+=clave_array[j];
            }
        try {
            ResultSet usuario = conexion_db.realizar_consulta("select * from usuarios where (usuario="+conexion_db.parsear_cadena(usuario_correo.getText())+" or email="+conexion_db.parsear_cadena(usuario_correo.getText())+") and "+"clave="+conexion_db.parsear_cadena(pass));
            if(conexion_db.leer_resultset_string(usuario, "Usuario")!=null){
                
                if(conexion_db.leer_resultset_string(usuario,"administrador").equalsIgnoreCase("1")){
                    admin = true;
                }else{
                    admin = false;
                }         
                nombre_usuario=conexion_db.leer_resultset_string(usuario, "Usuario");
                id=conexion_db.leer_resultset_string(usuario, "ID");
                this.usuario_i = new Usuario(nombre_usuario,admin,id);
                this.UserLabel.setText("Bienvenido "+this.usuario_i.getNombre_usuario());
                this.UserLabel.setVisible(true);
                this.ajustes.setVisible(true);
                this.botonRegistro.setVisible(false);
                 homeInterface a = null;
                    try {
                        a = new homeInterface(usuario_i);
                    } catch (SQLException ex) {
                      Logger.getLogger(homeInterface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    a.setVisible(true);
                    this.setVisible(false);
                    LocalDate fecha = LocalDate.now();
                    conexion_db.actualizar_resultset_string(usuario, "ultimo_inicio_sesion", conexion_db.formatear_fecha(fecha));
                }else{
                String nombre = conexion_db.leer_resultset_string(usuario, "Usuario");
                String correo = conexion_db.leer_resultset_string(usuario, "email");
                System.out.println(nombre);
                System.out.println(correo);
                System.out.println(conexion_db.leer_resultset_string(usuario, "clave"));
                if(nombre == null || correo == null || conexion_db.leer_resultset_string(usuario, "clave")== null){
                    JOptionPane.showMessageDialog(rootPane, "ERROR: LOS DATOS INTRODUCIDOS SON ERRONEOS");
                }
            }
        } catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
        }
         
    }//GEN-LAST:event_boton_inicion_sesionActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // TODO add your handling code here:
        homeInterface a = null;
        try {
            a = new homeInterface(usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(homeInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
       a.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_menuButtonActionPerformed

    private void ajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajustesActionPerformed
         if(miniMenu.isVisible()==true){
            miniMenu.setVisible(false);
        }else{
            miniMenu.setVisible(true);
        }
    }//GEN-LAST:event_ajustesActionPerformed

    private void cerrarSButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSButonActionPerformed
        usuario_i.setAdmin(false);
        usuario_i.setId("");
        usuario_i.setNombre_usuario("");
        comprobarInicioS(usuario_i);
        miniMenu.setVisible(false);
    }//GEN-LAST:event_cerrarSButonActionPerformed

    private void botonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdminActionPerformed
        // TODO add your handling code here:
        Registro_juegos a = null;
        try {
            a = new Registro_juegos(usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(Registro_juegos.class.getName()).log(Level.SEVERE, null, ex);
        }
       a.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_botonAdminActionPerformed

    private void BotonInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInformacionMouseClicked
        File htmlFile = new File("C:src/Pagina_manual//index.html");
        try {
            Desktop.getDesktop().browse(htmlFile.toURI());
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_BotonInformacionMouseClicked

    private void BotonInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInformacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonInformacionActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new inicio_sesion(this.).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInformacion;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JButton ajustes;
    private javax.swing.JButton botonAdmin;
    private javax.swing.JButton botonRegistro;
    private javax.swing.JButton boton_inicion_sesion;
    private javax.swing.JButton cerrarSButon;
    private javax.swing.JPasswordField clave_inicio;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton menuButton;
    private javax.swing.JPanel miniMenu;
    private javax.swing.JTextField usuario_correo;
    // End of variables declaration//GEN-END:variables

    

    


}