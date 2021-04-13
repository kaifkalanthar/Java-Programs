package com.GetStronger;

public class Enemy implements Character{
    public String Weapon="Sniper";
    Enemy(){

    }
    public String GetWeapon(){
        return Weapon;
    }
    public void Attack(){
        System.out.println("Enemy attacked you");
}
@Override
    public void Heal(){
        System.out.println("Enemy healed himself");
}

}

