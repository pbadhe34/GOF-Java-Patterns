
package com.data;

public class UserFacade implements DBFacade
{   
	boolean res = false;
	public  boolean addUser(User u)
	{
		try
		 {
			 UserDB db = new UserDB();
			 res = db.InsertUserRecord(u);			 
		 }
		 catch(Exception e )
		 {
             System.out.println("Error in addUser is  "+e.getMessage());
		 }
		 return res;
	}
	public boolean removeUser(int id)
	{
        
		 try
		 {
			 UserDB db = new UserDB();
		     res = db.removeUserRecord(id);
		     
		 }
		 catch(Exception e )
		 {
			 System.out.println("Error in removeUser is  "+e.getMessage());

		 }
		 return res;

	}
	 
}
