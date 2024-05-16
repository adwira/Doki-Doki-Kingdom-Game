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
    private String name;
    private int hp;
    private int level;
    private int gold;
    private int physicalPower;
    private int magicPower;
    private int pDefense;
    private int mgDefense;
    
    
    public Enemy(String name, int hp, int level,int gold, int physicalPower, int magicPower, int pDefense, int mgDefense){
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.gold = gold;
        this.physicalPower = physicalPower;
        this.pDefense = pDefense;
        this.magicPower = magicPower;
    }
    
    @Override
    public abstract void attack();
    @Override
    public abstract void defend();

    //Magic Attack Barbarian
    public void acidBreath() {
        
    }
    
    //Magic Attack Imp
    public void fireball(){
        
    }
    
    //Magic Attack Kobold
    public void poisonDagger(){
        
    }
    
    //Magic Attack Bandit
    public void stealGold(){
        
    }
    //CHOOSE ACTION ATTACK
    

    //SETTER GETTER
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

    public int getpDefense() {
        return pDefense;
    }

    public void setpDefense(int pDefense) {
        this.pDefense = pDefense;
    }

    public int getMgDefense() {
        return mgDefense;
    }

    public void setMgDefense(int mgDefense) {
        this.mgDefense = mgDefense;
    }

}
