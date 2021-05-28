package com.company;

public class Main {

    public static void main(String[] args) {
        CricketPlayer cricketPlayer = new CricketPlayer("Mahendra Singh Dhoni");
        FootballPlayer footballPlayer = new FootballPlayer("Sunil Chetri");
        BadmintonPlayer badmintonPlayer = new BadmintonPlayer("Kidambi Srikanth");

        Team mumbai_indians = new Team("Mumbai Indians");
        mumbai_indians.addPlayer(cricketPlayer);
        mumbai_indians.addPlayer(footballPlayer);
        mumbai_indians.addPlayer(badmintonPlayer);

        System.out.println(mumbai_indians.numPlayers());
    }
}
