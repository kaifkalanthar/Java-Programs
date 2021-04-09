package com.Ex;

import javax.management.BadStringOperationException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionJava {

    public static void main(String[] args) {
	/*int Array[]=new int[12];
        System.out.println(Array[12]);
        This is uncheaked error
	 */
        //Avoid error using Try-Catch
        System.out.println("========================================================================================");
       /* try {
            int Arr[]=new int[21];
            System.out.println(Arr[27]);
        }catch (ArrayIndexOutOfBoundsException S){
            System.out.println("Yes finally finished: "+S);
        }

        */
        Scanner sc =new Scanner(System.in);


        try{
            int Num =sc.nextShort();
            int Number=sc.nextShort();
            int div =  (Num/Number);
            System.out.println(div);

        }catch (InputMismatchException h){
            System.out.println(h.getClass().getName());
        }
        catch (ArithmeticException y){
            System.out.println(y);
        }
        System.out.println("========================================================================================");
    }
}
