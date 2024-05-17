/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.penggantiuasoop;

/**
 *
 * @author User
 */
public class PenggantiUASOOP {

    public static void main(String[] args) {
        Magician hero = new Magician("Magician Master", 100, 50, 1, 10, 20, 10, 15, "Magician");

    // Start battle with the created Hero
    Battle battle = new Battle(hero); // Pass the Hero object to Battle constructor
    battle.start();
    }
}
