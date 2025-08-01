package org.java.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import org.java.constraint.Role;
import org.java.dto.MemberDto;
import org.java.service.MemerService;
import org.java.service.impl.MemberServiceImpl;

public class MemberController {

	public static void main(String[] args) throws SQLException, IOException {

		System.out.println("MemberController");

		Scanner input = new Scanner(System.in);
		boolean bool = false;

		while (!bool) {
			System.out.print("예제를 실행 하시겠습니다!(exit-> 종료): ");
			String quest = input.next();
			if (!quest.equals("exit")) {
				System.out.print("쿼리문을 입력하세요(insert,update,select,delete,detail): ");
				String query = input.next();
				// 다형성 -> 부모타입의 객체 참조변수
				MemerService service = new MemberServiceImpl();
				if (query.equals("insert")) {
					// while, Scanner입력 -> 회원가입
					// 사용자의 입력정보를 -> Controller-> Service에 전달 -> DAO-> DB저장
					System.out.println("회원가입 실행! ");

					System.out.print("아이디: ");
					int memberId = input.nextInt();

					System.out.print("userEmail: ");
					String userEmail = input.next();

					System.out.print("userPw: ");
					String userPw = input.next();

					System.out.print("UserName");
					String UserName = input.next();

					System.out.print("userRole: ");
					String userRole = input.next();

					service.insert(new MemberDto(memberId, userEmail, userPw, UserName, Role.ROLE_MEMBER,
							LocalDateTime.now(), null));
				} else if (query.equals("update")) {

					System.out.println("회원수정 실행! ");

					System.out.print("아이디: ");
					int memberId = input.nextInt();

					System.out.print("userEmail: ");
					String userEmail = input.next();

					System.out.print("userPw: ");
					String userPw = input.next();

					System.out.print("UserName");
					String UserName = input.next();

					System.out.print("userRole: ");
					String userRole = input.next();
					
					service.update(new MemberDto(memberId, userEmail, userPw, UserName, Role.ROLE_MEMBER,
							LocalDateTime.now(), null));
				} else if (query.equals("delete")) {
					System.out.println("삭제할 이메일을 입력 하세요");
					System.out.print("userEmail: ");
					String userEmail = input.next();
					
					service.delete(userEmail);
					
				} else if (query.equals("detail")) {
					System.out.println("조회할 이메일 입력하세요");
					System.out.print("userEmail: ");
					String userEmail = input.next();
					
					MemberDto member=service.memberDetail(userEmail);
					
					System.out.print(member.getMemberId()+" ");
					System.out.print(member.getUserPw()+" ");
					System.out.print(member.getUserEmail()+" ");
					System.out.print(member.getUserName()+" ");
					System.out.print(member.getUserRole()+" ");
					System.out.println(member.getCreateTime()+" ");
					
					
				}   else if (query.equals("select")) {
					
					List<MemberDto> memberLis=service.members();
					//회원목록 조회
					// 모든 객체리스트 조회
					for(MemberDto member:memberLis) {
						System.out.print(member.getMemberId()+" ");
						System.out.print(member.getUserPw()+" ");
						System.out.print(member.getUserEmail()+" ");
						System.out.print(member.getUserName()+" ");
						System.out.print(member.getUserRole()+" ");
						System.out.println(member.getCreateTime()+" ");
					}					
					
				} else if (query.equals("exit")) {
					System.out.println("예제를 종료하겠습니다!");
					bool = true;
				} else {
					System.out.println("쿼리문 입력오류입니다!!");
				}
			} else {
				System.out.println("예제를 종료하겠습니다!");
				bool = true;
			}

		}

		input.close();
	}
}
