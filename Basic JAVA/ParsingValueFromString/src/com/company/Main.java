package com.company;

public class Main {

    public static void main(String[] args) {
	    String strNumber = "2021";
	    int number = Integer.parseInt(strNumber);
        System.out.println(strNumber);
        System.out.println(number);
        number+=1;
        System.out.println(number);
        strNumber+=1.85;
        System.out.println(strNumber);
        double numberDouble = Double.parseDouble(strNumber);
        System.out.println(numberDouble);
    }
}
