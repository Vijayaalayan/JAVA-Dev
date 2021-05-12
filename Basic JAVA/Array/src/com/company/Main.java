package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//	    int[] myArray = new int[5];
//	    for(int i=0;i<5;i++){
//	        myArray[i] = scanner.nextInt();
//        }
//	    for(int i=0;i<5;i++){
//            System.out.println(myArray[i]);
//        }

	    int[] array = getIntegers(5);
	    for(int i=0;i<array.length;i++){
            System.out.println("Element at "+i+" is "+array[i]);
        }
        System.out.println("Average of all numbers is "+getAverage(array));

    }
    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" values");
        int[] values = new int[number];
        for(int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] values){
        int sum = 0;
        for(int i=0;i<values.length;i++){
            sum+=values[i];
        }
        return (double) sum / (double) values.length;
    }
}
