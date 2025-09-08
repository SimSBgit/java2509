package ch03.exercise;

public class num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
//		--------------------------------
		
		int score = 85;
		String result = (!(score>90))? "가":"나";
		System.out.println(result);
		
		System.out.println("-------------------");
		
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (int) (pencils / students);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = (int) (pencils % students);
		System.out.println(pencilsLeft);
		
		System.out.println("-------------------");
		
		int value = 356;
		System.out.println(((float) value / 100) * 100);
		
//		-----------------------------
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((double)((lengthTop+lengthBottom) * height / 2));
		System.out.println(area); 
	
//		-----------------------------
		System.out.println("------------------------");
		
		int a = 10;
		int b = 5;
		
		System.out.println( (a>7) && (b<=5));
		System.out.println( (a%3 == 2) || (b%2 != 1));
		
		System.out.println("-----------------------");
		
//		double e = 5;
//		double f = 0.0;
//		double g = 5 % f;
//		if (Double.isNaN(g)) {
//			System.out.println("0.0으로 나눌 수 없습니다.");
//		} else {
//			double result1 = g + 10;
//			System.out.println("결과: " + result1);
			
		}
	}

}
