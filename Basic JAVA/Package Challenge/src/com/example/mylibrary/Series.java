package com.example.mylibrary;

public class Series {

    public static long nSum(int n){
        long sum = 0;
        for(int i=1;i<n;i++){
            sum+=i;
        }
        return sum;
    }

    public static long factorial(int n){
        if(n == 0){
            return 0;
        }
        long fact = 1;
        for(int i=1;i<n;i++){
            fact*=i;
        }
        return fact;
    }

    public static void fibanocci(int n){
        int t1 = 0,t2 = 1;
        if(n==0){
            System.out.println(t1);
        }else{
            System.out.println(t1);
            System.out.println(t2);
            for(int i=2;i<=n;i++){
                int temp = t1+t2;
                t1 = t2;
                t2 = temp;
                System.out.println(temp);
            }
        }
    }
}
