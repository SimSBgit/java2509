package ch04.exercise;

public class num4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			int i = (int) (Math.random() * 6) + 1;
			int j = (int) (Math.random() * 6) + 1;
			System.out.println("두 수의 합은 " + (i+j));
			if ((i + j) == 5) {
				break;
			}
		}

	}
}
