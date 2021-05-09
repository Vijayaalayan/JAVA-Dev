package com.company;

public class Bank {
    private String  accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;
    public Bank(){
        this("5555",2.5,"defaultName","defaultEmail","defaultNumber");
        System.out.println("Empty constructor called");
    }
    public Bank(String accountNumber,double balance,String customerName,String customerEmail,String  phoneNumber){
        System.out.println("Parameterised Constructor");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getCustomerEmail(){
        return this.customerEmail;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void addBalance(int amount){
        this.balance+=amount;
        System.out.println("After deposition balance : "+this.balance);
    }
    public void removeBalance(int amount){
        if(!(this.balance-amount<0)){
            this.balance-=amount;
            System.out.println("After withdrawal balance : "+this.balance);
        }else{
            System.out.println("Withdrawal not possible");
        }
    }
}
