package org.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.java.connect.DBConnect;
import org.java.constraint.Role;
import org.java.dto.MemberDto;

public class MemberDao {

	//=== 싱글톤 ====//
	private MemberDao() {
		System.out.println("ItemDao <<- 싱글톤");
	}
	private static class SingletonClass {
		private static final MemberDao INSTANCE = new MemberDao();
	}
	public static MemberDao getInstance() {
		return SingletonClass.INSTANCE;
	}	
	//=== 싱글톤 ====//
	//회원가입
	public int memberInsert(MemberDto memberDto) {
		System.out.println("회원가입 DAO");		
		int rs=0;		
//		1. DB연동
		Connection conn = null;
//		2. SQL문 실행 -> insert~ into
		String query = "";			
		try {
			conn =  DBConnect.getConnection();
			query =  " insert into 회원테이블 values(?,?,?,?,?,?,?) ";				
//		3. 결과반환  1->성공, 나머지 -> 실패	
			System.out.println(memberDto.toString());
			System.out.println(query);
			
			rs=1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//DB연동 해제				
				if (conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}
		return rs;
	}
	
	public int memberUpdate(MemberDto memberDto) {
		System.out.println("회원수정 DAO");		
		int rs=0;		
//		1. DB연동
		Connection conn = null;
//		2. SQL문 실행 -> updat~ set ~where~
		String query = "";	
		
		try {
			conn =  DBConnect.getConnection();
			query =  " updat 회원테이블 set ?,?,?,?,?,?,? where=? ";				
//		3. 결과반환  1->성공, 나머지 -> 실패	
			System.out.println(memberDto.toString());
			System.out.println(query);
			
			rs=1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//DB연동 해제				
				if (conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}
		return rs;
	}	
	public int memberDelete(String userEmail) {
		System.out.println("회원삭제 DAO");		
		int rs=0;
//		1. DB연동
		Connection conn = null;
//		2. SQL문 실행 -> updat~ set ~where~
		String query = "";			
		try {
			conn =  DBConnect.getConnection();
			query =  " delete  from 회원테이블  where=? ";				
//		3. 결과반환  1->성공, 나머지 -> 실패	
			System.out.println(userEmail);
			System.out.println(query);			
			rs=1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//DB연동 해제				
				if (conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}
		return rs;
	}
	public List<MemberDto> memberList() {		
		System.out.println("회원목록 조회");		
		 List<MemberDto> members=new ArrayList<MemberDto>();
//		1. DB연동
		Connection conn = null;
//		2. SQL문 실행 -> updat~ set ~where~
		String query = "";			
		try {
			conn =  DBConnect.getConnection();
			query =  " select *  from 회원테이블  ";				
//		3. 결과반환  1->성공, 나머지 -> 실패	
			System.out.println(query);
			
//			members=new ArrayList<MemberDto>();
			//반드시 아이디와 이메일은 중복 불가능
			members.add(new MemberDto(1, "m1@email.com", "11","m1", Role.ROLE_MEMBER,LocalDateTime.now(), null));
			members.add(new MemberDto(2, "m2@email.com", "21","m2", Role.ROLE_ADMIN,LocalDateTime.now(), null));
			members.add(new MemberDto(3, "m3@email.com", "31","m3", Role.ROLE_MEMBER,LocalDateTime.now(), null));
			members.add(new MemberDto(4, "m4@email.com", "41","m4", Role.ROLE_MEMBER,LocalDateTime.now(), null));
			members.add(new MemberDto(5, "m5@email.com", "51","m5", Role.ROLE_MEMBER,LocalDateTime.now(), null));
			//회원 5명추가
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//DB연동 해제				
				if (conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}	
		return members;
	}	
	public MemberDto memberOneDetail(String useEmail) {
		System.out.println("회원 조회");		
		 MemberDto member=null;
//			1. DB연동
			Connection conn = null;
//			2. SQL문 실행 -> uselect *  from 회원테이블 where userEmai=? 
			String query = "";			
			try {
				conn =  DBConnect.getConnection();
				query =  " select *  from 회원테이블 where userEmai=? ";				
//			3. 결과반환  1->성공, 나머지 -> 실패	
				System.out.println(query);				
				member=new MemberDto(1, "m1@email.com", "11","m1", Role.ROLE_MEMBER,LocalDateTime.now(), null);
							//회원 5명추가
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					//DB연동 해제				
					if (conn != null) conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
				}
			}	
			return member;
	}
	
	
}
