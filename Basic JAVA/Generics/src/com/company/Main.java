package com.company;

public class Main {

    public static void main(String[] args) {
        CricketPlayer rohit = new CricketPlayer("Rohit Sharma");
        FootballPlayer footballPlayer = new FootballPlayer("Sunil Chetri");
        BadmintonPlayer badmintonPlayer = new BadmintonPlayer("Kidambi Srikanth");

        Team<CricketPlayer> mumbai_indians = new Team<>("MI");
        mumbai_indians.addPlayer(rohit);

//        System.out.println(mumbai_indians.numPlayers());

        Team<FootballPlayer> chennai = new Team<>("CSK");
        chennai.addPlayer(footballPlayer);

//        System.out.println(chennai.numPlayers());

        Team<BadmintonPlayer> kolkata = new Team<>("KKR");
        kolkata.addPlayer(badmintonPlayer);

        Team<CricketPlayer> bangalore = new Team<>("RCB");
        CricketPlayer kohli = new CricketPlayer("Virat Kohli");
        bangalore.addPlayer(kohli);

        Team<CricketPlayer> delhi = new Team<>("DC");
        CricketPlayer shikhar = new CricketPlayer("Shikhar Dhawan");
        delhi.addPlayer(shikhar);

        mumbai_indians.matchResult(bangalore,212,180);
        mumbai_indians.matchResult(delhi,220,218);

        bangalore.matchResult(delhi,125,187);
//        bangalore.matchResult(kolkata,120,180);

        System.out.println(mumbai_indians.ranking());
        System.out.println(bangalore.ranking());
        System.out.println(delhi.ranking());

        System.out.println(mumbai_indians.compareTo(bangalore));
        System.out.println(bangalore.compareTo(delhi));

    }
}
