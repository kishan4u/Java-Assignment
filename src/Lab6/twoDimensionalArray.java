package Lab6;

import java.util.Scanner;

public class twoDimensionalArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		int column = sc.nextInt();

		int [][] array = new int[row][column];

		for(int i = 0; i<array.length;i++) {
			for(int j = 0; j<array.length;j++) {

			array[i][j] = sc.nextInt();
			}
		}

	}

}
