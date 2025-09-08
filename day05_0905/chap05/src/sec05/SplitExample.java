package sec05;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String board = "1,자바 학습,참조 타입 String을 합습니다.,홍길동";
		
		String[] tokens = board.split(",");
		
		System.out.println("변호: " + tokens[0]);
		System.out.println("변호: " + tokens[1]);
		System.out.println("변호: " + tokens[2]);
		System.out.println("변호: " + tokens[3]);
		System.out.println();
		
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}	
}
