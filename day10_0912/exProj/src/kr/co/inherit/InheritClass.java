package kr.co.inherit;

public class InheritClass {

	public InheritClass() {
		
		Dog dog = new Dog("호두", 3, "진돗개");
		
		Cat cat = new Cat("껌이", 5, false);

		dog.displayInfo();
		dog.eat();
		dog.makeSound();
		dog.wagTail();
		
		System.out.println();
		
		cat.displayInfo();
		cat.eat();
		cat.makeSound();
		cat.climb();
		
	}
}
