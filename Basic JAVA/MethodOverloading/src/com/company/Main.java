package com.company;

public class Main {

    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if(feet<0 || (inches<0 && inches>12)){
            System.out.println("Invalid");
            return -1;
        }
        double centimeter = (feet * 12) * 2.54;
        centimeter+=inches * 2.54;
        System.out.println(feet+" feet + "+inches+" inches = "+centimeter);
        return centimeter;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double feet = Math.round(inches * 0.0833);
        double fInch = (inches*0.0833 - feet) * 10;
        double centimeter = calcFeetAndInchesToCentimeters(feet,fInch);
        System.out.println(centimeter);
        return centimeter;
    }

    public static void main(String[] args) {
	    double n = calcFeetAndInchesToCentimeters(5,5);
        if(n<0.0){
            System.out.println("Invalid");
        }else{
            System.out.println(n);
        }
        double fconvert = calcFeetAndInchesToCentimeters(66);
    }
}
