package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("123456-1234567", "박자바");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		k1.name = "김자바";
		System.out.println(k1.name + " " + k1.ssn + " " + k1.nation);
	}

}
