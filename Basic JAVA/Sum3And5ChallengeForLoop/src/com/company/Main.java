package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int j=0;
        for(int i=1;i<=1000;i++){
            if(i%3 == 0 && i%5==0){
                System.out.println(i);
                sum+=i;
                j++;
            }
            if(j == 5){
                break;
            }
        }
        System.out.println(sum);
    }
}
