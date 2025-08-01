package org.java.time;

import java.time.LocalDateTime;

public class LocalDateTimeEx5 {
	public static void main(String[] args) {
		System.out.println("LocalDatTime");		
		// plus~ + , min~-
		// LocalDate, LocalTime ,LocalDateTime,		
		LocalDateTime now= LocalDateTime.now();
		// 날짜,시간 -?> spring JPA Entity 기본 시간 타입
		System.out.println("현재 날짜,시간: "+now);	
		System.out.println("현재 날짜: "+now.toLocalDate()); //날짜만
		System.out.println("현재 시간: "+now.toLocalTime()); //시간만
		System.out.println("======= plus =======");
		// plus
		LocalDateTime now2=now.plusYears(10); // 년도+
		System.out.println(now2);		
		LocalDateTime now3=now.plusMonths(1); // 월+
		System.out.println(now3);
		LocalDateTime now4=now.plusDays(1); // 일+
		System.out.println(now4);
		LocalDateTime now5=now.plusHours(1); // 시+
		System.out.println(now5);
		System.out.println(now.plusHours(1));
		System.out.println(now.plusMinutes(10)); // 분+
		System.out.println(now.plusSeconds(10)); // 초+
		
		System.out.println("======= minus =======");
		// min~
		System.out.println(now);
		LocalDateTime now6= now.minusYears(10);
		System.out.println(now6);
		System.out.println(now.minusMonths(5));
		System.out.println(now.minusDays(5));
		System.out.println(now.minusHours(5));
		System.out.println(now.minusMinutes(5));
		System.out.println(now.minusSeconds(5));
		
		
		
		
	}
}
