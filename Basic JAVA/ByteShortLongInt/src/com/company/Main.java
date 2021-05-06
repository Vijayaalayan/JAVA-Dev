package com.company;

public class Main {

    public static void main(String[] args) {
	    int minInt = Integer.MIN_VALUE;
	    int maxInt = Integer.MAX_VALUE;
	    System.out.println(minInt);
        System.out.println(maxInt);

//        overflow and underflow
        System.out.println(minInt-1);
        System.out.println(maxInt+1);

        int number = 2_12_21_21;
        System.out.println(number);

    }
}
