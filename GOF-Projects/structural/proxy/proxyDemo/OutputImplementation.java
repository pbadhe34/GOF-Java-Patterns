 
 // Acts as  RealSubject and implements the OutputSubjec interface.  

public class OutputImplementation implements OutputSubject 
{
 
	// A type of  request(..).Prints the argument string to System.out   
     
	public void safeRequest(String s) 
	{
		System.out.println("[RealSubject.safeRequest()]: "+s);
	}

	//Second type of  request(..).Prints the argument string to System.out 

	public void regularRequest(String s) 
	{
		System.out.println("[RealSubject.regularRequest()]: "+s);
	}
		
	//Third type of  request(..).Prints the argument string to System.out 

	public void unsafeRequest(String s)
	{
		System.out.println("[RealSubject.unsafeRequest()]: "+s);
	}
	//Return the String Representation
	public String toString()
	{
            return "RealSubject";
	}
}