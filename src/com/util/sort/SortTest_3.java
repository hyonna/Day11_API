package com.util.sort;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class SortTest_3 {

	public static void main(String[] args) {

//		ArrayList<String> ar = new ArrayList<String>();
//		ArrayList<String> ar2 = new ArrayList<String>();
//		
//		ArrayList<ArrayList<String>> ar3 = new ArrayList<ArrayList<String>>();
//		ar3.add(ar2);
//		ar3.add(ar);
//		
//		HashMap<ArrayList<String>, ArrayList<String>> map = new HashMap<ArrayList<String>, ArrayList<String>>();
//		map.put(ar, ar2);

		Member member = new Member("choa", 20);
		System.out.println("객체 주소 : " + member);
		
		Member member2 = new Member("iu", 20);
		System.out.println(member.equals(member2));
		
		ArrayList<Member> ar = new ArrayList<Member>();
		Collections.sort(ar);
		
		

	}
	
	
//	public static void sort(List<Comparable<Object>> ) {
//		
//		ar.get(0).compareTo(ar.get(1));
//		
//		if(num > 0) {
//			
//			
//		} else if(num < 0) {
//			
//			
//		} else {
//			
//			
//		}
		
		
	}


