package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseInterface {
	
	static Connection con;
	
	static void dbConnect() throws ClassNotFoundException, SQLException {
		//1. Load the Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Establish Connection with Database
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cj_10_12", 
											"root", "");
		
		
		//System.out.println(con);
	}
	
	static void dbDisconnect() throws SQLException {
		con.close();
	}
}
