/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penggantiuasoop;

/**
 *
 * @author USER
 */
interface Character {
    void attack();
    void defend();
    
    public String chooseAttackSkill();
    public String chooseDefenseSkill();
    
    //Attack
    public void basicAttack();
    public void strikeAttack();
    public void magicAttack();
    public void useSkill();
    
    //Defend
    public void basicDefend();
    public void counter();
    public void giveUp();
    public void magicDefend();
    
}
