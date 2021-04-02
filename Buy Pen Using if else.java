package com.Day1;

import java.util.Scanner;

public class ifelse{

    public static void main(String[] args) {
        // write your code here
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a cost : ");
        int Cost=scanner.nextInt();
        if (Cost==10){
            System.out.println("You can buy Normal pen");
        }
        else if(Cost>10 && Cost<=20){
            System.out.println("You can buy Gel pen");
        }
        else if(Cost>20 && Cost<=30){
            System.out.println("You can buy Ball pen");
        }
        else if (Cost>=30){
            System.out.println("you can Buy any pen");
        }
        else {
            System.out.println("you can't buy pen");
        }
    }
}

