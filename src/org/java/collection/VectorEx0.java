package org.java.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.java.dto.MemberDto;

public class VectorEx0 {

	public static void main(String[] args) {
		System.out.println("Vector");

		Vector<Integer> v0 = new Vector<Integer>();

		List<Integer> v1 = new Vector<Integer>();

		v0.add(new Integer(10));
		v0.add(new Integer(20));
		v0.add(30); // 자동박싱 Integer i=30
		v0.add(40);
		v0.add(50);
		int size = v0.size();
		System.out.println(size);
		System.out.println(v0);
		v0.add(5, 100);
		System.out.println(size);
		System.out.println(v0);
		v1.add(200);
		v1.add(300);
		v1.add(400);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.addAll(v0));
//		v1.clear();
		System.out.println(v1);
		System.out.println(v1.contains(200));
		System.out.println(v1);
		v1.remove(0); // 인덱스
		System.out.println(v1);
		int i1 = v1.get(0); /// 자동 언박싱
		System.out.println(i1);

		System.out.println("모든 요소 조회");
		// 2. 조회 -> 모든 요소
		List<Integer> v2 = new Vector<Integer>();
		v2.add(100);
		v2.add(200);
		v2.add(300);
		v2.add(400);
		v2.add(500);
		// for -> 갯수를 개발자가 설정
		for (int i = 0; i < v2.size(); i++) {
			System.out.print(v2.get(i) + " ");
		}
		System.out.println();
		// foeach ***** -> 모든요소를 조회
		for (Integer i : v2) {
			System.out.print(i + " ");
		}
		System.out.println();
		// Iterator -> 공식 -> 객체를 직렬화
		Iterator<Integer> iterator = v2.iterator();
		while (iterator.hasNext()) {
//			Integer i2= iterator.next();
			int i2 = iterator.next();
			System.out.print(i2 + " ");
		}

		// DB데이터 조회 -> 비었다
		if (v2.isEmpty()) {
			System.out.println("조회할 데이터가 없다!!");
		}
		System.out.println();
		
		Vector<String> v3= new Vector<String>();
		System.out.println(v3);
		
		System.out.println(v3.isEmpty());		
		if (v3.isEmpty()) {
			System.out.println("조회할 데이터가 없다!!");
		}
		
		MemberDto member=null;
		System.out.println(member);
		if (member==null) {
			System.out.println("조회할 회원이 존재하지 않습니다!!");
		}
		

	}
}
