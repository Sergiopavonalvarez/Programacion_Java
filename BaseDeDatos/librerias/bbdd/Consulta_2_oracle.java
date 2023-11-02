package bbdd;

import java.sql.*;

public class Consulta_2_oracle {
	// Atributos de la clase

	private String login = "sergio";
	private String pwd = "sergio";
	private String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private Connection conexion;

	// Constructor que crea la conexión
	public Consulta_2_oracle() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(url, login, pwd);
			System.out.println(" - Conexión con ORACLE establecida -");
			//conexion.close();
		} catch (Exception e) {
			System.out.println(" – Error de Conexión con ORACLE -");
			e.printStackTrace();
		}
	}

	public void Consulta2(String query, int cod, int columna) {
		try {
			PreparedStatement pstmt = conexion.prepareStatement(query);
			pstmt.setInt(1, cod);
			ResultSet rset = pstmt.executeQuery();
			while (rset.next())
				System.out.println(rset.getString(columna));
			rset.close();
			pstmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Consulta_2_oracle prueba = new Consulta_2_oracle();
		prueba.Consulta2("select * from equipo WHERE ID<?", 4, 2);
	}
}
