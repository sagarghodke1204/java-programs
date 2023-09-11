package com.company;
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
     Scanner Sagar = new Scanner(System.in);
     System.out.println("Enter First Number");
     int x = Sagar.nextInt();
     System.out.println("Enter second number");
     int y = Sagar.nextInt();
     int sum = x+y ;
     System.out.println( "sum of Entered number is "+sum);
}
}