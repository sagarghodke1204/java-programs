package com.company;

public class countingnumber {
    public static void main(String[] args) {
        int num =1234;
        int count=0;

        while(num!=0)
        {
            num = num/10;
            count++;
        }
        System.out.println("total no of digits in number ="+count);
    }
}
