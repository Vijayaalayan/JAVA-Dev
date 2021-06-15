package com.company;

public class Tourist {
    private String touristId;
    private String touristName;
    private String destination;
    private int daysOfTravel;
    private double travelCost;

    public Tourist(String touristId, String touristName, String destination, int daysOfTravel) {
        this.touristId = touristId;
        this.touristName = touristName;
        this.destination = destination;
        this.daysOfTravel = daysOfTravel;
    }

    public String getTouristId() {
        return touristId;
    }

    public void setTouristId(String touristId) {
        this.touristId = touristId;
    }

    public String getTouristName() {
        return touristName;
    }

    public void setTouristName(String touristName) {
        this.touristName = touristName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDaysOfTravel() {
        return daysOfTravel;
    }

    public void setDaysOfTravel(int daysOfTravel) {
        this.daysOfTravel = daysOfTravel;
    }

    public double getTravelCost() {
        return travelCost;
    }

    public void setTravelCost(double travelCost) {
        this.travelCost = travelCost;
    }
}
