package com.company;

public class Main {

    public static int sumDigits(int number){
        if(number<10){
            return -1;
        }
        int sum = 0;
        while(number>0){
            int temp = number%10;
            sum+=temp;
            number/=10;
        }
        return sum;
    }

    //  Coding Exercise 17
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum = 0;
        while(number>0){
            int temp = number%10;
            if(temp%2 == 0){
                sum+=temp;
            }
            number/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
	    int sum = sumDigits(21);
        System.out.println(sum);
    }
}
