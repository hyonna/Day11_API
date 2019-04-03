package com.util.list.ex1;

import java.util.ArrayList;

public class ListExView {
	
	public void view(ArrayList ar) {
		
		System.out.println("****등록된 정보 출력****");

		for (int i = 0; i < ar.size(); i++) {

			System.out.println(ar.get(i));

		}
		
		
	}

}
