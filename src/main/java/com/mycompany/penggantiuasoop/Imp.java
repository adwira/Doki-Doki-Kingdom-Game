/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penggantiuasoop;
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
        public void skillSpecial(Hero hero){
        int dmg = 0;
        int x = hero.chooseDefenseSkill();
        //System.out.println("Musuh menggunakan Fireball!");
        switch (x) {
            case 1 -> {
                dmg = (getMagicPower() * 2) - hero.getMagicDefense();
                dmg = dmg < 0 ? 0 : dmg;
                System.out.println("Kamu menggunakan Defend!");
                System.out.println("Musuh menggunakan Fireball!");
            }
            case 2 -> {
                dmg = (getMagicPower() * 2);
                dmg = dmg < 0 ? 0 : dmg;
                System.out.println("Kamu menggunakan Counter!");
                System.out.println("Musuh menggunakan Fireball!");
            }
            case 3 -> {
                dmg = getMagicPower();
                dmg = dmg < 0 ? 0 : dmg;
                System.out.println("Kamu menggunakan Defend!");
                System.out.println("Musuh menggunakan Fireball!");
            }
            case 4 -> {
                hero.giveUp();
                System.out.println("Kamu menyerah!");
            }
            default -> {
                System.out.println("Masukkan angka yang benar!");
                x = hero.chooseDefenseSkill();
            }
        }
        hero.setHp(hero.getHp() - dmg);
        System.out.println("Kamu memberikan damage " + dmg + " kepada " + hero.getName());
    }
        
    @Override
     public void buff(Hero hero){
         int x = hero.chooseDefenseSkill();
        switch (x) {
            case 1 -> System.out.println("kamu menggunakan Defend!");
            case 2 -> System.out.println("kamu menggunakan Counter!");
            case 3 -> System.out.println("kamu menggunakan Magic Shield!");
            default -> {
            }
        }
        System.out.println(name +" menggunakan skill Focus Mind!");
         this.tempP = getMagicPower();
        setMagicPower(tempP*2);
     }   
}

