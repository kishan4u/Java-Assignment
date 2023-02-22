package Lab13;

import java.util.TreeSet;

public class TreeSetToArrayExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        // Adding elements to the set
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        // Converting the TreeSet to an integer array
        Integer[] intArray = set.toArray(new Integer[set.size()]);

        System.out.println("Integer array: ");
        for (Integer i : intArray) {
            System.out.print(i + " ");
        }
    }
}
