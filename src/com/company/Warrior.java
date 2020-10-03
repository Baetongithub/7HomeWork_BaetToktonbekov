package com.company;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("WARRIOR WENT TO ATTACK");
    }
}
