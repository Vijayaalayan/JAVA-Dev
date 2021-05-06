package com.company;

public class Main {

    public static void main(String[] args) {
	    String myStr = "This is a string";
        System.out.println(myStr);
	    myStr+=", this second";
        System.out.println(myStr);
        myStr+=" \u00A9 2021";
        System.out.println(myStr);

        int number = 10;
        String IntNumber = "10";
        IntNumber+=number;
        System.out.println(IntNumber);

//        Strings are immutable they can't be changed. It replaces the previous string with the newly updated string

    }
}
