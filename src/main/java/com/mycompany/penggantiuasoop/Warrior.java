package com.mycompany.penggantiuasoop;

import java.util.Scanner;

public class Warrior extends Hero {
    private static final Scanner scanner = new Scanner(System.in);

    public Warrior(String name, int hp, int gold,int level,int physicalPower, int magicPower, int physicalDefense, int magicDefend, String type) {
        super(name, hp, gold, level,physicalPower,magicPower, physicalDefense, magicDefend , type);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void useSkill() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'useSkill'");
        System.out.println(name + " menggunakan skill Muscle");
    }

    @Override
    public int chooseAttackSkill() {
         System.out.println("Pilih Skill Serangan (attack/strike/runesword/muscle):");
        return scanner.nextInt();
        // TODO Auto-generated method stub
 
    }

    @Override
    public int chooseDefenseSkill() {
        System.out.println("Pilih Skill Pertahanan (defend/counter/magic defend/giveUp):");
        return scanner.nextInt();
        // TODO Auto-generated method stub

    }

    @Override
    public void basicAttack() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'basicAttack'");
        System.out.println(name +" menggunakan skill Basic Attack");
    }

    @Override
    public void strikeAttack() {
        // TODO Auto-generated method stub
        System.out.println(name + " menggunakan skill Strike!");
    }

    @Override
    public void magicAttack(){
        System.out.println(name + " Menyerang dengan ");
    }

    @Override
    public void basicDefend() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'basicDefend'");
        System.out.println(name+" bertahan dengan Basic Defend");
    }

    @Override
    public void counter() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'counter'");
        System.out.println(name + " bertahan dengan skill Counter");
    }

    @Override
    public void giveUp() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'giveUp'");
        System.out.println(name + "memilih menyerah, cemen banget lu bang");
    }

    @Override
    public void magicDefend() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'magicDefend'");
        System.out.println(name + "bertahan dengan Magic Defend");
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'attack'");
        int skillChoice = chooseDefenseSkill();
        switch (skillChoice) {
            case 1:
            basicAttack();
            break;

            case 2:
            strikeAttack();
            break;

            case 3:
            runeSword();
            break;

            case 4:
            useSkill();
            break;
        }

    }

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
    
}
