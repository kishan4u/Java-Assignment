package Lab8;

import java.util.Scanner;

public class RecursionReverse {


	public static void reverse(int number) {



		if(number<10) {

			System.out.println(number);

			return;
		}
		else {

			System.out.print(number%10);

			reverse(number/10);

		}




	}



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		reverse(num);





	}

}
