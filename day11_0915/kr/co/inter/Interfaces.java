package kr.co.inter;

public class Interfaces {

    public  Interfaces() {

        Bird bird = new Bird("참새", 1, 25.5);
        Duck duck = new Duck("도널드", 3);

        bird.makeSound();
        bird.walk();
        bird.fly();
        bird.swim();
        System.out.println();

        duck.makeSound();
        duck.walk();
        duck.swim();
        System.out.println();

        Walkalbe[] walkalbe = {bird, duck};
        for(Walkalbe w : walkalbe){
            w.walk();
        }
        System.out.println();

        testWalk(bird);
        testWalk(duck);
        System.out.println();

        testSwim(bird);
        testSwim(duck);
    }

    private void testSwim(Swimmable swimming) {
        swimming.swim();
    }

    public static void testWalk(Walkalbe walker){
        walker.walk();
    }
}
