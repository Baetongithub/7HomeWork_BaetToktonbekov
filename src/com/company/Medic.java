package com.company;

public class Medic extends Hero {
    public Medic(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("MEDIC IS HEALING");
    }
}
