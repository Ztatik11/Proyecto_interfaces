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
       conexion_db.creacion_tabla( "usuarios", "ID int NOT NULL AUTO_INCREMENT,Usuario char(100),Nombre char(100),Apellidos char(200),Email char(200),residencia char(50),clave char(30),administrador boolean,primary key(ID)");
       conexion_db.creacion_tabla( "juegos", "ID int NOT NULL AUTO_INCREMENT,Titulo char(100),Descripcion char(200),Precio int,Nota int,Genero char(100),Desarrolladora char(100),Numero_jugadores int,primary key(ID)");
       conexion_db.creacion_tabla( "compras", "ID_usuario int,ID_juego int,Constraint fk_ID_usuario foreign key (ID_usuario) references usuarios(ID),Constraint fk_ID_juego foreign key (ID_juego) references juegos(ID)");
       conexion_db.creacion_tabla( "imagenes", "ID int NOT NULL AUTO_INCREMENT,Nombre char(100),Imagen char(100),ID_juego int,Constraint fk_ID_juego_imagenes foreign key (ID_juego) references juegos(ID),primary key(ID)");
       conexion_db.creacion_tabla( "datos_bancarios", "Numero_tarjeta int NOT NULL AUTO_INCREMENT,Nombre char(100),numero_secreto int,ID_usuario int,Constraint fk_ID_usuario_tarjeta foreign key (ID_usuario) references usuarios(ID),primary key(Numero_tarjeta)");
    }
    
}
