package com.company;

import java.util.Scanner;

public class MinimumElementChallenge {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int size = readInteger();
        int[] array = readElements(size);
        int min = findMin(array);
        System.out.println(min);
    }

    private static int[] readElements(int count){
        int[] array = new int[count];
        for(int i=0;i<count;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    private static int readInteger(){
        return scanner.nextInt();
    }

    private static int findMin(int[] array){
        int min = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
