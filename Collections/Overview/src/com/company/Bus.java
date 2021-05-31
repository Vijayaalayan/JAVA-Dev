package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    private final String busName;
    private List<Seat> seats = new ArrayList<>();

    public Bus(String busName,int numRows,int seatsPerRow) {
        this.busName = busName;

        int lastRow = 'A' + (numRows-1);
        for (char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1;seatNum<=seatsPerRow;seatNum++){
                Seat seat = new Seat(row+String.format("%02d",seatNum));
                seats.add(seat);
            }
        }
    }

    public String getBusName() {
        return busName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requested = null;
        for(Seat seat : seats){
            if(seat.getSeatNumber().equals(seatNumber)){
                requested=seat;
                break;
            }
        }
        if(requested == null){
            System.out.println("There is no seat "+seatNumber);
            return false;
        }
        return requested.reserve();
    }

    public boolean cancelSeat(String seatNumber){
        Seat cancelRequest = null;
        for(Seat seat :seats){
            if(seat.getSeatNumber().equals(seatNumber)){
                cancelRequest = seat;
                break;
            }
        }
        if(cancelRequest == null){
            return false;
        }
        return cancelRequest.cancel();
    }

    public void getSeats(){
        for(Seat seat:seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat "+seatNumber+" reserved");
                return true;
            }else{
                return false;
            }
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("Seat "+seatNumber+" cancelled");
                return true;
            }else{
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

    }
}
