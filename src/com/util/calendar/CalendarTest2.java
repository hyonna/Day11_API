package com.util.calendar;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		//생일 올 세팅
		//요일이 무슨 요일?
		
		cal.set(1994, 12, 25);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

	}

}
