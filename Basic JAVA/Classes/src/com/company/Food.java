package com.company;

public class Food {
    private String name;

    public void setName(String name){
        if(name.equals("Noodles")){
            this.name = name;
        }else{
            this.name = "Unknown";
        }
    }

    public void getName(){
        System.out.println(this.name);
    }
}
