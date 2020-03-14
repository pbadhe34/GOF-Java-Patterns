 
/*
   Defines the Subject interface that is implemented by  
   RequestCounter,RequestBlocker and  OutputImplementation.  
 */  
 
public interface OutputSubject
{ 
   //A type of <i>request(..)     
     
	public void safeRequest(String s);     
    
   //another type of  request(..)      

	public void regularRequest(String s);
	
	//third type of  request(..)

	public void unsafeRequest(String s);

}