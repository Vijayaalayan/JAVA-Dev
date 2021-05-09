package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Animal",1,2,3);
	    animal.chew();
	    animal.eat();
	    Dog dog = new Dog("Dog",1,2,3,4,5);
	    dog.chew();
	    dog.eat();
	    dog.walk();
	    dog.run();

    }
}
