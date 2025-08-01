package org.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;

public class ArrayListEx1 {

	public static void main(String[] args) {

		System.out.println("ArrayList");
		// 1. 순서가 있다.
		// 2. 객체형 요소
		// 3. 데이터의 크기가 정해 지지 않았다.
		Vector<Integer> v1 = new Vector<Integer>();
//		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		List<Integer> arr1 = new ArrayList<Integer>();
		// 1. 추가
		List<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(new Integer(10));
		arr2.add(20);
		arr2.add(30);
		arr2.add(40);
		arr2.add(50);		
		// 2. 조회
		// 확장형 for ->확장형 for문 ,foreach
		for (Integer i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(arr2);
		System.out.println(arr2.size());
//		arr2.clear();
		System.out.println(arr2.size());
		System.out.println(arr2);
		System.out.println(arr2.contains(new Integer(10)));
		System.out.println(arr2.contains(10));
//		arr2.clear();
		if (arr2.isEmpty()) {
			System.out.println("조회 데이터가 없습니다!");
			try {
				throw new RuntimeException("조회할 데이터가 없습니다!!");
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
		} else {
//			return "조회할 데이터를 반환";
		}
		System.out.println("정상실행");
		System.out.println(arr2);
		arr2.remove(0); // index-> 요소 삭제
		System.out.println(arr2);		
		// Iterator *****
		Iterator<Integer> iterator = arr2.iterator();
		while (iterator.hasNext()) {
			Integer i = iterator.next();
			System.out.print(i + " ");
		}
		System.out.println("forEach");		
		// forEach -> List -> 요소 -> 조회
		arr2.forEach(element -> {
			System.out.print(element + " ");	
		});		
		arr2.forEach(element -> System.out.print(element + " "));

		System.out.println();
		
		
		
		

	}
}
