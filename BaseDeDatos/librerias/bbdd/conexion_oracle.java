package bbdd;

import java.sql.*;

public class conexion_oracle {
	// Atributos de la clase
	
	private String login = "sergio";
	private String pwd = "sergio";
	private String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private Connection conexion;

	// Constructor que crea la conexión
	public conexion_oracle() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(url, login, pwd);
			System.out.println(" - Conexión con ORACLE establecida -");
			conexion.close();
		} catch (Exception e) {
			System.out.println(" – Error de Conexión con ORACLE -");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new conexion_oracle();
	}
}
