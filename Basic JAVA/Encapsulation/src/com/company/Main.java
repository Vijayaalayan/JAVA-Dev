package com.company;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Vijay";
        player.health = 20;
        player.weapon = "Sword";
        player.loseHealth(30);
        System.out.println(player.getHealth());
        player.health+=40;
        System.out.println(player.getHealth());
    }
}
