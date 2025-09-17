package com.my.setEx;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {

	public SetExam() {
		System.out.println("< Set >");
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Java");
		hashSet.add("Vue");
		hashSet.add("React");
		hashSet.add("Java"); //중복 추가 X
		System.out.println(hashSet);
		
		System.out.println();
		
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(30);
		treeSet.add(10);
		treeSet.add(50);
		treeSet.add(20);
		treeSet.add(10); //중복 추가 X
		System.out.println("treeSet(정렬됨): " + treeSet);
		
		System.out.println();
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("첫째");
		linkedHashSet.add("둘째");
		linkedHashSet.add("셋째");
		linkedHashSet.add("첫째"); //중복 추가 X
		System.out.println("linkedHashSet(순서 유지): " + linkedHashSet);

		System.out.println();
	}
}
