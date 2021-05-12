package com.company;

import java.util.Scanner;

public class CodingChallenge41 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = getIntegers(5);5
        array = sortIntegers(array);
        printArray(array);
    }

    public static int[] getIntegers(int number){
        int[] values = new int[number];
        System.out.println("Enter "+number+" values");
        for(int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] values){
        for(int i=0;i<values.length;i++){
            System.out.println("Element "+i+" contents "+values[i]);
        }
    }
    public static int[] sortIntegers(int[] values){
        for(int i=0;i<values.length;i++){
            for(int j=i+1;j<values.length;j++){
                if(values[i] < values[j]){
                    int temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }
        return values;
    }
}
