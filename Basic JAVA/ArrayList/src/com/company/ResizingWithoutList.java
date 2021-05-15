package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ResizingWithoutList {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Enter 10 integers");
        array = getinputinitial();
        System.out.println("Array : "+ Arrays.toString(array));
        array = resize(array);
        array[10] = 100;
        array[11] = 101;
        System.out.println("Array : "+Arrays.toString(array));
    }

    private static int[] resize(int[] array) {
        int[] temp = array;
        array = new int[12];
        for(int i=0;i<temp.length;i++){
            array[i] = temp[i];
        }
        return array;
    }

    private static int[] getinputinitial(){
        int[] array = new int[10];
        for (int i=0;i<10;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

}
