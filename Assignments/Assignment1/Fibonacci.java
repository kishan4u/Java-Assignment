package Assignment1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number for fibonacci ");
		int num = sc.nextInt();
		int a=0;
		int b=1;
		int c;
		System.out.print(a);
		System.out.print(b);
		for(int i=0; i< num;i++) {

			c=a+b;
			System.out.print(c);
			a=b;
			b=c;

		}




	}

}
