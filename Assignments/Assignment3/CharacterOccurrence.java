package Assignment3;

import java.util.HashMap;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String str = "DevLabs Alliance Training";
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        for (char c : charCount.keySet()) {
            System.out.println("Character " + c + " occurs " + charCount.get(c) + " times");
        }
    }
}
