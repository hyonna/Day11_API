package com.util.random;

import java.util.Random;

public class RandomEx1 {

	public void ex4() {

		// RPG
		// Lineage : 0 -> 1
		// 10% 확률로 3단계 성공
		// 20%확률로 2단계 성공
		// 30%확률로 1단계 성공
		// 40%확률로 실패

		Random rd = new Random();

		int[] nums = { 0, 0, 0, 1, 0, 2, 0, 1, 0, 0 };
		int index = rd.nextInt(nums.length);
		int num = nums[index];

		if (num == 0) {

			System.out.println("실패 현질");
		} else {
			System.out.println(num + "강화 성공");
		}

//		if (Math.random() <= 0.1) {
//
//			System.out.println("3단계 성공");
//
//		} else if (Math.random() <= 0.2) {
//
//			System.out.println("2단계 성공");
//
//		} else if (Math.random() <= 0.3) {
//
//			System.out.println("1단계 성공");
//
//		} else if (Math.random() <= 0.4) {
//
//			System.out.println("실패");
//
//		} else {
//
//			System.out.println("강화 실패");
//		}

	}

	public void ex3() {

		String[] foods = { "떡볶이", "냉면", "순대국", "육개장", "해장국", "굶기" };

		Random rd = new Random();

		int num = rd.nextInt(foods.length);

		System.out.println(foods[num]);

	}

	public void ex2() {

		// 1~45번 까지의 숫자를 6개

		int temp;
		int[] lotto = new int[6];
		Random rd = new Random();

		for (int i = 0; i < lotto.length; i++) {

			lotto[i] = rd.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {

				while (lotto[i] == lotto[j]) {

					lotto[i] = rd.nextInt(45) + 1;
					j = 0;

				}
			}

			System.out.print(lotto[i] + " ");

		}

	}

	public void ex1() {

		// 6개 숫자가 출력
		// 1~45번 출력

		Random rd = new Random();

		for (int i = 0; i <= 6; i++) {

			int num = rd.nextInt(46);
			System.out.println(num);

		}

	}

}
