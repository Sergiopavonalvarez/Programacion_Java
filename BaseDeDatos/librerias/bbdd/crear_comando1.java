package bbdd;

import java.sql.*;

public class crear_comando1 {
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

	public crear_comando1() {
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
		System.out.println(r + " registro agregado.");
		this.stmt.close();
	}

	public static void main(String[] args) {
		crear_comando1 a = new crear_comando1();
		try {
			a.operacionesBD("INSERT INTO `users`(`usr`, `pwd`) VALUES (?,?)", "Pablo6", "pass6");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}