package org.java.time;

import java.time.LocalDate;

public class LocalDateEx {

	public static void main(String[] args) {
		
		System.out.println("LocalDate");
		
//		LocalDate.now(); //현재 시스템시간		
		LocalDate localDate= LocalDate.now();// 현시점 -> 날짜
		
		System.out.println(localDate);
		System.out.println(localDate.getYear()); 		//년 2025
		System.out.println(localDate.getMonthValue()); 	//월	8
		System.out.println(localDate.getMonth()); 		//월	AUGUST
		System.out.println(localDate.getDayOfMonth()); 	//일  1
		System.out.println(localDate.getDayOfYear()); 	//일  213
		System.out.println(localDate.getDayOfWeek()); 	//일 FRIDAY		
		// 2025년 8월 1일 FRIDAY
		System.out.println(localDate.getYear()+"년 "+localDate.getMonthValue()+"월 "
		+localDate.getDayOfMonth()+"일 "+localDate.getDayOfWeek());		
		// 예약
		LocalDate localDate2= LocalDate.of(2025, 12, 14);
		System.out.println(localDate2);
		
		System.out.println(localDate2.getYear()); 			//년 2025
		System.out.println(localDate2.getMonthValue()); 	//월	12
		System.out.println(localDate2.getMonth()); 			//월 DECEMBER
		System.out.println(localDate2.getDayOfMonth()); 	//일  14
		System.out.println(localDate2.getDayOfYear()); 		//일  348
		System.out.println(localDate2.getDayOfWeek()); 		//일 SUNDAY
		
		
	}
}
