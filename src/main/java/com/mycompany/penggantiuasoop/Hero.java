/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penggantiuasoop;
/**
 *
 * @author USER
 */
abstract class Hero implements Character{
    protected String name;
    protected int hp;
    protected int exp;
    protected int gold;
    protected int attackPower;
    protected int defensePower;
    protected String type;
    
    public Hero(String name, int hp, int gold,int exp,int attackPower, int defensePower, String type){
        this.name = name;
        this.hp = hp;
        this.exp= exp;
        this.gold = gold;
        this.type = type;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }
    
    @Override
    public abstract void attack();
    @Override
    public abstract void defend();
    public void scorch(){

    }

    public void runeSword(){
        
    }

    public void pickpocket(){

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

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }

    
    
    
}
