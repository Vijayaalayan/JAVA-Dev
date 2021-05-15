package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printList(){
        System.out.println("You have "+groceryList.size()+" items in your grocery list");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }

    public void modifyGroceryList(String item){
        int position = findItem(item);
        if(position>=0){
            modifyGroceryList(position,item);
        }
    }

    private void modifyGroceryList(int position, String item){
        groceryList.set(position,item);
    }
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
    public int findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position>=0){
            return position;
        }
        return -1;
    }
}
