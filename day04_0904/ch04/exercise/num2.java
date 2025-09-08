package ch04.exercise;

public class num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = "B";
		
		int score2 = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		};
		System.out.println("score2: " + score2);
	}
}
