/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pagina_Home;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author JoseManuelRodriguezC
 */
public class homeMain extends JFrame {

    
    public static void main(String[] args) {
        
        consultas_sql conexion_db = new consultas_sql("usuario","clave","tuma");
    }
    
}
