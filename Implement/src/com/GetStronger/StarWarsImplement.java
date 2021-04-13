package com.GetStronger;

import java.util.Random;

public class StarWarsImplement {
    public static Character SummonCharacter(){
        Random War =new Random();
        if (Math.abs(War.nextInt())%2 ==0){
            return new Enemy();
        }
        else{
            return new Hero();
        }
    }


    public static void main(String[] args) {
        Enemy Bavani= new Enemy();
        Hero JosephDurairaj=new Hero();
        Bavani.Attack();
        Bavani.Heal();
        JosephDurairaj.Attack();
        JosephDurairaj.Heal();
        System.out.println("Hero's Weapon "+JosephDurairaj.GetWeapon());
        System.out.println("Vilian's Weapon "+Bavani.GetWeapon());
        Character spy =SummonCharacter();
        System.out.println("============================================================");
        //System.out.println(spy);
        spy.Attack();
        spy.Heal();
    }
}
