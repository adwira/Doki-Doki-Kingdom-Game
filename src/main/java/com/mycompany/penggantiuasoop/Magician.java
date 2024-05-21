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
        char input ;
        int ascii, intInput;
        String temp;
        System.out.println("Pilih Skill Serangan (Basic Attack/Strike/Scorch/Meditate):");
        do{
            System.out.println("masuk pak eko");
            temp = scanner.nextLine();
            input = temp.charAt(0);
            ascii = (int)input;
            System.out.println("ascii " + ascii);
        } while(ascii < 49 || ascii > 52);
        
        intInput = Integer.parseInt(temp);
        System.out.println("bapajau " + intInput + " "+temp);
        return  intInput;
    }
 
    @Override
    public int chooseDefenseSkill() {
        char input ;
        int ascii, intInput;
        String temp;
        System.out.println("Pilih Skill Pertahanan (defend/counter/magic defend/giveUp):");
        do{
            System.out.println("masuk pak eko");
            temp = scanner.nextLine();
            input = temp.charAt(0);
            ascii = (int)input;
            System.out.println("ascii " + ascii);
        } while(ascii < 49 || ascii > 52);
        
        intInput = Integer.parseInt(temp);
        System.out.println("bapajau " + intInput + " "+temp);
        return  intInput;
    }
    
    
    
    @Override
    public void skillSpecial(Enemy enemy){
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
    
    
   
    
    
    
    @Override
    public void buff(){
        this.tempM = getMagicPower();
        setMagicPower(tempM*2);
    }
}


   
