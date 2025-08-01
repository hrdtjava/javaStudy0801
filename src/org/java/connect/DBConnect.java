package org.java.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() {
		
		Connection conn=null;
		//오라클 -> //Mysql // Maradb,,,
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521/xe";
		String user="system";
		String password="1234";
		
		try {
			Class.forName(driver);
			System.out.println("Driver OK!");
			
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("DB연동 Success!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver No!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연동 Fail!");
			e.printStackTrace();
		}	
		
		return conn;
	}

}
