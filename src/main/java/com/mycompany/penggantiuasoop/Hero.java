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
    
    private String name;
    private int hp;
    private int maxhp;
    private int level;
    private int gold;
    private int physicalPower;
    private int magicPower;
    private int physicalDefense;
    private int magicDefense;
    private boolean isGiveUp;
    private String type;
    
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
        this.isGiveUp = false;
        this.maxhp = hp;
    }
//    public Enemy enemy;
    
//    @Override
//    public abstract void attack();
//    @Override
//    public abstract void defend();
    
    abstract void skillSpecial(Enemy enemy);
    abstract void buff(Enemy enemy);
    abstract void debuff();
    
     
    public void basicAttack(Enemy enemy){
        int dmg;
        int x = enemy.chooseDefenseSkill();
        System.out.println("Kamu menggunakan Basic Attack!");
        if(x == 1){
            dmg = this.getPhysicalPower() - enemy.getPhysicalDefense();
            dmg = dmg < 0 ? 0 : dmg;
            System.out.println(enemy.getName() + " menggunakan Defend!");
        }
        else if(x == 2) {
            dmg = this.getPhysicalPower() * 2;
            System.out.println(enemy.getName() + " menggunakan Counter!");
        }
        else { 
            dmg = this.getPhysicalPower();
            dmg = dmg < 0 ? 0 : dmg;    
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
            dmg = dmg < 0 ? 0 : dmg;
            System.out.println(enemy.getName() + " menggunakan Defend!");
        }
        else if(x == 2) {
            dmg = (getPhysicalPower() * 2) + enemy.getPhysicalPower();
            dmg = dmg < 0 ? 0 : dmg;
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
        isGiveUp = true;
        System.out.println("Kamu Menyerah cemen lu");
        }

    public boolean isGiveUp(){
        boolean temp = isGiveUp;
        isGiveUp = false;
        return temp;
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

    public int getMaxhp() {
        return maxhp;
    }

    public void setMaxhp(int maxhp) {
        this.maxhp = maxhp;
    }

}
