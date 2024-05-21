package com.mycompany.penggantiuasoop;

import java.util.Scanner;

public class Thief extends Hero{
    private static final Scanner scanner = new Scanner(System.in);

    public Thief(String name, int hp, int gold, int level, int physicalPower, int magicPower, int physicalDefense, int magicDefend, String type) {
        super(name, hp, gold, level, physicalPower, magicPower, physicalDefense, magicDefend, type);
    }

    @Override
    public int chooseAttackSkill() {
         System.out.println("Pilih Skill Serangan (attack/strike/scorch/meditate):");
        return scanner.nextInt();
 
    }

    @Override
    public int chooseDefenseSkill() {
        System.out.println("Pilih Skill Pertahanan (defend/counter/magic defend/giveUp):");
        return scanner.nextInt();

    }
    
    
    @Override
    public void skillSpecial(Enemy enemy){
       int dmg = 0;
       int x = enemy.chooseDefenseSkill();
        switch (x) {
            case 1 -> {
                dmg = ((getPhysicalPower() * 3/2) + (getGold() * 1/10)) - enemy.getMagicDefense();
                System.out.println("Musuh menggunakan Defend!");
                System.out.println("Musuh menggunakan Pickpocket!");
            }
            case 2 -> {
                dmg = ((getPhysicalPower() * 3/2) + (getGold() * 1/10));
                System.out.println("Musuh menggunakan Counter!");
                System.out.println("Musuh menggunakan Pickpocket!");
            }
            case 3 -> {
                dmg = ((getPhysicalPower() * 3/2) + (getGold() * 1/10)) / 2;
                System.out.println("Musuh menggunakan Magic Shield!");
                System.out.println("Musuh menggunakan Pickpocket!");
            }
            default -> {
            }
        }
        enemy.setHp(enemy.getHp() - dmg);
        System.out.println("Kamu memberikan damage " + dmg + " kepada " + enemy.getName());
    }
    
    @Override
    public void buff(){
        setGold(getGold()*3/2);
    }
}


   
