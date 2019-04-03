package com.util.list.ex1;

import java.util.ArrayList;

public class ListExView {
	
	public void view(ArrayList<Member> ar) {
		
		System.out.println("****등록된 정보 출력****");

		for (int i = 0; i < ar.size(); i++) {

			System.out.println("이름 : " + ar.get(i).getName());
			System.out.println("나이 : " + ar.get(i).getAge());

		}
		
		
	}

}
