package org.java.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dto.ItemDto;
import org.java.dto.MemberDto;

public interface ItemService {
		// 상품등록
		int save(ItemDto itemDto) throws IOException,SQLException;

		// 상품조회(목록)
		List<ItemDto> findAll() throws SQLException;

		// 상품조회(상세)
		ItemDto findById(Long itemId)throws SQLException;

		// 상품수정
		int updateSave(ItemDto itemDto)throws SQLException;

		// 상품삭제-> 상품 아이디가 같으며 삭제
		int deleteId(Long itemId)throws SQLException;

		/// -- inner join //<- 상품 등록자 정보를 조회
		MemberDto findByItemId(Long memberId)throws SQLException;
}
