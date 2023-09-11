package com.company;

public class Arrays {
    public static void main(String[] args) {
        //there are three ways to create array
        //1. declare and then memory allocation
        int [] marks;
        marks = new int [5];
        marks [0] = 1;
        marks [1] = 2;
        System.out.println(marks[1]);

        // declare and memory allocation
        String [] name = new String[2];
        name [0]= "sagar";
        name [1]= "Arpita";
        //name [2]= "aryan";
        System.out.println(name[0]);

        //declare and intialization
        boolean [] check = {true,false};
        System.out.println(check[0]);


    }

    public static void sort(int[] nums) {
    }
}
