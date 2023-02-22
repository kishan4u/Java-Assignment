package Lab4;

import java.util.Scanner;

public class Largest0f3numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Value1 is ");
		int  value1 = sc.nextInt();
		System.out.println("Value2 is ");
		int  value2 = sc.nextInt();
		System.out.println("Value3 is ");
		int  value3 = sc.nextInt();


		if(value1>=value2 && value1>=value3)

			System.out.println(value1 + " is greater");

		else if(value3>=value1)

			System.out.println(value3+" is greater");

		else

			System.out.println(value2 + " is greater");



	}

}
