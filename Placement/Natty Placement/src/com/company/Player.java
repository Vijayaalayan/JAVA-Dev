package com.company;

public class Player {
    private String playerId;
    private String playerName;
    private char grade;
    private double currentRemun;
    private double revisedRemun;

    public Player(String playerId, String playerName, char grade, double currentRemun) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.grade = grade;
        this.currentRemun = currentRemun;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public double getCurrentRemun() {
        return currentRemun;
    }

    public void setCurrentRemun(double currentRemun) {
        this.currentRemun = currentRemun;
    }

    public double getRevisedRemun() {
        return revisedRemun;
    }

    public void setRevisedRemun(double revisedRemun) {
        this.revisedRemun = revisedRemun;
    }
}
