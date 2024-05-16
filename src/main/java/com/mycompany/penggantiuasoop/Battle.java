/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penggantiuasoop;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Battle {

    private Hero hero;
    private List<Enemy> enemies; // List to store enemy instances
    private Random random;

    public Battle(Hero hero) {
        this.hero = hero;
        this.enemies = new ArrayList<>();
        this.random = new Random();
        // Add enemies to the list here (e.g., using constructors)
    }

    public void start() {
        // Choose a random enemy from the list
        Enemy enemy = enemies.get(random.nextInt(enemies.size()));

        // Determine turn order (optional)
        boolean heroTurn = random.nextBoolean();
        String turnMessage = heroTurn ? "FIRST" : "LAST";
        System.out.println("Turn: " + turnMessage);

        while (true) {
            if (heroTurn) {
                // Hero's turn
                System.out.println("Hero's Action:");
                String actionChoice = hero.chooseAttackSkill();

                if (actionChoice.equals("Attack")) {
                    hero.attack();
                } else if (actionChoice.equals("strike")) {
                    hero.strikeAttack();
                } else if (actionChoice.equals("useSkill")) {
                    hero.useSkill();
                } else if (actionChoice.equals("magicAttack")) {
                    hero.magicAttack();
                }
                    else {
                        System.out.println("Invalid action!");
                }

            } else {
                // Enemy's turn
                // Modified Logic: Enemy always chooses Defend if Hero attacks first
                System.out.println("Hero's Action:");
                String actionChoice = hero.chooseDefenseSkill();
                if (actionChoice.equals("basicDefend")) {
                    hero.basicDefend();
                } else if (actionChoice.equals("counter")) {
                    hero.counter();
                } else if (actionChoice.equals("magicDefend")) {
                    hero.magicDefend();
                }
                    else {
                        System.out.println("Invalid action!");
                }
//                } else {
//                    String enemyAction = enemy.chooseAction(); // Call enemy's chooseAction
//
//                    if (enemyAction.equals("Attack")) {
//                        enemy.attack(hero);
//                    } else if (enemyAction.equals("Defend")) {
//                        enemy.defend();
//                    } else if (enemyAction.equals("Use Skill")) {
//                        enemy.useSkill(hero);
//                    } else {
//                        System.out.println("Enemy's action: " + enemyAction);
//                    }
//                }
//            }

            // Check battle conditions (health, etc.)
//            if (hero.isDead()) {
//                System.out.println("Defeat! You have fallen.");
//                break;
//            } else if (enemy.isDead()) {
//                System.out.println("Victory! You have defeated " + enemy.getName() + ".");
//                // Handle victory (loot, experience, etc.)
//                break;
//            }
//
//            // Switch turn
//            heroTurn = !heroTurn;
//        }
//    }
}
        }
    }
}
        
