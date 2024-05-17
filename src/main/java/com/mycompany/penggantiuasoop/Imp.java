package com.mycompany.penggantiuasoop;

class Imp extends Enemy{
    public Imp(String name, int hp, int level, int gold, int physicalPower, int magicPower, int physicalDefense,
    int magicDefense, String type) {
            super(name, hp, level,gold, physicalPower, magicPower, physicalDefense, magicDefense, type);
    }
    
    @Override
    public void attack(){
         int skillChoice = chooseAttackSkill();
         switch (skillChoice) {
            case 1:
            basicAttack();
            break;

            case 2:
            strikeAttack();
            break;

            case 3:
            ;
            break;

            case 4:
            useSkill();
            break;
        }
       
        
    }
    
    @Override
    public void defend(){
        int skillChoice = chooseDefenseSkill();
        switch (skillChoice) {
            case 1:
            basicAttack();
            break;

            case 2:
            strikeAttack();
            break;

            case 3:
            
            break;

            case 4:
            useSkill();
            break;
        }
        
    }

    //CHOOSE ACTION DEFENSE
    @Override
     public int chooseAttackSkill() {
        int[] actions = {0,1,2,3};
    int randomIndex = (int)Math.random() * 4;
    return actions[randomIndex]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    public int chooseDefenseSkill() {
        int[] actions = {0,1,2,3};
    int randomIndex = (int)Math.random() * 3;
    return actions[randomIndex]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

