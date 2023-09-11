package com.company;

public class custom {
    public static void main(String[] args) {

        student sagar = new student();
        sagar.name="sagar";
        sagar.roll_no=66;
        sagar.fees=3456;

        sagar.printDetails();

    }
}

   class student {
    String name ;
    int roll_no;
    int fees;
    public void printDetails(){
        System.out.println("Student's name is "+ name);
        System.out.println("Student's roll_no is "+ roll_no);
    }
   }