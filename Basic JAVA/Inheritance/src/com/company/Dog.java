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
}
