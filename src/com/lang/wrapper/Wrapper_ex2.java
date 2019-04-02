package com.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex2 {
	
	public void ex1() { //쌤이 풀어주신거

		// 주민번호 입력 941226-1234567
		// 9 4 1 2 2 6 - 1 2 3 4 5 6 7
		// 마지막 번호는 체크용 번호로 따로 저장
		// 앞 번호 * 2 / 두번쨰 번쨰 번호 * 3 . . . -는 제외
		// 결과를 11로 나눈 나머지를 구하기
		// 나머지를 11로 뺀값을 체크용 번호랑 비교, 같으면 정상적인 번호, 아니면 false

		// 나머지를 11로 뺀 값이 두자리라면 위의 결과값을 10으로 나눈 나머지를 체크번호랑 비교

		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호 입력");
		String jumin = sc.next();
		
		char ch = jumin.charAt(jumin.length() - 1);
		//체크용 번호
		
		int check = Integer.parseInt(String.valueOf(ch));
		
		//합계를 담을 변수
		int sum = 0;
		
		//곱하기 하는 변수
		int count = 2;
		
		for(int i = 0; i < jumin.length(); i++) {
			
			char c = jumin.charAt(i);
			
			if(!Character.isDigit(c)) {
				
				continue;
				
			}
			
			String n = String.valueOf(c);
			int num = Integer.parseInt(n);
			
			sum = sum + num * count;
			count++;
			
			if(count > 9) {
				
				count = 2;
				
			}
			
		}
		
		
		sum = sum % 11;
		sum = 11 - sum;
		
		if(sum > 9) {
			
			sum = sum % 10;
		}
		
		if(sum == check) {
			
			System.out.println("OK");
			
		} else {
			
			System.out.println("NO");
		}
		
		
		
		
		
//		String name = ch + "";
//		name = String.valueOf(ch);
//		String name1 = Character.toString(ch);

	}

	
	

//	public void ex1() {
//
//		// 주민번호 입력 941226-1234567
//		// 9 4 1 2 2 6 - 1 2 3 4 5 6 7
//		// 마지막 번호는 체크용 번호로 따로 저장
//		// 앞 번호 * 2 / 두번쨰 번쨰 번호 * 3 . . . -는 제외
//		// 결과를 11로 나눈 나머지를 구하기
//		// 나머지를 11로 뺀값을 체크용 번호랑 비교, 같으면 정상적인 번호, 아니면 false
//
//		// 나머지를 11로 뺀 값이 두자리라면 위의 결과값을 10으로 나눈 나머지를 체크번호랑 비교
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("주민번호 입력");
//		String jumin = sc.next();
//		
//		jumin = jumin.replace("-", "");
//		int total = 0;
//		int remain = 0;
//		int minus = 0;
//		int length = 0;
//
//		char ch = jumin.charAt(jumin.length() - 1);
//
//		for (int i = 0; i < jumin.length() - 1; i++) {
//
//			char c = jumin.charAt(i);
//			String n = String.valueOf(c);
//
//			int num = Integer.parseInt(n);
//
//			total += num * (i + 2);
//
//			System.out.println(num + " * " + (i + 2) + " = " + num * (i + 2));
//
//		}
//
//		System.out.println("총 합 : " + total);
//
//		remain = total % 11;
//		System.out.println("나머지 : " + remain);
//
//		minus = 11 - remain;
//		System.out.println("나머지에서 11을 뺀 값 : " + minus);
//
//		length = (int) (Math.log10(minus) + 1);
//		System.out.println("나머지 자릿수 : " + length);
//
//		if (minus == ch) {
//
//			System.out.println("결과값 : 정상번호");
//
//		} else {
//
//			System.out.println("결과값 : false");
//		}
//
//		
//		if (length == 2) {
//
//			int remain2 = total % 10;
//			
//
//			if (remain2 == ch) {
//
//				System.out.println("결과값 : 정상번호");
//			}
//
//		} else {
//			
//			System.out.println("결과값 : false");
//
//		}
//
////		String name = ch + "";
////		name = String.valueOf(ch);
////		String name1 = Character.toString(ch);
//
//	}

}
