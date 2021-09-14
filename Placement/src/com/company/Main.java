package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int size = scanner.nextInt();
	    int[] arr = new int[size];
	    for(int i=0;i<size;i++){
	        arr[i] = scanner.nextInt();
        }
	    for(int i=0;i<size;i++){
	        for(int j=i+1;j<size;j++){
	            if(arr[i]<arr[j]){
	                arr[i] = arr[j];
	                break;
                }
            }
        }
	    for(int i=0;i<size;i++){
	        System.out.print(arr[i]+" ");
        }
    }
}
