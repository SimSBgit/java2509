package ch15.sec03.exam03;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("Vue");
		set.add("React");
		set.add("Spring");

		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			if (element.equals("React")) {
				iterator.remove();
			}
		}
		
		System.out.println();

		set.remove("Vue");

		for (String element : set) {
			System.out.println(element); 
			}
		}
	}

