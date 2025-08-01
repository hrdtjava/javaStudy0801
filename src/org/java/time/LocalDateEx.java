package org.java.time;

import java.time.LocalDate;

public class LocalDateEx {

	public static void main(String[] args) {
		
		System.out.println("LocalDate");
		
		LocalDate localDate= LocalDate.now();// 현시점 -> 날짜
		
		System.out.println(localDate);
		System.out.println(localDate.getYear()); 		//년 2024
		System.out.println(localDate.getMonthValue()); 	//월	11
		System.out.println(localDate.getMonth()); 	//월	NOVEMBER
		System.out.println(localDate.getDayOfMonth()); 	//일  14
		System.out.println(localDate.getDayOfYear()); 	//일  319
		System.out.println(localDate.getDayOfWeek()); 	//일 THURSDAY		
		// 2024년 11월 14일 THURSDAY
		System.out.println(localDate.getYear()+"년 "+localDate.getMonthValue()+"월 "
		+localDate.getDayOfMonth()+"일 "+localDate.getDayOfWeek());
		
		// 예약
		LocalDate localDate2= LocalDate.of(2024, 12, 14);
		System.out.println(localDate2);
		
		System.out.println(localDate2.getYear()); 		//년 2024
		System.out.println(localDate2.getMonthValue()); 	//월	11
		System.out.println(localDate2.getMonth()); 	//월	NOVEMBER
		System.out.println(localDate2.getDayOfMonth()); 	//일  14
		System.out.println(localDate2.getDayOfYear()); 	//일  319
		System.out.println(localDate2.getDayOfWeek()); 	//일 THURSDAY
		
		
	}
}
