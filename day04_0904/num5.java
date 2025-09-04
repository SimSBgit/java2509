package ch04.exercise;

public class num5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 0;
		for(x=1; x<=10; x++) {
			for(y=1; y<=10; y++) {
				if((4*x +5*y) == 60) {
					System.out.println("x는 " + x + "이고, y는 " + y + "입니다.");
				}
			}
		}
	}
}
