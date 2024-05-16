/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penggantiuasoop;

/**
 *
 * @author USER
 */
class Slime extends Enemy{
    public Slime(String name, int hp,int level,int gold, int physicalPower, int magicPower, int pDefense, int mgDefense) {
            super(name, hp, level,gold, physicalPower, magicPower, pDefense, mgDefense);
    }
    
    @Override
    public void attack(){
         String skillChoice = chooseAttackSkill();
        if (skillChoice.equals("attack")) {
            basicAttack();
        } else if (skillChoice.equals("strike")) {
            strikeAttack();
        } else if (skillChoice.equals("magicAttack")) {
            magicAttack();
        }else if(skillChoice.equals("Use Skill")) {
            useSkill();
        }else {
            System.out.println("Skill tidak valid!");
        }
        
    }
    
    @Override
    public void defend(){
        String skillChoice = chooseDefenseSkill();
        if (skillChoice.equals("defend")) {
            basicDefend();
        } else if (skillChoice.equals("counter")) {
            counter();
        } else if (skillChoice.equals("giveUp")) {
            giveUp();
        } else if (skillChoice.equals("magicDefend")) {
            magicDefend();
        } else {
            System.out.println("Skill tidak valid!");
        }
    }
    
    //CHOOSE ACTION DEFENSE
    @Override
    public String chooseAttackSkill() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void strikeAttack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void basicAttack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void magicAttack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void useSkill(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    //CHOOSE ACTION DEFENSE
    @Override
    public String chooseDefenseSkill() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void basicDefend() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void counter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void magicDefend() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void giveUp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

  
    
    

    
    
}
