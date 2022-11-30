/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagina_Home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


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
                        System.out.println("Puñeta mala");
                        Statement creacion_base_datos = this.connection_.createStatement();
                        creacion_base_datos.executeUpdate("create database mango_games");
                        this.connection_=null;
                        this.connection_ = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db_,login_,password_);
                        System.out.println("Conexion a base de datos " + db_ + " correcta.");
                        e.printStackTrace();
                    }
	}
    public Connection getConnection_() {
        return connection_;
    }

    public void setConnection_(Connection connection_) {
            this.connection_ = connection_;
    }
    
    
    
    public void creacion_tabla(String nombre_tabla, String atributos) throws SQLException {
       Statement st_;
       st_=this.connection_.createStatement();
       st_.executeUpdate("create table if not exists " + nombre_tabla + "(" + atributos + ")");
    }
    
    public void insertar_una_nueva_fila_en_una_tabla(String tabla, String atributos, String sentencia_atributos) {

		try {
			Statement st_ = this.connection_.createStatement();
			System.out.println("insert into " + tabla + " (" + atributos + ") values (" + sentencia_atributos + ")");
			st_.executeUpdate("insert into " + tabla + " (" + atributos + ") values (" + sentencia_atributos + ")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
    
    public ResultSet realizar_consulta(String query) throws SQLException {

       Statement _st = this.connection_.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
       System.out.println(query);
       ResultSet _rs = _st.executeQuery(query);

       return _rs;
    }
    
    public String leer_resultset_string(ResultSet _rs, String atributo) throws SQLException {
	_rs.beforeFirst();
	String valorpedido = null;
	while (_rs.next()) {

		valorpedido = _rs.getString(atributo);

	}
	return valorpedido;
    }
    
    public static int leer_resultset_int(ResultSet _rs, String atributo) throws SQLException {
	_rs.beforeFirst();
	int valorpedido = 0;
	while (_rs.next()) {

		valorpedido = _rs.getInt(atributo);

	}
	return valorpedido;
    }
    
    	public static String parsear_atributos(String[] atributos) {

		String sentencia_atributos = "";

		// Crea una sentencia compatible con MySQL
		for (int j = 0; j < atributos.length; j++) {

			atributos[j]=parsear_cadena(atributos[j]);

			sentencia_atributos += atributos[j];
			if (j != atributos.length - 1) {
				sentencia_atributos += ",";
			}

		}
		return sentencia_atributos;
	}
        
        public static String parsear_cadena(String cadena) {
		return (isParsable(cadena)) ? cadena : "'" + cadena + "'";
	}
        public static boolean isParsable(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (final NumberFormatException e) {
			return false;
		}
	}
    
}


