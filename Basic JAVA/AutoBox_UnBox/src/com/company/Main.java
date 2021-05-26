package com.company;

import java.util.ArrayList;

class IntClass{
    private int i;
    public IntClass(int i){
        this.i=i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<10;i++){
            arrayList.add(i);
        }
        for(int i=0;i<10;i++){
            System.out.println(i+"-->"+ arrayList.get(i));
        }

        ArrayList<IntClass> intclass = new ArrayList<>();
        for(int i=0;i<10;i++){
            intclass.add(new IntClass(i));
        }
        for(int i=0;i<10;i++){
            System.out.println(intclass.get(i).getI());
        }

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for(int i=0;i<10;i++){
            integerArrayList.add(Integer.valueOf(i));
        }
        for(int i=0;i<10;i++){
            System.out.println(integerArrayList.get(i));
        }
    }
}
