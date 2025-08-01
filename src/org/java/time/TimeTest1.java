package org.java.time;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimeTest1 {

	public static void main(String[] args) {
		System.out.println("LocalDate,LocallTime");
		
		//현재날짜와 시간을 출력
		LocalDate date= LocalDate.now();
		LocalTime time= LocalTime.now();
	
		System.out.println(date.getYear()+"년 "+date.getMonthValue()+"월 "
				+date.getDayOfMonth()+"일 "+date.getDayOfWeek()+
				time.getHour() + "시 " + time.getMinute() + "분 " 
				+ time.getSecond() + "초");	
	} 
	
}
