package Assignment4;

import java.util.HashSet;
import java.util.Objects;

public class CopyElements {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();
    set.add("dog");
    set.add("cat");
    set.add("mouse");

    Object[] arr = set.toArray();
    for (Object obj : arr) {
      System.out.println(obj);
    }
  }
}

