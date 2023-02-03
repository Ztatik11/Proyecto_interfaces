/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pagina_Home;

/**
 *
 * @author JoseManuelRodriguezC
 */

import java.awt.Desktop;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import org.openide.util.Exceptions;

public class homeInterface extends javax.swing.JFrame {

    ArrayList<String> datosJuego = new ArrayList<String>();
    ArrayList<Juego> juegos = new ArrayList<Juego>();
    consultas_sql conexion_db = new consultas_sql("mango_games","root","root");
    java.sql.ResultSet resultSet=conexion_db.realizar_consulta("SELECT * FROM juegos");
    ArrayList<Juego> search = new ArrayList<Juego>();
    Usuario usuario_i;
    
    
    public homeInterface(Usuario usuario) throws SQLException {
        initComponents();
        menu.setVisible(true);
        sinResult.setVisible(false);
        ajustes.setVisible(false);
        miniMenu.setVisible(false);
        UserLabel.setVisible(false);
        this.J1.setVisible(false);
        this.J2.setVisible(false);
        this.J3.setVisible(false);
        this.J4.setVisible(false);
        this.J5.setVisible(false);
        this.J6.setVisible(false);
        this.usuario_i=usuario;
        comprobarInicioS(this.usuario_i);
        
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        this.setIconImage(new ImageIcon(getClass().getResource("/images/MicrosoftTeams-image (2).png")).getImage());
        //Se utiliza para terminar conseguir el numero de columnas del result set
        ResultSetMetaData rsmd = resultSet.getMetaData();
        int totalColumnas = rsmd.getColumnCount();
        
        
        while (resultSet.next()) {
            //Pilla todos los atributos de cada registro
            for(int i=1; totalColumnas>=i; i++){
               datosJuego.add(resultSet.getString(i));
           }
            //Crea el onjeto juego y lo introduce en el array de objetos juegos
            juegos.add(new Juego(datosJuego));
            datosJuego.clear();
        }
    }
    
    public void comprobarInicioS(Usuario usuario){
        if(usuario.getNombre_usuario().equals("")==false){
            esAdmin(usuario.getAdmin());
            ajustes.setVisible(true);
            this.UserLabel.setText("Bienvenido "+this.usuario_i.getNombre_usuario());
            UserLabel.setVisible(true);
            loginButton.setVisible(false);
            registerButton.setVisible(false);
        }else{
            ajustes.setVisible(false);
            UserLabel.setVisible(false);
            loginButton.setVisible(true);
            registerButton.setVisible(true);
        }
    }
    
    public void esAdmin(boolean admin){
        if(admin==true){
            botonAdmin.setVisible(true);
        }else{
            botonAdmin.setVisible(false);
        }
    }
    
    public void busquedaCategorias(String categoria){
    this.search.clear();
    
        JLabel[] labelJuego = {
        G1,
        G2,
        G3,
        G4,
        G5,
        G6
        };
        JButton[] imagenJuego = {
        B1,
        B2,
        B3,
        B4,
        B5,
        B6
        };
        for(int j=0;labelJuego.length>j;j++ ){
            labelJuego[j].setText("");
        } 
        
        for(int i = 0; juegos.size()>i;i++){
            if(categoria.equalsIgnoreCase(juegos.get(i).getGenero())){
                search.add(juegos.get(i)); 
            }else{
            for(int j=0;labelJuego.length>j;j++ ){
                System.out.println("entra");
                labelJuego[j].getParent().setVisible(false);
                sinResult.setVisible(true);
            }
            }
        }
        for(int j=0;search.size()>j;j++ ){
               labelJuego[j].setText(search.get(j).getTitulo());
               Image img=getToolkit().getImage(search.get(j).getImagen());
               img=img.getScaledInstance(B1.getWidth(), B1.getHeight(), Image.SCALE_DEFAULT);
               imagenJuego[j].setIcon(new ImageIcon(img));
        }
        for(int j=0;labelJuego.length>j;j++ ){
            if(labelJuego[j].getText().equalsIgnoreCase("")){
                labelJuego[j].getParent().setVisible(false);
            }else{
                labelJuego[j].getParent().setVisible(true);
                sinResult.setVisible(false);
            }
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
        java.awt.GridBagConstraints gridBagConstraints;

        MenuAyuda = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        fPS = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        plataformas = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        mOBA = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        estrategia = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        rPG = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        soulsLike = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        aventura = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        accion = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        criaturas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel16 = new javax.swing.JPanel();
        J1 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        G1 = new javax.swing.JLabel();
        J2 = new javax.swing.JPanel();
        B2 = new javax.swing.JButton();
        G2 = new javax.swing.JLabel();
        J3 = new javax.swing.JPanel();
        B3 = new javax.swing.JButton();
        G3 = new javax.swing.JLabel();
        J4 = new javax.swing.JPanel();
        B4 = new javax.swing.JButton();
        G4 = new javax.swing.JLabel();
        J5 = new javax.swing.JPanel();
        B5 = new javax.swing.JButton();
        G5 = new javax.swing.JLabel();
        J6 = new javax.swing.JPanel();
        B6 = new javax.swing.JButton();
        G6 = new javax.swing.JLabel();
        sinResult = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        searchBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        menuButton = new javax.swing.JButton();
        ajustes = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        miniMenu = new javax.swing.JPanel();
        botonAdmin = new javax.swing.JButton();
        cerrarSButon = new javax.swing.JButton();
        UserLabel = new javax.swing.JLabel();
        BotonInformacion = new javax.swing.JButton();

        jMenuItem1.setText("Ayuda");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        MenuAyuda.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MangoGames");
        setIconImages(null);

        jPanel2.setComponentPopupMenu(MenuAyuda);
        jPanel2.setLayout(new java.awt.BorderLayout());

        content.setBackground(new java.awt.Color(0, 102, 204));
        content.setComponentPopupMenu(MenuAyuda);

        menu.setBackground(new java.awt.Color(0, 102, 204));
        menu.setComponentPopupMenu(MenuAyuda);
        menu.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setBackground(new java.awt.Color(0, 102, 204));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setComponentPopupMenu(MenuAyuda);

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));
        jPanel4.setComponentPopupMenu(MenuAyuda);

        fPS.setText("FPS");
        fPS.setToolTipText("First person shooter");
        fPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fPSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fPS, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fPS, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));
        jPanel5.setComponentPopupMenu(MenuAyuda);

        plataformas.setText("Plataformas");
        plataformas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plataformasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plataformas, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plataformas, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(0, 102, 204));
        jPanel7.setComponentPopupMenu(MenuAyuda);

        mOBA.setText("MOBA");
        mOBA.setToolTipText("Multiplayer Online Battle Arena");
        mOBA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mOBAMouseClicked(evt);
            }
        });
        mOBA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mOBAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mOBA, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mOBA, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 204));
        jPanel8.setComponentPopupMenu(MenuAyuda);

        estrategia.setText("Estrategia");
        estrategia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estrategiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estrategia, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estrategia, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(0, 102, 204));
        jPanel9.setComponentPopupMenu(MenuAyuda);

        rPG.setText("RPG");
        rPG.setToolTipText("Role playing Game");
        rPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rPG, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rPG, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(0, 102, 204));
        jPanel10.setComponentPopupMenu(MenuAyuda);

        soulsLike.setText("SoulsLike");
        soulsLike.setToolTipText("Juego parecido a \"Dark Souls\"");
        soulsLike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soulsLikeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(soulsLike, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(soulsLike, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(0, 102, 204));
        jPanel13.setComponentPopupMenu(MenuAyuda);

        aventura.setText("Aventura");
        aventura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aventuraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aventura, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aventura, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(0, 102, 204));
        jPanel14.setComponentPopupMenu(MenuAyuda);

        accion.setText("Accion");
        accion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accion, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accion, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(0, 102, 204));
        jPanel15.setComponentPopupMenu(MenuAyuda);

        criaturas.setText("Criaturas");
        criaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criaturasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(criaturas, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(criaturas, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 124;
        gridBagConstraints.ipady = 364;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 3, 4);
        menu.add(jScrollPane1, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setComponentPopupMenu(MenuAyuda);
        jPanel3.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 710;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(jSeparator1, gridBagConstraints);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setComponentPopupMenu(MenuAyuda);
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        J1.setBackground(new java.awt.Color(255, 255, 255));
        J1.setComponentPopupMenu(MenuAyuda);

        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout J1Layout = new javax.swing.GroupLayout(J1);
        J1.setLayout(J1Layout);
        J1Layout.setHorizontalGroup(
            J1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(J1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(J1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, J1Layout.createSequentialGroup()
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, J1Layout.createSequentialGroup()
                        .addComponent(G1)
                        .addGap(70, 70, 70))))
        );
        J1Layout.setVerticalGroup(
            J1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(J1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(G1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.add(J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 170, 140));

        J2.setBackground(new java.awt.Color(255, 255, 255));
        J2.setComponentPopupMenu(MenuAyuda);

        javax.swing.GroupLayout J2Layout = new javax.swing.GroupLayout(J2);
        J2.setLayout(J2Layout);
        J2Layout.setHorizontalGroup(
            J2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(J2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, J2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(G2)
                .addGap(36, 36, 36))
        );
        J2Layout.setVerticalGroup(
            J2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(J2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(G2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.add(J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, 140));

        J3.setBackground(new java.awt.Color(255, 255, 255));
        J3.setComponentPopupMenu(MenuAyuda);

        javax.swing.GroupLayout J3Layout = new javax.swing.GroupLayout(J3);
        J3.setLayout(J3Layout);
        J3Layout.setHorizontalGroup(
            J3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(J3Layout.createSequentialGroup()
                .addGroup(J3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(J3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(J3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(G3)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        J3Layout.setVerticalGroup(
            J3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(J3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(G3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.add(J3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 160, 140));

        J4.setBackground(new java.awt.Color(255, 255, 255));
        J4.setComponentPopupMenu(MenuAyuda);

        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout J4Layout = new javax.swing.GroupLayout(J4);
        J4.setLayout(J4Layout);
        J4Layout.setHorizontalGroup(
            J4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(J4Layout.createSequentialGroup()
                .addGroup(J4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(J4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(J4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(G4)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        J4Layout.setVerticalGroup(
            J4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(J4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(G4)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel16.add(J4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 160, -1));

        J5.setBackground(new java.awt.Color(255, 255, 255));
        J5.setComponentPopupMenu(MenuAyuda);

        javax.swing.GroupLayout J5Layout = new javax.swing.GroupLayout(J5);
        J5.setLayout(J5Layout);
        J5Layout.setHorizontalGroup(
            J5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(J5Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(G5)
                .addGap(44, 44, 44))
            .addGroup(J5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        J5Layout.setVerticalGroup(
            J5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(J5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(G5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.add(J5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 150, 130));

        J6.setBackground(new java.awt.Color(255, 255, 255));
        J6.setComponentPopupMenu(MenuAyuda);

        javax.swing.GroupLayout J6Layout = new javax.swing.GroupLayout(J6);
        J6.setLayout(J6Layout);
        J6Layout.setHorizontalGroup(
            J6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(J6Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(G6)
                .addGap(23, 23, 23))
            .addGroup(J6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        J6Layout.setVerticalGroup(
            J6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(J6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(G6))
        );

        jPanel16.add(J6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 150, 130));

        sinResult.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sinResult.setText("NO SE HAN ENCONTRADO RESULTADOS");
        jPanel16.add(sinResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 460, 40));

        jScrollPane2.setViewportView(jPanel16);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 675;
        gridBagConstraints.ipady = 393;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(27, 20, 6, 0);
        jPanel3.add(jScrollPane2, gridBagConstraints);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        jPanel2.add(content, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));
        jPanel6.setComponentPopupMenu(MenuAyuda);
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MANGO GAMES");
        jLabel4.setVerifyInputWhenFocusTarget(false);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 37, -1, -1));

        loginButton.setBackground(new java.awt.Color(0, 153, 255));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel6.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, 20));

        registerButton.setBackground(new java.awt.Color(0, 153, 255));
        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("register");
        registerButton.setToolTipText("");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel6.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, 20));

        searchButton.setBackground(new java.awt.Color(0, 153, 255));
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("SEARCH");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        searchButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchButtonKeyPressed(evt);
            }
        });
        jPanel6.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, -1, 30));

        searchBox.setToolTipText("Buscar juego por nombres");
        searchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBoxActionPerformed(evt);
            }
        });
        jPanel6.add(searchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 125, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MicrosoftTeams-image (2).png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 9, 126, 125));

        menuButton.setBackground(new java.awt.Color(0, 153, 255));
        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu_32px.png"))); // NOI18N
        menuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButtonMouseClicked(evt);
            }
        });
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        jPanel6.add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 74, 70, 60));

        ajustes.setBackground(new java.awt.Color(0, 153, 255));
        ajustes.setForeground(new java.awt.Color(255, 255, 255));
        ajustes.setText("Ajustes");
        ajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajustesActionPerformed(evt);
            }
        });
        jPanel6.add(ajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 90, -1));

        jPanel11.setBackground(new java.awt.Color(0, 153, 255));
        jPanel11.setComponentPopupMenu(MenuAyuda);
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 120, -1));

        miniMenu.setBackground(new java.awt.Color(0, 102, 204));
        miniMenu.setComponentPopupMenu(MenuAyuda);
        miniMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                    .addComponent(cerrarSButon, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addContainerGap())
        );
        miniMenuLayout.setVerticalGroup(
            miniMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miniMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cerrarSButon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(miniMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 110, -1));

        UserLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        UserLabel.setComponentPopupMenu(MenuAyuda);
        jPanel6.add(UserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 140, 20));

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

        jPanel2.add(jPanel6, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MousePressed
        InterfazJuego d = null;
        try {

            d = new InterfazJuego(this.search.get(0),usuario_i);
            

        } catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
        }
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_B1MousePressed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
        InterfazJuego d = null;
        try {
            d = new InterfazJuego(search.get(3),usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(homeInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_B4ActionPerformed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
    homeInterface c = null;
        try {
            c = new homeInterface(usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(homeInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
       c.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jLabel4MousePressed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        inicio_sesion a = null;
        try {
            a = new inicio_sesion(usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(homeInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBoxActionPerformed

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        this.search.clear();
        JLabel[] labelJuego = {
        G1,
        G2,
        G3,
        G4,
        G5,
        G6
        };
        
        JButton[] imagenJuego = {
        B1,
        B2,
        B3,
        B4,
        B5,
        B6
        };
        
                String busqueda=searchBox.getText();
                for(int i = 0; juegos.size()>i;i++){
                    System.out.println(busqueda+"=="+juegos.get(i).getTitulo());
                    if(busqueda.equalsIgnoreCase(juegos.get(i).getTitulo())){
                        search.add(juegos.get(i)); 
                    }
                }
                for(int j=0;search.size()>j;j++ ){
                   labelJuego[j].setText(search.get(j).getTitulo());
                   Image img=getToolkit().getImage(search.get(j).getImagen());
                   img=img.getScaledInstance(B1.getWidth(), B1.getHeight(), Image.SCALE_DEFAULT);
                   imagenJuego[j].setIcon(new ImageIcon(img));
                }
                for(int j=0;labelJuego.length>j;j++ ){
                    if(labelJuego[j].getText().equalsIgnoreCase("")){
                        labelJuego[j].getParent().setVisible(false);
                    }else{
                        labelJuego[j].getParent().setVisible(true);
                    }
                }
                if(search.size()==0){
                    for(int j=0;labelJuego.length>j;j++ ){
                    labelJuego[j].getParent().setVisible(false);
                    }
                        sinResult.setVisible(true);      
                }else{
                        sinResult.setVisible(false);
                }

    }//GEN-LAST:event_searchButtonMouseClicked

    private void searchButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchButtonKeyPressed
    }//GEN-LAST:event_searchButtonKeyPressed

    private void fPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fPSActionPerformed
        busquedaCategorias(this.fPS.getText());
    }//GEN-LAST:event_fPSActionPerformed

    private void plataformasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plataformasActionPerformed
        busquedaCategorias(this.plataformas.getText());
    }//GEN-LAST:event_plataformasActionPerformed

    private void criaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criaturasActionPerformed
        busquedaCategorias(this.criaturas.getText());
    }//GEN-LAST:event_criaturasActionPerformed

    private void mOBAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mOBAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mOBAMouseClicked

    private void mOBAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mOBAActionPerformed
       busquedaCategorias(this.mOBA.getText());
    }//GEN-LAST:event_mOBAActionPerformed

    private void estrategiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estrategiaActionPerformed
       busquedaCategorias(this.estrategia.getText());
    }//GEN-LAST:event_estrategiaActionPerformed

    private void rPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPGActionPerformed
       busquedaCategorias(this.rPG.getText());
    }//GEN-LAST:event_rPGActionPerformed

    private void soulsLikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soulsLikeActionPerformed
        busquedaCategorias(this.soulsLike.getText());
    }//GEN-LAST:event_soulsLikeActionPerformed

    private void aventuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aventuraActionPerformed
        busquedaCategorias(this.aventura.getText());
    }//GEN-LAST:event_aventuraActionPerformed

    private void accionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionActionPerformed
        busquedaCategorias(this.accion.getText());
    }//GEN-LAST:event_accionActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        InterfazJuego d = null;
        try {
            d = new InterfazJuego(search.get(1),usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(homeInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        InterfazJuego d = null;
        try {
            d = new InterfazJuego(search.get(2),usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(homeInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_B3ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
        InterfazJuego d = null;
        try {
            d = new InterfazJuego(search.get(4),usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(homeInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:
        InterfazJuego d = null;
        try {
            d = new InterfazJuego(search.get(5),usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(homeInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_B6ActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuButtonActionPerformed

    private void menuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseClicked
        if(menu.isVisible()==true){
            menu.setVisible(false);
        }else{
            menu.setVisible(true);
        }
    }//GEN-LAST:event_menuButtonMouseClicked

    private void ajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajustesActionPerformed
        if(miniMenu.isVisible()==true){
            miniMenu.setVisible(false);
        }else{
            miniMenu.setVisible(true);
        }
    }//GEN-LAST:event_ajustesActionPerformed

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

    private void cerrarSButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSButonActionPerformed
        usuario_i.setAdmin(false);
        usuario_i.setId("");
        usuario_i.setNombre_usuario("");
        comprobarInicioS(usuario_i);
        miniMenu.setVisible(false); 
    }//GEN-LAST:event_cerrarSButonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        registro b = null;
        try {
            b = new registro(this.usuario_i);
        } catch (SQLException ex) {
            Logger.getLogger(homeInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        File htmlFile = new File("C:src/Pagina_manual//index.html");
        try {
            Desktop.getDesktop().browse(htmlFile.toURI());
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void BotonInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInformacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonInformacionActionPerformed

    private void BotonInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInformacionMouseClicked
        File htmlFile = new File("C:src/Pagina_manual//index.html");
        try {
            Desktop.getDesktop().browse(htmlFile.toURI());
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_BotonInformacionMouseClicked

        
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
            java.util.logging.Logger.getLogger(homeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new homeInterface().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(homeInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton BotonInformacion;
    public javax.swing.JLabel G1;
    private javax.swing.JLabel G2;
    private javax.swing.JLabel G3;
    private javax.swing.JLabel G4;
    private javax.swing.JLabel G5;
    private javax.swing.JLabel G6;
    private javax.swing.JPanel J1;
    private javax.swing.JPanel J2;
    private javax.swing.JPanel J3;
    private javax.swing.JPanel J4;
    private javax.swing.JPanel J5;
    private javax.swing.JPanel J6;
    private javax.swing.JPopupMenu MenuAyuda;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JButton accion;
    private javax.swing.JButton ajustes;
    private javax.swing.JButton aventura;
    private javax.swing.JButton botonAdmin;
    private javax.swing.JButton cerrarSButon;
    private javax.swing.JPanel content;
    private javax.swing.JButton criaturas;
    private javax.swing.JButton estrategia;
    private javax.swing.JButton fPS;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton mOBA;
    private javax.swing.JPanel menu;
    private javax.swing.JButton menuButton;
    private javax.swing.JPanel miniMenu;
    private javax.swing.JButton plataformas;
    private javax.swing.JButton rPG;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField searchBox;
    public javax.swing.JButton searchButton;
    private javax.swing.JLabel sinResult;
    private javax.swing.JButton soulsLike;
    // End of variables declaration//GEN-END:variables
}
