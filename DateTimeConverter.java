package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date/time (HH-MM-YYYY hh:mm:ss): ");
        String inputDateTime = scanner.nextLine();
        scanner.close();

        SimpleDateFormat inputFormat = new SimpleDateFormat("HH-MM-yyyy HH:mm:ss");
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss yyyy-MM-dd");

        try {
            Date date = inputFormat.parse(inputDateTime);
            String convertedDateTime = outputFormat.format(date);
            System.out.println("Converted Date/Time: " + convertedDateTime);
        } catch (ParseException e) {
            System.out.println("Invalid input format. Please enter date/time in the format HH-MM-YYYY hh:mm:ss");
        }
    }
}

