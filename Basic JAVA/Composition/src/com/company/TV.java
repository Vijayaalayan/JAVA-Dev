package com.company;

public class TV {
    private String company;

    public TV(String company) {
        this.company = company;
    }

    public void turnOn(){
        System.out.println("Turning on");
    }

    public String getCompany() {
        return company;
    }
}
