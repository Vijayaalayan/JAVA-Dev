package com.company;

public class Bedroom_Challenge {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed_Challenge bed_challenge;
    private Lamp lamp;

    public Bedroom_Challenge(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed_Challenge bed_challenge, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed_challenge = bed_challenge;
        this.lamp = lamp;
    }

    public void makeBed(){
        System.out.print("Bedroom -> Making bed | ");
        bed_challenge.make();
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

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed_Challenge getBed() {
        return bed_challenge;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
