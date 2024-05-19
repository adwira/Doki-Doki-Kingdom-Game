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
    

public void defend(){
        int defendChoice = chooseDefenseSkill();
        switch (defendChoice) {
            case 1 -> basicDefend();
            case 2 -> counter();
            case 3 -> magicDefend();
        }
    }

abstract void attack(Hero hero);
public void basicDefend() {
       // System.out.println(name +" menggunakan skill Basic Defend"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void counter() {
        //System.out.println(name +" menggunakan Counter"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void magicDefend() {
       // System.out.println(name +" menggunakan Magic Shield"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
    public void basicAttack(Hero hero){
        int dmg = 0;       
        int x = hero.chooseDefenseSkill();
        if(x == 1){
            dmg = Math.max(0,getPhysicalPower() - hero.getPhysicalDefense());
            System.out.println("kamu menggunakan Defend!");
            System.out.println("Musuh menggunakan Basic Attack!");
        }
        else if(x == 2) {
            dmg = Math.max(0,getPhysicalPower() * 2);
            System.out.println("kamu menggunakan Counter!");
            System.out.println("Musuh menggunakan Basic Attack!");
        }
        else if(x == 3) { 
            dmg = Math.max(0,getPhysicalPower());    
            System.out.println("kamu menggunakan Magic Shield!");
            System.out.println("Musuh menggunakan Basic Attack!");
        }
        else if(x == 4) { 
            hero.giveUp();
            System.out.println("Kamu menyerah!");
        }
        else {
            System.out.println("Masukkan angka yang benar!");
            x = hero.chooseDefenseSkill();
        }
        hero.setHp(hero.getHp() - dmg);
        System.out.println("Musuh memberikan damage " + dmg + " kepada " + hero.getName());
    }
    
    public void strikeAttack(Hero hero) {
        int dmg = 0;
        int x = hero.chooseDefenseSkill();
        if( x == 1){
            dmg = Math.max(0,getPhysicalPower() - hero.getPhysicalDefense());
            System.out.println("kamu menggunakan Defend!");
            System.out.println("Musuh menggunakan Strike!");
        }
        else if(x == 2) {
            dmg = Math.max(0,getPhysicalPower() * 2);
            System.out.println("kamu menggunakan Counter!");
            System.out.println("Musuh menggunakan Strike!");
        }
        else if(x == 3) { 
            dmg = Math.max(0,getPhysicalPower() * 2); 
            System.out.println("kamu menggunakan Magic Shield!");
            System.out.println("Musuh menggunakan Strike!");
        }
        else if(x == 4) { 
            hero.giveUp();
            System.out.println("Kamu menyerah!");
        }
        else {
            System.out.println("Masukkan angka yang benar!");
            x = hero.chooseDefenseSkill();
        }
        
        if(x != 2){
             hero.setHp(hero.getHp() - dmg);
        System.out.println("Musuh memberikan damage " + dmg + " kepada " + hero.getName());
        }
        else{setHp(getHp() - dmg);}
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
