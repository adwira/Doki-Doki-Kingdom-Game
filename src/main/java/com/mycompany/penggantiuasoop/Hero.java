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
    protected int level;
    protected int gold;
    protected int physicalPower;
    protected int magicPower;
    protected int physicalDefense;
    protected int magicDefense;
    protected String type;
    
    public Hero(String name, int hp, int gold,int level,int physicalPower, int magicPower, int physicalDefense, int magicDefend, String type){
        this.name = name;
        this.hp = hp;
        this.level= level;
        this.gold = gold;
        this.type = type;
        this.physicalPower = physicalPower;
        this.magicPower = magicPower;
        this.physicalDefense = physicalDefense;
        this.magicDefense = magicDefend;
    }
//    public Enemy enemy;
    
//    @Override
//    public abstract void attack();
//    @Override
//    public abstract void defend();
    
    abstract void skillSpecial(Enemy enemy);
    abstract void buff();
    
     
    public void basicAttack(Enemy enemy){
        int dmg;
        int x = enemy.chooseDefenseSkill();
        System.out.println("Kamu menggunakan Basic Attack!");
        if(x == 1){
            dmg = this.getPhysicalPower() - enemy.getPhysicalDefense();
            System.out.println(enemy.getName() + " menggunakan Defend!");
        }
        else if(x == 2) {
            dmg = this.getPhysicalPower() * 2;
            System.out.println(enemy.getName() + " menggunakan Counter!");
        }
        else { dmg = this.getPhysicalPower();
            System.out.println(enemy.getName() + " menggunakan Magic Shield!");
        }
        enemy.setHp(enemy.getHp() - dmg);
        System.out.println("Kamu memberikan damage " + dmg + " kepada " + enemy.getName());
    }
    
    public void strikeAttack(Enemy enemy) {
        int dmg;
        int x = enemy.chooseDefenseSkill();
        System.out.println("Kamu menggunakan Strike!");
        if(x == 1){
            dmg = (getPhysicalPower() * 2) - enemy.getPhysicalDefense();
            System.out.println(enemy.getName() + " menggunakan Defend!");
        }
        else if(x == 2) {
            dmg = (getPhysicalPower() * 2) + enemy.getPhysicalPower();
            System.out.println(enemy.getName() + " menggunakan Counter!");
        }
        else { dmg = getPhysicalPower() * 2;
        System.out.println(enemy.getName() + " menggunakan Magic Shield!");
        }
        if(x != 2){
            enemy.setHp(enemy.getHp() - dmg);
        System.out.println("Kamu memberikan damage " + dmg + " kepada " + enemy.getName());
        }
        
        else { setHp(getHp() - dmg);
        System.out.println("Kamu terkena counter damage sebesar " + dmg);
    }
    
    }
    public void giveUp() {
        setGold(0);
        System.out.println("Kamu Menyerah cemen lu");
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
