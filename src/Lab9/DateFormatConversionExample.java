package Lab9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatConversionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date in dd/mm/yyyy format: ");
        String input = sc.nextLine();
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date date = inputFormat.parse(input);
            System.out.println("Date in yyyy/mm/dd format: " + outputFormat.format(date));
        } catch (ParseException e) {
            System.out.println("Invalid date format. Exception message: " + e.getMessage());
        }
    }   
}