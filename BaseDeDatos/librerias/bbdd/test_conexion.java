package bbdd;

import java.sql.*;

public class test_conexion {
	// Atributos de la clase
	private String bd = "test";
	private String login = "root";
	private String pwd = "";
	private String url = "jdbc:mySql://localhost/"+bd;
	private Connection conexion;
	


	// Constructor que crea la conexión
	public test_conexion() {
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
		new test_conexion();
	}
}
