package org.java.time;

import java.time.LocalTime;

public class LocalTimeEx {

	public static void main(String[] args) {

		System.out.println("LocalTime");

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime); // 시: 분: 초. 나노시간

		System.out.println(localTime.getHour());
		System.out.println(localTime.getMinute());
		System.out.println(localTime.getSecond());
		System.out.println(localTime.getNano());

		System.out.println(localTime.getHour() + "시 " 
							+ localTime.getMinute() + "분 " 
							+ localTime.getSecond() + "초");
		
		System.out.println("예약 시간");
		LocalTime localTime2= LocalTime.of(14, 20, 0);
		
		System.out.println(localTime2.getHour());
		System.out.println(localTime2.getMinute());
		System.out.println(localTime2.getSecond());
		System.out.println(localTime2.getNano());

		System.out.println(localTime2.getHour() + "시 " 
							+ localTime2.getMinute() + "분 " 
							+ localTime2.getSecond() + "초");

	}
}
