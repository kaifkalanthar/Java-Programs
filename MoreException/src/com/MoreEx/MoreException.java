package com.MoreEx;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MoreException {
    public static double TooHot=180;
    public static double TooCold=165;
    public static final Scanner sc =new Scanner(System.in);

    public static void DrinkHotChocolate(double CocoTemp) throws TooColdException, TooHotException {

        if (CocoTemp>=TooHot){
            throw new TooHotException();
        }else if(CocoTemp<=TooCold){
            throw new TooColdException();
        }
    }

    public static void main(String[] args) throws TooHotException,TooColdException,InterruptedException{
        double CurrentCocoTemp=sc.nextDouble();
        boolean WrongTemp = true;
        while (WrongTemp ) {
            try {
                DrinkHotChocolate(CurrentCocoTemp);
                System.out.println("It's Too Good To Drink");
               WrongTemp=false;
            } catch (TooColdException e) {
                System.out.println("It's Too Cold ");
                CurrentCocoTemp =CurrentCocoTemp+5;
                System.out.println(e.getMessage());
            } catch (TooHotException e1) {
                System.out.println("It's Too Hot You can't Drink It");
                CurrentCocoTemp =CurrentCocoTemp-5;
            }
            TimeUnit.SECONDS.sleep(1);

        }

    }
}
