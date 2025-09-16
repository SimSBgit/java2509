package ch13.sec02.exam03;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<String> box1 = new Box<>();
		box1.content = "100";
		
		Box<String> box2 = new Box<>();
		box2.content = "100";
		
		boolean result1 = box1.compare(box2);
		System.out.println("result1 : " + result1);
	}
}

