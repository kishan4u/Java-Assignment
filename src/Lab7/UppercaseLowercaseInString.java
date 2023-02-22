package Lab7;

public class UppercaseLowercaseInString {
    public static void main(String[] args) {
        String characters = "AbCdefGHijklMNOpqRstUVwxyZ@%*234";
        int upperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < characters.length(); i++) {
            char c = characters.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCount++;
            }
        }
        System.out.println("Number of uppercase characters: " + upperCount);
        System.out.println("Number of lowercase characters: " + lowerCount);
    }
}