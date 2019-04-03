package com.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExMain {

	public static void main(String[] args) {

		// 1. 정보입력
		// - 이름입력
		// - 나이입력
		// 2. 정보출력
		// - 모든정보 출력
		// 3. 종료

		Scanner sc = new Scanner(System.in);
		ArrayList ar = new ArrayList();
		

		while (true) {

			System.out.println("1. 정보입력");
			System.out.println("2. 정보출력");
			System.out.println("3. 종료");
			int select = sc.nextInt();

			if (select == 1) {

				new ListExInput().setInfo(ar);
				

			} else if (select == 2) {

				new ListExView().view(ar);

			} else {
				
				System.out.println("종료합니다");
				break;
			}

		}

	}

}
