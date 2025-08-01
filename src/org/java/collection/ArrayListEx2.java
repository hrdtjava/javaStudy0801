package org.java.collection;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.java.constraint.Role;
import org.java.dto.MemberDto;

public class ArrayListEx2 {

	public static void main(String[] args) {

		System.out.println("ArrayList");
		System.out.println("=========== 회원 가입 =============");

		List<MemberDto> members = new ArrayList<MemberDto>();
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
		System.out.println("=========== 회원 조회(목록) =============");
		for (MemberDto member : members) {
			System.out.println(member.getMemberId() + ", " + member.getUserEmail() + ", " + member.getUserPw() + ", "
					+ member.getUserName() + ", " + member.getUserRole() + ", " + member.getCreateTime());
		}
		System.out.println("Iterator");
		Iterator<MemberDto> iterator = members.iterator();

		while (iterator.hasNext()) {
			MemberDto member = iterator.next();
			System.out.println(member.getMemberId() + ", " + member.getUserEmail() + ", " + member.getUserPw() + ", "
					+ member.getUserName() + ", " + member.getUserRole() + ", " + member.getCreateTime());
		}
		System.out.println("forEach");
		members.forEach(el -> System.out.println(el.getMemberId() + ", " + el.getUserEmail() + ", " + el.getUserPw()
				+ ", " + el.getUserName() + ", " + el.getUserRole() + ", " + el.getCreateTime()));
		
		System.out.println("=========== 회원 상세 조회 =============");
		for (MemberDto member : members) {
			if (member.getUserEmail().equals("m1@email.com")) {
				System.out.println(member.getMemberId() + ", " + member.getUserEmail() + ", " + member.getUserPw()
						+ ", " + member.getUserName() + ", " + member.getUserRole() + ", " + member.getCreateTime());

			}
		}
		System.out.println("=========== 회원 상세 조회 =============");
		members.forEach(el -> {
			if (el.getUserEmail().equals("m2@email.com")) {
				System.out.println(el.getMemberId() + ", " + el.getUserEmail() + ", " + el.getUserPw()
						+ ", " + el.getUserName() + ", " + el.getUserRole() + ", " + el.getCreateTime());

			}
		});

	}
}
