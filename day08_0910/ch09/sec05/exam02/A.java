package ch09.sec05.exam02;

public class A {

	String field = "A-field";

	void method() {
		System.out.println("A메서드");
	}

	class B {
		String field = "B=field";

		void method() {
			System.out.println("B메서드");
		}

		void print() {
			System.out.println(this.field);
			this.method();

			System.out.println(A.this.field);
			A.this.method();
		}
	}
	
	void useB() {
		B b = new B();
		b.print();
	}
}
