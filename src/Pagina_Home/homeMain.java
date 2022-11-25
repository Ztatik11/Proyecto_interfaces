/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pagina_Home;
import java.awt.Image;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.sql.Statement;


public class homeMain extends JFrame {

    
    public static void main(String[] args) throws SQLException {
        
        consultas_sql conexion_db = new consultas_sql("mango_games","root","root");
        creacion_tablas(conexion_db);
         
    }
    
    public static void creacion_tablas(consultas_sql conexion_db) throws SQLException{
       conexion_db.creacion_tabla( conexion_db, "usuarios", "ID int NOT NULL AUTO_INCREMENT,Nombre char(100),Apellidos char(200),Telefono int,Genero char(10),NIF char(9),Comision int,primary key(ID)");
    }
    
}
