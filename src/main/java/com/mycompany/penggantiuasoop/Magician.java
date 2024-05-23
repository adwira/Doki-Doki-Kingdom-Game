package com.mycompany.penggantiuasoop;

import java.util.Scanner;

public class Magician extends Hero{
    private static final Scanner scanner = new Scanner(System.in);

    public Magician(String name) {
        super(name, 100, 50, 1, 10, 40, 15, 35, "Magician");
    }

    int tempM;
    
    @Override
 public int chooseAttackSkill() {
        char input ;
        int ascii, intInput;
        String temp;
        System.out.println("Pilih Skill Serangan (Basic Attack/Strike/Scorch/Meditate):");
        do{
            temp = scanner.nextLine();
            input = temp.charAt(0);
            ascii = (int)input;
        } while(ascii < 49 || ascii > 52);
        
        intInput = Integer.parseInt(temp);
        return  intInput;
    }
 
    @Override
    public int chooseDefenseSkill() {
        char input ;
        int ascii, intInput;
        String temp;
        System.out.println("Pilih Skill Pertahanan (defend/counter/magic defend/giveUp):");
        do{
            temp = scanner.nextLine();
            input = temp.charAt(0);
            ascii = (int)input;
        } while(ascii < 49 || ascii > 52);
        
        intInput = Integer.parseInt(temp);
        return  intInput;
    }
    
    
    
    @Override
    public void skillSpecial(Enemy enemy){
            int dmg = 0;
            int x = enemy.chooseDefenseSkill();
            if(x == 1){
                dmg = (getMagicPower() * 2) - enemy.getMagicDefense();
                dmg = dmg < 0 ? 0 : dmg;
                System.out.println("Musuh menggunakan Defend!");
                System.out.println("Kamu menggunakan Scorch!");
            }
            else if(x == 2) {
                dmg = (getMagicPower() * 2);
                dmg = dmg < 0 ? 0 : dmg;
                System.out.println("Musuh menggunakan Counter!");
                System.out.println("Musuh menggunakan Scorch!");
            }
            else { dmg = getMagicPower() / 2;
            dmg = dmg < 0 ? 0 : dmg;
            System.out.println("Musuh menggunakan Magic Shield!");
                System.out.println("Kamu menggunakan Scorch!");
            }
            enemy.setHp(enemy.getHp() - dmg);
            System.out.println("Kamu memberikan damage " + dmg + " kepada " + enemy.getName());
        }
    
    
   @Override
    public void debuff(){
        setMagicPower(tempM);
    }
    public void setdebuff(){
        this.tempM = getMagicPower();
    }
    
    
    @Override
    public void buff(){
       setdebuff();
        setMagicPower(getMagicPower()*2);
    }
}


   
