package Assignment3;

public class ArithmeticExceptionExample {
    public static void divideByZero() throws ArithmeticException {
        int x = 10;
        int y = 0;
        int result = x / y;
    }

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}