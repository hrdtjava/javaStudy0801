package org.java.time;

import java.time.LocalDateTime;

public class LocalDateTimeEx1 {

	public static void main(String[] args) {
		
		System.out.println("LocalDateTime");
		
		LocalDateTime localDateTime= LocalDateTime.now();
		
		System.out.println(localDateTime);
		System.out.println(localDateTime.getYear());
		System.out.println(localDateTime.getMonthValue());
		System.out.println(localDateTime.getDayOfMonth());
		System.out.println(localDateTime.getHour());
		System.out.println(localDateTime.getMinute());
		System.out.println(localDateTime.getSecond());
		System.out.println(localDateTime.getNano());
		
		// 예약 날짜, 시간
		LocalDateTime localDateTime2= LocalDateTime.of(2024, 11,14,12,30,22);
		System.out.println(localDateTime2);
		
		System.out.println(localDateTime2);
		System.out.println(localDateTime2.getYear());
		System.out.println(localDateTime2.getMonthValue());
		System.out.println(localDateTime2.getDayOfMonth());
		System.out.println(localDateTime2.getHour());
		System.out.println(localDateTime2.getMinute());
		System.out.println(localDateTime2.getSecond());
		System.out.println(localDateTime2.getNano());
		
	}
}
