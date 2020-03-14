 

/*  
 
  Intent:  Provide a surrogate or placeholder for another object to control
  access to it.  
    Participating objects are  OutputImplementation and 
    RequestCounter as  RealSubject  and  Proxy respectively.
  
   Both implement the  OutputSubject interface which represents the Subject interface.
  
   The main method here issues three different kinds of requests to
   the  RealSubject OutputImplementation twice.  
    SAFE requests are not affected
    REGULAR request are counted
    UNSAFE requests are blocked entirely. 
  
  The Proxy needs to implement all methods of OutputSubject even those it is not interested in. 
  They need to be aware of their role in the pattern.
  
 */

public class TestProxy 
{     
	static int count = 0;
	public static OutputSubject getSubject()
	{
		OutputSubject subject= null;
		
		OutputSubject real          = new OutputImplementation();
		OutputSubject countingProxy = new RequestCounter(real);
		OutputSubject blockingProxy = new RequestBlocker(countingProxy);

		switch(count)
		{
        case 0:
			subject = real;            
            break;
		case 1:
			subject = countingProxy;
            break;
		case 2:
			subject = blockingProxy;
            break;
		default :
            subject = real;
            break;
		}
		++count;
		return subject;
	  }
	 
      
	public static void main (String[] args) 
	{ 	 
		
		OutputSubject data = getSubject();
		System.out.println("\nThe subject is  "+data);			
		data.safeRequest("Safe Reqeust");
		
		
		data = getSubject();
		System.out.println("\nThe subject is  "+data);
		data.safeRequest("Safe Reqeust");
		

		data = getSubject();	
		System.out.println("\nThe subject is  "+data);
		data.safeRequest("Safe Reqeust");
			 
		 
	}
}
