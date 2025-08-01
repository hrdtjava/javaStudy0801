package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dto.MemberDto;

public interface MemerService{
	// 회원관련 service
	// 회원가입
	int insert(MemberDto memberDto) throws SQLException,IOException;
	// 회원수정
	int update(MemberDto memberDto) throws SQLException;
	// 회원삭제
	int delete(String userEmail) throws SQLException;
	// 회원조회(목록)
	List<MemberDto> members() throws SQLException;
	// 회원조회(개인)
	MemberDto memberDetail(String email) throws SQLException;
	
}
