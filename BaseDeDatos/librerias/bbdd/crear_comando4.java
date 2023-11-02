package bbdd;

import java.sql.*;

public class crear_comando4 {
	// Atributos de la clase
	private String db = "PI";
	private String login = "root";
	private String pwd = "";
	private String url = "jdbc:mySql://localhost/" + db;
	private Connection conexion;

	// Constructor que crea la conexión
	public crear_comando4() {
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

	public void Delete() throws SQLException {

		Statement stm = conexion.createStatement();
		int r = 0;
		String cadSql = null;
		cadSql = "DELETE FROM `users` WHERE usr='Miguel'";
		r = stm.executeUpdate(cadSql);
		System.out.println(r + " Filas borrada");
	}

	public static void main(String[] args) throws SQLException {

		crear_comando4 prueba = new crear_comando4();
		prueba.Delete();
	}
}
