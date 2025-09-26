package com.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMain {

	public static void main(String[] args) {
		
		// 가장 기초적인 연결 단계1
//		String url = "jdbc:mariadb://localhost:3306/employees";
//		String user = "root";
//		String password = "1234";
//		Connection conn = null;
//		
//		try {
//			conn = DriverManager.getConnection(url, user, password);
//			System.out.println("연결 성공");
//			
//		} catch (SQLException se) {
//			se.printStackTrace();
//		} 
		
		Connection connection = null;
		
		try {
			connection = DBConnection.getConnection();
		} finally {
			CRUDClass crudClass = new CRUDClass();
		}
	}

}
