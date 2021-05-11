package com.company;

public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.hitPoints = health;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <=0){
            System.out.println("Player Knocked Out");
            this.hitPoints = 0;
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
