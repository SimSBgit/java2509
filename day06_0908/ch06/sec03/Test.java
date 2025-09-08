package ch06.sec03;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		심성보
		
		
//		문제 1번
		String name = "철수";
		System.out.println(name);
		
		int age = 20;
		System.out.println(age);
		
		double tall = 174.3;
		System.out.println((int)tall);
		
		boolean student = true;
		System.out.println(student);
		
		char grade = 65;
		System.out.println(grade);
//		
		System.out.println("---------------------------");
		
//		문제 2번. 연산자
		int a = 10;
		int b = 3;
		System.out.println(a + b); //값은 13
		System.out.println(a - b); //값은 7
		System.out.println(a * b); //값은 30
		System.out.println((double)a / b); //값은 3.33333333333333333335
		System.out.println(a % b); //값은 1
		System.out.println();
		System.out.println(a > b); //값은 true
		System.out.println(a == b); //값은 false
		System.out.println();
		System.out.println( a > b && a == b); //값은 false
		System.out.println(a > b || a == b); //값은 true
		System.out.println(!(a==b)); //값은 true
		System.out.println();
		++a;
		System.out.println(++a); 
		a--;
		System.out.println(a++); 
		--b;
		System.out.println(--b);
		b--;
		System.out.println(b--);
		
		System.out.println("-----------------------------");
		
//		문제 3번 if / switch 
		int score = 85;
		String grade1 = "";
		
		if(score > 90) {
			grade1 = "A";
			System.out.println(grade1);
		} else if(score >= 80) {
			grade1 = "B";
			System.out.println(grade1);
		} else if(score >= 70) {
			grade1 = "C";
			System.out.println(grade1);
		} else {
			grade1 = "D";
			System.out.println(grade1);
		}
		
//		3항 연산자 사용
		System.out.println(score > 80 ? "합격" : "불합격");
		
//		switch문
		switch(score) {
		case 85:
			grade1 = "B";
			System.out.println(grade1);
			break;
		default:
			grade1 = "B보다 높거나 낮음";
			System.out.println(grade1);
		}
//		for문
		int value;
		
		for(int i=1; i<=9; i++) {
			for(int k=1; k<=9; k++) {
				value = i*k;
				System.out.println(value);
			}
		}
		
	}

}
