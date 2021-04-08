
package rec;

import java.util.Scanner;

class Recursive {
    public int summation(int n){
        if (n<=0){
            return 0;
        }
        else {
            return n+summation(n-1);
        }
    }
    public int factorial(int n){
        if(n<=0){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }

    }
    public int exponential(int n,int p){
        if (p<=0){
            return 1;
        }
        else {
            return n*exponential(n,p-1);
        }
    }
}
public class Main {


    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int t = sc.nextInt();
        rec.Recursive rec=new rec.Recursive();
        System.out.println(rec.summation(t));
        System.out.println(rec.factorial(t));

        System.out.println("Enter a Number and its Power");
        int i =sc.nextInt();
        int j=sc.nextInt();
        System.out.println(rec.exponential(i,j));

    }
}
