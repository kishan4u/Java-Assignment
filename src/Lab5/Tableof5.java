package Lab5;

import java.util.Scanner;

public class Tableof5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter number to print table ");
        int s = sc.nextInt();

        for (int i=0 ; i < 10 ;i++) {
        	System.out.println( s + "x" + (i+1) + "=" + s*(i+1));
        }


	}

}
