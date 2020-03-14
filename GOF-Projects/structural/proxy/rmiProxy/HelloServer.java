
import java.rmi.*;
//The server to host the Hello implementation object
class HelloServer 
{
	public static void main(String args[]) 
	{ 
		System.out.println("HelloServer starting");
        try
		{ 
	     HelloImpl obj = new HelloImpl(); 
	    // Bind this object instance to the name "HelloServer" 
	     Naming.rebind("rmi://localhost/MyServer", obj); 
	     System.out.println("HelloServer bound in registry"); 
        } 
		catch (Exception e)
		{ 
	     System.out.println("HelloServer err: " + e.getMessage()); 
	     e.printStackTrace(); 
        } 
    } 
}
