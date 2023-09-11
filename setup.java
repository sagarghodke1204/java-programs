package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class setup {

    String Database;
    String tablename;
    int  column_no;
   /* String [] columnname;
    String [] datatype;
    String [] size;*/
    String columnname = "sagar";
    String datatype = "varchar";
    String size = "12";

    Scanner sc = new Scanner(System.in);


   /* public  void createdatabase() {
          System.out.println("please provide Database name to be created");
          Database = sc.next();

       try {
            // conection establish

            String url = "jdbc:mysql:///";
            String username ="root";
            String password ="Sagar@321";

            Connection connect = DriverManager.getConnection(url,username,password);
            Statement state    = connect.createStatement(); // create statement
            System.out.println("connection succesffull !");

            String Query = "create database "+Database; //execute query
            state.execute(Query);

           System.out.println("Database created Successfully !");

            connect.close(); //connection close

        }catch (Exception e){
            System.out.println(e);
        }
    } */

             public void createtable(){

            System.out.println("Enter table name");
             tablename = sc.next();

      /*       System.out.println("Enter no of columns to be created");
             column_no= sc.nextInt();

             for (int i=0; i<column_no; i++){
                 System.out.println("Enter names of columns");
                 columnname[i]=sc.next();

                 System.out.println("Enter dataypes of columns");
                 datatype[i]=sc.next();

                 System.out.println("Enter size of columns");
                 size[i]=sc.next();

             } */

             try {
                 // conection establish

                 String url = "jdbc:mysql:///demo";
                /// String db  = "demo";
                 String username ="root";
                 String password ="Sagar@321";

                 Connection connect = DriverManager.getConnection(url,username,password);
                 Statement state    = connect.createStatement(); // create statement
              //

                 String sql = "CREATE TABLE tablename"+
                         "(id INTEGER not NULL, " +
                         " first VARCHAR(255), " +
                         " age INTEGER)";
                 state.executeUpdate(sql);
                 System.out.println(tablename+"created succesffull !");
                 connect.close(); //connection close

             }catch (Exception e){
                 System.out.println(e);
             }

         }


}

