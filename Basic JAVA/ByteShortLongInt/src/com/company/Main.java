package com.company;

public class Main {

    public static void main(String[] args) {
	    int minInt = Integer.MIN_VALUE;
	    int maxInt = Integer.MAX_VALUE;
	    System.out.println(minInt);
        System.out.println(maxInt);

//        overflow and underflow
        System.out.println(minInt-1);
        System.out.println(maxInt+1);

        int number = 2_12_21_21;
        System.out.println(number);

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(minByte);
        System.out.println(maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println(minShort);
        System.out.println(maxShort);

        long myLong = 10046346334L;
        System.out.println(myLong);
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println(minLong);
        System.out.println(maxLong);
        

    }
}
