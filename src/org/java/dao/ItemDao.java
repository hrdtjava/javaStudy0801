package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.java.connect.DBConnect;
import org.java.dto.ItemDto;

public class ItemDao {

	private ItemDao() {
		System.out.println("ItemDao -> 싱글톤");
	}

	private static class SingleTonClass {
		private static final ItemDao INSTANCE = new ItemDao();
	}

	public static ItemDao getInstance() {
		return SingleTonClass.INSTANCE;
	}

	// 상품등록
	public int itemInsert(ItemDto itemDto) {

		int rs = 0;

		Connection conn = null; // DB연동
		String query = ""; // 쿼리문
		PreparedStatement pstm = null; // Query처리객체

		try {
			conn = DBConnect.getConnection();
			query = "insert into 상품테이블 values(?,?,?,?,?,?,?) ";
			pstm=conn.prepareStatement(query);

			rs = 1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return rs;
	}

	public int itemUpdate(ItemDto itemDto) {
		int rs = 0;

		Connection conn = null; // DB연동
		String query = ""; // 쿼리문
		PreparedStatement pstm = null; // Query처리객체

		try {
			conn = DBConnect.getConnection();
			query = "update  상품테이블 set ?,?,?,?,?,?,? where =? ";
//			pstm=conn.prepareStatement(query);
//			pstm.setString(0, itemDto.getItemName());

			rs = 1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return rs;
	}

}
