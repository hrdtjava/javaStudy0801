package org.java.entity;

import java.time.LocalDateTime;

import org.java.dto.BoardDto;

//@NoArgsConstruct
//@AllArgsConstruct
//@Builder
//@Entity
//@Table
public class BoardEntity {

	private Long boardId;
	private String title;
	private String content;
	private int count;
	private Long memberId; // 로그인한 회원아이디-> 회원만 글작성 허용

	private LocalDateTime createTime;
	private LocalDateTime updateTime;

	public BoardEntity() {
		// TODO Auto-generated constructor stub
	}

	public BoardEntity(Long boardId, String title, String content, int count, Long memberId, LocalDateTime createTime,
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
		return "BoardEntity [boardId=" + boardId + ", title=" + title + ", content=" + content + ", count=" + count
				+ ", memberId=" + memberId + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

	// BoardDto => BoardEntity

	// 게시글 작성
	public static BoardEntity toInsertBoardEntity(BoardDto boardDto) {
		
		BoardEntity boardEntity = new BoardEntity();
		// DB에서 자동으로 1씩 증가
//		boardEntity.setBoardId(boardDto.getBoardId());
		boardEntity.setTitle(boardDto.getTitle());
		boardEntity.setContent(boardDto.getContent());
		boardEntity.setCount(boardDto.getCount());
		boardEntity.setMemberId(boardDto.getMemberId());
		// 작성시간, 수정시간은 자동으로 설정
//		boardEntity.setCreateTime(boardDto.getCreateTime());
//		boardEntity.setUpdateTime(boardDto.getUpdateTime());
		return boardEntity;
	}

	// 게시글 수정 - >반드시 게시글 아이디가 존재
	public static BoardEntity toUpdateBoardEntity(BoardDto boardDto) {
		
		BoardEntity boardEntity = new BoardEntity();
		// 게시글 수정시에는 반드시 게시글 아이디가 있어야된다.
		boardEntity.setBoardId(boardDto.getBoardId());
		boardEntity.setTitle(boardDto.getTitle());
		boardEntity.setContent(boardDto.getContent());
		boardEntity.setCount(boardDto.getCount());
		boardEntity.setMemberId(boardDto.getMemberId());
		// 작성시간, 수정시간은 자동으로 설정
		boardEntity.setCreateTime(boardDto.getCreateTime());
//		boardEntity.setUpdateTime(boardDto.getUpdateTime());

		return boardEntity;
	}

}
