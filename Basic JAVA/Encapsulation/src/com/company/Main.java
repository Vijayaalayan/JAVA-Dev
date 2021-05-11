package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Vijay";
//        player.health = 20;
//        player.weapon = "Sword";
//        player.loseHealth(30);
//        System.out.println(player.getHealth());
//        player.health+=40;
//        System.out.println(player.getHealth());

//Coding Challenge - 38
        Printer printer = new Printer(50,true);
        System.out.println(printer.addToner(50));
        System.out.println(printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println(pagesPrinted+" "+printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println(pagesPrinted+" "+printer.getPagesPrinted());

    }
}
