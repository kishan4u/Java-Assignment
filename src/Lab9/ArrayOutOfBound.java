package Lab9;

public class ArrayOutOfBound {

	static String [] array = new String[10];


	public static void main(String[] args) {

		try {
			String a = array[10];
		}

		catch(ArrayIndexOutOfBoundsException ae)
		{

			System.out.println("Array index exception executed");
		}


	}

}
