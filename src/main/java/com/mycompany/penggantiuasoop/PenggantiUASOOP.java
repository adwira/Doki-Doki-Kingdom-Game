/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.penggantiuasoop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class PenggantiUASOOP {

        
    public static void main(String[] args) {
        Magician hero = new Magician("Magician Master", 100, 50, 1, 10, 20, 10, 15, "Magician"); //NAMA, HP, gold  level  physicalPower  magicPower physicalDefense magicDefend

//    ArrayList<Enemy> enemies = new ArrayList<>();
//    enemies.add(new Goblin("Goblin Grunt", 50, 1, 10, 5, 5, 5, 5));
    Enemy enemy = new Goblin("Goblin Grunt", 50, 1, 10, 5, 5, 5, 5);
//    Enemy n = n

    Battle battle = new Battle(hero); // Pass the Hero object to Battle constructor
    battle.start(enemy);
    }
}
