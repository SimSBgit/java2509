package exercise;

import java.util.Scanner;

public class num9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int students = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			
			int inputValue = Integer.parseInt(scanner.nextLine());
			
			if(inputValue == 1) {
				System.out.print("학생수> ");
				students = Integer.parseInt(scanner.nextLine());
				scores = new int[students];
			} else if(inputValue == 2) {
				for(int i=0; i<scores.length; i++) {
				System.out.println("scores[" + i + "]> ");
				scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if(inputValue == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			} else if(inputValue == 4) {
				int max = scores[0];
				int sum = 0;
				double avg = 0;
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];
					max = (max<scores[i])? scores[i] : max;
				}
				avg = (double) sum / students;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if(inputValue == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
