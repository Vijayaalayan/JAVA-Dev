package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while(count<10){
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int temp = scanner.nextInt();
                count++;
                sum+=temp;
            }else{
                System.out.println("Invalid");
            }
            scanner.nextLine();
        }
        System.out.println(sum);
    }
}
