/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.penggantiuasoop;

//import java.util.ArrayList;
//import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
        int c = 0;
        int index = 0, length, enemyCount = 0;
        //int battleState = 0;
        List<Enemy> listEnemies = new ArrayList<>();
        String Nama = "";
        Hero hero = null;
        String welcomeMessage = "SELAMAT DATANG DI DOKI DOKI ADVENTURE!";
        String message1 = "Tekan enter untuk melanjutkan...";
        String message2 = "KAMU ADALAH SEORANG PAHLAWAN, TOLONG SELAMATKAN DUNIA INI!";
        String message3 = "Masukan Nama Hero Anda!";

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
                System.out.println("DES masuk kes 4");
                System.out.println("Tekan Apa Saja untuk kembali");
                scanner.nextLine();
            } else {
                System.out.println("Masukan Inputan Yang Valid!");
            }

        }

        length = listEnemies.size();
        while (true) {
            Enemy currentEnemy;
            if (enemyCount < listEnemies.size()) { // Access enemies from list
                currentEnemy = listEnemies.get(enemyCount);
            } else {
                // Boss fight (optional, not shown here for brevity)
                System.out.println("****** BOSS BATTLE ******");
                // ... (your boss fight logic)
                break; // Exit the loop after boss fight (assuming one boss)
            }

            Battle battle = new Battle(hero);
            int battleState = battle.start(currentEnemy);

            if (battleState == 1) {
                enemyCount++; // Increment enemyCount only after winning a battle
                if (enemyCount % 5 == 0 && enemyCount != listEnemies.size()) {
                    System.out.println("Setelah mengalahkan 5 musuh, kamu akan melawan Boss!");
                    System.out.println("Tekan enter untuk melanjutkan...");
                    scanner.nextLine();
                }
            }

            if (enemyCount == listEnemies.size()) { // Win condition: Defeat all enemies
                System.out.println("YOU WIN! Kamu telah menyelamatkan dunia!");
                break;
            }
        }

    }

}
