package com.company;

public class break_continue {
    public static void main(String[] args) {
        //Break and continue using loops
        for (int x = 5; x < 10; x++) {
            System.out.println(x);
            System.out.println("breaking loop");
            if (x==7){
                System.out.println("let's end it now");
                break;
            }

        }
    }
}