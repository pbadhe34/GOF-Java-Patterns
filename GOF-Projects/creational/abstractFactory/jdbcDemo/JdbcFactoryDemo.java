   
   import java.sql.*;
   import sun.jdbc.odbc.*; 


          /*
           Syntax for using Oracle jdbc Driver
           driverName="oracle.jdbc.driver.OracleDriver"
           URL="jdbc:oracle:thin:@Prakash:1521:oracle" where oracle is the host string/service id
           user="scott" Password="tiger"           
		  */

   public class JdbcFactoryDemo 
   {
    public static void main(String args[])
     {
     try
	  {		
		 //Access database Connection
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");		 
        Connection con = DriverManager.getConnection("jdbc:odbc:UserDsn");

        //Oracle database Connection
		//Class.forName("oracle.jdbc.driver.OracleDriver");		 
        //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Prakash:1521:oracle","scott","tiger");

		System.out.println("Database connection is  : "+con);
        Statement selectAll = con.createStatement();
		System.out.println("Jdbc statement is  : "+selectAll);
        String sql = "Select * from UserDetails";
        ResultSet res = selectAll.executeQuery(sql);
		System.out.println("Jdbc ResultSet is  : "+res);
        if(res == null)
          {
           System.out.println("No ResultSet Found");
           System.exit(0);
          }	  	  
             
          res.close();
          selectAll.close(); 
          con.close();
       }

     catch(Exception e)
      {
         System.out.println("Exception in JdbcFactoryDemo is  "+e.getMessage());
      }
 }  
}

/*
create table UserDetails(Number number, Name varchar(20) , Password varchar(16),Balance float,primary key(Number));
*/