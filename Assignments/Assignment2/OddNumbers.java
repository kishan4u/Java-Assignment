package Assignment2;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		for(int i=a; i<b; i++) {

			if(i%2 != 0) {

				System.out.println(" Odd number is "+i);

			}


		}




	}

}
