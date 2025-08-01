package org.java.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dto.ItemDto;
import org.java.dto.MemberDto;
import org.java.service.ItemService;

public class ItemServiceImpl implements ItemService {

	@Override
	public int save(ItemDto itemDto) throws IOException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ItemDto> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemDto findById(Long itemId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateSave(ItemDto itemDto) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteId(Long itemId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberDto findByItemId(Long memberId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
