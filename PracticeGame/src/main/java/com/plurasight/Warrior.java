package com.plurasight;

public class Warrior extends Character implements FightingStyle{

    public Warrior(String name, int hp, int attack) {
        super(name, hp, attack);
    }



    public void hpSpinAttack(Character target) {
        System.out.println(name + " unleashes HP SPINNING ATTACK!  " + target.name + " is wiped out instantly!");
        target.hp = 0;
    }


    @Override
    public void Fight() {
        System.out.println("Star-Stream Slash");
    }

    @Override
    public void Defend() {
        System.out.println("Raising Shields");
    }
}
