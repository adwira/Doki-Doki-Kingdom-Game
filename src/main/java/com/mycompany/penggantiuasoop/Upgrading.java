/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penggantiuasoop;

/**
 *
 * @author User
 */
public class Upgrading {

    Hero hero;
    int price;
    int up;
    
    public Upgrading() {
    }
    
    
    public void hpUp(Hero hero,int up){
        this.hero = hero;
        
//        isi dengan peningkatan dari equipment, kurangai gold hero dgn hrg equipm
        hero.setGold(hero.getGold()-0);
        hero.setMagicDefense(0);
        

    }
    
    public boolean GoldCheker(Hero hero, int price){
        boolean state = hero.getGold() < price ? false : true;
        return state;
    }
    
    public void ppUp(Hero hero, int up){
        
        price = up*50;
        if(!GoldCheker(hero, price)){
            System.out.println("kau bokek anjir");
        }
        else{
            
            hero.setGold(hero.getGold()-price);
            hero.setPhysicalPower(up+hero.getPhysicalPower());
            System.out.println("Physical Power Telah Ditingkatkan!");
        }
    }
    
    public void pdUp(Hero hero, int up){
        price = up*50;
        if(!GoldCheker(hero, price)){
            System.out.println("kau bokek anjir");
        }
        else{
            
            hero.setGold(hero.getGold()-price);
            hero.setPhysicalDefense(up+hero.getPhysicalDefense());
            System.out.println("Physical Defense Telah Ditingkatkan!");
        }
    }
    
    public void mgP(Hero hero, int up){
        price = up*50;
        if(!GoldCheker(hero, price)){
            System.out.println("kau bokek anjir");
        }
        else{
            
            hero.setGold(hero.getGold()-price);
            hero.setMagicPower(up+hero.getMagicPower());
            System.out.println("Magic Power Telah Ditingkatkan!");
        }
    }
    
    public void mgD(Hero hero, int up){
        price = up*50;
        if(!GoldCheker(hero, price)){
            System.out.println("kau bokek anjir");
        }
        else{

            hero.setGold(hero.getGold()-price);
            hero.setMagicDefense(up+hero.getMagicDefense());
            System.out.println("Magic Defense Telah Ditingkatkan!");
        }
    }
    
    public void healing(Hero hero){
        price = 100;
        if(!GoldCheker(hero, price)){
            System.out.println("kau bokek anjir");
        }
        else{

            hero.setGold(hero.getGold()-price);
            hero.setHp(hero.getHp());
            System.out.println("HP Telah Pulih!");
        }
    }
    
    
}
