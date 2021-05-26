package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Customer customer = new Customer("Vijay",20.00);
	    Customer anotherCustomer = customer;
	    anotherCustomer.setBalance(30.00);
        System.out.println("Balance : "+customer.getBalance());

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        for(int i=0;i<arrayList.size();i++){
            System.out.println("Position : "+i+" --> "+arrayList.get(i));
        }
        arrayList.add(1,2);
        for(int i=0;i<arrayList.size();i++){
            System.out.println("Position : "+i+" --> "+arrayList.get(i));
        }
    }
}
