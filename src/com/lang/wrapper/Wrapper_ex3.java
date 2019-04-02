package com.lang.wrapper;

public class Wrapper_ex3 {
	
	public void ex1() {
		
		//random 발생
		//0 ~ 9 사이의 정수를 반환
		
		for(int i = 0; i <= 9; i++) {
			
			int num = (int) (Math.random() * 10);
			System.out.println(num);
			
		}
		
	}
	
}
