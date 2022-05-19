package days01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex04 {
	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "SCOTT";
		String password = "tiger"; 
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");			
		
			Connection conn = DriverManager.getConnection(url, user, password);
			
			
			System.out.println(  conn );
			System.out.println(  conn.isClosed() );
			
		
			conn.close();  
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
