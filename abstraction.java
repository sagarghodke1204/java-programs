package com.company;

   interface drone{
        void fly();
        void record();
   }

   abstract class parent implements drone{

      abstract public void greet();

        }

        class child extends parent {
      public void greet(){
           System.out.println("good evening");
       }

            @Override
            public void fly() {
                System.out.println("Drone is flying");
            }
            public void record () {
                System.out.println("Start Recoding now");
            }
        }

public class abstraction {
    public static void main(String[] args) {
        child obj = new child();
        obj.fly();
    }
}
