package com.util.calendar;

import java.util.Calendar;

public class CalendarTest5 {

	public static void main(String[] args) {

		Calendar ca = Calendar.getInstance();
		ca.set(2019, 4, 1);
		int dayOfWeek = ca.get(Calendar.DAY_OF_WEEK) - 1;

		int max = ca.getActualMaximum(Calendar.DATE); // 나타낼 수 있는 가장 큰 수

		//System.out.println(max);

		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println();

		for (int i = 0; i < dayOfWeek; i++) {

			System.out.print("\t");

		}

		for (int i = 1; i <= max; i++) {
			
			System.out.print(i + "\t");

			if ((i + dayOfWeek) % 7 == 0) {

				System.out.println();

			}

		}
		
		System.out.println();

		System.out.println();
		System.out.println("YEAR : " + Calendar.YEAR);
		System.out.println("MONTH : " + Calendar.MONTH);
		System.out.println("DATE : " + Calendar.DATE);
		System.out.println(ca.getTime());

	}

}
