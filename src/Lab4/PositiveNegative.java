package Lab4;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		float num = sc.nextFloat();

		if(num>= 0 )
         System.out.println("Value is positive");
		else
			System.out.println("Value is negative");
	}

}
