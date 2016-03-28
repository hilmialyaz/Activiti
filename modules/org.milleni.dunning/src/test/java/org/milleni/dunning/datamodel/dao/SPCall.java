package org.milleni.dunning.datamodel.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SPCall {
 public static void main(String[] args) {
  
  Connection conn = null;
  Statement stmt = null;
  ResultSet rs = null;
  try {
   System.out.println("before class load2");
   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   
   conn = DriverManager.getConnection("jdbc:sqlserver://192.168.2.141:1433;databaseName=dunning_migration","sa","P@ssw0rd34");
   
   System.out.println("Before statement creation2");
   stmt = conn.createStatement();
   String sql = "EXECUTE SPTest";
   rs = stmt.executeQuery(sql);
   
   if(rs.next())
    System.out.println("resultset found");
   else
    System.out.println("resultset not found");
   
   if(rs != null) rs.close();
   if(stmt != null) stmt.close();
   if(conn != null) conn.close();
  } catch (Exception e) {
   e.printStackTrace();
   try{
   if(rs != null) rs.close();
   if(stmt != null) stmt.close();
   if(conn != null) conn.close();
   }catch(Exception ex){}
  }
  System.out.println("finished");
 }
}