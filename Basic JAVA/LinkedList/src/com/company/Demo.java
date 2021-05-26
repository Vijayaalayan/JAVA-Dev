package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Vijay");
        linkedList.add("Nithin");
        linkedList.add("Naveen");

        printList(linkedList);

        linkedList.add(0,"Kili");
        printList(linkedList);

        linkedList.remove("Kili");
        printList(linkedList);
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> it = linkedList.iterator();
        while(it.hasNext()){
            System.out.println("Now in "+it.next());
        }
        System.out.println("=======================");
    }
}
