package com.company;
import java.util.Scanner;

public class password_check {

    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter password");
    String password = sc.next();

    boolean hasUppercase=false;
    boolean haslowercase=false;
    boolean hasnumbercase=false;
    boolean hasspecialcase=false;

    for (char c : password.toCharArray()){
        if(Character.isLowerCase(c)){
            haslowercase=true;
        }else if( Character.isUpperCase(c)){
            hasUppercase=true;
        }else if(Character.isDigit(c)){
            hasnumbercase=true;
        }
        if ("@$#!".indexOf(c) != -1) {
            hasspecialcase = true;
        }
    }

    if(password.length()==8 && haslowercase && hasnumbercase && hasspecialcase && hasUppercase){
        System.out.println("yes");
    }else {
        System.out.println("no");
    }


    }

}
