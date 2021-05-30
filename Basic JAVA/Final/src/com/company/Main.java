package com.company;

public class Main {

    public static void main(String[] args) {
	    Password password = new Password(12345);
	    password.storePassword();
	    password.letMeIn(1213);
	    password.letMeIn(354234);
	    password.letMeIn(12345);
    }
}
