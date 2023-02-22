package Assignment2;

public class AverageofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value [] = {1,2,3,4,5};
		int sum=0;
		for (int element : value) {

			sum+= element;

		}

		int average = sum/value.length;

		System.out.println(average + " is average value ");


	}

}
