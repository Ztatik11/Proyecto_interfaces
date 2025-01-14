/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pagina_Home;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class homeMain extends JFrame {
    
    public static void main(String[] args) throws SQLException, IOException, URISyntaxException {
        LocalDate fecha = LocalDate.now();
        consultas_sql conexion_db = new consultas_sql("mango_games","root","root");
        creacion_tablas(conexion_db);
        ArrayList<String[]> juegos = conexion_db.leer_csv("resources/csv/juegos.csv");
        conexion_db.insertar_fichero_csv(juegos,"juegos","Titulo,Descripcion,Precio,Nota,Genero,Desarrolladora,Numero_jugadores,Imagen", false);
        
        if(conexion_db.leer_resultset_string(conexion_db.realizar_consulta("select * from usuarios where Usuario='root'"), "Usuario")==null){
            conexion_db.insertar_una_nueva_fila_en_una_tabla("usuarios", "Usuario,Nombre,Apellidos,Email,residencia,clave,administrador,fecha_registro,ultimo_inicio_sesion", "'root','root','root','alvarocarrascogarcia6@gmail.es','Sevilla','root',true,"+conexion_db.parsear_cadena(conexion_db.formatear_fecha(fecha))+","+conexion_db.parsear_cadena(conexion_db.formatear_fecha(fecha)));
        }
        
         ArrayList<String[]> Usuarios = conexion_db.leer_csv("resources/csv/usuarios.csv");
        for(int i = 0; i < Usuarios.size(); i++){
            if(conexion_db.leer_resultset_string(conexion_db.realizar_consulta("select * from usuarios where Usuario='" + Usuarios.get(i)[0] +"'"), "Usuario")==null){
            conexion_db.insertar_una_nueva_fila_en_una_tabla("usuarios", "Usuario,Nombre,Apellidos,Email,residencia,clave,administrador,fecha_registro,ultimo_inicio_sesion", "'" + Usuarios.get(i)[0]+ "','" + Usuarios.get(i)[1]+"','" + Usuarios.get(i)[2]+"','" + Usuarios.get(i)[3]+"','" + Usuarios.get(i)[4]+"','" + Usuarios.get(i)[5]+"','" + Usuarios.get(i)[6]+"'," + Usuarios.get(i)[7] +"," + Usuarios.get(i)[8]);
            }
            else{
                System.out.println("El usuario ya existe");
            }
        }
        
        ArrayList<String[]> compras = conexion_db.leer_csv("resources/csv/compras.csv");
        conexion_db.insertar_fichero_csv(compras,"compras","ID_usuario,ID_juego,Precio_transaccion,Fecha_de_compra", false);
        homeInterface a = null;
        try {
            a = new homeInterface(new Usuario("",false,"0"));
        } catch (SQLException ex) {
            Logger.getLogger(homeInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setVisible(true);
    }
    
    public static void creacion_tablas(consultas_sql conexion_db) throws SQLException{
       conexion_db.creacion_tabla( "usuarios", "ID int NOT NULL AUTO_INCREMENT,Usuario char(100),Nombre char(100),Apellidos char(200),Email char(200),residencia char(50),clave char(30),administrador boolean, fecha_registro date,ultimo_inicio_sesion date,primary key(ID)");
       conexion_db.creacion_tabla( "juegos", "ID int NOT NULL AUTO_INCREMENT,Titulo char(100),Descripcion char(200),Precio int,Nota int,Genero char(100),Desarrolladora char(100),Numero_jugadores int,Imagen char(255),primary key(ID)");
       conexion_db.creacion_tabla( "compras", "ID_usuario int,ID_juego int, Precio_transaccion int ,Fecha_de_compra date,Constraint fk_ID_usuario foreign key (ID_usuario) references usuarios(ID),Constraint fk_ID_juego foreign key (ID_juego) references juegos(ID)");
    }
    
}
