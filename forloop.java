package com.company;
import java.util.Scanner;

public class forloop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n ");
        int n = sc.nextInt();

        for ( int i=1; i<=n; i++){
            int x = (2*i)-1;
            System.out.println(x);
        }

    }

}
