package com.company;

public class Main {

    public static void main(String[] args) {
	    Dimensions dimensions = new Dimensions(2,3,4);
	    Case myCase = new Case("220B","MSI","240",dimensions);
	    Monitor monitor = new Monitor("MSI2020Liquid","MSI",32,new Resolution(3,4));
	    Motherboard motherboard = new Motherboard("MSI-2021","MSI",2021,4,4);
	    PC pc = new PC(myCase,monitor,motherboard);
	    pc.getMyCase().pressPowerButton();
	    pc.getMonitor().drawPixelAt(1,2,"red");
	    pc.getMotherboard().loadProgram("C++");
    }
}
