 

 
 //Acts as Proxy.It implements the OutputSubject interface.
    

public class RequestCounter implements OutputSubject
{ 
	//A reference to the  Subject used to forward requests to     
     
	private OutputSubject realSubject; 
	//An internal counter for the number of calls to print(String).	 
	 
	private int regularRequests = 0;	
	
    
  // Creates a new  RequestCounter with the given Subject.     

	public RequestCounter(OutputSubject subject) 
	{
		this.realSubject = subject;
	}
	 
   
	// Forwards the request to its subject.       
     
	public void safeRequest(String s)
	{
		System.out.println("[RequestCounter:] Not interested in safe " +
			" requests, but must implement anyway");	
		realSubject.safeRequest(s);                                               
			
	}
	
	 
     //Forwards the request to its subject and prints 
     // out how many times the  request has been called so far.	  

	public void regularRequest(String s)
	{
		regularRequests++;		                                             
		System.out.println("[RequestCounter:] That was regular request number. " + regularRequests);	
		realSubject.regularRequest(s);   
	}

	 
	 //Forwards the request to its subject
	  
	public void unsafeRequest(String s)
	{                                  
		System.out.println("[RequestCounter:] Not interested in unsafe requests, but must implement anyway");		
		realSubject.unsafeRequest(s); 
	}
	//Return the String Representation
	public String toString()
	{
            return "RequestCounterProxy";
	}
	
}