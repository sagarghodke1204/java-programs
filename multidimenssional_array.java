package com.company;

public class multidimenssional_array{
    public static void main (String[]MA) {
       /* String[][] classrooms = new String[2][3];
        classrooms[0][0] = "div a";
        classrooms[0][1] = "div b";
        classrooms[0][2] = "div b";
        classrooms[1][0] = "div b";
        classrooms[1][1] = "div ";
        classrooms[1][2] = "div ";*/

        int[][]flats=new int [2][3];
      /*flats[0][0]=12;
        flats[0][1]=23;
        flats[0][2]=34;
        flats[1][0]=32;
        flats[1][1]=56;
        flats[1][2]=65;*/

        {
            for (int i=0;i<flats.length; i++)
          for (int j=0; j<flats[i].length; j++){
              System.out.print(flats[i][j]+" ");
        }
                      System.out.println();
        {
            //System.out.println(classrooms[1][1]);

        }

      /*or (int i = 0; i < classrooms.length; i++)
            for (int j = 0; j < classrooms[i].length; j++) {
                System.out.print(classrooms[i][j]);
                System.out.print(" ");
            }
        System.out.println("");*/
    }
}}