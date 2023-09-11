package com.company;
import java.util.Scanner;

public class problem {
    public static void main(String[] args) {

       String [] arr= new String[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hername");
        arr[0]= sc.next();

        System.out.println("Enter Hisname");
        arr[1]=sc.next();

        System.out.println("what are they doing");
        arr[2]=sc.next();

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
