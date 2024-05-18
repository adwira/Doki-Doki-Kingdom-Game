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
    
    
    abstract void attack(Enemy enemy);

     @Override
     public void defend() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'defend'");
        int defendChoice = chooseDefenseSkill();
        switch (defendChoice) {
            case 1:
            basicDefend();
            break;
            case 2:
            counter();
            break;
            case 3:
            magicDefend();
            break;
            case 4:
            giveUp();
            break;
        }
    }
     
    public void basicAttack(Enemy enemy){
        int dmg;
        int x = enemy.chooseDefenseSkill();
        System.out.println("Kamu menggunakan Basic Attack!");
        if(x == 1){
            dmg = this.getPhysicalPower() - enemy.getPhysicalDefense();
        }
        else if(x == 2) {
            dmg = this.getPhysicalPower() * 2;
        }
        else { dmg = this.getPhysicalPower();
            
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
        }
        else if(x == 2) {
            dmg = (getPhysicalPower() * 2) + enemy.getPhysicalPower();
        }
        else { dmg = getPhysicalPower() * 2;
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
        
    }
    //Magic Attack Magician, dmg = mgPower x2
    
    
    //Magic Attack Warrior, dmg = pAttack + pDef, dmg tipe magic attack
    public void runeSword(Enemy enemy){
        int dmg;
        int x = enemy.chooseDefenseSkill();
        System.out.println("Kamu menggunakan Rune Sword!");
        if(x == 1){
            dmg = (getPhysicalPower() + getPhysicalDefense()) - enemy.getMagicDefense();
        }
        else if(x == 2) {
            dmg = getPhysicalPower() + getPhysicalDefense();
        }
        else { dmg = getPhysicalPower() + getPhysicalDefense() / 2;
        }
    }
    
    //Magic Attack Thief, dmg = pAttack * 150% + 10% Gold, trus nyuri gold
    public void pickpocket(Enemy enemy){
       int dmg;
       int x = enemy.chooseDefenseSkill();
       System.out.println("Kamu menggunakan Pickpocket!");
        if(x == 1){
            dmg = ((getPhysicalPower() * 3/2) + (getGold() * 1/10)) - enemy.getMagicDefense();
        }
        else if(x == 2) {
            dmg = ((getPhysicalPower() * 3/2) + (getGold() * 1/10));
        }
        else { dmg = ((getPhysicalPower() * 3/2) + (getGold() * 1/10)) / 2;
        }
    }

    //Skill Warrior, pAttack & pDef naik 50%
    public void muscle(){
        
    }
    //Skill Magician, mgPower x2
 
    //Skill Thief, gold * 150%
    public void moneyGrubber(){
        
    }
    
    public void basicDefend(){
       System.out.println("Kamu menggunakan Defend!");
    }
    
    public void counter(){
        System.out.println("Kamu menggunakan Counter!");
    }
    public void magicDefend(){
        System.out.println("Kamu menggunakan Magic Shield!");
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
