package Assignment1;

public class AscendingArray {

	public static void main(String[] args) {
		int temp;
		int[] array = {25,78,12,45,38};

        for (int i= 0;i<array.length ;i++) {
        	for(int j=i+1;j<array.length;j++) {
        		if(array[i]>array[j]) {
        			temp = array[j];
        			array[j]=array[i];
        			array[i]=temp;

        		}

        	}
        }

        System.out.println(" Array in ascending order is ");
		for (int element : array) {


			System.out.println(element);
		}
	}

}
