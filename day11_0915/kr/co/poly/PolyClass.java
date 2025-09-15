package kr.co.poly;

import kr.co.Animal;
import kr.co.Cat;
import kr.co.Dog;

public class PolyClass {

    public PolyClass(){

        Animal[] animals = {
                new Dog("바둑이", 5, "진돗개"),
                new Dog("밥돌이", 2, "삽살개"),
                new Cat("나비", 3, false),
                new Cat("까망이", 4, true)
        };
        for (Animal animal : animals) {
            System.out.println(animal.getAge() + "살 " + animal.getName());
            animal.makeSound();
        }

        System.out.println();

        for (Animal animal : animals) {
            if(animal instanceof Dog){
                Dog myDog = (Dog) animal;
                myDog.wagTail();
            } else if(animal instanceof Cat cat){
                cat.wagTail();
                cat.climb();
            }
            }
        }
    }

