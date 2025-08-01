package org.java.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeEx6 {

	public static void main(String[] args) {
		
		System.out.println("LocalDateTime");

		// 날짜 비교
		LocalDateTime startDateTime = LocalDateTime.now();// 오늘
		LocalDateTime endDateTime = LocalDateTime.of(2024, 11, 18, 23, 59, 59);
		
		System.out.println("기준날짜: " + startDateTime);
		System.out.println("비교날짜: " + endDateTime);

		System.out.println("===========Duration");// 싱글톤  -> 초
		Duration duration = Duration.between(startDateTime, endDateTime);
		System.out.println("초: " + duration.getSeconds()); // 하루 -> 24*60*60
		System.out.println("나노초: " + duration.getNano());

		System.out.println("===========Period");// 년,월,일  -> 기준 365 이상 년+1
		LocalDate startDate = LocalDate.of(2024, 2, 14);
		LocalDate endDate = LocalDate.of(2025, 10, 18);
		Period period = Period.between(startDate, endDate);
		
		System.out.println("Years: " + period.getYears()); // 년*365
		System.out.println("Months: " + period.getMonths());// 월*30
		System.out.println("Days: " + period.getDays()); 	// 일*1	
		
		
		
		
		System.out.println("===========ChronoUnit"); // 객체 생성 없이 사용가능		

		LocalDateTime sTime = LocalDateTime.now();// 오늘
		LocalDateTime eTime = LocalDateTime.of(2024, 12, 31, 10, 59, 59);
				
		long months = ChronoUnit.MONTHS.between(sTime, eTime);
		long weeks = ChronoUnit.WEEKS.between(sTime, eTime);
		long days = ChronoUnit.DAYS.between(sTime, eTime);
		long hours = ChronoUnit.HOURS.between(sTime, eTime); // 알바비계산
		long minutes = ChronoUnit.MINUTES.between(sTime,eTime);
		long seconds = ChronoUnit.SECONDS.between(sTime, eTime);
//		
		System.out.println("Months: " + months);
		System.out.println("Weeks: " + weeks);
		System.out.println("Days: " + days);
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
		
		
		
		
		
	}
}
