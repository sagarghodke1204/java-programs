package com.company;

class Employes{
   private int id;
   private String name;

   public Employes(){
      id=65;
       name="sagar";
   }
   public Employes(int i, String n){
       id=i;
       name=n;
   }

    public int getId(){
        return id;
    }
    public void setName(String x){
        name= x;
    }
    public String getName (){
        return name;
    }
    public void setId( int i){
        id=i;
    }
}

public class constructors {
    public static void main(String[] args) {
     // Employes info= new Employes(66,"sagar");
      Employes info= new Employes();
     /* info.setId(66);

      info.setName("sagar");*/ //<--instead of calling this we are using constructors-->
        System.out.println(info.getId());
        System.out.println(info.getName());

    }
}
