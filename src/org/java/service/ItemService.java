package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dto.ItemDto;
import org.java.dto.MemberDto;

public interface ItemService {
	// 게시글 작성
		int save(ItemDto itemDto) throws IOException,SQLException;

		// 게시글조회(목록)
		List<ItemDto> findAll() throws SQLException;

		// 게시글조회(상세)
		ItemDto findById(Long itemId)throws SQLException;

		// 게시글수정
		int updateSave(ItemDto itemDto)throws SQLException;

		// 게시글삭제-> 게시글 아이디가 같으며 삭제
		int deleteId(Long itemId)throws SQLException;

		/// -- inner join //<- 게시글 작성자의 정보를 조회(username)
		MemberDto findByItemId(Long memberId)throws SQLException;
}
