package com.GetStronger;

public class Hero implements Character{
    public String Weapon ="Rx 500";
    public String GetWeapon(){
        return Weapon;
    }
    Hero(){

    }
    public  void Attack(){
    System.out.println("Hero attacked Enemy");
}
@Override
    public void Heal(){
    System.out.println("Hero healed you");
}
    }

