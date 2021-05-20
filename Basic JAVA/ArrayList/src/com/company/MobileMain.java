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
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
                default:
                    printActions();
                    System.out.println("Enter between 0 and 6");
            }
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println(name+" doesn't exist in the phonebook");
        }else{
            System.out.println("Name : "+existingContactRecord.getName()+" Number : "+existingContactRecord.getPhoneNumber());
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println(name+" doesn't exist in the phonebook");
        }else{
            if(mobilePhone.removeContact(existingContactRecord)){
                System.out.println("Deleted contact");
            }else{
                System.out.println("Error while deleting");
            }
        }
        
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println(name+" doesn't exist in the phonebook");
        }else{
            System.out.println("Enter new contact name : ");
            String newName = scanner.nextLine();
            System.out.println("Enter phone number : ");
            String newNumber = scanner.nextLine();
            Contact newContact = new Contact(newName,newNumber);
            if(mobilePhone.updateContact(existingContactRecord,newContact)){
                System.out.println("Successfully updated record");
            }else{
                System.out.println("Error while updating");
            }
        }

        
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name : ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number : ");
        String number = scanner.nextLine();
        Contact newContact = new Contact(name,number);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added : Name = "+name+" Number = "+number);
        }else{
            System.out.println("Cannot add, "+name+" already on file");
        }
    }

    static void startPhone(){
        System.out.println("Starting Phone ...");
    }

    static void printActions(){
        System.out.println("\nAvailable actions :\nPress");
        System.out.println("0 - to shutdown\n"+
                           "1 - to print contacts\n"+
                           "2 - to add a new contact\n"+
                           "3 - to update an existing contact\n"+
                           "4 - to remove a contact\n"+
                           "5 - query if a contact exists\n"+
                           "6 - to print the list of all available actions");
        System.out.println("Choose your action : ");
    }
}
