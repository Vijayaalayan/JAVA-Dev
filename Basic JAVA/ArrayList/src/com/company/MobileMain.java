package com.company;

import java.util.Scanner;

public class MobileMain {
    static Scanner scanner = new Scanner(System.in);
    static MobilePhone mobilePhone = new MobilePhone("6382576401");
    public static void main(String[] args) {
        boolean flag = true;
        startPhone();
        printActions();
        while(flag){
            System.out.println("\n Enter action : (6 to show availabe actions)");
            int action = scanner.nextInt();
            switch (action){
                case 0:
                    flag = false;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    
            }
        }
    }

    private static void printContacts() {

    }

    static void startPhone(){
        System.out.println("Starting Phone ...");
    }

    static void printActions(){
        System.out.println("\nAvailable actions :\nPress");
        System.out.println("0 - to shutdown\n"+
                           "1 - to print contacts\n"+
                           "2 - to add a new contact\n"+
                           "3 - to update an existaing contact\n"+
                           "4 - to remove a contact\n"+
                           "5 - query if a contacct exists\n"+
                           "6 - to print the list of all available actions");
        System.out.println("Choose your action : ");
    }
}
