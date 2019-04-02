package com.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {
	
	public void ex2() { //쌤이 풀어주신거

		// 비밀번호를 입력
		// 대문자 1개 이상, 소문자 1개 이상, 공백은 없어야하고
		// 숫자 1개 이상으로 조합
		// 최소 6자 이상
		
		int upper = 0;
		int lower = 0;
		int digit = 0;
		int space = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("비밀번호를 입력하세요");
		String pw = sc.nextLine(); //공백포함여부

		int count = pw.length(); // 문자열의 길이를 담을 변수
		
		if(count > 5) {
			
			for(int i = 0; i < count; i++) {
				
				char ch = pw.charAt(i);
				
				if(Character.isUpperCase(ch)) {
					upper++;
				} else if(Character.isLowerCase(ch)) {
					lower++;
					
				} else if(Character.isDigit(ch)) {
					
					digit++;
				} else if(Character.isWhitespace(ch)) {
					
					space++;
				} else {
					
					
				}
				
				
			} // for문 끝
			
			if(upper > 0 && lower > 0 && digit > 0 && space == 0) {
				
				System.out.println("OK");
				
			} else {
				
				System.out.println("다시 입력하시오");
			}
			
			
		} else {
			
			System.out.println("최소 6글자 이상");
		}



	}

//	public void ex2() {
//
//		// 비밀번호를 입력
//		// 대문자 1개 이상, 소문자 1개 이상, 공백은 없어야하고
//		// 숫자 1개 이상으로 조합
//		// 최소 6자 이상
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("비밀번호를 입력하세요");
//		String pw = sc.next();
//
//		int count = 0; // 문자열의 길이를 담을 변수
//
//		char[] arr = new char[pw.length()];
//
//		for (int i = 0; i < arr.length; i++) {
//
//			arr[i] = pw.charAt(i);
//			System.out.println(arr[i]);
//
//		}
//
//		if (arr.length <= 6) {
//
//			for (int i = 0; i < arr.length; i++) {
//
//				if (Character.isUpperCase(arr[i]) == true) {
//
//					System.out.println("비밀번호 성공");
//					break;
//
//				} else if (Character.isLowerCase(arr[i]) == true) {
//
//					System.out.println("비밀번호 성공");
//					break;
//				} else if (Character.isDigit(arr[i]) == true) {
//
//					System.out.println("비밀번호 성공");
//					break;
//				} else {
//
//					System.out.println("대소문자+숫자 확인 후 다시 입력하세요");
//					break;
//				}
//
//			}
//			
//		} else {
//
//			System.out.println("6자 미만으로 다시 입력하세요");
//		}
//
////		String[] arr;
////		
////		arr = pw.split("");
////		
////		for(int i = 0; i < arr.length; i++) {
////			
////			System.out.println(arr[i]);
////			
////		}
//
//	}

	public void ex1() {

		// 주민번호를 입력
		// 1. 나이가 ??
		// 2. 3 ~ 5 : 봄, 6 ~ 8 : 여름, 9 ~ 11 : 가을, 12 ~ 2 : 겨울

		Scanner sc = new Scanner(System.in);
		int ageNum = 0;
		int n = 0;

		System.out.println("주민번호를 입력하세요");
		String num = sc.next();

		// 나이 구하기

		int age = Integer.parseInt(num.substring(0, 2));

		char ch = num.charAt(7);

		if (ch == '1' || ch == '2') {

			ageNum = 2019 - (1900 + age) + 1;
			System.out.println("나이 : " + ageNum + "세");

		} else if (ch == '3' || ch == '4') {

			ageNum = 2019 - (2000 + age) + 1;
			System.out.println("나이 : " + ageNum + "세");

		}

		// 태어난 달, 계절 구하기

		String n2 = num.substring(2, 4);
		n = Integer.parseInt(n2);

		System.out.println("태어난 달 : " + n2 + "월");

		switch (n) {

		case 3:
		case 4:
		case 5:

			System.out.println("봄 태생");
			break;

		case 6:
		case 7:
		case 8:

			System.out.println("여름");
			break;

		case 9:
		case 10:
		case 11:

			System.out.println("가을");
			break;

		case 12:
		case 1:
		case 2:

			System.out.println("겨울");
			break;

		}

	}

}
