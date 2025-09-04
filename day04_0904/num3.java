package ch04.exercise;

public class num3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i;
		
		for(i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
				} else {
					continue;
				}
			}
		System.out.println("sum: " + sum);
		}
	}


