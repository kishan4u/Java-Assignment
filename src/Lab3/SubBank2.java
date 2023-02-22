package Lab3;

public class SubBank2 implements Bank {

	public static void main(String[] args) {
		SubBank2 sb2 = new SubBank2();
		sb2.getInterest();

	}

	@Override
	public void getInterest() {
		System.out.println("Bank info is appearing");

	}

}
