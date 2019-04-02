package com.lang;

public class Obejct_1_Object {

	public static void main(String[] args) {
		
		//Object 클래스 객체 생성
		//클래스명 참조변수명 = new 생성자()
		//참조변수명.멤버변수명
		//참조변수명.멤버메서드명()
		Object obj = new Object();
		Object obj1 = new Object();
		//접근지정자 그외지정자 리턴타입 메서드명([매개변수 선언])
		
		boolean c = obj.equals(obj1);
		System.out.println(c);
		
		System.out.println(obj == obj1);
		
		String s = obj.toString();
		System.out.println(s);
		
	
		int i = obj.hashCode();
		System.out.println(i);
	
	}
	

}
