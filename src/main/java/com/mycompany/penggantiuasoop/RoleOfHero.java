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
    private int physicalPower;
    private int magicPower;
    private int pDefense;
    private int mgDefense;
    private String type;
    
    public RoleOfHero(String name, int hp, int physicalPower,int magicPower, int pDefense,int mgDefense, String type, int gold, int exp){
        this.name = name;
        this.hp = hp;
        this.exp= exp;
        this.gold = gold;
        this.physicalPower = physicalPower;
        this.magicPower = magicPower;
        this.pDefense = pDefense;
        this.mgDefense = mgDefense;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    
    
    
}
