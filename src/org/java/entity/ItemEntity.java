package org.java.entity;

import java.time.LocalDateTime;

import org.java.dto.ItemDto;

//@NoArgsConstruct
//@AllArgsConstruct
//@ToString
//@Builder
//@Entity
//@Table
public class ItemEntity {

	private Long itemId;			//중복불가능 -> 자동으로 설정
	private String itemName;  //상품명
	private int itemPrice;     //상품가격
	private String itemDetail; //상품내용
	private int inventory;		//재고량
	// 기본 -> 생산날짜,수정날짜 -> 자동으로 설정
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	
	//기본생성자
	public ItemEntity() {
		System.out.println("ItemDto-> @NoArgsConstruct");
	}

	// 모든필드 매개인자-> 생성자
	//@AllArgsConstruct
	public ItemEntity(Long itemId, String itemName, int itemPrice, String itemDetail, int inventory,
			LocalDateTime createTime, LocalDateTime updateTime) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemDetail = itemDetail;
		this.inventory = inventory;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	//setter, getter
	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(String itemDetail) {
		this.itemDetail = itemDetail;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

	// toString 
	@Override
	public String toString() {
		return "상품정보 [상품아이디=" + itemId + ", 상품명=" + itemName + ", 상품가격=" + itemPrice + ", 상품상세정보="
				+ itemDetail + ", 재고량=" + inventory + ", 입고일=" + createTime + ", 수정일=" + updateTime
				+ "]";
	}	
	
	
	//Dto -> Entity
	//spring boot JPA 
	public static ItemEntity toInsertItemEntity(ItemDto itemDto) {
		
		ItemEntity itemEntity=new ItemEntity();
		
		itemEntity.setItemId(itemDto.getItemId());
		
		
		return itemEntity;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
