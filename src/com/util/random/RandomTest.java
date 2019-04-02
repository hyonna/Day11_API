package com.util.random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int num = rd.nextInt(); //int 최소, 최대
		System.out.println(num);
		num = rd.nextInt(5); //0부터 5 미만
		System.out.println(num);

	}

}
