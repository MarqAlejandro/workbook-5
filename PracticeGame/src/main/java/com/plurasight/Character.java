package com.plurasight;

public class Character {
    protected String name;
    protected int hp;
    private int attack;

    public Character(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }


    public void attack(Character target) {
        System.out.println(name + " attacks " + target.name + " for " + attack + " dmg!");
        target.hp -= attack;
    }

    public void block() {
        System.out.println(name + " blocks and takes half damage next turn!");
    }

    public void heal() {
        int amount = 10;
        hp += amount;
        System.out.println(name + " heals for " + amount + " HP. Now at " + hp);
    }

    public void run() {
        System.out.println(name + " tries to run away... but this is a turn-based RPG, so... denied! ");
    }

   public void fireball(Character target) {
        int dmg = 12;
        System.out.println(name + " casts FIREBALL on " + target.name + " for " + dmg + " 🔥 damage!");
        target.hp -= dmg;
    }

    public boolean isAlive() {
        return hp > 0;
    }


}
