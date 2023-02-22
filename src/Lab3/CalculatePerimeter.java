package Lab3;


interface perimeter {

	public void rectangle(float a, float b);
	public void square(float a);
	public void circle(float a);


}



public class CalculatePerimeter implements perimeter {

	float length = 2;
	float breadth = 4;
	float side = 5;
	float radius = 4;
	double pi = 3.14;


	public static void main(String[] args) {
		CalculatePerimeter cp = new CalculatePerimeter();
		cp.rectangle( cp.length, cp.breadth);
		cp.square(cp.side);
		cp.circle(cp.radius);

	}

	@Override
	public void rectangle(float a, float b) {
		float perimeterRec = 2*(a+b);
		System.out.println("Perimeter of rectangle " + perimeterRec);

	}

	@Override
	public void square(float a) {
		float perimeterSqr = 4*a;
		System.out.println("Perimeter of triangle "+ perimeterSqr);

	}

	@Override
	public void circle(float a) {
		double perimeterCir = 2*pi*a;
		System.out.println("Perimeter of circle " + perimeterCir);

	}

}
