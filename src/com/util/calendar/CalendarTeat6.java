package com.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTeat6 {
	
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		//2019년 4월 8일 9시 13분
		
		String pattern = "yyyy년 MM월 dd일 HH:mm E";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		long now = calendar.getTimeInMillis();
//		Date date = new Date();
//		date.setTime(now);
		
//		Date date = new Date(now);
		
		Date date = calendar.getTime();
		
		
		String result = sd.format(date); //java.util.Date
		System.out.println(result);
		
		
	}

}
