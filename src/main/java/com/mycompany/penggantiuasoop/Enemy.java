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

public void attack(Hero hero){
         int skillChoice = chooseAttackSkill();
        switch (skillChoice) {
            case 1 -> basicAttack(hero);

            case 2 -> strikeAttack(hero);

            case 3 -> acidBreath(hero);

//            case 4 -> battleCry();
        }
    }
public void basicDefend() {
        System.out.println(name +" menggunakan skill Basic Defend"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void counter() {
        System.out.println(name +" menggunakan Counter"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void magicDefend() {
        System.out.println(name +" menggunakan Magic Shield"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

abstract void acidBreath(Hero hero);
abstract void battleCry();
        
    public void basicAttack(Hero hero){
        int dmg = 0;
        System.out.println("Musuh menggunakan Basic Attack!");
        int x = hero.chooseDefenseSkill();
        if(x == 1){
            dmg = Math.max(0,getPhysicalPower() - hero.getPhysicalDefense());
        }
        else if(x == 2) {
            dmg = Math.max(0,getPhysicalPower() * 2);
        }
        else if(x == 3) { 
            dmg = Math.max(0,getPhysicalPower());    
        } else {}
        hero.setHp(hero.getHp() - dmg);
        System.out.println("Musuh memberikan damage " + dmg + " kepada " + hero.getName());
    }
    
    public void strikeAttack(Hero hero) {
        int dmg = 0;
        System.out.println("Musuh menggunakan Strike!");
        int x = hero.chooseDefenseSkill();
        if( x == 1){
            dmg = Math.max(0,getPhysicalPower() - hero.getPhysicalDefense());
        }
        else if(x == 2) {
            dmg = Math.max(0,getPhysicalPower() * 2);
        }
        else if(x == 3) { 
            dmg = Math.max(0,getPhysicalPower());    
        } else {}
        hero.setHp(hero.getHp() - dmg);
        System.out.println("Kamu memberikan damage " + dmg + " kepada " + hero.getName());
    }
    
    //Magic Attack Imp
    public void fireball(Hero hero){
        int dmg;
        System.out.println("Musuh menggunakan Fireball!");
        if(hero.chooseDefenseSkill() == 1){
            dmg = (getMagicPower() * 2) - hero.getMagicDefense();
        }
        else if(hero.chooseDefenseSkill() == 2) {
            dmg = (getMagicPower() * 2);
        }
        else { dmg = getMagicPower();
        }
        hero.setHp(hero.getHp() - dmg);
        System.out.println("Kamu memberikan damage " + dmg + " kepada " + hero.getName());
    }
    
    //Magic Attack Kobold
    public void poisonDagger(Hero hero){
        int dmg;
        System.out.println(this.getName() + " menggunakan Poison Dagger!");
        if(hero.chooseDefenseSkill() == 1){
            dmg = (getPhysicalPower() + (getMagicPower() / 2)) - hero.getMagicDefense();
        }
        else if(hero.chooseDefenseSkill() == 2) {
            dmg = (getPhysicalPower() + (getMagicPower() / 2));
        }
        else { dmg = (getPhysicalPower() + (getMagicPower() / 2)) / 2;
    }
   }
    
    //Magic Attack Bandit
    public void stealGold(Hero hero){
        int dmg;
       System.out.println("Musuh menggunakan Steal Gold!");
        if(hero.chooseDefenseSkill() == 1){
            dmg = ((getPhysicalPower() * 3/2) + (getGold() * 1/10)) - hero.getMagicDefense();
        }
        else if(hero.chooseDefenseSkill() == 2) {
            dmg = ((getPhysicalPower() * 3/2) + (getGold() * 1/10));
        }
        else if(hero.chooseDefenseSkill() == 3){ dmg = ((getPhysicalPower() * 3/2) + (getGold() * 1/10)) / 2;
        } else { hero.giveUp();}
    }
    
    //Magic Attack Slime
    public void splash(){
        System.out.println("Hmm?? Tidak ada yang terjadi");
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
