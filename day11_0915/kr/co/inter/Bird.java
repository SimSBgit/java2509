package kr.co.inter;

public class Bird extends Animal implements Walkalbe, Swimmable, Flyable {
    private double wingspan;

    public Bird(String name, int age, double wingspan) {
        super(name, age);
        this.setName(name);
        this.setAge(age);
        this.wingspan = wingspan;
    }

    @Override
    public void swim() {
        System.out.println("새가 수영을 합니다.");
    }

    @Override
    public void walk() {
        System.out.println("새가 걸어요");
    }

    @Override
    public void fly() {
        System.out.println("새가 날아오릅니다.");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("짹짹");
    }
}
