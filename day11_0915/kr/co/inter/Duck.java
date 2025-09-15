package kr.co.inter;

public class Duck extends Animal implements Walkalbe, Swimmable {


    public Duck(String name, int age) {
        super(name, age);
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public void swim() {
        System.out.println("오리가 수영해요");
    }

    @Override
    public void walk() {
        System.out.println("오리가 걸어요");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("꽥꽥");
    }
}