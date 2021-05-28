package com.company;

public class LeagueMain {

    public static void main(String[] args) {
        League<Team<CricketPlayer>> cricketLeague = new League<>("IPL");
        Team<CricketPlayer> mumbai_indians = new Team<>("MI");
        Team<CricketPlayer> bangalore = new Team<>("RCB");
        Team<CricketPlayer> delhi = new Team<>("DC");
        Team<BadmintonPlayer> punjab = new Team<>("KP");

        cricketLeague.add(mumbai_indians);
        cricketLeague.add(bangalore);
        cricketLeague.add(delhi);
//        cricketLeague.add(punjab);

        mumbai_indians.matchResult(bangalore,212,180);
        mumbai_indians.matchResult(delhi,220,218);
        bangalore.matchResult(delhi,125,187);

        cricketLeague.showLeagueTable();

//        RAW 
    }

}
