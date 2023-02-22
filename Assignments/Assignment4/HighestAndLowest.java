package Assignment4;

import java.util.TreeSet;

public class HighestAndLowest {
  public static void main(String[] args) {
    TreeSet<Integer> treeSet = new TreeSet<>();
    treeSet.add(100);
    treeSet.add(200);
    treeSet.add(300);
    treeSet.add(400);
    treeSet.add(500);
    
    int lowestValue = treeSet.first();
    int highestValue = treeSet.last();
    
    System.out.println("Lowest value in TreeSet: " + lowestValue);
    System.out.println("Highest value in TreeSet: " + highestValue);
  }
}