package org.java.util;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TimeEx {
	public static void main(String[] args) {		
		System.out.println("시간, 날짜");
		// Date, SimpleDateFormat
		//1. 날짜 생성 -> 시스템기본시간
		Date date1=new Date();
		System.out.println(date1);
		//2.날짜 포맷
		SimpleDateFormat sf= new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		//3. 포맷() <- 날짜
		String dateFormat1= sf.format(date1);
		System.out.println(dateFormat1);		
		// Date, DateFormat
		//날짜 생성
		Date date2= new Date();
		// 싱글톤 ->
		// 날짜 포맷
//		DateFormat df=DateFormat.getInstance();
		// 날짜
//		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
//		DateFormat df=DateFormat.getDateInstance(DateFormat.MEDIUM);
//		DateFormat df=DateFormat.getDateInstance(DateFormat.LONG);
//		DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT);
//		DateFormat df=DateFormat.getDateInstance(DateFormat.DEFAULT);
		// 날짜, 시간
//		DateFormat df=DateFormat.getDateTimeInstance();
		DateFormat df=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.LONG,Locale.KOREA);
		
		String dateFormat2=df.format(date2);
		System.out.println(dateFormat2);
		
		// Calender
		Calendar cal= Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));	//2024
		System.out.println(cal.get(Calendar.MONTH)+1);//11
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));//14
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));// 3
		System.out.println(cal.get(Calendar.HOUR));// 	시	
		System.out.println(cal.get(Calendar.MINUTE));// 분
		System.out.println(cal.get(Calendar.SECOND));// 초
		
	}
}
 