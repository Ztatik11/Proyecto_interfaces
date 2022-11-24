/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagina_Home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author AlvaroCarrascoGarcia
 */
public class consultas_sql {
    Connection connection_;

	public consultas_sql(String db_,String login_,String password_) {
		// Conexion

		String url_ = "jdbc:sqlserver://localhost:1433;database="+db_+";user="+login_+";password="+password_+";encrypt=true;trustServerCertificate=true;";
		this.connection_ = null;
                    try {
                            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    } catch (ClassNotFoundException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                    }
                    try {
                            this.connection_ = DriverManager.getConnection(url_);
                            System.out.println("Conexion a base de datos " + db_ + " correcta.");
                    } catch (SQLException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                    }
	}
}
