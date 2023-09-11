package com.company;

import com.sun.jdi.request.ExceptionRequest;

import java.util.Arrays;
import java.util.Scanner;

public class arrayproblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the array elements");
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered values in array are :" + Arrays.toString(arr));
        int i = 0;
        while (true && i<5) {
            try {
                System.out.println("Enter the index of the array that you want to get");
                int index = sc.nextInt();
                System.out.println(arr[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            i++;
        }
    }
}