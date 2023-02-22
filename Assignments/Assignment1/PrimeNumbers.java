package Assignment1;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int j=2;j<=n;j++)
		{
		int count=0;
		for(int i=1;i<=j;i++)
		{
		   if(j%i==0)
		   {
		        count++;        // counts the number of divisors, that is divisible by itself and 1
		   }
		}
		if(count==2)
		       System.out.print(j+"  ");
		}


	}

}
