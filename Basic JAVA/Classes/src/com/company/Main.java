package com.company;

public class Main {

    public static void main(String[] args) {
//	    Food food = new Food();

//	    When name declared as public
//	    food.name = "Maggi";
//        System.out.println(food.name);

//       When name declared as private
//        food.setName("Noodles");
//        food.getName();

//       Coding Exercise - 29
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println(calculator.getAdditionResult());
//        System.out.println(calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println(calculator.getMultiplicationResult());
//        System.out.println(calculator.getDivisionResult());

//        Constructors
        Bank vijayBank = new Bank("1234",0000,"Vijay","vijayaalayan1234@gmail.com","9876543210");
        System.out.println(vijayBank.getAccountNumber());
        System.out.println(vijayBank.getCustomerName());
        System.out.println(vijayBank.getPhoneNumber());
        vijayBank.addBalance(100);
        vijayBank.removeBalance(50);
        vijayBank.removeBalance(51);
        Bank xBank = new Bank();
    }
}
