package ch03.exercise;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int num2 = 11;
		System.out.println(Integer.toBinaryString(num) + "---" + Integer.toBinaryString(num2));
		System.out.println("정수 10의 2진수값");
		
		System.out.println("2진수 1010, 1011에 대한 10진수값");
		byte[] dat = {0b1010,0b1011};
		for(byte b:dat) {
			int val = b;
			System.out.println(val);
		}
	}

}
