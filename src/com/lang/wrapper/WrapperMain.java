package com.lang.wrapper;

public class WrapperMain {

	public static void main(String[] args) {
		
		Wrapper_ex1 ex1 = new Wrapper_ex1();
		Wrapper_ex2 ex2 = new Wrapper_ex2();
		Wrapper_ex3 ex3 = new Wrapper_ex3();
		
//		ex2.ex1();
		
//		ex1.ex2();
//		
//		ex1.ex1();
		
//		int num = -10;
//		System.out.println(Integer.toBinaryString(num));
//		System.out.println(Integer.toOctalString(num));
//		System.out.println(Integer.toHexString(num));
		
		
		
		Integer n1 = new Integer(10);
		int num = n1; //autoUnBoxing : 레퍼런스 타입을 기본형 타입으로 바꿔줌
		
		n1 = 20; //autoBoxing : 자동으로 감싸줌
		
		n1 = (int)20.3;
		double d = 20.3;
		
		String s1 = "iu";
		String s2 = "choa";
		System.out.println(s1.hashCode());
		
		s1 = s1 + s2;
		
		System.out.println(s1.hashCode());
		System.out.println("1" + "2" + "3" + "4");
		
		StringBuffer s = new StringBuffer();
		System.out.println(s.hashCode());
		s.append("iu");
		System.out.println(s);
		s.append("choa");
		System.out.println(s);
		
		System.out.println(s.toString());
		String name = s1.toString();
		
		double d1 = 3.14;
		d1 = Math.ceil(d1); //올림
		System.out.println(d1);
		
		d1 = 3.54;
		d1 = Math.floor(d1); //내림
		System.out.println(d1);
		
		d1 = 3.54;
		d1 = Math.round(d1); //반올림
		System.out.println(d1);
		
		System.out.println("==================");
		
		ex3.ex1();

	}

}
