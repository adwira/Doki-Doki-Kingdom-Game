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
    
    public int start(Enemy enemy) {
        this.enemy = enemy;
        System.out.println("Kamu Melawan " + enemy.getName());
        printTurnSummary(hero, enemy);
        while (true) {

            boolean heroFirst = random.nextBoolean();
            String turnMessage = heroFirst ? "FIRST" : "LAST";
            System.out.println("Turn: " + turnMessage);

            // Battle loop for one enemy
            while (true) {
                if (heroFirst) {
                    // Hero's turn
                    System.out.println("Giliran Kamu");
                    attack(enemy);

                } else {
                    // Enemy's turn
                    System.out.println("Giliran Musuh");                   
                    attack(hero);
                }
                System.out.println();
                printTurnSummary(hero, enemy);

                // Check for win/lose condition
                if(hero.isGiveUp()){
                    return 2;
                }
                if (hero.getHp() <= 0) {
                    System.out.println("Kamu Kalah!!!!");
                    return -1;
                } 
                else if (enemy.getHp() <= 0) {
                    hero.debuff();
                    hero.setGold(hero.getGold() + enemy.getGold());
                    System.out.println(enemy.getName() + " telah dikalahkan!");
                     System.out.println("Kamu mendapatkan " + enemy.getGold() + "Gold!");
                    return 1;
                }
                

                heroFirst = !heroFirst;
            }
        }
    }

    private void printTurnSummary(Hero hero, Enemy enemy) {
        // Format the summary using String.format()
        String summary = String.format("%-30s        %-30s\n", hero.getName(), enemy.getName());
        summary += String.format("HP    : %-30s HP    : %-30s\n", hero.getHp(), enemy.getHp());
        summary += String.format("Level : %-30s Level : %-30s\n", hero.getLevel(), enemy.getLevel());
        summary += String.format("PP    : %-30s PP    : %-30s\n", hero.getPhysicalPower(), enemy.getPhysicalPower());
        summary += String.format("PD    : %-30s PD    : %-30s\n", hero.getPhysicalDefense(), enemy.getPhysicalDefense());
        summary += String.format("MP    : %-30s MP    : %-30s\n", hero.getMagicPower(), enemy.getMagicPower());
        summary += String.format("MD    : %-30s MD    : %-30s\n", hero.getMagicDefense(), enemy.getMagicDefense());
        summary += String.format("Gold  : %-30s \n", hero.getGold());

        System.out.println(summary);
    }
}
   

