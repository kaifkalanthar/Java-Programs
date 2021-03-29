package com.Day1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		System.out.println("Come on Let's Say Hello World! ");
 //syntax  Scanner  <Name of the Scanner> = new Scanner(System.in);
	       Scanner input = new Scanner(System.in);

	     //Data type variable = NameOfTheScanner nextLine();-->Function
	       String SayHelloWorld = input.nextLine();

        //System.out.println();-->it is used to Display Output
	       System.out.println(SayHelloWorld);
    }
}
