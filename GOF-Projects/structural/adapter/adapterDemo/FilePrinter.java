 
 
 /*
 Provides a specialized writeMessage method. Acts as the Adaptee in the 
 Adapter pattern context.
 */  
 import java.io.*;

public class FilePrinter implements MessagePrinter
{
    /*
     Writes the argument meassage string to  System.out .
     In the pattern  context, this is the  specificRequest( method on 
     the  Adaptee
	 */       
     private File file= null;

	 public FilePrinter(File f)
	 {
          file = f;
	 }

	public void writeMessage(String s) 
	{
		
		try
		{
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeBytes(s);
		}
		catch(IOException ioe)
		{

		}
	}
}