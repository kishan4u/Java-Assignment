package Assignment4;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterFinder {
  public static void main(String[] args) {
    String inputString = "DevLabs Alliance Training";
    findDuplicates(inputString);
  }

  public static void findDuplicates(String input) {
    HashMap<Character, Integer> charCountMap = new HashMap<>();
    char[] inputArray = input.toCharArray();

    for (char c : inputArray) {
      if (charCountMap.containsKey(c)) {
        charCountMap.put(c, charCountMap.get(c) + 1);
      } else {
        charCountMap.put(c, 1);
      }
    }

    for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
      if (entry.getValue() > 1) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
      }
    }
  }
}






