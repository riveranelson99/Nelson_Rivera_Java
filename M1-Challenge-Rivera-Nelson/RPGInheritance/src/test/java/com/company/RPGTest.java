package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class RPGTest {
    Farmer farmer;
    Constable constable;
    Warrior warrior;

    @Before
    public void playerClasses() {
        farmer = new Farmer("Jenkins", 75, 100, 75, 10, 1, false, false, false, false);
        constable = new Constable("John", 60, 100, 60, 20, 5, false, false, "Texas");
        warrior = new Warrior("Jimmy", 75, 100, 100, 50, 10, 100, false, false);
    }

    @Test
    public void shouldCheckFarmer() {
        farmer.attackAnotherCharacter(warrior);
        farmer.attackAnotherCharacter(warrior);

        assertEquals("Jenkins", farmer.getName());
        assertEquals(98, warrior.getHealth());
        assertEquals(false, farmer.isArrested());
    }

    @Test
    public void shouldCheckConstable() {
        constable.arrestAnotherPlayer(farmer);
        constable.arrestAnotherPlayer(warrior);

        assertEquals("John", constable.getName());
        assertEquals(false, constable.isArrested());
        assertEquals(true, farmer.isArrested());
        assertEquals(true, warrior.isArrested());
    }

    @Test
    public void shouldCheckWarrior() {
        warrior.attackAnotherCharacter(farmer);
        warrior.attackAnotherCharacter(constable);
        warrior.attackAnotherCharacter(farmer);

        assertEquals("Jimmy", warrior.getName());
        assertEquals(80, farmer.getHealth());
        assertEquals(90, constable.getHealth());
        assertEquals(false, warrior.isArrested());
    }
}
