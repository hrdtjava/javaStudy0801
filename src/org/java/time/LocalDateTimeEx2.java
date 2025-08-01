package org.java.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeEx2 {

	public static void main(String[] args) {
		System.out.println("LocalDateTime");
		
		System.out.println("국제표준 UTC");	
		// 국제표준   UTC
		ZonedDateTime utcZonedDateTime=ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utcZonedDateTime);
		// 서울     UTC+9
		ZonedDateTime seoulZonedDateTime=ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulZonedDateTime);
		
		System.out.println("두 날짜 비교1");
		
		LocalDate today = LocalDate.now(); // 현재날짜 
		LocalDate oldDate = LocalDate.of(2025, 10,11);		
		//// 비교일 로부터 오늘까지의 날짜 차이 계산
		Period period= oldDate.until(today);		
		System.out.println(period);
		System.out.println(today);
		System.out.println(oldDate);
		System.out.println(period.getYears());  // 년	
		System.out.println(period.getMonths()); // 월	
		System.out.println(period.getDays());   // 일   today-oldDate		
		if(period.getDays()>0) {
			System.out.println("시작일이 끝날보다 크거나 같아야 됩니다.");
		}	

		
		System.out.println(" ChronoUnit ");		
		// 날짜 차이 비교-> 특정 날짜의 차이-> ChronoUnit ->new X  -> 년까지 포함한 월,일 차이		
		long days = ChronoUnit.DAYS.between(oldDate, today);  // 일 차이 
		System.out.println(days);    //  전체일수 비교 
		System.out.println(ChronoUnit.MONTHS.between(oldDate, today)); // 월 차이 
		System.out.println(ChronoUnit.YEARS.between(oldDate, today));  // 년 차이 
		
		if(days>0) {
			System.out.println("시작일이 끝날보다 크거나 같아야 됩니다.");
		}	

		
	}
}
