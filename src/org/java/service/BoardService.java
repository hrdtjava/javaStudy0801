package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dto.BoardDto;
import org.java.dto.MemberDto;

public interface BoardService {
	// 게시글 작성
	int save(BoardDto boardDto) throws IOException,SQLException;

	// 게시글조회(목록)
	List<BoardDto> findAll() throws SQLException;

	// 게시글조회(상세)
	BoardDto findById(Long boardId)throws SQLException;

	// 게시글수정
	int updateSave(BoardDto boardDto)throws SQLException;

	// 게시글삭제-> 게시글 아이디가 같으며 삭제
	int deleteId(Long boardId)throws SQLException;

	/// -- inner join //<- 게시글 작성자의 정보를 조회(username)
	MemberDto findByBoardId(Long boardId)throws SQLException;

}
