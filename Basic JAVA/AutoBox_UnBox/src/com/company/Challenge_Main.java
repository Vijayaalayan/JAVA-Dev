package com.company;

public class Challenge_Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Vijay National Bank");

        bank.addBranch("Erode");

        bank.addCustomer("Erode","Nithin",20.00);
        bank.addCustomer("Erode","Naveen",30.00);
        bank.addCustomer("Erode","Kili",40.00);

        bank.addCustomerTransaction("Erode","Nithin",10.00);
        bank.addCustomerTransaction("Erode","Naveen",10.00);
        bank.addCustomerTransaction("Erode","Kili",10.00);

        bank.listCustomers("Erode",true);
    }
}
