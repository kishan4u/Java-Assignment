package Assignment3;

public class NestedTryExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            int x = 10;
            int y = 0;

            try {
                int result = x / y;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero.");
            }

            try {
                System.out.println("Accessing element 6: " + numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array index out of bounds.");
            }
        } catch (Exception e) {
            System.out.println("Error: An unexpected error has occurred.");
        }
    }
}
