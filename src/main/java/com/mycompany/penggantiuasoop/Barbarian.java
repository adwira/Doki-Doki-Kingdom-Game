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
//class Barbarian extends Enemy{
//    public Barbarian(String name, int hp,int level,int gold, int physicalPower, int magicPower, int pDefense, int mgDefense) {
//            super(name, hp, level,gold, physicalPower, magicPower, pDefense, mgDefense);  
//            
//    }
//            int tempPw;
//            int tempPd;
//    @Override
//    public void attack(){
//         int skillChoice = chooseAttackSkill();
//        switch (skillChoice) {
//            case 1 -> basicAttack();
//
//            case 2 -> strikeAttack();
//
//            case 3 -> acidBreath();
//
//            case 4 -> battleCry();
//        }
//    }
//    
//    @Override
//    public void defend(){
//        int defendChoice = chooseDefenseSkill();
//        switch (defendChoice) {
//            case 1 -> basicDefend();
//            case 2 -> counter();
//            case 3 -> magicDefend();
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
//        System.out.println(name +" menggunakan strike"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    @Override
//    public void basicAttack() {
//        System.out.println(name +" menggunakan skill Basic Attack");// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    @Override
//    public void acidBreath() {
//        System.out.println(name +" menggunakan skill acidBreath"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    @Override
//    public void battleCry(){
//        System.out.println(name +" menggunakan skill Battle Cry");
//        this.tempPw = getPhysicalPower();
//        this.tempPd = getPhysicalDefense();
//        setPhysicalPower(getPhysicalPower() * 3/2);
//        setPhysicalDefense(getPhysicalDefense() * 1/2);
//    }
//    
//    //CHOOSE ACTION DEFENSE
//    @Override
//    public int chooseDefenseSkill() {
//        int[] actions = {0,1,2};
//    int randomIndex = (int)Math.random() * 3;
//    return actions[randomIndex]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    @Override
//    public void basicDefend() {
//        System.out.println(name +" menggunakan skill Basic Defend"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    @Override
//    public void counter() {
//        System.out.println(name +" menggunakan Counter"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    @Override
//    public void magicDefend() {
//        System.out.println(name +" menggunakan skill Magic Shield"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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