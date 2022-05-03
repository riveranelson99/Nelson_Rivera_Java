package com.company;

public class Warrior extends Player {

    private int shieldStrength = 100;

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, int shieldStrength, boolean running, boolean arrested) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.shieldStrength = shieldStrength;
    }
}
