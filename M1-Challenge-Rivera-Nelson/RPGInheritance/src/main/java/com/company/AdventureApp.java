package com.company;

public class AdventureApp {

    public static void main(String[] args) {
        Farmer farmer = new Farmer("Jenkins", 75, 100, 75, 10, 1, false, false, false, false);
        Constable constable = new Constable("John", 60, 100, 60, 20, 5, false, false, "Texas");
        Warrior warrior = new Warrior("Jimmy", 75, 100, 100, 50, 10, 100, false, false);


        System.out.println(farmer);
        System.out.println(constable);
        System.out.println(warrior);
        warrior.attackAnotherCharacter(farmer);
        farmer.attackAnotherCharacter(warrior);
        constable.arrestAnotherPlayer(warrior);

    }

}
