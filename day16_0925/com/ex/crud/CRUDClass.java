package com.ex.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ex.conn.DBconnection;

public class CRUDClass {

	public CRUDClass() {

//		createTable();
		
//		insertTables("1", "홍길동");
//		insertTables("2", "일지매");
//		insertTables("3", "세종대왕");
//		insertTables("4", "장영실");
		
		selectTables();
		
		
	}

	private void insertTables(String id, String name) {
		
		String sql = "insert into users (id, name)\r\n"
				+ "values (?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
				
		try {
			conn = DBconnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			int rows = pstmt.executeUpdate();
			System.out.println("--- " + rows + "행이 추가되었음.");
			
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			DBconnection.close(pstmt, conn);
		}
		
	}

	private void insertTables() {
		
	}

	private void createTable() {
//		db연결
		String sql = "create table if not exists users(\r\n" 
				+ "	id varchar(50),\r\n" 
				+ "	name varchar(100)\r\n" + ")";
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBconnection.getConnection();
			stmt = conn.createStatement();
			boolean result = stmt.execute(sql);
			System.out.println("테이블 생성 완료");
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("테이블 생성 실패");
		} finally {
			DBconnection.close(stmt, conn);
		}

	}

	private void selectTables() {
		
		String sql = "select * from users";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			conn = DBconnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("employees의 테이블들 확인");
			
			if(!rs.next()) {
				System.out.println("users 테이블에 조회된 결과 없음");
			} else {
				int rowCount = 0;
				do {
					rowCount++;
					String id = rs.getString("id");
					String name = rs.getString("name");
					System.out.println("ID: " + id + ", NAME: " +name);
				} while(rs.next());
				System.out.println("총 " + rowCount + "개의 행으로 이루어진 테이블");
			}
			
			
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			DBconnection.close(rs, pstmt, conn);
		}
		
		
	}
}
