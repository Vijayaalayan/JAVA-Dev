package com.company;

public class Password {
    private static final int key = 1234567;
    private final int encrytptedPassword;

    public Password(int password) {
        this.encrytptedPassword = encrytpt(password);
    }

    private int encrytpt(int password){
        return password*key;
    }

    public void storePassword(){
        System.out.println("Saving password as "+this.encrytptedPassword);
    }

    public boolean letMeIn(int password){
        if(encrytpt(password) == this.encrytptedPassword){
            System.out.println("Welcome");
            return true;
        }else{
            System.out.println("Invalid credentials");
            return false;
        }
    }
}
