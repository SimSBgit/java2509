package kr.co;

public class Dog extends Animal{
    String breeds;

    public Dog(String name, int age, String breeds) {
        super(name, age);
        this.setName(name);
        this.setAge(age);
        this.breeds = breeds;
    }

    public Dog() {

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("멍멍");
    }

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    @Override
    public void wagTail() {
        super.wagTail();
        System.out.println(getAge() + "살 " + getName() + "가 꼬리를 흔듭니다.");
    }
}
