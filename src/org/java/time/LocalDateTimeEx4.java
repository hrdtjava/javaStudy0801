package org.java.time;

import java.time.LocalDateTime;

public class LocalDateTimeEx4 {

	public static void main(String[] args) {
		System.out.println("LocalDateTime  is~");

		// 이전이냐?, 같으냐?, 이후냐?
		LocalDateTime startTime = LocalDateTime.now();// 오늘 -> 현재 시간
		System.out.println(startTime);

		LocalDateTime endTime = LocalDateTime.of(2025, 12, 20, 16, 30, 20);
		System.out.println(endTime);
		// 이전이냐?
		boolean bool = startTime.isBefore(endTime);
		if (!bool) {
			System.out.println("예약시작일은 예약 종료일보다 이전일이어야 합니다!!");
		}else {			
			System.out.println("예약가능합니다. 예약일을 선택해 주세요!!");
			System.out.println("예약가능일: "+endTime);
		}
		// 같으냐? -> 예약한 날 확인?
		boolean bool2 = startTime.equals(endTime);
		if (!bool2) {
			System.out.println("두 비교날짜가 일치 하지 않습니다!");
		}
		boolean bool3 = startTime.isAfter(endTime);
		if (bool3) {
			System.out.println("예약시작일은 예약 종료일보다 이전일이어야 합니다!!");
		}else {			
			System.out.println("예약가능합니다. 예약일을 선택해 주세요!!");
			System.out.println("예약가능일: "+endTime);
		}


	}
}
