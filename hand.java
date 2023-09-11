package com.company;

import java.util.Scanner;

public class hand {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 2;
        marks[1] = 3;
        marks[2] = 5;

        Scanner sc = new Scanner((System.in));
        System.out.println("enter index for array");
        int x = sc.nextInt();

        System.out.println("enter number to divide it");
        int y = sc.nextInt();


        try {
            System.out.println("hello");
            try {
                System.out.println("value at entered index is" + marks[x]);
                System.out.println("division by " + y + " is :" + marks[x] / y);
            } catch (ArithmeticException e) {
                System.out.println(" ArithmeticException occured");
                System.out.println(e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(" ArrayIndexOutOfBoundsException occured");
                System.out.println(e);
            }
        }
            catch (Exception e) {
                System.out.println(" some excetion  occured");
                System.out.println(e);
            }
    }


}
