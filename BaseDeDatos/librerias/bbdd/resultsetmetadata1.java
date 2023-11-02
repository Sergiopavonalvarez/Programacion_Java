package bbdd;

import java.sql.*;
import java.util.Iterator;

public class resultsetmetadata1 {
	// Atributos de la clase
	private String db = "PI";
	private String login = "root";
	private String pwd = "";
	private String url = "jdbc:mySql://localhost/" + db;
	private Connection conexion;

	// Constructor que crea la conexión
	public resultsetmetadata1() {
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

	public void Desplegardatos() throws SQLException {

		Statement stmt = conexion.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM USERS");
		ResultSetMetaData rsmd = rs.getMetaData();

		int Columnas = rsmd.getColumnCount();
		System.out.println("Nombre tabla: " + rsmd.getTableName(1));
		System.out.println("La tabla tiene : " + rsmd.getColumnCount() + " columnas");
		for (int i = 1; i < Columnas + 1; i++) {
			System.out.println("Columna " + rsmd.getColumnName(i) + "\t" + rsmd.getColumnTypeName(i) + "\t"
					+ rsmd.getPrecision(i));

		}
		rs.close();
		stmt.close();

	}

	public static void main(String[] args) throws SQLException {

		resultsetmetadata1 prueba = new resultsetmetadata1();
		prueba.Desplegardatos();
	}
}