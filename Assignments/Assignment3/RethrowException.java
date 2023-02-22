package Assignment3;

public class RethrowException {
	  public static void main(String[] args) {
	    try {
	      method1();
	    } catch (Exception e) {
	      System.out.println("Caught Exception in Main: " + e);
	    }
	  }

	  public static void method1() throws Exception {
	    try {
	      method2();
	    } catch (Exception e) {
	      System.out.println("Caught Exception in Method1: " + e);
	      throw e;
	    }
	  }

	  public static void method2() throws Exception {
	    throw new Exception("Exception Thrown in Method2");
	  }
	}
