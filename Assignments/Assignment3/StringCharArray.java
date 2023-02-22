package Assignment3;

import java.util.Arrays;

public class StringCharArray {
    public static void main(String[] args) {
        // Convert string to character array
        String str = "Convert this to a character array";
        char[] charArray = str.toCharArray();
        System.out.println("Converted character array: " + Arrays.toString(charArray));

        // Convert character array to string
        String convertedString = new String(charArray);
        System.out.println("Converted string: " + convertedString);
    }
}
