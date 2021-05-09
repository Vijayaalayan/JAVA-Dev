package com.company;

public class Dog extends Animal{
    private int tail;
    private int teeth;
    public Dog(String name, int body, int size, int weight,int tail,int teeth) {
        super(name, body, size, weight);
        this.tail = tail;
        this.teeth =teeth;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() is called");
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    private void dogSpeed(int speed){
        System.out.println("Dog.dogSpeed() called "+speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        dogSpeed(speed);
        super.move(speed);
    }
}
