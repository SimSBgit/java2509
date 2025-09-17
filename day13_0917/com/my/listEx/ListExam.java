package com.my.listEx;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public ListExam() {
		
		System.out.println("< List >");
		List<String> arrList = new ArrayList<>();
		arrList.add("초록사과");
		arrList.add("오렌지");
		arrList.add("골드키위");
		
		System.out.println(arrList);
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		
		System.out.println();
		
		arrList.add(1, "레몬");
		System.out.println(arrList);
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		System.out.println(arrList.get(3));
		
		System.out.println();
		
		arrList.set(2, "그린키위");
		System.out.println(arrList);
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		System.out.println(arrList.get(3));
		
		System.out.println();
		
		List<Integer> arrList2 = new ArrayList<>();
		arrList2.add(10);
		arrList2.add(10);
		arrList2.add(20);
		arrList2.add(1, 30);
		arrList2.set(0, 5);
		
		System.out.println(arrList2);
		System.out.println(arrList2.get(0));
		System.out.println(arrList2.get(1));
		System.out.println(arrList2.get(2));
		System.out.println(arrList2.get(3));
		
		System.out.println();
		
		arrList.remove(1);
		System.out.println(arrList);
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		
		System.out.println();
		
		arrList2.clear();
		System.out.println("clear 후");
		System.out.println(arrList2);
		
		System.out.println();
		
		for(int i=0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		System.out.println();
		
		for(String fruit : arrList) {
			System.out.println(fruit);
		}
		System.out.println();
	}
}
