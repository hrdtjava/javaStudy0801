package org.java.time;

import java.time.LocalDateTime;

public class LocalDateTimeEx1 {

	public static void main(String[] args) {
		
		System.out.println("LocalDateTime");//날짜+시간
		
		LocalDateTime localDateTime= LocalDateTime.now();
		
		System.out.println(localDateTime);
		System.out.println(localDateTime.getYear());  		//년
		System.out.println(localDateTime.getMonthValue()); 	//월
		System.out.println(localDateTime.getDayOfMonth()); 	//월
		System.out.println(localDateTime.getHour());		//시
		System.out.println(localDateTime.getMinute());		//분
		System.out.println(localDateTime.getSecond());		//초
		System.out.println(localDateTime.getNano());		//나노
		
		System.out.println(localDateTime.getYear()+"년"+localDateTime.getMonthValue()+"월");
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
