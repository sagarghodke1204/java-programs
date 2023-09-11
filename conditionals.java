package com.company;
import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {

        Scanner Age = new Scanner(System.in);
        System.out.println("enter Age of Man");
      int age = Age.nextInt();

     /*   if (age>20){
             System.out.println("you are  eligible for marriage ");
         }
        else {
             System.out.println("you are not eligible for marriage");
         }*/


      /*  boolean a = true;
        boolean b = false;
        if (a || b) {
            System.out.println("yes");
        } else {
            System.out.println("no");

       }*/

      /*  if (age>36){
            System.out.println("your at the end of marriage age");
        }
        else if(age<23)
        {
            System.out.println("you are too young for marriage");
        }
        else {
            System.out.println("don't get married");
        }*/

      switch (age){
          case 18:
              System.out.println("your going to join be adult");
              break;
          case 20:
              System.out.println("your are gettting in college");
              break;
          case 24:
                  System.out.println("you are going to get a job");
                  break;
          default:
              System.out.println("enjoy every moment of your life");
      }
        System.out.println("thanks for using my java code");
    }
}