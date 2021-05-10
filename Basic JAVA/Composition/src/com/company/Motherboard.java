package com.company;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int yearOfManufacture;
    private int cardSlots;
    private int ramSlots;

    public Motherboard(String model, String manufacturer, int yearOfManufacture, int cardSlots, int ramSlots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.cardSlots = cardSlots;
        this.ramSlots = ramSlots;
    }

    public void loadProgram(String programName){
        System.out.println("Program "+programName+" loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public int getRamSlots() {
        return ramSlots;
    }
}
