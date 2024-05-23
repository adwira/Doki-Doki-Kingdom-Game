/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penggantiuasoop;

/**
 *
 * @author User
 */
public class Shop {

    Hero hero;
    
    public Shop() {
    }
    
    
    public void equipmentName(Hero hero){
        this.hero = hero;
        
//        isi dengan peningkatan dari equipment, kurangai gold hero dgn hrg equipm
        hero.setGold(hero.getGold()-0);
        hero.setMagicDefense(0);
        

    }
    
}
