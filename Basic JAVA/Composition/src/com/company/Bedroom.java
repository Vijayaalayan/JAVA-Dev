package com.company;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Bed bed;
    private TV tv;

    public Bedroom(String name, Wall wall1, Wall wall2, Bed bed, TV tv) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.bed = bed;
        this.tv = tv;
    }

    public void makeBed(){
        System.out.println("Making Bed");
        bed.make();
    }

    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Bed getBed() {
        return bed;
    }

    public TV getTv() {
        return tv;
    }
}
