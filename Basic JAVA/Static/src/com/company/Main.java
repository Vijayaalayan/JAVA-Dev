package com.company;

public class Main {

    public int multiplier = 2;
    public static int add = 2;

    public static void main(String[] args) {
        StaticTest first = new StaticTest("First");
        System.out.println(first.getName()+" number of instance is "+first.getNumberOfInstance());
        StaticTest second = new StaticTest("Second");
        System.out.println(second.getName()+" number of instance is "+second.getNumberOfInstance());
        StaticTest third = new StaticTest("Third");
        System.out.println(third.getName()+" number of instance is "+third.getNumberOfInstance());

//        Static methods can be accessed without creating instance of a class
        System.out.println(StaticTest.getNumberOfInstance());

//        System.out.println(multiplier);
//        System.out.println(multiply(6));
//        Static methods and members can be accessed within a static method.

        System.out.println(add);
        System.out.println(add(4));

    }

    public int multiply(int number){
        return number * this.multiplier;
    }
    public static int add(int number){
        return number+add;
    }
}
