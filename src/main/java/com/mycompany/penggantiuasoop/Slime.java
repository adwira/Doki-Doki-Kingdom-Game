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
class Slime extends Enemy{
    public Slime(String name, int hp,int level,int gold, int physicalPower, int magicPower, int pDefense, int mgDefense) {
            super(name, hp, level,gold, physicalPower, magicPower, pDefense, mgDefense);    
    }
    int tempP;
    int tempA;

   
    @Override
    public int chooseAttackSkill() {
        List<Integer> actions = new ArrayList<>();
    actions.add(1); // Basic Attack
    actions.add(2); // Strike Attack
    actions.add(3); // Acid Breath
    actions.add(4); // Harden

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
        public void skillSpecial(Hero hero) {
        int dmg = 0;
        int x = hero.chooseDefenseSkill();
        switch (x) {
            case 1 -> {
                System.out.println("kamu menggunakan Defend!");
                System.out.println("Musuh menggunakan Splash, tidak ada yang terjadi!");
            }
            case 2 -> {
                System.out.println("kamu menggunakan Counter!");
                System.out.println("Musuh menggunakan Splash, tidak ada yang terjadi!");
            }
            case 3 -> {
                System.out.println("kamu menggunakan Defend!");
                System.out.println("Musuh menggunakan Splash, tidak ada yang terjadi!");
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
        System.out.println(name +" menggunakan skill Harden!");
         this.tempP = getPhysicalDefense();
         this.tempA = getMagicDefense();
         setPhysicalDefense(tempP*2);
         setMagicDefense(tempA*2);
     }
    
    

    
    
}