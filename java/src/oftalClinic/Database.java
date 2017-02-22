package oftalClinic;

import java.sql.*;

public class Database {

	private static String username = "admin";
	private static String password = "admin";
	private static String url = "jdbc:postgresql://localhost:5432/OftalClinic";
	
	static{		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}
	
	public static Connection getConnection(){
		try {
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}		
	}
			
}
