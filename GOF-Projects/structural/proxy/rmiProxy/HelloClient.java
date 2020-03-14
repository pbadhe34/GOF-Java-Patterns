 
import java.applet.Applet; 
import java.awt.Graphics; 
import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.rmi.*;

public class HelloClient
{ 
 
    // "obj" is the identifier that we'll use to refer 
    // to the remote object that implements the "Hello" interface 
     //The stub component on client side pepresents the Remote server Object

     public static void main(String args[]) 
	 { 
	  
	 Hello obj = null;
	 String message = "BLANK";
	 try
	{ 
	     obj = (Hello)Naming.lookup("rmi://LocalHost/MyServer"); 
		 System.out.println("The remote object is  "+obj.getClass().getName());
	     message = obj.sayHello(); 
		 System.out.println("\nMessage from RMI Server is "+message);
	} 
	catch (Exception e)
	{ 
	    System.out.println("HelloClient exception: " + 
				    e.getMessage()); 
	    e.printStackTrace(); 
	} 
    } 

     
}
