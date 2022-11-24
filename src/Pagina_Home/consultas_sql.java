/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagina_Home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author AlvaroCarrascoGarcia
 */
public class consultas_sql {
    Connection connection_;

	public consultas_sql(String db_,String login_,String password_) throws SQLException {
		// Conexion

		this.connection_ = null;
                    try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                    } catch (ClassNotFoundException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                    }
                    try {
                            this.connection_ = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db_,login_,password_);
                            System.out.println("Conexion a base de datos " + db_ + " correcta.");
                    } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        System.out.println("La base de datos no existe, creando Base de datos...");
                        this.connection_ = DriverManager.getConnection("jdbc:mysql://localhost:3306/",login_,password_);
                        Statement creacion_base_datos = this.connection_.createStatement();
                        creacion_base_datos.executeUpdate("create database mango_games");
                        e.printStackTrace();
                    }
	}
}
