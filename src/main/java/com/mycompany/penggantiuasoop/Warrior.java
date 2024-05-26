package com.mycompany.penggantiuasoop;

import java.util.Scanner;

public class Warrior extends Hero{
    private static final Scanner scanner = new Scanner(System.in);

   public Warrior(String name) {
        super(name, 150, 50, 1, 40, 10, 35, 15, "Warrior");
    }

    int tempM;
    int tempN;
    @Override
    public int chooseAttackSkill() {
         System.out.println("Pilih Skill Serangan (Attack/Strike/Rune Sword/Muscle):");
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
        if(x == 1){
            dmg = (getPhysicalPower() + getPhysicalDefense()) - enemy.getMagicDefense();
            dmg = dmg < 0 ? 0 : dmg;
            System.out.println("Musuh menggunakan Defend!");
            System.out.println("Kamu menggunakan Rune Sword!");
        }
        else if(x == 2) {
            dmg = getPhysicalPower() + getPhysicalDefense();
            dmg = dmg < 0 ? 0 : dmg;
            System.out.println("Musuh menggunakan Counter!");
            System.out.println("Kamu menggunakan Rune Sword!");
        }
        else {
            dmg = getPhysicalPower() + getPhysicalDefense() / 2;
            dmg = dmg < 0 ? 0 : dmg;
            System.out.println("Musuh menggunakan Magic Shield!");
            System.out.println("Kamu menggunakan Rune Sword!");
        }
        enemy.setHp(enemy.getHp() - dmg);
        System.out.println("Kamu memberikan damage " + dmg + " kepada " + enemy.getName());
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
        System.out.println("Kamu menggunakan Muscle!");
        setPhysicalPower(getPhysicalPower()*3/2);
        setPhysicalDefense(getPhysicalDefense()*3/2);
    }
    
    @Override
    public void debuff(){
        setPhysicalPower(tempM);
        setPhysicalDefense(tempN);
    }
    public void setdebuff(){
        this.tempM = getPhysicalPower();
        this.tempN = getPhysicalDefense();
    }
}
