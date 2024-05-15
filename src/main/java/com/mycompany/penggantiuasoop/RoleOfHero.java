/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penggantiuasoop;
/**
 *
 * @author USER
 */
abstract class RoleOfHero implements Hero{
    private String name;
    private int hp;
    private int exp;
    private int gold;
    private String type;
    
    public RoleOfHero(String name, int hp, int attackPower, int defensePower, String type){
        this.name = name;
        this.hp = hp;
        this.exp= exp;
        this.gold = gold;
        this.type = type;
    }
    
    @Override
    public abstract void attack();
    @Override
    public abstract void defend();

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

    
    
    
}
