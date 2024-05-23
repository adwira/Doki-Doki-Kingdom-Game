/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.penggantiuasoop;

//import java.util.ArrayList;
//import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
// *
// * @author User
// */

public class PenggantiUASOOP {

    private static void typeWithAnimation(String text) throws InterruptedException {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            System.out.flush(); // Memastikan karakter langsung ditampilkan
            Thread.sleep(50); // Menunda 50 milidetik antara setiap karakter
        }
        System.out.println(); // Pindah ke baris baru setelah teks selesai
    }

    public static int checker() {
        Scanner scanner = new Scanner(System.in);
        char input;
        int ascii, intInput;
        String temp;
        do {
            temp = scanner.nextLine();
            input = temp.charAt(0);
            ascii = (int) input;
        } while (ascii < 49 || ascii > 52);

        intInput = Integer.parseInt(temp);
        return intInput;
    }

    public static void main(String[] args) throws InterruptedException {
        //NAMA, HP, gold  level  physicalPower  magicPower physicalDefense magicDefend
        int c = 0, poinUp;
        String input;
        Upgrading up = new Upgrading();
        int index = 0, length, enemyCount = 0, battleState = 0;
        //int battleState = 0;
        List<Enemy> listEnemies = new ArrayList<>();
        String Nama = "";
        Hero hero = null;
        String welcomeMessage = "SELAMAT DATANG DI DOKI DOKI ADVENTURE!";
        String message1 = "Tekan enter untuk melanjutkan...";
        String message2 = "KAMU ADALAH SEORANG PAHLAWAN, TOLONG SELAMATKAN DUNIA INI!";
        String message3 = "Masukan Nama Hero Anda!";

//        Add Enemy to List
        Enemy enemy = new Goblin("Goblin Grunt", 90, 1, 35, 25, 20, 15, 5);
        Enemy slime = new Slime("Slime", 150, 1, 50, 10, 10, 40, 40);
        Enemy slime2 = new Slime("Slime", 150, 1, 50, 10, 10, 40, 40);
        Enemy goblin2 = new Goblin("Goblin", 90, 1, 35, 25, 20, 15, 5);
        Enemy goblin3 = new Goblin("Goblin 3", 90, 1, 35, 25, 20, 15, 5);
        Enemy gblking = new Goblin("Goblin King", 200, 1, 35, 25, 20, 15, 5);
        listEnemies.add(enemy);
        listEnemies.add(slime);
        listEnemies.add(slime2);
        listEnemies.add(goblin2);
        listEnemies.add(goblin3);
        listEnemies.add(gblking);

        Scanner scanner = new Scanner(System.in);
        typeWithAnimation(welcomeMessage);
        System.out.print(message1);
        scanner.nextLine();

        typeWithAnimation(message2);
        System.out.print(message1);
        scanner.nextLine();

        typeWithAnimation(message3);
        String nama = scanner.nextLine();
//        System.out.println("SELAMAT DATANG DI DOKI DOKI ADVENTURE!");
//        System.out.print("Tekan enter untuk melanjutkan...");
//        scanner.nextLine();
//        System.out.println("KAMU ADALAH SEORANG PAHLAWAN, TOLONG SELAMATKAN DUNIA INI!");
//        System.out.print("Tekan enter untuk melanjutkan...");
//        scanner.nextLine();
//        System.out.println("Masukan Nama Hero Anda!");
//        Nama = scanner.nextLine();

        while (true) {
            System.out.println("PERTAMA-TAMA, PILIH ROLE KAMU!");
            System.out.println("1. Warrior");
            System.out.println("2. Thief");
            System.out.println("3. Magician");
            System.out.println("4. Deskripsi Role");
            System.out.println("Input 1-4");
            c = checker();
            if (c == 1) {
                hero = new Warrior(Nama);
                break;
            } else if (c == 2) {
                hero = new Thief(Nama);
                break;
            } else if (c == 3) {
                hero = new Magician(Nama);
                break;
            } else if (c == 4) {
                System.out.println("Warrior mengutamakan kekuatan fisik dan"
                        + " memiliki serangan fisik yang kuat. Warrior memiliki "
                        + "kemampuan bertahan yang baik dan cocok untuk pemain "
                        + "yang suka bermain agresif. Warrior memiliki statistik awal :");
                System.out.println("150 HP");
                System.out.println("40 PP (Physical Power)");
                System.out.println("35 PD (Physical Defense)");
                System.out.println("10 MP (Magic Power)");
                System.out.println("15 MD (Magic Defense)");
                System.out.println("Magician mengandalkan kekuatan sihir untuk"
                        + " menyerang musuh. Mereka memiliki berbagai mantra"
                        + " sihir yang dapat menyebabkan kerusakan besar atau"
                        + " memberikan efek status pada lawan. Magician memiliki"
                        + " statistik awal :");
                System.out.println("100 HP");
                System.out.println("10 PP (Physical Power)");
                System.out.println("15 PD (Physical Defense)");
                System.out.println("40 MP (Magic Power)");
                System.out.println("35 MD (Magic Defense)");
                System.out.println("Thief memiliki kemampuan untuk mencuri"
                        + " barang dari musuh atau pemain lain. Thief memiliki"
                        + " statistik awal :");
                System.out.println("120 HP");
                System.out.println("35 PP (Physical Power)");
                System.out.println("25 PD (Physical Defense)");
                System.out.println("15 MP (Magic Power)");
                System.out.println("25 MD (Magic Defense)");
                System.out.println("Tekan Apa Saja untuk kembali");
                scanner.nextLine();
            } else {
                System.out.println("Masukan Inputan Yang Valid!");
            }

        }

        length = listEnemies.size();
        while (battleState != -1) {
            Enemy currentEnemy;
            currentEnemy = listEnemies.get(index);

            Battle battle = new Battle(hero);
            battleState = battle.start(currentEnemy);

            if (battleState == 2) {
                index++;
            }

            if (battleState == 1) {
                index++;
            }
            enemyCount++; // Increment enemyCount only after winning a battle
            
//          LEVEL UP
            if (enemyCount % 3 == 0) {
                hero.setLevel(hero.getLevel() + 1);
                System.out.println("Kamu naik ke level " + hero.getLevel() + "!!");
                System.out.println("Kamu bertambah kuat!!");
                hero.setMaxhp((int) (hero.getMaxhp()* 1.1));
                hero.setPhysicalPower((int) (hero.getPhysicalPower() * 1.1));
                hero.setPhysicalDefense((int) (hero.getPhysicalDefense() * 1.1));
                hero.setMagicPower((int) (hero.getMagicPower() * 1.1));
                hero.setMagicDefense((int) (hero.getMagicDefense() * 1.1));
            }

            if (index % 5 == 0 && index != length) {
                System.out.println("Setelah mengalahkan 5 musuh, kamu akan melawan Boss!");
                System.out.println("Tekan enter untuk melanjutkan...");
                scanner.nextLine();

//                masuk ke shop
                while (true) {
                    System.out.println("Selamat datang di Doki Doki SHOP..");
                    
                    input = scanner.nextLine();
                    poinUp = 0;
                    if (input == "1") {
                        System.out.println("Masukan Jumlah bla...");
                        poinUp = scanner.nextInt();
                        up.hpUp(hero, poinUp);
                        
                        System.out.println("Tekan Apa Saja untuk kembali");
                        
                        scanner.nextLine();
                    } else if (input == "2") {
                        System.out.println("Masukan Jumlah bla...");
                        poinUp = scanner.nextInt();
                        up.ppUp(hero, poinUp);
                        System.out.println("Tekan Apa Saja untuk kembali");
                        scanner.nextLine();
                    } else if (input == "3") {
                        System.out.println("Masukan Jumlah bla...");
                        poinUp = scanner.nextInt();
                        up.pdUp(hero, poinUp);
                        System.out.println("Tekan Apa Saja untuk kembali");
                        scanner.nextLine();
                    } else if (input == "4") {
                        System.out.println("Masukan Jumlah bla...");
                        poinUp = scanner.nextInt();
                        up.mgP(hero, poinUp);
                        System.out.println("Tekan Apa Saja untuk kembali");
                        scanner.nextLine();
                    } else if (input == "5") {
                        System.out.println("Masukan Jumlah bla...");
                        poinUp = scanner.nextInt();
                        up.mgD(hero, poinUp);
                        System.out.println("Tekan Apa Saja untuk kembali");
                        scanner.nextLine();
                    }
                    else if(input == "6"){
                        
                        up.healing(hero);
                        System.out.println("Tekan Apa Saja untuk kembali");
                        scanner.nextLine();
                    }
                    else {
                        break;
                    }
                }

            }

            if (index == listEnemies.size()) { // Win condition: Defeat all enemies
                System.out.println("YOU WIN! Kamu telah menyelamatkan dunia!");
                break;
            }
        }
        System.out.println("YOU LOSE");

    }

}
