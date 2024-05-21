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
     
            public void giveUp(int gold) {
        gold = 0;

    }
        // Ketika Basic Attack bertemu dengan Basic Defend
    public int atkdef(String name1,String name2, int hp2, int physicalPower, int physicalDefense) {
        dmg = physicalPower - physicalDefense;
        hp2 -= dmg;
        System.out.println(name2 + "menerima" + dmg + "damage");
        return hp2;
    }
        //Ketika Basic Attack bertemu dengan Counter
    public int atkcounter(String name1,String name2, int hp2, int physicalPower) {
        dmg = physicalPower * 2;
        hp2 -= dmg;
        System.out.println(name2 + "menerima" + dmg + "damage");
        return hp2;
    }
        //Ketika Basic Attack Bertemu dengan Magic Defend
    public int atkm_def(String name1,String name2, int hp2, int physicalPower) {
        dmg = physicalPower;
        hp2 -= dmg;
        System.out.println(name2 + "menerima" + dmg + "damage");
        return hp2;
    }
    
    // Jika Give Up maka seluruh gold habis

    
    //Ketika Magic Attack bertemu dengan Basic Defend
    public int mgskilldef(String name1,String name2, int hp2, int magicPower, int magicDefense) {
        dmg = magicPower - magicDefense;
        hp2 -= dmg;
        System.out.println(name2 + "menerima" + dmg + "damage");
        return hp2;
    }
    //Ketika Magic Attack bertemu dengan Counter
    public int mgskillcounter(String name1,String name2, int hp2, int magicPower) {
        dmg = magicPower;
        hp2 -= dmg;
        System.out.println(name2 + "menerima" + dmg + "damage");
        return hp2;
    }
    //Ketika Magic Attack bertemu dengan Magic Defend
    public int mgskillmdef(String name1,String name2, int hp2, int magicPower) {
        dmg =  magicPower / 2;
        hp2 -= dmg;
        System.out.println(name2 + "menerima" + dmg + "damage");
        return hp2;
    }
    

    //Ketika Strike Bertemu dengan Basic Defend
    public int strikedef(String name1,String name2, int hp2, int physicalPower, int physicalDefense) {
        dmg =  physicalPower * 2 - physicalDefense;
        hp2 -= dmg;
        System.out.println(name2 + "menerima" + dmg + "damage");
        return hp2;
    }
    //Ketika Strike Bertemu dengan Counter, maka yang damage akan di
    public int strikecounter(String name1,String name2, int hp2, int physicalPower) {
        dmg =  physicalPower * 2;
        hp2 -= dmg;
        System.out.println(name1 + "menerima" + dmg + "damage");
        return hp2;
    }
    //Ketika Strike Bertemu dengan Magic Defend
    public int strikem_def(String name1,String name2, int hp2, int physicalPower) {
        dmg =  physicalPower * 2;
        hp2 -= dmg;
        System.out.println(name2 + "menerima" + dmg + "damage");
        return hp2;
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
}
