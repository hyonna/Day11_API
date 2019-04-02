package com.lang.string;

import java.util.Comparator;

public class StringTest_1 {

	public static void main(String[] args) {

		String s1 = "iu";
		String s2 = "iu";
		String s3 = new String("iu");
		String s4 = new String("iu");

		System.out.println(s1 == s2);
		System.out.println(s3 == s4);

		System.out.println(s3.equals(s4));

		String str = "choa";

		char ch = str.charAt(1);
		System.out.println(ch);
		
//		StringEx_1 ex_1 = new StringEx_1();
//		
//		ex_1.ex1();
		
		
		str = "lalarwdas";
		int a = str.indexOf('w'); //문자를 넣어줘야함
		System.out.println(a);
		
		str = "laallalal";
		int b = str.indexOf("lal");
		System.out.println(b);
		
		
//		System.out.println("==============");
//		
//		StringEx_1 ex_1 = new StringEx_1();
//		
//		ex_1.ex2();
		
		str = "choa";
		int l = str.length(); //글자의 크기 수 확인하기
		System.out.println(l);
		
		
		System.out.println("==============");
		
		StringEx_1 ex_1 = new StringEx_1();
		
		//ex_1.ex3();  
		
		//ex_1.ex4();
		
		str = "hellow world";
		String r = str.substring(7);
		System.out.println(r);
		r = str.substring(3, 6);
		System.out.println(r);
		
		//ex_1.ex5();
		
		r = str.toUpperCase();
		System.out.println(r);
		r = r.toLowerCase();
		System.out.println(r);
		
		String str1 = "test";
		String str2 = "  tes t ";
		
		r = str2.trim(); //문자열의 맨 앞, 맨 뒤에 있는 공백만 없애줌
		System.out.println(str2);
		System.out.println(r);
		
		r = String.valueOf("");
		System.out.println(r);
		
		str = "iu choa suji hani";
		String [] names = str.split(" ");
		
		for(int i = 0; i < names.length; i++) {
			
			System.out.println(names[i]);
			
		}
		
		
		str = "a,b,c-d-e,f";
		r = str.replace('-', ','); //앞 문자를 뒤 문자로 변경해줌
		System.out.println(r);
		
	}
}
