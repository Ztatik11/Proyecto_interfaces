/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagina_registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Pagina_inicio_sesion.*;
import Pagina_Home.*;

/**
 *
 * @author yorks
 */
public class Registro_codigo extends javax.swing.JFrame implements ActionListener {
    inicio_sesion inicio_sesion= new inicio_sesion();
    homeInterface pagina_principal= new homeInterface();
    public Registro_codigo(){
        
    }
    
    public javax.swing.JButton iniciar_sesion;
    public javax.swing.JButton registrarse;
    public javax.swing.JPanel panel_registro;
    public javax.swing.JPanel panel_inicio_sesion;
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
