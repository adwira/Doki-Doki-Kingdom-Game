/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penggantiuasoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Battle {

    private Hero hero;
    private List<Enemy> enemies; // List to store enemy instances
    private Random random;
    private Scanner scanner;

    public Battle(Hero hero) {
        this.hero = hero;
        this.enemies = new ArrayList<>();
        this.random = new Random();
        this.scanner = new Scanner(System.in);
        // Add enemies to the list here (e.g., using constructors)
        enemies.add(new Goblin("Goblin", 50, 1, 10, 5, 5, 5, 5));
        enemies.add(new Goblin("Goblin Grunt", 50, 1, 10, 5, 5, 5, 5));
    }

    public void start() {
        while (true) {
            // Choose a random enemy from the list
            Enemy enemy = enemies.get(random.nextInt(enemies.size()));

            // Determine turn order (optional)
            boolean heroFirst = random.nextBoolean();
            String turnMessage = heroFirst ? "FIRST" : "LAST";
            System.out.println("Turn: " + turnMessage);

            // Battle loop for one enemy
            while (true) {
                if (heroFirst) {
                    // Hero's turn
                    System.out.println("Hero's Turn");
                    hero.attack(enemy); // Call to choose attack skill
                    enemy.defend(); // Get enemy action first

                } else {
                    // Enemy's turn
                    System.out.println("Enemy's Turn");
                    
                    enemy.attack(hero);
                    // Get hero action after enemy attack
                    // No need to switch on hero action as it's already handled in Hero's attack method
                }

                printTurnSummary(hero, enemy);

                // Check for win/lose condition
                if (hero.getHp() <= 0) {
                    System.out.println("Hero is defeated!");
                    break;
                } else if (enemy.getHp() <= 0) {
                    System.out.println(enemy.getName() + " is defeated!");
                    enemies.remove(enemy); // Remove defeated enemy from list
                    break;
                }

                heroFirst = !heroFirst;
            }

            // Check for remaining enemies
            if (enemies.isEmpty()) {
                System.out.println("You have defeated all enemies! Congratulations!");
                break;
            }
        }
    }

    private void printTurnSummary(Hero hero, Enemy enemy) {
        // Format the summary using String.format()
        String summary = String.format("%-30s %-30s\n", hero.getName(), enemy.getName());
        summary += String.format("%-30s %-30s\n", hero.getHp(), enemy.getHp());
        summary += String.format("%-30s %-30s\n", hero.getLevel(), enemy.getLevel());

        // You can add more status information as needed
        // ... (e.g., mana, defense, attack power, etc.)
        System.out.println(summary);
    }
}
   





  // ... (Other methods from the original Battle class can be added here)

