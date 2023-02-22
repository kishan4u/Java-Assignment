package Assignment1;

import java.util.Scanner;

public class Factorial {


	int num = 10;

	public static int fact(int number) {

		if (number >= 1)
            return number * fact(number - 1);
        else
            return 1;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();


		System.out.println(fact(num));



	}

}
