/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penggantiuasoop;

/**
 *
 * @author USER
 */
class Imp extends Enemy{
    public Imp(String name, int hp, int physicalAttack, int magicAttack, int pDefense, int mgDefense) {
            super(name, hp, physicalAttack, magicAttack, pDefense, mgDefense);
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

    

  
    
    

    
    
}
