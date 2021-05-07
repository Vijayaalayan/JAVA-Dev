package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    char var = 'E';
	    switch (var){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            default:
                System.out.println("A,B,C,D not found");
        }

        String month = "June";
	    switch (month.toLowerCase()){
            case "january":
                System.out.println("1st month");
                break;
            case "june":
                System.out.println("6th month");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
