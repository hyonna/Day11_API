package com.util.calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		//추상클래스 new 생성 XXXX
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		//특정한 날짜 데이터를 꺼낼때, get
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min);
		int month = cal.get(Calendar.MONTH);
		System.out.println(month+1);
		
		//2100
		cal.set(Calendar.YEAR, 2100);
		System.out.println(cal.get(Calendar.YEAR));
		
		//1월로
		cal.set(Calendar.MONTH, 1);
		System.out.println(cal.get(Calendar.MONTH));
		
		cal.set(Calendar.HOUR_OF_DAY, 22);
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
		
		cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
//		int d = cal.get(Calendar.DATE) + 3;
//		cal.set(Calendar.DATE, d);
//		System.out.println(d);
		
		System.out.println("Month : " + cal.get(Calendar.MONTH));
		//cal.roll(Calendar.DATE, 28);
		cal.add(Calendar.DATE, 28);
		System.out.println("Month : " + cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));

	}

}
