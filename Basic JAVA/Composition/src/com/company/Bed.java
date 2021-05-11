package com.company;

public class Bed {
    private int size;
    private int pillows;

    public Bed(int size, int pillows) {
        this.size = size;
        this.pillows = pillows;
    }

    public void make(){
        System.out.println("Bed -> Making");
    }

    public int getSize() {
        return size;
    }

    public int getPillows() {
        return pillows;
    }
}
