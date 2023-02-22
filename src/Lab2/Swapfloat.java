package Lab2;

public class Swapfloat {

	float num1= 3.5f;
	float num2 = 5.6f;
	float num3 = 0.0f;

	public static void main(String[] args) {

		Swapfloat sf =new Swapfloat();

		sf.num3 = sf.num1;
		sf.num1 = sf.num2;
		sf.num2= sf.num3;

		System.out.println(sf.num1 +"  " + sf.num2);







	}

}
