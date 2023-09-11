package com.company;

import java.util.Scanner;

public class traverse {

     public boolean duplicate(int[]nums){

         Arrays.sort(nums);

         for (int i=0; i<nums.length-1; i++){

             if(nums[i] ==nums[i+1]){
                 return true;
             }
         }
         return false;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int [] nums = new int[5];
        int x =sc.nextInt();
        for (int i=0; i<x; i++){
            nums[i]= sc.nextInt();
        }
        traverse obj = new traverse();
        obj.duplicate(nums);
    }
}
