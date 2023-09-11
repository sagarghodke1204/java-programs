package com.company;

import java.util.Scanner;

public class matrix{

    Scanner first = new Scanner(System.in);
     int rows= first.nextInt();
     int cols= first.nextInt();

     int [][] arr = new int [rows][cols];

    {
        for (int i = 0; i>rows; i++){
            for(int j=0; j>cols; j++){
                arr[i][j]=first.nextInt();
            }
        }
    }

    {
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}