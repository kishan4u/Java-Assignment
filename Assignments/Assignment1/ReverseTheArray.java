package Assignment1;

import java.util.Scanner;

public class ReverseTheArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int[] array = new int[size];

		System.out.println("Array elements are ");

		for(int i = 0 ; i<array.length;i++) {

			array[i] = sc.nextInt();

			}


        System.out.println(" Array in reverse order is ");
		for(int i= array.length-1;i>=0;i--) {


			System.out.println(array[i]);
		}
	}

	}


