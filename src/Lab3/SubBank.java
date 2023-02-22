package Lab3;

interface Bank {

	public void getInterest();


}


class SubBank implements Bank {

	int SI = 0;
	int p= 100;
	int r= 5;
	int t= 10;

	@Override
	public void getInterest(){

		SI = (p*r*t)/100;

		System.out.println(SI);

	}

	public static void main(String[] args) {

		SubBank sb = new SubBank();

		sb.getInterest();

	}

}

