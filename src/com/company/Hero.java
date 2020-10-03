package com.company;

public abstract class Hero implements HavingSuperAbility{
    private int health;
    private int damage;
    private String superAbilityType;

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}


