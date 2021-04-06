package WhileLoop;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	int t= input.nextInt();

	int i=2;
	while (i<t){
        System.out.println(i);
        i=i+2;
    }
    }
}
