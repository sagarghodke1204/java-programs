package com.company;

import java.util.Scanner;

public class ara {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x [] =  new int[100];

        System.out.println("Enter no of elements you want  to store in an array");
        int y = sc.nextInt();

        for (int i=0; i<y; i++){
            System.out.println("Enter the elements of array");
            x[i]= sc.nextInt();
        }

        System.out.println("The elements you entered are as follow:");
        for(int i=0; i<y; i++){
            System.out.println(x[i]);
        }
    }
}
