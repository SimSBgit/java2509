package kr.co;

public class ExtClass {

    public  ExtClass() {
        Dog dog0 = new Dog();
        Cat cat0 = new Cat();

        Dog dog =  new Dog("호두", 3, "골든리트리버");
        Cat cat  =  new Cat("깜이", 2, true);

        dog.makeSound();
        cat.makeSound();
    }
}
