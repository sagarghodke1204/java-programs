package com.company;
import java.util.Scanner;
public class percentagecalculator {
    public static void main(String[] args) {
        System.out.println("*** percentage calculator ***");
        Scanner calculator = new Scanner(System.in);
        System.out.println("enter maths marks");
        int maths = calculator.nextInt();
        System.out.println("enter science marks");
        int science = calculator.nextInt();
        System.out.println("enter social science");
        int socialscience = calculator.nextInt();
        System.out.println("enter language marks");
        int language = calculator.nextInt();
        float mean = maths+science+socialscience+language /400;
        float percentage = mean*100;
        System.out.println("PERCENTAGE OF STUDENT IS "+percentage);

    }
}
