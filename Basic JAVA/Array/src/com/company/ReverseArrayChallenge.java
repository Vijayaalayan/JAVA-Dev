package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallenge {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = scanner.nextInt();
        }
        reverse(array);
    }
    private static void reverse(int[] array){
        System.out.println("Array = "+ Arrays.toString(array));
        int j= array.length-1;
        for(int i=0;i<array.length/2;i++){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
        }
        System.out.println("Reversed array = "+Arrays.toString(array));
    }
}
