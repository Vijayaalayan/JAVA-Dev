package com.company;

public class Main {

    public static void main(String[] args) {
//        Swift swift = new Swift(36);
//        swift.accelarate(4);
//        swift.accelarate(-5);
//        swift.accelarate(30);
//        swift.stop();
//        swift.steer(24);

//        Coding Challenge - 35
        Circle circle = new Circle(3.75);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        Cylinder cylinder = new Cylinder(5.55,7.25);
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}
