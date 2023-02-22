package Assignment2;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
