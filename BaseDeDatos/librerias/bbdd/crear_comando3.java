package bbdd;

import java.sql.*;

public class crear_comando3 {
// 1º activar en xapp my sql
// Para añadir un nombre de la BBDD;
	private String db = "PI";
	private String login = "root";
	private String pwd = "";
	private String url = "jdbc:mysql://localhost/" + db;
	private Connection conexion;
	private PreparedStatement pstmt;
	private PreparedStatement stmt;
	//private Object stmt;

	public crear_comando3() {
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

	public void operacionesBD(String query, String usr, String pwd) throws SQLException {
		int r = 0;
		
		this.pstmt = conexion.prepareStatement(query);
		pstmt.setString(1, usr);
		pstmt.setString(2, pwd);
		r = this.pstmt.executeUpdate();
		System.out.println(r + " registro modificado.");
		this.pstmt.close();
	}

	public static void main(String[] args) {
		crear_comando3 a = new crear_comando3();
		try {
			a.operacionesBD("UPDATE users set Pwd = ?, Usr=? WHERE pwd ='Iggy' &&  Usr = '0003'" , "009", "Iggy");
;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}