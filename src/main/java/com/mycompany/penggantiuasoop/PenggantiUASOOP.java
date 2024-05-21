/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.penggantiuasoop;

//import java.util.ArrayList;
//import java.util.List;
import java.io.Console;
import java.util.Scanner;
// *
// * @author User
// */
public class PenggantiUASOOP {

        public static int checker(){
            Scanner scanner = new Scanner(System.in);
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
    public static void main(String[] args) {
   //NAMA, HP, gold  level  physicalPower  magicPower physicalDefense magicDefend
        int c;
        String Nama, type;
        int HP, level, gold, PP, PD, MP, MD;

        Enemy enemy = new Goblin("Goblin Grunt", 50, 1, 10, 5, 5, 5, 5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI DOKI DOKI ADVENTURE!");
        System.out.print("Tekan enter untuk melanjutkan...");
        scanner.nextLine();
        System.out.println("KAMU ADALAH SEORANG PAHLAWAN, TOLONG SELAMATKAN DUNIA INI!");
        System.out.print("Tekan enter untuk melanjutkan...");
        scanner.nextLine();
        
        System.out.println("PERTAMA-TAMA, PILIH ROLE KAMU!\n");
        System.out.println("1. Warrior\n");
        System.out.println("2. Thief\n");
        System.out.println("3. Magician\n");
        switch (c = checker()){
            case 1: HP = 150;
                    level = 1;
                    gold = 50;
                    PP = 40;
                    PD = 35;
                    MP = 10;
                    MD = 10;
                    type = "Warrior";
            case 2:HP = 120;
                    level = 1;
                    gold = 100;
                    PP = 35;
                    PD = 25;
                    MP = 15;
                    MD = 25;
                    type = "Thief";
            case 3:HP = 100;
                    level = 1;
                    gold = 50;
                    PP = 10;
                    PD = 15;
                    MP = 40;
                    MD = 35;
                    type = "Magician";
        }
        
        Nama = scanner.nextLine();
        Hero hero = new 
        
    Battle battle = new Battle();
    battle.start(enemy);
    }
}
