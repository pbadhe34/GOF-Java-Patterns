 

import java.rmi.*; 
import java.rmi.server.UnicastRemoteObject;

 
public class HelloImpl extends UnicastRemoteObject   implements Hello
{

    public HelloImpl() throws RemoteException
    {
        super();
    }

    public String sayHello()
	{
		System.out.println("HelloImpl object method sayHello() is called on server side ");
        return  "Hello World!";
    }

      
}
