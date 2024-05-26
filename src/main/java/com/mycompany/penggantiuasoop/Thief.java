package com.mycompany.penggantiuasoop;

import java.util.Scanner;

public class Thief extends Hero{
    private static final Scanner scanner = new Scanner(System.in);

    public Thief(String name) {
        super(name, 120, 100, 1,35, 15, 25, 25, "Thief");
    }

    @Override
    public int chooseAttackSkill() {
         System.out.println("Pilih Skill Serangan (Attack/Strike/Pickpocket/Multiply Gold):");
        return scanner.nextInt();
 
    }

    @Override
    public int chooseDefenseSkill() {
        System.out.println("Pilih Skill Pertahanan (Defend/Counter/Magic Shield/Give Up):");
        return scanner.nextInt();

    }
    
    
    @Override
    public void skillSpecial(Enemy enemy){
       int dmg = 0;
       int x = enemy.chooseDefenseSkill();
        switch (x) {
            case 1 -> {
                dmg = ((getPhysicalPower() * 3/2) + (getGold() * 1/10)) - enemy.getMagicDefense();
                dmg = dmg < 0 ? 0 : dmg;
                System.out.println("Musuh menggunakan Defend!");
                System.out.println("Musuh menggunakan Pickpocket!");
            }
            case 2 -> {
                dmg = ((getPhysicalPower() * 3/2) + (getGold() * 1/10));
                dmg = dmg < 0 ? 0 : dmg;
                System.out.println("Musuh menggunakan Counter!");
                System.out.println("Musuh menggunakan Pickpocket!");
            }
            case 3 -> {
                dmg = ((getPhysicalPower() * 3/2) + (getGold() * 1/10)) / 2;
                dmg = dmg < 0 ? 0 : dmg;
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
    public void debuff(){
        
    }
    
    @Override
    public void buff(Enemy enemy){
         int x = enemy.chooseDefenseSkill();   
        switch (x) {
            case 1 -> System.out.println("musuh menggunakan Defend!");
            case 2 -> System.out.println("musuh menggunakan Counter!");
            case 3 -> System.out.println("musuh menggunakan Magic Shield!");
            default -> {
            }
        }
        System.out.println("Kamu menggunakan Multiply Gold!");
        setGold(getGold()*3/2);
    }
}


   
