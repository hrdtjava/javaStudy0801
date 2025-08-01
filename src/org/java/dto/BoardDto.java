package org.java.dto;

import java.time.LocalDateTime;

import org.java.entity.BoardEntity;

public class BoardDto {

	private Long boardId;
	private String title;
	private String content;
	private int count;
	private Long memberId; // 로그인한 회원아이디-> 회원만 글작성 허용

	private LocalDateTime createTime;
	private LocalDateTime updateTime;

	public BoardDto() {
		System.out.println("BoardDto-> @NoArgsContruct");
	}

	public BoardDto(Long boardId, String title,
			String content, int count, 
			Long memberId, 
			LocalDateTime createTime,
			LocalDateTime updateTime) {
		super();
		this.boardId = boardId;
		this.title = title;
		this.content = content;
		this.count = count;
		this.memberId = memberId;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public Long getBoardId() {
		return boardId;
	}

	public void setBoardId(Long boardId) {
		this.boardId = boardId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
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

	@Override
	public String toString() {
		return "BoardDto [boardId=" + boardId + ", title=" + title + ", content=" + content + ", count=" + count
				+ ", memberId=" + memberId + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

	// BoardEntity => BoardDto
    // DB -> 사용자 -> View
	
	public static BoardDto toInsertBoardDto(BoardEntity boardEntity) {
		BoardDto boardDto = new BoardDto();		
//		boardDto.setBoardId(boardEntity.getBoardId());
		boardDto.setTitle(boardEntity.getTitle());
		boardDto.setContent(boardEntity.getContent());
		boardDto.setCount(boardEntity.getCount());
		boardDto.setMemberId(boardEntity.getMemberId());
//		boardDto.setCreateTime(boardEntity.getCreateTime());
//		boardDto.setUpdateTime(boardEntity.getUpdateTime());

		return boardDto;
	}
	
	public static BoardDto toUpdateBoardDto(BoardEntity boardEntity) {
		
		BoardDto boardDto = new BoardDto();		
		boardDto.setBoardId(boardEntity.getBoardId());
		boardDto.setTitle(boardEntity.getTitle());
		boardDto.setContent(boardEntity.getContent());
		boardDto.setCount(boardEntity.getCount());
		boardDto.setMemberId(boardEntity.getMemberId());
		boardDto.setCreateTime(boardEntity.getCreateTime());
		boardDto.setUpdateTime(boardEntity.getUpdateTime());
		
		return boardDto;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
