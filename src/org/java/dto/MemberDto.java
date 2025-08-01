package org.java.dto;

import java.time.LocalDateTime;

import org.java.constraint.Role;
import org.java.entity.MemberEntity;

public class MemberDto {

	private int memberId;
	private String userEmail;
	private String userPw;
	private String userName;

	private Role userRole;

	private LocalDateTime createTime;
	private LocalDateTime updateTime;

	public MemberDto() {
		System.out.println("MemberDto-> @NoArgsConstruct");
	}

	public MemberDto(int memberId, String userEmail, String userPw, String userName, Role userRole,
			LocalDateTime createTime, LocalDateTime updateTime) {
		super();
		this.memberId = memberId;
		this.userEmail = userEmail;
		this.userPw = userPw;
		this.userName = userName;
		this.userRole = userRole;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		userName = userName;
	}

	public Role getUserRole() {
		return userRole;
	}

	public void setUserRole(Role userRole) {
		this.userRole = userRole;
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
		return "MemberDto [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", UserName="
				+ userName + ", userRole=" + userRole + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ "]";
	}
	// MemberEntity -> MemberDto
	// DB정보(Entity) -> 사용자(Dto) 반화(보여주기)  Spring JPA
	public MemberDto toMemberEntity(MemberEntity memberEntity) {

		MemberDto memberDto = new MemberDto();

		memberDto.setMemberId(memberEntity.getMemberId());
		memberDto.setUserEmail(memberEntity.getUserEmail());
		memberDto.setUserName(memberEntity.getUserName());
		memberDto.setUserPw(memberEntity.getUserPw());
		memberDto.setUserRole(memberEntity.getUserRole());
		memberDto.setCreateTime(memberEntity.getCreateTime());

		return memberDto;
	}
	
	
	
	
	
	
	
	
	
	
	

}
