package Lab7;

import java.util.Scanner;

public class BubbleSortStringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list of comma-separated strings: ");
        String input = sc.nextLine();
        String[] str = input.split(",");
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
                if (str[j].compareTo(str[j + 1]) > 0) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted list of strings: ");
        for (String s : str) {
            System.out.println(s.trim());
        }
    }
}
