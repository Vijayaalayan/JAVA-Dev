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

    public static boolean isValid(int number){
        return number > 9 && number <= 1000;
    }

    public static boolean hasSameLastDigit(int n1,int n2,int n3){
        if(isValid(n1) && isValid(n2) && isValid(n3)){
            int t1 = n1%10;
            int t2 = n2%10;
            int t3 = n3%10;
            return t1 == t2 || t2 == t3 || t1 == t3;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
	    int sum = sumDigits(21);
        System.out.println(sum);
    }
}
