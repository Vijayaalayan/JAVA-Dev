package com.company;

public class Main {

    public static void main(String[] args) {
	    Food food = new Food();

//	    When name declared as public
//	    food.name = "Maggi";
//        System.out.println(food.name);

//       When name declared as private
        food.setName("Noodles");
        food.getName();
    }
}
