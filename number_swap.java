package com.company;

public  class number_swap {

    public static void main(String[] args) {
      /* using temp varible
        int num1=10;
        int num2=3;
        int temp;
        System.out.println("numbers before swaping");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);

        System.out.println("numbers after swaping");
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
*/
      // without  using temp varible
        int num1=10;
        int num2=3;

        System.out.println("numbers before swaping");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("numbers after swaping");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
    }
}
