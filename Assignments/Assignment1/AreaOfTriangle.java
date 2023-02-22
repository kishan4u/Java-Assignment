package Assignment1;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base and height");
		int base = sc.nextInt();
		int height = sc.nextInt();

		float AreaOfTriangle = (base*height)/2;

		System.out.println("Area Of Triangle is " + AreaOfTriangle);

	}

}
