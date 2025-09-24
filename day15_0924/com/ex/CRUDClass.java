package com.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDClass {

	public CRUDClass() {
		
//		Create table - create table
		createTable();
		
		
		
//		Read table - select 
		selectTable();
		
		
		
//		Update table - update table
//		updateTable();
		
		
		
//		Delete 테이블 안의 row 삭제
//		deleteUser();
		
		
		
//		Insert = insert
//		insertUser();
	}

	private void insertUser() {
		// TODO Auto-generated method stub
		
	}

	private void deleteUser() {
		// TODO Auto-generated method stub
		
	}

	private void updateTable() {
		// TODO Auto-generated method stub
		
	}

	private void selectTable() {
		String sql = "show tables";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("employees의 테이블들 확인");
			
			while(rs.next()) {
//				String tblName = rs.getString("tables_in_employees");
				String tblName2 = rs.getString(1);
				System.out.println("[" + tblName2 + "]");
			}
 		} catch(SQLException se) {
			se.printStackTrace();
		} finally {
			DBConnection.close(rs, pstmt, conn);
		}
		
	}

	private void createTable() {
		String sql = "create table if not exists users(\r\n"
				+ "	id varchar(50),\r\n"
				+ "	name varchar(100)\r\n"
				+ ")";
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("users 테이블 생성 완료");
		} catch(SQLException se) {
			se.printStackTrace();
			System.out.println("users 테이블 생성 실패");
		} finally {
			DBConnection.close(stmt, conn);
		}
	}

	
}
