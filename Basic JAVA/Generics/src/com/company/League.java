package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team){
        if(league.contains(team)){
            System.out.println("Already team exist");
            return false;
        }
        league.add(team);
        System.out.println(team.getName()+" added to the league");
        return true;
    }

    public void showLeagueTable(){
        Collections.sort(league,Collections.reverseOrder());
        for (T t: league){
            System.out.println(t.getName()+" : "+t.ranking());
        }
    }
}
