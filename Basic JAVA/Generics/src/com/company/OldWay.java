package com.company;

import java.util.ArrayList;

public class OldWay {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        printDoubled(arrayList);
    }
    private static void printDoubled(ArrayList arrayList){
        for(Object i : arrayList){
            System.out.println((Integer) i*2);
        }
    }
}
