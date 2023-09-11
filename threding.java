package com.company;


     class thread1 extends Thread {
         public void run(){
             for (int i = 0; i < 50; i++){
                 System.out.println("Helloo i am from thread1");
             }         }
     }

     class thread2 extends Thread {
         public void run() {
             for (int i = 0; i < 50; i++){
                 System.out.println("Helloo i am from thread2");
             }
         }
     }

public class threding {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t2.start();
        t1.start();

    }
}