package com.company;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("Vijay");
//        linkedList.add("Nithin");
//        linkedList.add("Naveen");
//
//        printList(linkedList);
//
//        linkedList.add(0,"Kili");
//        printList(linkedList);
//
//        linkedList.remove("Kili");
//        printList(linkedList);
        addInorder(linkedList,"Vijay");
        addInorder(linkedList,"Naveen");
        addInorder(linkedList,"Nithin");
        addInorder(linkedList,"Kili");

        printList(linkedList);

        visit(linkedList);
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> it = linkedList.iterator();
        while(it.hasNext()){
            System.out.println("Now in "+it.next());
        }
        System.out.println("=======================");
    }
    
    private static boolean addInorder(LinkedList<String> linkedList,String newMember){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newMember);
            if(comparison == 0){
                System.out.println(newMember+" already exists");
                return false;
            }else if(comparison>0){
                stringListIterator.previous();
                stringListIterator.add(newMember);
                return true;
            }else if(comparison<0) {

            }
        }
        stringListIterator.add(newMember);
        return true;
    }

    private static void visit(LinkedList<String> members){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        boolean forward = true;
        ListIterator<String> listIterator = members.listIterator();
        if(members.isEmpty()){
            System.out.println("No members is list");
            return;
        }else{
            System.out.println("Now visiting --> "+listIterator.next());
            printMenu();
        }
        while(flag){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Exiting the list");
                    flag = false;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting --> "+listIterator.next());
                    }else{
                        System.out.println("Reached end of list");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting --> "+listIterator.previous());
                    }else{
                        System.out.println("Reached end of list");
                        forward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
                default:
                    System.out.println("Please select from available actions");
                    printMenu();
            }
        }

    }

    private static void printMenu(){
        System.out.println("Available actions\nPress " +
                "0 - to quit\n" +
                "1 - to go next\n" +
                "2 - to go previous\n" +
                "3 - to print menu");
    }

}
