package com.company;

public class StaticMain {
    public static void main(String[] args) {
        System.out.println("Main method");
        StaticIntialiser staticIntialiser = new StaticIntialiser();
        staticIntialiser.method();
        System.out.println("Owner is "+StaticIntialiser.owner);
    }
}
