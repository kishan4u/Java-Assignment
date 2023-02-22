package Lab2;

public class ConstructorsMember {


	int num = 50;
	String value;
	 String alphabet;



	public ConstructorsMember(String valu, String valu2) {
		valu2 = value;
	   alphabet = "Tomar";
	}

	ConstructorsMember(String val){       //Being called by this keyword, Constructor chaining
		System.out.println(val);
	}

	ConstructorsMember(){          //Being called by main method object
		this("abc");
	}


	public String memberFunction() {

		System.out.println("memberfunction");

		return "Kishan";

	}

	public static void main(String[] args) {

		ConstructorsMember Const = new ConstructorsMember();

		Const.value = "High";
		String valuee= "New";

		Const.memberFunction();
		ConstructorsMember cm = new ConstructorsMember(Const.value, valuee);

	}

}
