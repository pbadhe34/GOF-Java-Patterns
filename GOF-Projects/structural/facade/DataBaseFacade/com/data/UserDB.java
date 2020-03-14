

package com.data;

import java.sql.*;

class UserDB  
{
   private Connection conn;

   boolean InsertUserRecord(User user)throws Exception
	{   
      init();
      // Create a statement to insert user data       
	  String insert = "Insert into UserAccounts(Userid,Name,Balance) values(? , ? ,  ? )" ;
	  PreparedStatement pstmt = conn.prepareStatement(insert);
	  pstmt.setInt(1, user.getId());  
      pstmt.setString(2, user.getName()); 		 
	  pstmt.setDouble(3,user.getBalance()); 
	  int rows = pstmt.executeUpdate(); 
	  pstmt.close();
	  conn.close();
	  if(rows > 0)
		  return true;
	  else
		  return false;	

	}
	boolean removeUserRecord(int id)throws Exception
	{ 
	   init();
      // Create a statement to delete user data       
	  String query = "Delete from UserAccounts where userid="+id ;
	  Statement stmt = conn.createStatement();
	  int rows = stmt.executeUpdate(query);
	  stmt.close();
	  conn.close();
	  if(rows > 0)
		  return true;
	  else
		  return false;	
	}

	private void init()throws Exception
	{
       // Load the Oracle JDBC driver
	 Class.forName("oracle.jdbc.driver.OracleDriver");  
	 System.out.println("Oracle Driver loaded");
	 
     String url = "jdbc:oracle:thin:@Prakash:1521:oracle";  
      // Connect to the database
      conn = DriverManager.getConnection (url, "scott", "tiger");
	  System.out.println("Oracle Driver Connection");
	}


}
