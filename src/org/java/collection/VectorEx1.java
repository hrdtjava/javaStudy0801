package org.java.collection;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.java.constraint.Role;
import org.java.dto.MemberDto;

public class VectorEx1 {

	public static void main(String[] args) {

		System.out.println("Vector");

		List<MemberDto> members = new Vector<MemberDto>();

		members.add(new MemberDto(1, "m1@email.com", "1111", "m1", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberDto(2, "m2@email.com", "2111", "m12", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberDto(3, "m3@email.com", "3111", "m13", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberDto(4, "m4@email.com", "4111", "m14", Role.ROLE_MEMBER, LocalDateTime.now(), null));
		members.add(new MemberDto(5, "m5@email.com", "5111", "m15", Role.ROLE_MEMBER, LocalDateTime.now(), null));

		System.out.println(members.size());
		System.out.println(members.get(0));
		System.out.println(members.get(0).getUserEmail());
		System.out.println(members.get(0).getCreateTime());

		// 반복문 , foreach ,Iterator
		System.out.println("foreach");
		for (MemberDto member : members) {
			// id:~, 이메일: ~, 비빌번호:~,주소:~,Role:~ ,가입시간:~
			System.out.println(member.getMemberId() + ", " + member.getUserEmail() + ", " + member.getUserPw() + ", "
					+ member.getUserName() + ", " + member.getUserRole() + ", " + member.getCreateTime());
		}
		System.out.println("Iterator");

		Iterator<MemberDto> iterator = members.iterator();

		while (iterator.hasNext()) {
			MemberDto member = iterator.next();
			// id:~, 이메일: ~, 비빌번호:~,주소:~,Role:~ ,가입시간:~
			System.out.println(member.getMemberId() + ", " + member.getUserEmail() + ", " + member.getUserPw() + ", "
					+ member.getUserName() + ", " + member.getUserRole() + ", " + member.getCreateTime());
		}

		System.out.println();
		// userEmail -> m2@email.com 인 요소를 콘솔에 출력
		System.out.println(" userEmail ->  m2@email.com 인 요소를 콘솔에 출력 ");
		for (MemberDto member : members) {
			// id:~, 이메일: ~, 비빌번호:~,주소:~,Role:~ ,가입시간:~
			if (member.getUserEmail().equals("m2@email.com")) {
				System.out.println(member.getMemberId() + ", " + member.getUserEmail() + ", " + member.getUserPw() + ", "
						+ member.getUserName() + ", " + member.getUserRole() + ", " + member.getCreateTime());
				break;
			}
		}

	}
}
