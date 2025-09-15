package kr.co;

public class Cat extends Animal{
    boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.setName(name);
        this.setAge(age);
        this.isIndoor = isIndoor;
    }

    public Cat() {

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("야옹");
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    @Override
    public void wagTail() {
        super.wagTail();
        System.out.println(getAge() + "살 " + getName() + "가 꼬리를 흔듭니다.");
    }

    public void climb() {
        System.out.println(getAge()+"살 "+getName()+"가 점프합니다");
    }
}
