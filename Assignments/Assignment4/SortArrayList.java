package Assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<>();
    cars.add("Tesla");
    cars.add("BMW");
    cars.add("Mercedes");
    cars.add("Audi");

    System.out.println("Before sorting: " + cars);

    Collections.sort(cars);

    System.out.println("After sorting: " + cars);
  }
}

