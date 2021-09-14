package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Customers{
    private int customerId;
    private String userName;
    private String password;
    private String role;
    private ArrayList<Orders> ordersArrayList = new ArrayList<>();

    public Customers(int customerId, String userName, String password, String role) {
        this.customerId = customerId;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ArrayList<Orders> getOrdersArrayList() {
        return ordersArrayList;
    }

    public void setOrdersArrayList(Orders orders) {
        ordersArrayList.add(orders);
    }

    class Orders{
        private ArrayList<ArrayList<String>> products;
        private ArrayList<ArrayList<Integer>> quantity;
        private ArrayList<Integer> totalCost;

        public Orders(ArrayList<ArrayList<String>> products, ArrayList<ArrayList<Integer>> quantity, ArrayList<Integer> totalCost) {
            this.products = products;
            this.quantity = quantity;
            this.totalCost = totalCost;
        }

        public ArrayList<ArrayList<String>> getProducts() {
            return products;
        }

        public void setProducts(ArrayList<ArrayList<String>> products) {
            this.products = products;
        }

        public ArrayList<ArrayList<Integer>> getQuantity() {
            return quantity;
        }

        public void setQuantity(ArrayList<ArrayList<Integer>> quantity) {
            this.quantity = quantity;
        }

        public ArrayList<Integer> getTotalCost() {
            return totalCost;
        }

        public void setTotalCost(ArrayList<Integer> totalCost) {
            this.totalCost = totalCost;
        }
    }
}

class Products{
    private int itemId;
    private String itemName;
    private String category;
    private int pricePerUnit;
    private int available;

    public Products(int itemId, String itemName, String category, int pricePerUnit, int available) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.category = category;
        this.pricePerUnit = pricePerUnit;
        this.available = available;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(int pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }
}

public class Main {

    static ArrayList<Customers> customersArrayList = new ArrayList<>();
    static ArrayList<Products> productsArrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        customersArrayList.add(new Customers(100,"admin","admin123","admin"));
        customersArrayList.add(new Customers(101,"kaushik","kaushik123","customer"));
        customersArrayList.add(new Customers(102,"vignesh","vignesh123","customer"));

        productsArrayList.add(new Products(100,"Good day","Biscuit",90,10));
        productsArrayList.add(new Products(101,"Pantene","Conditioner",110,10));
        productsArrayList.add(new Products(102,"Lux","Soap",25,10));
        productsArrayList.add(new Products(103,"Dove","Soap",45,10));


        String username = scanner.nextLine();
        String password = scanner.nextLine();
        boolean login = loginCheck(username,password);
        if(login){
            if(username.equals("admin")){
                displayAdminMenu();
                int choice = scanner.nextInt();
                switch (choice){
                    case 0:
                        System.out.println("Logging out");
                        break;
                    case 1:
                        updateProduct();
                        break;
                    case 3:
                        addCustomer();
                        break;

                }
            }else{
                displayCustomerMenu();
                int choice = scanner.nextInt();
                switch (choice){
                    case 0:
                        System.out.println("Logging out");
                        break;
                    case 1:
                        orderPlace(username);
                        break;
                    case 2:
                        orderHistory(username);
                        break;
                }


            }
        }
    }

    public static boolean loginCheck(String username,String password){
        for(int i=0;i<customersArrayList.size();i++){
            if(customersArrayList.get(i).getUserName().equals(username) && customersArrayList.get(i).getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public static void displayAdminMenu(){
        System.out.println("Press 1 to update item");
        System.out.println("Press 2 to list the top selling items");
        System.out.println("Press 3 to add a new customer");
        System.out.println("Press 0 to logout");
    }

    public static void displayCustomerMenu(){
        System.out.println("Press 1 to place an order");
        System.out.println("Press 2 to view the order history");
        System.out.println("Press 0 to logout");
    }

    public static void addCustomer(){
        System.out.println("Enter username : ");
        String newUsername = scanner.nextLine();
        boolean match = false;
        String newPassword,reEnter;

        do{
            System.out.println("Enter password");
            newPassword = scanner.nextLine();
            System.out.println("Re-enter password");
            reEnter = scanner.nextLine();
            if(newPassword.equals(reEnter)){
                match = true;
            }else{
                System.out.println("Password mismatch retype the password");
            }
        }while (!match);
        int customerId = customersArrayList.get(customersArrayList.size()-1).getCustomerId();
        customerId+=1;
        customersArrayList.add(new Customers(customerId,newUsername,newPassword,"customer"));
    }

    public static void updateProduct(){
        System.out.println("Enter the product for which it needs updation");
        scanner.nextLine();
        String product = scanner.nextLine();
        for(int i=0;i<productsArrayList.size();i++){
            if(productsArrayList.get(i).getItemName().equals(product)){
                System.out.println("Enter the quantity ");
                int quantity = scanner.nextInt();
                System.out.println("Enter the price per unit ");
                int price = scanner.nextInt();
                productsArrayList.get(i).setAvailable(quantity);
                productsArrayList.get(i).setPricePerUnit(price);
            }
        }
    }

    public static void orderPlace(String username){
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        int totalCost = 0;
        while (true){
            System.out.println("Enter 1 to continue with selection of orders");
            System.out.println("Enter 2 to place your order");
            int choices = scanner.nextInt();
            if(choices == 2){
                break;
            }else{
                System.out.println("Enter product name");
                scanner.nextLine();
                String product = scanner.nextLine();
                System.out.println("Enter quantity");
                int quantity = scanner.nextInt();
                for(int i=0;i<productsArrayList.size();i++){
                    if(productsArrayList.get(i).getItemName().equals(product) ){
                        if(productsArrayList.get(i).getAvailable()>=quantity){
                            products.add(product);
                            quantities.add(quantity);
                            totalCost+=productsArrayList.get(i).getPricePerUnit() * quantity;
                            productsArrayList.get(i).setAvailable(productsArrayList.get(i).getAvailable() - quantity);
                        }else {
                            System.out.println("Available quantity is less");
                        }
                    }
                }
            }
        }
        System.out.println("Total cost is "+totalCost);
        System.out.println("Press 1 to confirm your order ");
        int confirm = scanner.nextInt();
        if(confirm == 1){
            for(int i=0;i<customersArrayList.size();i++){
                if(customersArrayList.get(i).getUserName().equals(username)){
                    ArrayList<ArrayList<String>> prodcutsGroup = new ArrayList<>();
                    prodcutsGroup.add(products);
                    ArrayList<ArrayList<Integer>> quantitesGroup = new ArrayList<>();
                    quantitesGroup.add(quantities);
                    ArrayList<Integer> totalCostGroup = new ArrayList<>();
                    totalCostGroup.add(totalCost);
                    Customers.Orders orders = customersArrayList.get(i).new Orders(prodcutsGroup,quantitesGroup,totalCostGroup);
                    customersArrayList.get(i).setOrdersArrayList(orders);
                }
            }
            System.out.println("Thank you for placing an order ");
        }
    }

    public static void orderHistory(String username){
        for(int i=0;i<customersArrayList.size();i++){
            if(customersArrayList.get(i).getUserName().equals(username)){
                System.out.println("Orders");
                for(int j=0;j<customersArrayList.get(i).getOrdersArrayList().size();j++){
                    System.out.println(j+1);
                    ArrayList<Customers.Orders> orderHistory = customersArrayList.get(i).getOrdersArrayList();
                    for(int k=0;k<orderHistory.size();k++){
                        System.out.println("Products and their quantities");
                        System.out.println(orderHistory.get(k).getProducts());
                        System.out.println(orderHistory.get(k).getQuantity());
                        System.out.println(orderHistory.get(k).getTotalCost());
                    }
                }
            }
        }
    }
}
