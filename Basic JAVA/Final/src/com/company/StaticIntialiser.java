package com.company;

public class StaticIntialiser {
    public static final String owner;

    static {
        owner = "Vijay";
        System.out.println("1st static called");
    }

    public StaticIntialiser() {
        System.out.println("Constructor Called");
    }

    static {
        System.out.println("2nd static called");
    }

    public void method(){
        System.out.println("Some method called");
    }
}
