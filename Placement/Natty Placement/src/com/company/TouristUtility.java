package com.company;

import java.util.ArrayList;

public class TouristUtility {
    private ArrayList<Tourist> tourists = new ArrayList<>();

    public ArrayList<Tourist> getTourists() {
        return tourists;
    }

    public void setTourists(ArrayList<Tourist> tourists) {
        this.tourists = tourists;
    }

    public void addValidTourists(String records[]){
        String touristName = records[0];
        String destination = records[1];
        int daysOfTravel = Integer.parseInt(records[2]);
        while(true){
            int randomPIN = (int)(Math.random()*9000)+1000;
            String touristId = ""+records[0].substring(0,2).toUpperCase()+randomPIN;
            boolean flag = true;
//            System.out.println(tourists.isEmpty());
            if(tourists.isEmpty()){
                Tourist tourist = new Tourist(touristId,touristName,destination,daysOfTravel);
                tourists.add(tourist);
            }else{
                for(int i=0;i<tourists.size();i++){
                    if(tourists.get(i).getTouristId().contains(touristId)){
                        flag = false;
                    }
                }
                if(flag){
                    Tourist tourist = new Tourist(touristId,touristName,destination,daysOfTravel);
                    tourists.add(tourist);
                    break;
                }
            }


        }


    }
}
