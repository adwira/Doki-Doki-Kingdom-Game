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
class Goblin extends Enemy{
    public Goblin(String name, int hp,int level,int gold, int physicalPower, int magicPower, int pDefense, int mgDefense) {
            super(name, hp, level,gold, physicalPower, magicPower, pDefense, mgDefense);    
    }
    int tempPd;
    int tempPw;
    
    
        public void battleCry(){
        System.out.println(name +" menggunakan skill Battle Cry");
        this.tempPw = getPhysicalPower();
        this.tempPd = getPhysicalDefense();
        setPhysicalPower(getPhysicalPower() * 3/2);
        setPhysicalDefense(getPhysicalDefense() * 1/2);
    }

    
    
    @Override


    //CHOOSE ACTION DEFENSE
   
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
    
    

        @Override
      public void acidBreath(Hero hero) {
        int dmg = 0;
        System.out.println("Musuh menggunakan Acid Breath!");
        int x = hero.chooseDefenseSkill();
        if(x == 1){
            dmg = Math.max(0,(getMagicPower() + (getPhysicalDefense() / 2)) - hero.getMagicDefense());
        }
        else if(x == 2) {
            dmg = Math.max(0,(getMagicPower() + (getPhysicalDefense() / 2)));
        }
        else if (x == 3){ 
            dmg = Math.max(0,(getMagicPower() + (getPhysicalDefense() / 2)));
        } else {}
        hero.setHp(hero.getHp() - dmg);
        System.out.println("Musuh memberikan damage " + dmg + " kepada " + hero.getName());  
    }
    
    

    
    
}