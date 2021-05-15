package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	    boolean flag = true;
	    int choice = 0;
	    printInstructions();
	    while(flag){
            System.out.println("Enter your choice : ");
            choice =scanner.nextInt();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Enter a number between 1 and 6");
            }
        }
    }

    private static void searchForItem() {
        System.out.println("Enter the element to be searched");
        scanner.nextLine();
        String item = scanner.nextLine();
        int result = groceryList.findItem(item);
        if(result>=0){
            System.out.println("Item found at :"+result);
        }else{
            System.out.println("Item not found");
        }
    }

    private static void removeItem() {
        System.out.println("Enter the position to be removed");
        scanner.nextLine();
        int position = scanner.nextInt();
        groceryList.removeGroceryItem(position);
    }

    private static void modifyItem() {
        System.out.println("Enter the position to be modified");
        int position = scanner.nextInt();
        System.out.println("Enter the item to be changed");
        scanner.nextLine();
        String item = scanner.nextLine();
        groceryList.modifyGroceryList(position,item);
    }

    private static void addItem() {
        System.out.println("Enter the item to be added");
        scanner.nextLine();
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\n0 - To print choice options");
        System.out.println("\n1 - To print the grocery items");
        System.out.println("\n2 - To add items to grocery");
        System.out.println("\n3 - To modify items in the list");
        System.out.println("\n4 - To remove item from the list");
        System.out.println("\n5 - to search for an item");
        System.out.println("\n6 - To exit the application");
    }



}
