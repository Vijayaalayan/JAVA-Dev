package com.company;

import java.util.Scanner;

public class Main {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int count = 0;
        while (true){
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int number = scanner.nextInt();
                count++;
                sum+=number;
            }else{
                avg = Math.ceil(sum/count);
                System.out.println("SUM = "+(int)sum+" AVG = "+(int)avg);
                break;
            }
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {
//        Challenge 1
//        Scanner scanner = new Scanner(System.in);
//        int count = 0;
//        int sum = 0;
//        while(count<10){
//            boolean hasNextInt = scanner.hasNextInt();
//            if(hasNextInt){
//                int temp = scanner.nextInt();
//                count++;
//                sum+=temp;
//            }else{
//                System.out.println("Invalid");
//            }
//            scanner.nextLine();
//        }
//        System.out.println(sum);

//        Challenge 2
//        Scanner scanner = new Scanner(System.in);
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        while(true){
//            System.out.println("Enter a number");
//            boolean isInt = scanner.hasNextInt();
//            if(isInt){
//                int number = scanner.nextInt();
//                if(min>number){
//                    min = number;
//                }
//                if(max<number){
//                    max = number;
//                }
//            }else {
//                break;
//            }
//            scanner.nextLine();
//        }
//        System.out.println("Minimum is : "+min);
//        System.out.println("Maximum is : "+max);

//        Coding Exercise - 27
        inputThenPrintSumAndAverage();
    }
}
