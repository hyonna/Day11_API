package com.lang.string;

import java.util.Scanner;

public class StringEx_1 {

	// ex1 메서드
	// 리턴 void

	// 주민번호 입력받기
	// 남자인지 여자인지 판별
	// 000000-0000000

	public void ex1() {

		Scanner sc = new Scanner(System.in);

		System.out.println("주민번호를 입력하시요.");
		String str = sc.next();

		if (str.charAt(7) == '1') {

			System.out.println("남자입니다");

		} else if (str.charAt(7) == '2') {

			System.out.println("여자입니다");
		} else {

			System.out.println("다시입력하세요.");

		}

	}

//	public void ex2() { // 인터넷에서 찾아본 답
//
//		String name = "Mississippi";
//		int count = 0;
//		// i글자가 몇개 있습니까?
//
//		char c = name.charAt(1);
//		int fromIndex = 0;
//
//		while (true) {
//
//			int index = name.indexOf(c, fromIndex);
//
//			if (index == -1) {
//
//				break;
//			} else {
//				
//				System.out.println(index + "번째");
//				count++;
//				
//				fromIndex = index + 1;
//			}
//
//		}
//		
//		System.out.println("개수 : " + count + "개");
//
//	}

	public void ex2() { // 쌤이 풀어주신 답

		String name = "Mississippi";
		int i = -1;
		int count = 0;

		while (true) {
			i = name.indexOf("s", i + 1);

			if (i != -1) {

				count++;
			} else {

				break;
			}
		} // while 끝

		System.out.println("Count : " + count);
	}

	public void ex3() {

		// 한 글자당 100원

		Scanner sc = new Scanner(System.in);

		System.out.println("글자를 입력하세요");
		String str = sc.next();

		int num = str.length() * 100;

		System.out.println(num + "원");

	}

	public void ex4() {

		// id 입력 - 이메일 형식, @
		// 최대 10글자 이하로만,

		Scanner sc = new Scanner(System.in);

		boolean check1 = false; // 길이가 맞는지 여부
		boolean check2 = false; // 이메일 형식 여부

		System.out.println("id를 입력하시오. (이메일 형식)");
		String id = sc.next();

		if (id.length() < 11) {

			check1 = true;

		}

		int index = id.indexOf("@");

		if (index != -1) {

			check2 = true;
		}

		if (check1 && check2) {

			System.out.println("사용가능한 id 입니다");
		} else {

			System.out.println("사용 불가능한 id 입니다");

		}
	}

	public void ex5() {

		// jpg, png, gif
		// 업로드할 파일명을 입력
		// 이 파일이 이미지 아닌지 판단
		// 이미지가 아니라면 이미지만 업로드 가능

		Scanner sc = new Scanner(System.in);

		System.out.println("파일명을 입력하세요");
		String name = sc.next();

		int i = name.lastIndexOf(".");

		String result = name.substring(i + 1);

		switch (result) {

		case "jpg":
			System.out.println("업로드 완료");
			break;
		case "gif":
			System.out.println("업로드 완료");
			break;
		case "png":
			System.out.println("업로드 완료");
			break;
		default:
			System.out.println("이미지만 업로드 가능");
			break;

		}

	}

}
