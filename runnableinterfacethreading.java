package com.company;

class rt1 implements Runnable{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("i am runnable thread from rt1");
            i++;
        }

    }
}
class rt2 implements Runnable{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("i am runnable thread from rt2");
            i++;
        }

    }
}


public class runnableinterfacethreading {

    public static void main(String[]args){

        rt1 t1 = new rt1();
        Thread t3 = new Thread(t1);

        rt2 t2 = new rt2();
        Thread t4 = new Thread (t2);

        t3.start();
        t4.start();

    }

}
