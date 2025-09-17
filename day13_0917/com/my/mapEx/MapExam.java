package com.my.mapEx;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExam {

	public MapExam() {
		System.out.println("< Map >");
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("초록사과", 1000);
		hashMap.put("오렌지", 500);
		hashMap.put("그린키위", 800);
		hashMap.put("골드키위", 1200);
		System.out.println("HashMap: " + hashMap);
		System.out.println("초록사과 가격: " + hashMap.get("초록사과"));
		
		System.out.println();
	
		System.out.print("키: ");
		for(String key : hashMap.keySet()) {
			System.out.print(key + " ");
		}
		
		System.out.println();
		
		System.out.print("값: ");
		for(int value : hashMap.values()) {
			System.out.print(value + " ");
		}
		
		System.out.println();
		System.out.println();
		
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("서울", "Seoul");
		treeMap.put("부산", "Busan");
		treeMap.put("대구", "Daegu");
		treeMap.put("인천", "Incheon");
		System.out.println("TreeMap(키 정렬): " + treeMap);
		
		System.out.println();
		
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(3, "셋");
		linkedHashMap.put(1, "하나");
		linkedHashMap.put(2, "둘");
		System.out.println("LinkedHashMap(순서 유지): " + linkedHashMap);
		
		System.out.println();
	}
}
