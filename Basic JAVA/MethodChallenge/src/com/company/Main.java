package com.company;

public class Main {

    public static void displayHighScorePosition(String PName, int position){
        System.out.println(PName+" managed to get into position "+position+" on the high score table");
    }

    public static int calculateHighScorePosition(int score){
//        if(score >= 1000){
//            return 1;
//        }else if(score >=500){
//            return 2;
//        }else if(score >= 100){
//            return 3;
//        }
//        return 4;

        int position = 4;
        if(score>=1000){
            position = 1;
        }else if(score>=500){
            position = 2;
        }else if(score>=100){
            position = 3;
        }
        return position;
    }

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Vijay",highScorePosition);
        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Nithin",highScorePosition);
        highScorePosition = calculateHighScorePosition(200);
        displayHighScorePosition("Naveen",highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Hari",highScorePosition);
    }
}
