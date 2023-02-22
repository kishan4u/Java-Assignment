package Lab13;

import java.util.TreeSet;

public class TreeSetMinMaxExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        // Adding elements to the set
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        // Getting the lowest value in the set
        int min = set.first();
        System.out.println("Lowest value: " + min);

        // Getting the highest value in the set
        int max = set.last();
        System.out.println("Highest value: " + max);
    }
}
