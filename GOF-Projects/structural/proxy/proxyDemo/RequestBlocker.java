 
 
 //Acts as  Proxy and implements the OutputSubject  interface.
  

public class RequestBlocker implements OutputSubject
{ 
    //a reference to the Subject used to forward requests to      
     
	private OutputSubject realSubject; 
     
  // Creates a new  RequestBlocker  with the given Subject.     

	public RequestBlocker(OutputSubject subject)
	{
		this.realSubject = subject;
	}      
	
    /* 
	 * Forwards the request to its subject. We are not interested in
	 * this kind of request, but must implement the method (and the 
	 * request forwarding) anyway since the method is part of the 
	 * OutputSubject interface.
     */
     
	public void safeRequest(String s)
	{
		System.out.println("[RequestBlocker:] " + s + "  blocking");	
		//realSubject.safeRequest(s);                                                
		//System.out.println("[RequestBlocker:] Not interested in safe requests  but must implement anyway");		
	}
	
	/*
	 * Forwards the request to its subject. We are not interested in
	 * this kind of request, but must implement the method (and the 
	 * request forwarding) anyway since the method is part of the 
	 *  OutputSubject  interface.	 
	 */

	public void regularRequest(String s) 
	{
		realSubject.regularRequest(s);                                                
		System.out.println("[RequestBlocker:] Not interested in regular requests but must implement anyway");		
	}

	 
	// Blocks unsafe requests.	 

	public void unsafeRequest(String s)
	{
		//realSubject.unsafeRequest(s);                                                
		System.out.println("[RequestBlocker:] " + s + "  blocking");		
	}
	//Return the String Representation
	public String toString()
	{
            return "RequestBlockerProxy";
	}
	
}