/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penggantiuasoop;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author USER
 */
class Imp extends Enemy{
    public Imp(String name, int hp,int level,int gold, int physicalPower, int magicPower, int pDefense, int mgDefense) {
            super(name, hp, level,gold, physicalPower, magicPower, pDefense, mgDefense);    
    }
    int tempP;
      @Override
    public void attack(Hero hero){
         int skillChoice = chooseAttackSkill();
        switch (skillChoice) {
            case 1 -> basicAttack(hero);

            case 2 -> strikeAttack(hero);

            case 3 -> fireball(hero);
            
            case 4 -> focusMind();

        }
    }
    
    @Override
    public int chooseAttackSkill() {
        List<Integer> actions = new ArrayList<>();
    actions.add(1); // Basic Attack
    actions.add(2); // Strike Attack
    actions.add(3); // Acid Breath
//    actions.add(4); // Battle Cry

    Random random = new Random();
    int randomIndex = random.nextInt(actions.size());
    return actions.get(randomIndex);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

        
    //CHOOSE ACTION DEFENSE
    @Override
    public int chooseDefenseSkill() {
        List<Integer> actions = new ArrayList<>();
    actions.add(1); // Defend
    actions.add(2); // Counter
    actions.add(3); // Magic Shield

    Random random = new Random();
    int randomIndex = random.nextInt(actions.size());
    return actions.get(randomIndex);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        public void fireball(Hero hero){
        int dmg = 0;
        int x = hero.chooseDefenseSkill();
        //System.out.println("Musuh menggunakan Fireball!");
        if(x == 1){
            dmg = (getMagicPower() * 2) - hero.getMagicDefense();
            System.out.println("Kamu menggunakan Defend!");
            System.out.println("Musuh menggunakan Fireball!");
        }
        else if(x == 2) {
            dmg = (getMagicPower() * 2);
            System.out.println("Kamu menggunakan Counter!");
            System.out.println("Musuh menggunakan Fireball!");
        }
        else if(x == 3) {
            dmg = getMagicPower();
            System.out.println("Kamu menggunakan Defend!");
            System.out.println("Musuh menggunakan Fireball!");
        }
        else if(x == 4) { 
            hero.giveUp();
            System.out.println("Kamu menyerah!");
        }
        else {
            System.out.println("Masukkan angka yang benar!");
            x = hero.chooseDefenseSkill();
        }
        hero.setHp(hero.getHp() - dmg);
        System.out.println("Kamu memberikan damage " + dmg + " kepada " + hero.getName());
    }
     public void focusMind(){
         this.tempP = getMagicPower();
        setMagicPower(tempP*2);
     }   
}

