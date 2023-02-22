package lab10;



	class TestExceptionChild1 extends Parent{

		  @Override
		void msg()throws ArithmeticException {  // using unchecked exception

		    System.out.println("child method");
		  }

		  public static void main(String args[]) {

		   Parent p = new TestExceptionChild1();

		   p.msg();

		  }

}