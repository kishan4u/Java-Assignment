package Lab6;

import java.util.Scanner;

public class ArrayAverage {
	Scanner sc = new Scanner(System.in);

	int size = sc.nextInt();

	int array[] = new int[size];

	int avrage;
	int answer;


	public void takeInput() {

		System.out.println("Input array values");

		for(int i = 0 ; i<array.length;i++) {

		array[i] = sc.nextInt();



		}
	}

	public static void main(String[] args) {

		System.out.println("Enter the size of an array");

		ArrayAverage Arrayaverage = new ArrayAverage();

		Arrayaverage.takeInput();
		Arrayaverage.average();
	}

	public void average() {

		for (int element : array) {

			avrage += element;

		}

		answer = avrage/array.length;

		System.out.println("Answer for array average is " + answer);
	}

}
