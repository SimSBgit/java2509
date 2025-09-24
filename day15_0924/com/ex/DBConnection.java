package com.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//		이 클래스에서 DB 연결, 해제를 관리한다.
public class DBConnection {
	// DB접속 기본정보
	static String URL = "jdbc:mariadb://localhost:3306/employees";
	static String USER = "root";
	static String PASSWORD = "1234";
	
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("연결 성공");
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("연결 실패");
		}
		return conn;
	}
	
	public static void close(Statement stmt, Connection conn) {
				try {
					if(stmt != null) {
						stmt.close();
					}
				} catch(SQLException se) {
					se.printStackTrace();
				}
				try {
					if(conn != null) {
						conn.close();
					}
				} catch(SQLException se) {
					se.printStackTrace();
				}
	}

	public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
			try {
				if(rs != null) {
				rs.close();	
				}
			} catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(conn != null) {
					conn.close();
				}
			} catch(SQLException se) {
				se.printStackTrace();
			}
		
	}
	
	
}
