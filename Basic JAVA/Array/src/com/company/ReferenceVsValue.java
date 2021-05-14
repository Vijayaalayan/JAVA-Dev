package com.company;

import java.util.Arrays;

public class ReferenceVsValue {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;
        System.out.println(num1);
        System.out.println(num2);
        num2 = 10;
        System.out.println(num1);
        System.out.println(num2);
        int[] arr1 = new int[5];
        for(int i=0;i<5;i++){
            arr1[i] = i;
        }
        int[] arr2 = arr1;
        for(int i=0;i<5;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        arr2[3] = 10;
        for(int i=0;i<5;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println("Array 1 :"+ Arrays.toString(arr1));
    }
}
