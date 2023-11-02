package bbdd;

import java.sql.*;

public class conexion_mysql {
	// 1º activar en xapp my sql
	// Para añadir un nombre de la BBDD;
		private String db = "PI";
		private String login = "root";
		private String pwd = "";
		private String url = "jdbc:mysql://localhost/" + db;
		private Connection conexion;

	// Constructor que crea la conexión
	public conexion_mysql() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, login, pwd);
			System.out.println("-> Conexión con MySQL establecida");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver JDBC No encontrado");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error al conectarse a la BD");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error general de Conexión");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new conexion_mysql();
	}
}

