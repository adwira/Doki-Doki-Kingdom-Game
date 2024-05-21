package com.mycompany.penggantiuasoop;

import java.util.Scanner;

public class Warrior extends Hero{
    private static final Scanner scanner = new Scanner(System.in);

    public Warrior(String name, int hp, int gold, int level, int physicalPower, int magicPower, int physicalDefense, int magicDefend, String type) {
        super(name, hp, gold, level, physicalPower, magicPower, physicalDefense, magicDefend, type);
    }

    int tempM;
    int tempN;
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
        if(x == 1){
            dmg = (getPhysicalPower() + getPhysicalDefense()) - enemy.getMagicDefense();
            System.out.println("Musuh menggunakan Defend!");
            System.out.println("Kamu menggunakan Rune Sword!");
        }
        else if(x == 2) {
            dmg = getPhysicalPower() + getPhysicalDefense();
            System.out.println("Musuh menggunakan Counter!");
            System.out.println("Kamu menggunakan Rune Sword!");
        }
        else {
            dmg = getPhysicalPower() + getPhysicalDefense() / 2;
            System.out.println("Musuh menggunakan Magic Shield!");
            System.out.println("Kamu menggunakan Rune Sword!");
        }
        enemy.setHp(enemy.getHp() - dmg);
        System.out.println("Kamu memberikan damage " + dmg + " kepada " + enemy.getName());
    }
    
    @Override
    public void buff(){
        this.tempM = getPhysicalPower();
        this.tempN = getPhysicalDefense();
        setPhysicalPower(tempM*3/2);
        setPhysicalDefense(tempN*3/2);
    }
}
