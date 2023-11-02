package bbdd;

import java.sql.*;

public class comandos_mysql {
	// Atributos de la clase
	
	private String login = "root";
	private String pwd = "";
	private String url = "jdbc:mySql://localhost";
	private Connection conexion;

	// Constructor que crea la conexión
	public comandos_mysql() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, login, pwd);
			System.out.println(" - Conexión con mysql establecida -");
			conexion.close();
		} catch (Exception e) {
			System.out.println(" – Error de Conexión con mysql -");
			e.printStackTrace();
		}
	}

public void Consulta(String query, int columna) {
	try {
		Statement stmt = conexion.createStatement();
		ResultSet rset = stmt.executeQuery(query);
		while (rset.next())
			System.out.println(rset.getString(columna));
		rset.close();
		stmt.close();
	} catch (SQLException s) {
		s.printStackTrace();
	}
}

public static void main(String[] args) {
	comandos_mysql Prueba = new comandos_mysql();
	Prueba.Consulta("SELECT * FROM EMP",2);
}
}