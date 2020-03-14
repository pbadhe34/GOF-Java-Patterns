 

  /*
   Represents an  Object Adapter. Implements the Target interface
   and stores a private variable of type  Adaptee SystemOutWriter to which it forwards appropriate 
   method calls.  
   It is not possible to use a class adapter in Java as it requires multiple inheritance. 
   */
 
public class PrinterAdapter implements Writer
{ 
      
    //The adaptee variable to forward the appropriate messages to.    
     
	private MessagePrinter adaptee = null;
    
     //Create a new Adapter for a given Adaptee.    
     

    public PrinterAdapter(MessagePrinter adaptee)
	{
        this.adaptee = adaptee;
    }	
	 
	  /*
	   Implements the Target interface. This is where the actual
	   adaption happens: calls to write(String) invoke calls
	   to writeMessage(String) on the adaptee.
	   */     
	
	public void write(String message)
	{
		adaptee.writeMessage(message);
	}
}