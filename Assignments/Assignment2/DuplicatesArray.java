package Assignment2;

public class DuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {12, 32, 12, 45, 65, 93 , 0, 23, 45, 6 };
		int count=0;
		for(int i=0; i<array.length;i++) {

			for(int j=i+1; j<array.length;j++) {


				if( array[i] == array[j]) {

					System.out.println(array[i] + "is a duplicate number");

				}



			}



		}


	}

}
