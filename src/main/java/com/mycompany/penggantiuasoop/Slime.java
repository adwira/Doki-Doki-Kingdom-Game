///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.penggantiuasoop;
//import java.lang.Math;
///**
// *
// * @author USER
// */
//class Slime extends Enemy{
//    public Slime(String name, int hp,int level,int gold, int physicalPower, int magicPower, int pDefense, int mgDefense) {
//            super(name, hp, level,gold, physicalPower, magicPower, pDefense, mgDefense);    
//    }
//    
//    @Override
//    public void attack(){
//         int skillChoice = chooseAttackSkill();
//        switch (skillChoice) {
//            case 1:
//            basicAttack();
//            break;
//
//            case 2:
//            strikeAttack();
//            break;
//
//            case 3:
//            splash();
//            break;
//
//            case 4:
//            focusMind();
//            break;
//        }
//    }
//    
//    @Override
//    public void defend(){
//        int defendChoice = chooseDefenseSkill();
//        switch (defendChoice) {
//            case 1:
//            basicDefend();
//            break;
//            case 2:
//            counter();
//            break;
//            case 3:
//            magicDefend();
//            break;
//        }
//    }
//
//    //CHOOSE ACTION DEFENSE
//    @Override
//    public int chooseAttackSkill() {
//        int[] actions = {0,1,2,3};
//    int randomIndex = (int)Math.random() * 4;
//    return actions[randomIndex]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    @Override
//    public void strikeAttack() {
//       System.out.println(name +" menggunakan skill Strike"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    @Override
//    public void basicAttack() {
//        System.out.println(name +" menggunakan skill Basic Attack"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    @Override
//    public void splash() {
//        System.out.println(name +" menggunakan Splash"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    @Override
//    public void focusMind(){
//        System.out.println(name +" menggunakan skill Focus Mind");
//    }
//    
//    //CHOOSE ACTION DEFENSE
//    @Override
//    public int chooseDefenseSkill() {
//        int[] actions = {0,1,2};
//    int randomIndex = (int)Math.random() * 3;
//    return actions[randomIndex]; 
//    }
//    @Override
//    public void basicDefend() {
//        System.out.println(name +" menggunakan Defend");
//    }
//    @Override
//    public void counter() {
//        System.out.println(name +" menggunakan Counter");
//    }
//    @Override
//    public void magicDefend() {
//        System.out.println(name +" menggunakan magic Shield");
//    }
//
//
//  
//    
//    
//
//    
//    
//}