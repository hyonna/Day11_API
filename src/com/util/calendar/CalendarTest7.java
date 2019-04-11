package com.util.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarTest7 {

	public static void main(String[] args) throws ParseException {
		
		String now = "2020-05-05";
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
		Date date = sd.parse(now);
		System.out.println(sd.format(date));
		
		//문자열 -> Calendar
		
		//java.text.SimpleDateFormat
		

	}

}
