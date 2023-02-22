package Assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    System.out.println("Original ArrayList: " + numbers);

    Collections.reverse(numbers);

    System.out.println("Reversed ArrayList: " + numbers);
  }
}
