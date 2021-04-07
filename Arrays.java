package Condition;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        // write your code here
        Scanner sc =new Scanner(System.in);

        int t = sc.nextInt();
        int Array[] =new int[t];

        for (int i =0;i<t;i++){
            Array[i] =sc.nextInt();
            System.out.println(Array[i]);


        }

    }
}

