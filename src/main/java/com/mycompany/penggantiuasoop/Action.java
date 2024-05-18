/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penggantiuasoop;

/**
 *
 * @author USER
 */
public class Action {
        String name;
        int hp;
        int dmg;
        int gold;
        int level;
        int physicalPower;
        int magicPower;
        int physicalDefense;
        int magicDefend;
        String type;
        
        // Ketika Basic Attack bertemu dengan Basic Defend
    public void atkdef(Hero hero, Enemy enemy) {
        dmg = physicalPower - physicalDefense;
        hp -= dmg;
        System.out.println(name + "menerima" + dmg + "damage");
    }
        //Ketika Basic Attack bertemu dengan Counter
    public void atkcounter(Hero hero, Enemy enemy) {
        dmg = physicalPower * 2;
        hp -= dmg;
        System.out.println(name + "menerima" + dmg + "damage");
    }
        //Ketika Basic Attack Bertemu dengan Magic Defend
    public void atkm_def(Hero hero, Enemy enemy) {
        dmg = physicalPower;
        hp -= dmg;
        System.out.println(name + "menerima" + dmg + "damage");
    }
    
    // Jika Give Up maka seluruh gold habis
    public void giveUp(int gold) {
        gold = 0;

    }
    
    //Ketika Magic Attack bertemu dengan Basic Defend
    public void mgskilldef(Hero hero, Enemy enemy) {
        dmg = magicPower;
        hp -= dmg;
        System.out.println(name + "menerima" + dmg + "damage");
    }
    //Ketika Magic Attack bertemu dengan Counter
    public void mgskillcounter(Hero hero, Enemy enemy) {
        dmg = magicPower;
        hp -= dmg;
        System.out.println(name + "menerima" + dmg + "damage");
    }
    //Ketika Magic Attack bertemu dengan Magic Defend
    public void mgskillmdef(Hero hero, Enemy enemy) {
        dmg =  magicPower / 2;
        enemy.hp -= dmg;
        System.out.println(name + "menerima" + dmg + "damage");
    }
    
    //Magic Attack Hero Thief
    public void pickpocket(Hero hero, Enemy enemy) {
        dmg =  physicalPower * (1 / 10 * gold);
        enemy.hp -= dmg;
        System.out.println(name + "menerima" + dmg + "damage");
    }
    //Magic Attack Hero Magician
    public void scorch(Hero hero, Enemy enemy) {
        dmg =  (magicPower * 2);
        enemy.hp -= dmg;
        System.out.println(name + "menerima" + dmg + "damage");
    }
    //Magic Attack Hero Warrior
    public void runeSword(Hero hero, Enemy enemy) {
        dmg = physicalPower + physicalDefense;
        hp -= dmg;
        System.out.println(name + "menerima" + dmg + "damage");
    }
    //Ketika Strike Bertemu dengan Basic Defend
    public void strikedef(Hero hero, Enemy enemy) {
        dmg =  physicalPower * 2 - physicalDefense;
        hp -= dmg;
        System.out.println(name + "menerima" + dmg + "damage");
    }
    //Ketika Strike Bertemu dengan Counter, maka yang damage akan di
    public void strikecounter(Hero hero, Enemy enemy) {
        dmg =  physicalPower * 2;
        hp -= dmg;
        System.out.println(name + "menerima" + dmg + "damage");
    }
    //Ketika Strike Bertemu dengan Magic Defend
    public void strikem_def(Hero hero, Enemy enemy) {
        dmg =  physicalPower * 2;
        hp -= dmg;
        System.out.println(name + "menerima" + dmg + "damage");
    }

}
