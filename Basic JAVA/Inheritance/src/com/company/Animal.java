package com.company;

public class Animal {
    private String name;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int body, int size, int weight) {
        this.name = name;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal.eat() is called");
    }

    public void chew(){
        System.out.println("Animal.chew() is called");
    }

    public void move(int speed){
        System.out.println("Animal.move() called "+speed);
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
