package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Aarthi {
    HashMap<String, ArrayList<String>> fatherSonMap = new HashMap<>();

    public void constructFatherSonMap(String[][] famArray) {
        for(int i = 0; i < famArray.length; i++) {
            String father = famArray[i][1];
            if(fatherSonMap.containsKey(father)) {
                ArrayList<String> sonLst = fatherSonMap.get(father);
                sonLst.add(famArray[i][0]);

            } else {
                ArrayList<String> sonList = new ArrayList<String>();
                sonList.add(famArray[i][0]);
                fatherSonMap.put(father, sonList);
            }
        }
    }

    public int getChildren(String fatherName){
        ArrayList<String> children = fatherSonMap.get(fatherName);
        if (fatherSonMap.isEmpty()) {
            return 0;
        }
        return children.size();
    }

    public int getGrandChildren( String gFatherName) {
        ArrayList<String> gChildren = new ArrayList<>();
        if (fatherSonMap.isEmpty()) {
            return 0;
        }

        ArrayList<String> children = fatherSonMap.get(gFatherName);
        for(String child : children) {
            gChildren.addAll(fatherSonMap.get(child));
        }
        return gChildren.size();
    }

    public static void main(String[] args) {

        String[][] familyArray = {
                {"Surya", "Sivakumar"},
                {"Karthi", "Sivakumar"},
                {"Sivakumar", "Rakkaiya"},
                {"Dev", "Surya"},
                {"Umayaal", "Karthi"},
                {"Diya", "Surya"},
                {"Prabu", "Sivaji"},
                {"Vikram", "Prabu"}
        };

        Aarthi aarthi = new Aarthi();
        aarthi.constructFatherSonMap(familyArray);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int number = scanner.nextInt();
        if(number == 1){
            System.out.println(aarthi.getChildren(name));
        }else{
            System.out.println(aarthi.getGrandChildren(name));
        }


    }
}
