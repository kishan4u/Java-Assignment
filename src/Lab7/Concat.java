package Lab7;

import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		String concatenated = str1.concat(str2);

		System.out.println("Concatenated string is " + concatenated);

	}

}
