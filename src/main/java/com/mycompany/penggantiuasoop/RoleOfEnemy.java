/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penggantiuasoop;

/**
 *
 * @author USER
 */
abstract class RoleOfEnemy implements Enemy{
    private String name;
    private int hp;
    private int physicalPower;
    private int magicPower;
    private int pDefense;
    private int mgDefense;
    private String type;
    
    public RoleOfEnemy(String name, int hp, int physicalPower,int magicPower, int pDefense,int mgDefense, String type){
        this.name = name;
        this.hp = hp;
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
