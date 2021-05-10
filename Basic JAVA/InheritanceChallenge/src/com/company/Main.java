package com.company;

public class Main {

    public static void main(String[] args) {
        Swift swift = new Swift(36);
        swift.accelarate(4);
        swift.accelarate(-5);
        swift.accelarate(30);
        swift.stop();
        swift.steer(24);
    }
}
