package com.company;

public class Main {

    public static void main(String[] args) {
	    double firstDoubleVal = 20.00;
	    double secondDoubleVal = 80.00;
	    double result = (firstDoubleVal + secondDoubleVal) * 100.00;
        System.out.println(result);
	    double remainder = result % 40.00;
        System.out.println(remainder);
	    boolean value = remainder == 0 ? true : false;
        System.out.println(value);
        if(!value){
            System.out.println("Got some remainder");
        }
    }
}
