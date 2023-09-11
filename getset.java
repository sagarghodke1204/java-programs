package com.company;

class myEmpolyee{
    private int id;
    private String name;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setId(int i){
        id =i;
    }
    public int getId(){
        return id;
    }

}

public class getset {
    public static void main(String[] args) {
      myEmpolyee info = new myEmpolyee();
      info.setName("sagar");
      info.setId(66);
        System.out.println(info.getName());
        System.out.println(info.getId());
    }
}
