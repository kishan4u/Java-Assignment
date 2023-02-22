package Assignment2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 13;

		for(int i = 2; i< num-1; i++) {

		if(num/i ==0 )

			System.out.println(" Not a prime number ");
		else

			System.out.println(num + " Is a prime number ");
		break;
		}
	}

}
