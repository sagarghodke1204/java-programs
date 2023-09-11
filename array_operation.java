package com.company;

public class array_operation{
    public static void main (String[]array){
        int [] classroom;
        classroom = new int[3];
        classroom[1]=1;
        classroom[1]=12;
        classroom[0]=3;
        classroom[2]=3;
        System.out.println(classroom[1]);
        System.out.println(classroom.length);

        String[]Roommates = new String [5];
        Roommates[0]="abhi";
        Roommates[1]="Sagar";
        Roommates[2]="Madhav";
        Roommates[3]="anurag";
        Roommates[4]="Aryan";

        //using for loop displaying array
        for (int i=0; i<Roommates.length; i++){
            System.out.println(Roommates[i]);
        }

        // printing elements in reverse order
        for (int i=Roommates.length-1; i>=0; i--){
            System.out.println(Roommates[i]);
        }

       //printing using for each loop
       for(String sagar: Roommates){
           System.out.println(sagar);
       }
    }

}
