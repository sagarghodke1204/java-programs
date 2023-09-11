package com.company;
import java.util.Scanner;

public class trick {

    public static int maximum(int[]number){
        int max=0;

        for(int x: number ){
            if(x>max){
                max=x;
            }
        }return max;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int [] arr = new int[4];
        System.out.println("enter array elements");
         for(int i =0; i<4; i++){
             arr[i]=sc.nextInt();
         }
        System.out.println(maximum(arr));



    }
}
