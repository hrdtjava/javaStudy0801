package org.java.entity;

import java.time.LocalDateTime;

import org.java.constraint.Role;
import org.java.dto.MemberDto;

// DB테이블과 이름이 같다 -> DB에 데이터를 전송객체 JPA
// @Entity  -> Dto 구조가 같다
// DB저장시 반드시 Dto를 Entity로 변환 해주어야 된다. => JPA
public class MemberEntity {

	//DB테이블의 칼럼명과 일치
	private int memberId;
	private String userEmail;
	private String userPw;
	private String userName;

	private Role userRole;

	private LocalDateTime createTime;
	private LocalDateTime updateTime;

	public MemberEntity() {
		System.out.println("MemberDto-> @NoArgsConstruct");
	}

	public MemberEntity(int memberId, String userEmail,
			String userPw,
			String userName, Role userRole,
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
		return "MemberEntity [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", userName="
				+ userName + ", userRole=" + userRole + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ "]";
	}

	
	
	// MemberDto -> MemberEntity	
	// 사용자정보(Dto) -> DB(Entity변환)  Spring JPA
	public static MemberEntity toMemberEntity(MemberDto memberDto) {
		
		MemberEntity memberEntity=new MemberEntity();
		
		memberEntity.setMemberId(memberDto.getMemberId());
		memberEntity.setUserEmail(memberDto.getUserEmail());
		memberEntity.setUserName(memberDto.getUserName());
		memberEntity.setUserPw(memberDto.getUserPw());
		memberEntity.setUserRole(memberDto.getUserRole());
		memberEntity.setCreateTime(memberDto.getCreateTime());
		
		return memberEntity;		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
