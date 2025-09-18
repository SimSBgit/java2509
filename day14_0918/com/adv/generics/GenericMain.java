package com.adv.generics;

public class GenericMain {

    public GenericMain() {

    Box<String> strBox = new Box<>();

    strBox.setValue("Hello");
    System.out.println(strBox.getValue());

    Box<Integer> intBox = new Box<>();
    intBox.setValue(50);
    System.out.println(intBox.getValue());

//  배열 String 사용
    String[] names = { "존", "밥" };
    printArray(names);

//  배열 Integer 사용
    Integer[] numbers = {1, 2, 3};
    printArray(numbers);

    Integer[] intNumbers = {10, 20, 30, 40};
    Stats<Integer> intStats = new Stats<>(intNumbers);
    System.out.println(intStats.average());

    Double[] doubles = {1.1, 2.2, 3.3};
    Stats<Double> doubleStats = new Stats<>(doubles);
        System.out.println(doubleStats.average());
    }

    private <T> void printArray(T [] arr) {
        for(T item : arr)  {
            System.out.println(item);
        }
    }
}
