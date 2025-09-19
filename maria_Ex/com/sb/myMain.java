package com.sb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class myMain {

	public static void main(String[] args) {

		 String url = "jdbc:mariadb://localhost:3306/employees"; // DB명 testdb 가정
	        String user = "root"; // 사용자명
	        String password = "1234"; // 패스워드

	        try {
	            // 1. 드라이버 로드 (JDBC 4.0 이상에서는 생략 가능하지만, 명시해도 OK)
	            Class.forName("org.mariadb.jdbc.Driver");

	            // 2. 연결 생성
	            try (Connection conn = DriverManager.getConnection(url, user, password);
	                 Statement stmt = conn.createStatement()) {

	                System.out.println("✅ MariaDB 연결 성공!");

	                // 3. 쿼리 실행 예시
	                ResultSet rs = stmt.executeQuery("SHOW DATABASES;");
	                while (rs.next()) {
	                    System.out.println("DB 이름: " + rs.getString(1));
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
