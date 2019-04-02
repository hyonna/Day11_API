package com.lang;

public class Object_2_wrapper {
	
	public static void main(String[] args) {
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		System.out.println(Double.BYTES);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.SIZE);
		
		Integer i = new Integer(10);
		Integer i2 = new Integer("20");
		
		int n2 = i2.intValue(); //문자열을 정수로 바꿔줌
		System.out.println(n2);
		
		
		String num1 = "3.2";
		Double d = new Double(num1);
		double n3 = d.doubleValue(); //문자열을 더블로 바꿔줌
		System.out.println(n3);
		
		n2 = Integer.parseInt("20"); //문자열을 정수로 바꿔줌
		n3 = Double.parseDouble("3.0"); //문자열을 더블로 바꿔줌
		
		System.out.println(n2); 
		System.out.println(n3); 
		
	}

}
