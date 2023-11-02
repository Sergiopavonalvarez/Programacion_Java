package bbdd;

import java.sql.*;

public class consulta_1_oracle {
//Atributos de la clase
	//private String bd = "liga";
	private String login = "sergio";
	private String pwd = "sergio";
	private String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private Connection conexion;

//Constructor que crea la conexión
	public consulta_1_oracle() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(url, login, pwd);
			System.out.println(" - Conexión con ORACLE establecida -");
//Quitamos esta instrucción: conexion.close();
		} catch (Exception e) {
			System.out.println(" – Error de Conexión con ORACLE -");
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
		consulta_1_oracle Prueba = new consulta_1_oracle();
		Prueba.Consulta("SELECT * FROM USUARIO",2);
	}
}