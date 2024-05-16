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
    private int physicalAttack;
    private int magicAttack;
    private int pDefense;
    private int mgDefense;
    
    
    public Enemy(String name, int hp, int physicalAttack, int magicAttack, int pDefense, int mgDefense){
        this.name = name;
        this.hp = hp;
        this.physicalAttack = physicalAttack;
        this.pDefense = pDefense;
        this.magicAttack = magicAttack;
    }
    
    @Override
    public abstract void attack();
    @Override
    public abstract void defend();

    public void acidBreath() {
        
    }
    public void fireball(){
        
    }
    
    public void poisonDagger(){
        
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

    public int getPhysicalAttack() {
        return physicalAttack;
    }

    public void setPhysicalAttack(int physicalAttack) {
        this.physicalAttack = physicalAttack;
    }

    public int getMagicAttack() {
        return magicAttack;
    }

    public void setMagicAttack(int magicAttack) {
        this.magicAttack = magicAttack;
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
