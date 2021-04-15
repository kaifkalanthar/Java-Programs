package souf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a number of entry");
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            System.out.printf("Enter phone number");
            long Number=sc.nextLong();
            System.out.println("Enter name");
            String  Name =sc.nextLine();
            Name = sc.nextLine();

           System.out.printf("%-15s%10d%n",Name,Number);
        }


    }
}
