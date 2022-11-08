package com.Utill;

 
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;



public class UtilConnection {
  public static Connection cn=null;
  public static Statement st=null;
  public static ResultSet resultSet=null;
  public static Properties properties=null;
  static{
	 
	  try {
		  properties =new Properties();
		properties.load(UtilConnection.class.getClassLoader().getResourceAsStream("DB"));
		
		Class.forName(properties.getProperty("Driver"));
		cn=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));

		
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
  }
  
  public static Connection getConnection() {
     return cn;
     
  }
  
  public static void close(Connection cn,Statement st) {
	  
  }
 public static void close(Connection cn,Statement st, ResultSet resultSet) {
	 
 }
   public static void main(String args[]) {
	   System.out.println(getConnection());
	   
   }
     
    

  
}
