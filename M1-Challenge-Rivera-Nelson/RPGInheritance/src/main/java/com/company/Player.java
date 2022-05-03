package com.company;

import java.util.Objects;

public class Player {

    public String name;
    public int strength;
    public int health;
    public int stamina;
    public int speed;
    public int attackPower;
    public boolean running;
    public boolean arrested;

    public Player(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.running = running;
        this.arrested = arrested;
    }

    public void attackAnotherCharacter(Player opponent) {
        System.out.println(this.name + " attacks " + opponent.getName() + " for " + this.attackPower + " damage!");
        opponent.setHealth(opponent.getHealth() - this.attackPower);
        System.out.println(opponent.getName() + "'s health is now at " + opponent.getHealth() + "!");
    }


    // Getters
    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public boolean isRunning() {
        return running;
    }

    public boolean isArrested() {
        return arrested;
    }


    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setArrested(boolean arrested) {
        this.arrested = arrested;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return strength == player.strength && health == player.health && stamina == player.stamina && speed == player.speed && attackPower == player.attackPower && running == player.running && arrested == player.arrested && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, health, stamina, speed, attackPower, running, arrested);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", running=" + running +
                ", arrested=" + arrested +
                '}';
    }
}
