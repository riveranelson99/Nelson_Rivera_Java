package com.company;

public class Constable extends Player {

    private String jurisdiction;

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, String jurisdiction) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.jurisdiction = jurisdiction;
    }

    public void arrestAnotherPlayer(Player opponent) {
        System.out.println(this.name + " arrests " + opponent.getName() + " and sends them straight to jail!");
        opponent.setArrested(true);
        System.out.println(opponent.getName() + " begins to cry!");
    }
}
