package org.java.dao;

import java.sql.Connection;

import org.java.connect.DBConnect;
import org.java.dto.BoardDto;

public class BoardDao {
	
	private BoardDao() {
		System.out.println("BoardDao -> 싱글톤");
	}
	private static class SingleTonClass{
		private static final BoardDao INSTANCE=new BoardDao();
	}	
	public static BoardDao getInstance() {
		return SingleTonClass.INSTANCE;
	}
	public int boardInsert(BoardDto boardDto) {
		int rs=0;		
		Connection conn = null;
		String query = "";			
		try {
			conn =  DBConnect.getConnection();
			query =  " insert into 게시글테이블 values(?,?,?,?,?,?,?) ";				
			rs=1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}		}
		return rs;
	}
	//게시글 수정
	public int boardUpdate(BoardDto boardDto) {
		System.out.println("게시글 수정");		
		int rs=0;		
		Connection conn = null;
		String query = "";		
		try {			
			conn =  DBConnect.getConnection();
			query =  " update  게시글테이블 set ?,?,?,?,?,?,? where boardId=? ";			
			rs=1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {		}
		}
		return rs;
	}
	
}
