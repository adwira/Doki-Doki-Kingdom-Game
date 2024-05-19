package com.mycompany.penggantiuasoop;

import java.util.Scanner;

public class Magician extends Hero{
    private static final Scanner scanner = new Scanner(System.in);

    public Magician(String name, int hp, int gold, int level, int physicalPower, int magicPower, int physicalDefense, int magicDefend, String type) {
        super(name, hp, gold, level, physicalPower, magicPower, physicalDefense, magicDefend, type);
    }

    int tempM;
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
    public void attack(Enemy enemy) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'attack'");
        int skillChoice = chooseAttackSkill();
        switch (skillChoice) {
            case 1:
            basicAttack(enemy);
            break; 

            case 2:
            strikeAttack(enemy);
            break;

            case 3:
            scorch(enemy);
            break;

            case 4:
            meditate();
            break;
        }
    }
    
    public void scorch(Enemy enemy){
            int dmg;
            int x = enemy.chooseDefenseSkill();
            System.out.println("Kamu menggunakan Scorch!");
            if(x == 1){
                dmg = (getMagicPower() * 2) - enemy.getMagicDefense();
            }
            else if(x == 2) {
                dmg = (getMagicPower() * 2);
            }
            else { dmg = getMagicPower() / 2;
            }
            enemy.setHp(enemy.getHp() - dmg);
            System.out.println("Kamu memberikan damage " + dmg + " kepada " + enemy.getName());
        }
    

    public void meditate(){
        this.tempM = getMagicPower();
        setMagicPower(tempM*2);
    }
}


   
