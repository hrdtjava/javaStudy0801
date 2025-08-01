package org.java.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.java.dao.ItemDao;
import org.java.dto.ItemDto;
import org.java.dto.MemberDto;
import org.java.service.ItemService;

public class ItemServiceImpl implements ItemService {

	@Override
	public int save(ItemDto itemDto) throws IOException, SQLException {
		System.out.println("상품등록");
		 ItemDao dao= ItemDao.getInstance();
		 
		 int rs=dao.itemInsert(itemDto);
		 if(rs!=1) {
			 System.out.println("상품등록실패!");
			 throw new SQLException();
		 }		 
		 System.out.println("상품등록성공!");
		 
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
		System.out.println("상품수정");
		 ItemDao dao= ItemDao.getInstance();
		 
		 int rs=dao.itemUpdate(itemDto);
		 if(rs!=1) {
			 System.out.println("상품수정실패!");
			 throw new SQLException();
		 }		 
		 System.out.println("상품수정성공!");
		 
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
