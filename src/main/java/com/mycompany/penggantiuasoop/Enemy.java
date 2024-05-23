/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penggantiuasoop;

/**
 *
 * @author USER
 */
abstract class Enemy implements Character{
    protected String name;
    protected int hp;
    protected int level;
    protected int gold;
    protected int physicalPower;
    protected int magicPower;
    protected int physicalDefense;
    protected int magicDefense;
    
    public Enemy(String name, int hp, int level, int gold, int physicalPower, int magicPower, int physicalDefense,
            int magicDefense) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.gold = gold;
        this.physicalPower = physicalPower;
        this.magicPower = magicPower;
        this.physicalDefense = physicalDefense;
        this.magicDefense = magicDefense;
    }
    

abstract void skillSpecial(Hero hero);
abstract void buff(Hero hero);
        
    public void basicAttack(Hero hero){
        int dmg = 0;       
        int x = hero.chooseDefenseSkill();
        switch (x) {
            case 1 -> {
                dmg = getPhysicalPower() - hero.getPhysicalDefense();
                dmg = dmg < 0 ? 0 : dmg;
                System.out.println("kamu menggunakan Defend!");
                System.out.println("Musuh menggunakan Basic Attack!");
            }
            case 2 -> {
                dmg = getPhysicalPower() * 2;
                dmg = dmg < 0 ? 0 : dmg;
                System.out.println("kamu menggunakan Counter!");
                System.out.println("Musuh menggunakan Basic Attack!");
            }
            case 3 -> {
                dmg =getPhysicalPower();
                dmg = dmg < 0 ? 0 : dmg;
                System.out.println("kamu menggunakan Magic Shield!");
                System.out.println("Musuh menggunakan Basic Attack!");
            }
            case 4 -> {
                hero.giveUp();
                System.out.println("Kamu menyerah!");
            }
            default -> {
                System.out.println("Masukkan angka yang benar!");
                x = hero.chooseDefenseSkill();
            }
        }
        hero.setHp(hero.getHp() - dmg);
        System.out.println("Musuh memberikan damage " + dmg + " kepada " + hero.getName());
    }
    
    public void strikeAttack(Hero hero) {
        int dmg = 0;
        int x = hero.chooseDefenseSkill();
        switch (x) {
            case 1 -> {
                dmg = Math.max(0,getPhysicalPower() - hero.getPhysicalDefense());
                System.out.println("kamu menggunakan Defend!");
                System.out.println("Musuh menggunakan Strike!");
            }
            case 2 -> {
                dmg = Math.max(0,getPhysicalPower() * 2);
                System.out.println("kamu menggunakan Counter!");
                System.out.println("Musuh menggunakan Strike!");
            }
            case 3 -> {
                dmg = Math.max(0,getPhysicalPower() * 2);
                System.out.println("kamu menggunakan Magic Shield!");
                System.out.println("Musuh menggunakan Strike!");
            }
            case 4 -> {
                hero.giveUp();
                System.out.println("Kamu menyerah!");
            }
            default -> {
                System.out.println("Masukkan angka yang benar!");
                x = hero.chooseDefenseSkill();
            }
        }
        
        if(x != 2){
             hero.setHp(hero.getHp() - dmg);
        System.out.println("Musuh memberikan damage " + dmg + " kepada " + hero.getName());
        }
        else{setHp(getHp() - dmg);
        System.out.println("Musuh terkena damage Counter" + dmg);}
    }
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    public int getPhysicalPower() {
        return physicalPower;
    }
    public void setPhysicalPower(int physicalPower) {
        this.physicalPower = physicalPower;
    }
    public int getMagicPower() {
        return magicPower;
    }
    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }
    public int getPhysicalDefense() {
        return physicalDefense;
    }
    public void setPhysicalDefense(int physicalDefense) {
        this.physicalDefense = physicalDefense;
    }
    public int getMagicDefense() {
        return magicDefense;
    }
    public void setMagicDefense(int magicDefense) {
        this.magicDefense = magicDefense;
    }
    
}
