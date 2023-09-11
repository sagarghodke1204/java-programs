package com.company;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class array_printing {
    public static void main(String[] args) {
        int arr [] = new int[5];
        arr[0]=1;
        arr[1]=5;
        arr[2]=4;
        arr[3]=3;
        arr[4]=2;

        //1. Using for loop
           for(int i=0; i<5; i++) {
            System.out.println(arr[i]);
        }

        //2. Using for each loop
        for (int str : arr)
        {
            System.out.println("*** Using for each loop ****");
            System.out.println(str);
        }

        //3.Using Arrays.toStringmethod(arr);
        System.out.println("*** Using Arrays.toStringmethod ****");
        System.out.println(Arrays.toString(arr));

        //4. Using Arrays.aslist(arr);
        System.out.println("*** Using Arrays.asList() ****");
        int[] stringArray={1,2,3};
        System.out.println(Arrays.asList(stringArray));

        //5. Using Iterator interface
        Integer ar[] ={1,3,4};
        Iterator<Integer>IT = Arrays.asList(ar).iterator();
        while (IT.hasNext()){
            System.out.println(IT.next());
        }

    }
}

