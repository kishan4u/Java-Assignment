package Assignment2;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123;
		int value = 0;
		int reverse = 0;


			   while(num!=0) {

				 value = num % 10;
				 reverse = reverse*10+value;
				 num = num / 10;

			   }



		System.out.println(" Reverse number is "+ reverse );


	}

}
