package Assignment3;

public class StringContains {
    public static void main(String[] args) {
        String str = "A brown fox ran away fast";
        if (str.contains("brown")) {
            System.out.println("The word 'brown' is present in the string");
        } else {
            System.out.println("The word 'brown' is not present in the string");
        }
    }
}
