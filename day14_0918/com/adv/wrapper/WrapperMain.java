package com.adv.wrapper;

import java.util.ArrayList;

public class WrapperMain {

    public WrapperMain() {
/*
       byte > Byte
       shor > Short
       int > Integer
       long > Long
       float > Float
       double > Double
       boolean > Boolean
       char > Char
        */

        ArrayList<Integer> myNums = new ArrayList<>();

        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println("myNums: " + myInt);
        System.out.println("myInt: " + myInt);
        System.out.println("myDouble: " + myDouble);
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        System.out.println();

        myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString);
        System.out.println(myString.length());
    }
}
