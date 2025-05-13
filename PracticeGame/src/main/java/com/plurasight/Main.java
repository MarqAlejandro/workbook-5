package com.plurasight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello, World!");

        Scanner input = new Scanner(System.in);

        Warrior player = new Warrior("Code-Blooded Warrior", 40, 8);
        Enemy monster = new Enemy("Error Bug", 30, 6);

        System.out.println(" Welcome to the Code Dungeon!");
        System.out.println("A wild " + monster.name + " appears!\n");

        while (player.isAlive() && monster.isAlive()) {
            System.out.println("\nYour HP: " + player.hp + " | Enemy HP: " + monster.hp);
            System.out.println("Choose an action:");
            System.out.println("1. Attack");
            System.out.println("2. Fireball");
            System.out.println("3. Heal");
            System.out.println("4. HP Spin Attack");
            System.out.println("5. Run");

            try {
                int choice = input.nextInt();

                switch(choice){
                    case 1:
                        player.attack(monster);
                        break;
                    case 2:
                        player.fireball(monster);
                        break;
                    case 3:
                        player.heal();
                        break;
                    case 4:
                        player.hpSpinAttack(monster);
                        break;
                    case 5:
                        player.run();
                        break;
                    default:
                        System.out.println("Player has hesitated, turn has been skipped.");
                }
            }
            catch (InputMismatchException e){
                System.out.println("input was non-numeric. Please try again");

            }

            int enemyChoice = (int) (Math.random() * 5);

            switch (enemyChoice){
                case 1:
                    monster.attack(player);
                    break;
                case 2:
                    monster.fireball(player);
                    break;
                case 3:
                    monster.heal();
                    break;
                case 4:
                    monster.block();
                    break;
                case 5:
                    monster.run();
                    break;
                default:
                    System.out.println("Player has hesitated, turn has been skipped.");

            }


        }
    }
}