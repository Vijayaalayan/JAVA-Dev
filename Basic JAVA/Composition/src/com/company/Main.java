package com.company;

public class Main {

    public static void main(String[] args) {
//	    Dimensions dimensions = new Dimensions(2,3,4);
//	    Case myCase = new Case("220B","MSI","240",dimensions);
//	    Monitor monitor = new Monitor("MSI2020Liquid","MSI",32,new Resolution(3,4));
//	    Motherboard motherboard = new Motherboard("MSI-2021","MSI",2021,4,4);
//	    PC pc = new PC(myCase,monitor,motherboard);
//	    Direct when it was public
//	    pc.getMyCase().pressPowerButton();
//	    pc.getMonitor().drawPixelAt(1,2,"red");
//	    pc.getMotherboard().loadProgram("C++");

//		Indirect when it is private
//		pc.powerUp();

//		Composition Challenge Exercise
		Wall wall1 = new Wall("Norhth");
		Wall wall2 = new Wall("South");
		Bed bed = new Bed(20,2);
		TV tv = new TV("SAMSUNG");
		Bedroom bedroom = new Bedroom("Master",wall1,wall2,bed,tv);
		bedroom.makeBed();
		bedroom.getTv().turnOn();

    }
}
