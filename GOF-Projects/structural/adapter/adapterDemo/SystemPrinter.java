 
 
 /*
 Provide a specialized writeMessage method. Acts as the Adaptee in the 
 Adapter pattern context.
 */  
 
public class SystemPrinter implements MessagePrinter
{
    /*
     Writes the argument meassage string to  System.out .
     In the pattern  context, this is the  specificRequest( method on 
     the  Adaptee
	 */       

	public void writeMessage(String s) 
	{
		System.out.println(s);
	}
}