package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("___________");
        for (Hero hero : allHeroes()) {
            hero.applySuperAbility("___");
            System.out.println(hero.getClass().getSimpleName() + " health: "
                    + hero.getHealth() + ", Damage: " + hero.getDamage() + ";\n");

        }
    }

    public static Hero[] allHeroes() {
        Medic medic = new Medic(270, 70);
        Magic magic = new Magic(260, 60);
        Warrior warrior = new Warrior(250, 50);
        return new Hero[]{magic, medic, warrior};
    }
}
