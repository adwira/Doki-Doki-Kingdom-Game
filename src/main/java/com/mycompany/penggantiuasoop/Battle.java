/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penggantiuasoop;

import java.util.Random;

public class Battle {

    private Hero hero;
    private Enemy enemy;
    private Random random;

    public Battle(Hero hero) {
        this.hero = hero;
        this.random = new Random();
        // Add enemies to the list here (e.g., using constructors)
        //enemies.add(new Goblin("Goblin", 50, 1, 10, 5, 5, 5, 5));
        //enemies.add(new Goblin("Goblin Grunt", 50, 1, 10, 5, 5, 5, 5));
    }
    
    public void attack(Enemy enemy) {
        int skillChoice = hero.chooseAttackSkill();
        switch (skillChoice) {
            case 1 -> hero.basicAttack(enemy); 

            case 2 -> hero.strikeAttack(enemy);

            case 3 -> hero.skillSpecial(enemy);

            case 4 -> hero.buff();
        }
    }
    
    public void attack(Hero hero) {
        int skillChoice = enemy.chooseAttackSkill();
        switch (skillChoice) {
            case 1 -> enemy.basicAttack(hero); 

            case 2 -> enemy.strikeAttack(hero);

            case 3 -> enemy.skillSpecial(hero);

            case 4 -> enemy.buff(hero);
        }
    }
    
    public void start(Enemy enemy) {
        this.enemy = enemy;
        while (true) {
            // Choose a random enemy from the list

            // Determine turn order (optional)
            boolean heroFirst = random.nextBoolean();
            String turnMessage = heroFirst ? "FIRST" : "LAST";
            System.out.println("Turn: " + turnMessage);

            // Battle loop for one enemy
            while (true) {
                if (heroFirst) {
                    // Hero's turn
                    System.out.println("Hero's Turn");
                    attack(enemy);

                } else {
                    // Enemy's turn
                    System.out.println("Enemy's Turn");                   
                    attack(hero);
                }

                printTurnSummary(hero, enemy);

                // Check for win/lose condition
                if (hero.getHp() <= 0) {
                    System.out.println("Hero is defeated!");
                    break;
                } 
                else if (enemy.getHp() <= 0) {
                    System.out.println(enemy.getName() + " is defeated!");
                    break;
                }

                heroFirst = !heroFirst;
            }
        }
    }

    private void printTurnSummary(Hero hero, Enemy enemy) {
        // Format the summary using String.format()
        String summary = String.format("%-30s %-30s\n", hero.getName(), enemy.getName());
        summary += String.format("HP : %-30s HP : %-30s\n", hero.getHp(), enemy.getHp());
        summary += String.format("Level : %-30s Level : %-30s\n", hero.getLevel(), enemy.getLevel());
        summary += String.format("PP : %-30s %-30s\n", hero.getPhysicalPower(), enemy.getPhysicalPower());
        summary += String.format("%-30s %-30s\n", hero.getPhysicalDefense(), enemy.getPhysicalDefense());
        summary += String.format("%-30s %-30s\n", hero.getMagicPower(), enemy.getMagicPower());
        summary += String.format("%-30s %-30s\n", hero.getMagicDefense(), enemy.getMagicDefense());
        
        // You can add more status information as needed
        // ... (e.g., mana, defense, attack power, etc.)
        System.out.println(summary);
    }
}
   





  // ... (Other methods from the original Battle class can be added here)

