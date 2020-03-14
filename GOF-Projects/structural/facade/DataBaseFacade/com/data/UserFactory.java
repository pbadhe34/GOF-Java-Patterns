
package com.data;

public class UserFactory
{
	public  static DBFacade getFacade()
	{
         return new UserFacade();
	}
}
