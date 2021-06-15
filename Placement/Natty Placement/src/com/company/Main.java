package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of tourists");
        int number = sc.nextInt();
        sc.nextLine();
        TouristUtility touristUtility = new TouristUtility();
        for(int i=0;i<number;i++){
            String[] array = new String[3];
            array[0] = sc.nextLine();
            array[1] = sc.nextLine();
            array[2] = sc.nextLine();
            touristUtility.addValidTourists(array);
//            Tourist tourist = new Tourist()
        }
        for(int i=1;i<=number;i++){
            System.out.println(touristUtility.getTourists().get(i).getTouristId());
            System.out.println(touristUtility.getTourists().get(i).getTouristName());
            System.out.println(touristUtility.getTourists().get(i).getDestination());
            System.out.println(touristUtility.getTourists().get(i).getDaysOfTravel());
        }
    }
}
