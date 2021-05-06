package com.company;

public class Main {

    public static void main(String[] args) {
	    float minVal = Float.MIN_VALUE;
	    float maxVal = Float.MAX_VALUE;
        System.out.println(minVal);
        System.out.println(maxVal);

        double minDVal = Double.MIN_VALUE;
        double maxDVal = Double.MAX_VALUE;
        System.out.println(minDVal);
        System.out.println(maxDVal);

        int x = 10;
        float y = 5f;
        double z = 5d;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


//        Challenge Pound to Kilogram
        double pound = 200;
        double kilogram = pound * 0.45359237;
        System.out.println(kilogram);
    }
}
