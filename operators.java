package com.company;
import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        System.out.println("**** Let's study operator");
        Scanner operator = new Scanner(System.in);
        System.out.println("Enter a value for variable x");
        int x = operator.nextInt();
        System.out.println("Enter another value for variable y ");
        int y = operator.nextInt();
        // arthimetic operator
        int z = x+y;
        System.out.println("arithmetic operator output "+z);
        System.out.println("*******************");
        System.out.println("enter values for variable s");
        float s = operator.nextInt();
        float v = z%s;
        System.out.println("modulo's output"+v);

        //assignment operator
        System.out.println("assignment operator");
        int a = 34;
                 a +=4;
        System.out.println(a);
        System.out.println(78==34);

       //logical operator
        System.out.println(56<<67);
        System.out.println(78>56 || 78>5);
    }
}
