package com.company;

public class Main {

    public static void main(String[] args) {
        byte byteVal = 10;
        short shortVal = 20;
        int intVal = 50;
        long longFinalVal = 50000L+ 10L * (byteVal + shortVal + intVal);
        System.out.println(longFinalVal);

        short shortFinalVal = (short) (1000 + 10 * (byteVal + shortVal + intVal));
        System.out.println(shortFinalVal);
    }
}
