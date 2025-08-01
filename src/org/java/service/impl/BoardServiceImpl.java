package org.java.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dao.BoardDao;
import org.java.dto.BoardDto;
import org.java.dto.MemberDto;
import org.java.service.BoardService;

public class BoardServiceImpl implements BoardService {

	@Override
	public int save(BoardDto boardDto) throws IOException, SQLException {

		System.out.println("게시글 작성");

		BoardDao dao = BoardDao.getInstance();
		int rs = dao.boardInsert(boardDto);

		if (rs != 1) {
			System.out.println("게시글작성 실패!");
			throw new SQLException();
		}
		return rs;
	}

	@Override
	public List<BoardDto> findAll() throws SQLException {
		System.out.println("게시글 작성");

		return null;
	}

	@Override
	public BoardDto findById(Long boardId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateSave(BoardDto boardDto) throws SQLException {
		
		BoardDao dao = BoardDao.getInstance();
		int rs = dao.boardUpdate(boardDto);

		if (rs != 1) {
			System.out.println("게시글수정 실패!");
			throw new SQLException();
		}
		return rs;
	}

	@Override
	public int deleteId(Long boardId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberDto findByBoardId(Long boardId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
