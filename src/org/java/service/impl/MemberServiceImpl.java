package org.java.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;
import org.java.service.MemerService;

public class MemberServiceImpl implements MemerService {

	@Override
	public int insert(MemberDto memberDto) throws SQLException, IOException {

		System.out.println("회원가입 서비스");
		MemberDao dao = MemberDao.getInstance();	
		
		int rs = dao.memberInsert(memberDto);
		if(rs!=1) {
			System.out.println("회원가입 실패!");			
			  throw new SQLException(); 
		}
		return rs;
	}

	@Override
	public int update(MemberDto memberDto) throws SQLException {
		System.out.println("회원수정 서비스");

		MemberDao dao = MemberDao.getInstance();
		int rs = dao.memberUpdate(memberDto);
		
		if(rs!=1) {
			System.out.println("회원수정 실패!");			
			  throw new SQLException(); 
		}

		System.out.println("회원수정 성공!");
		return rs;
	}

	@Override
	public int delete(String userEmail) throws SQLException {
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.memberDelete(userEmail);
		
		if(rs!=1) {
			System.out.println("회원삭제 실패!");			
			  throw new SQLException(); 
		}
		System.out.println("회원삭제 성공!");
		return rs;
	}

	@Override
	public List<MemberDto> members() throws SQLException {
		MemberDao dao = MemberDao.getInstance();
		List<MemberDto> memberList=dao.memberList();		
		if(memberList.isEmpty()) {
			System.out.println("조회할 내용이 없습니다!");
			  throw new SQLException(); 
		}
		System.out.println("회원조회(목록)");
		return memberList;
	}

	@Override
	public MemberDto memberDetail(String useEmail) throws SQLException {
		MemberDao dao = MemberDao.getInstance();
		MemberDto member=dao.memberOneDetail(useEmail);		
		if(member==null) {
			System.out.println("조회할 회원이 없습니다!");
			  throw new SQLException(); 
		}
		System.out.println("회원조회(상세)");
		return member;
	}

}
