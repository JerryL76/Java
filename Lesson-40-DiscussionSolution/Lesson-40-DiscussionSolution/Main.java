import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; ServerExample.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {
      // Review the database class, how it's instantiated 
    
      //Discuss the jar file 
      // Disucss that the database must be in one of our files in the project.

      String queryResult="";

      //Instatiate a Database object which will be used to connect an communicate with or
		  Database   db =  new  Database("jdbc:sqlite:cr101.db" );		
    
	    String sql = "Select * From cr101 Where studentId='STUDENT1' ;";	

      queryResult = db.runSQL(sql,"table-auto");

      print(queryResult);

      print("*************************");
      //Only display the first 5 records
      sql = "Select * From cr101 Where studentId='STUDENT1' Limit 5;";	
      queryResult = db.runSQL(sql,"table-auto");

      print(queryResult);
      print("===========================");

      sql = "Select distinct teacher1, course  From  cr101 Where room=106 and period = 3;";	
      queryResult = db.runSQL(sql,"table-auto");

      print(queryResult);


      // Review how to compile and run the code
      
      
      }    
}