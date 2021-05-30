package com.company;

public class StaticTest {
    private static int numberOfInstance = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numberOfInstance++;
    }

    public static int getNumberOfInstance() {
        return numberOfInstance;
    }

    public String getName() {
        return name;
    }

}
