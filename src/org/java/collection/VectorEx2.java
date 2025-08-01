package org.java.collection;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import org.java.constraint.Role;
import org.java.dto.MemberDto;

public class VectorEx2 {

	public static void main(String[] args) {

		System.out.println("Vecter");

		// MemberDto -> ,while문 이용 -> exit 종료
		// "insert" -> MemberDto -> Vector -> List<MemberDto> 추가
		// "exit" -> while문 종료 , Scanner 이용 -> 3명 추가
		// 입력 데이터를 출력 ->

		Scanner input = new Scanner(System.in);
		boolean bool = false;

		List<MemberDto> members = new Vector<MemberDto>();

		while (!bool) {
			System.out.println("회원 서비스를 시작하시겠습니까?(exit종료)");
			String q = input.next();

			if (!q.equals("exit")) {

				while (true) {

					System.out.println("쿼리문을 입력해주세요(insert)(exit종료)");
					String query = input.next();

					if (query.equals("insert")) {
						System.out.println("회원가입 -> ");

						System.out.print("memberId: "); //중복불가능
						int memberId = input.nextInt();

						System.out.print("userEmail: ");//중복불가능
						String userEmail = input.next();

						System.out.print("userPw: ");
						String userPw = input.next();

						System.out.print("userName: ");
						String userName = input.next();

						members.add(new MemberDto(memberId, userEmail, userPw, userName, 
								Role.ROLE_MEMBER,
								LocalDateTime.now(), null));

					} else if (query.equals("exit")) {
						System.out.println("전체 프로그램 종료!!");
						bool = true;
						break;
					} else {
						System.out.println("쿼리문 입력오류!!");
					}
				}

			} else {
				System.out.println("종료합니다!!");
				bool = true;
			}
		}

		System.out.println("foreach");
		for (MemberDto member : members) {
//			if (member.getUserEmail().equals("m2@email.com")) {
				System.out.println(member.getMemberId() + ", " + member.getUserEmail() + ", " + member.getUserPw()
						+ ", " + member.getUserName() + ", " + member.getUserRole() + ", " + member.getCreateTime());
//			}
		}
		input.close();

	}
}
