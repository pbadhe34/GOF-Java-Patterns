  

/*  
 Intent: Convert the interface of a class into another interface clients
 expect. Adapter lets classes work together that couldn't otherwise because
 incompatible interfaces. 
 
  here the Adaptee can print strings to  System.out.
  The Adapter allows to access Adaptee's functionality
  via Target's interface. 
 
  The Participants and their roles: 
        TestAdpater (Client)
        Writer (Target)
        SystemPrinter (Adaptee)
        PrinterAdapter (Adapter)  
 
  This implementation is of an  object adapter (NOT class adapter),
  The Class adapter requires multiple inheritance which Java does not provide. 
  */
import java.io.*;
public class TestAdapter
{ 
    
  // The Target object      
     	
	private static Writer Target; 
     
     
	public static void main(String[] args) 
	{

		System.out.println("Creating the Adaptee...");
		//The Adaptee   
		MessagePrinter adaptee = new SystemPrinter();

	    System.out.println("Creating the Adapter...");
		Target = new PrinterAdapter(adaptee); //Uses MessagePrinter

		System.out.print ("Are the Adapter and Adaptee the same objects ? ");
		System.out.println(Target.equals(adaptee));

		System.out.println("Issuing the request() to the Adapter...");
		Target.write("Here I want to write the message!"); 

		//Now write to the file
		FilePrinter fp = new FilePrinter(new File("data.txt"));
		adaptee = fp;//cast to MessagePrintr

	    System.out.println("\nCreating the File Adapter to write to file...");
		Target = new PrinterAdapter(adaptee); //Adapt to FilePrinter
		Target.write("Welcome to Adapter!"); 


		
	}
}

/*
To implement the class Adapter we need multiple inheritance support

 Case :The LegacyDatabase  is not compatible with the system that would like to reuse it.
 An abstract base class is defined that specifies the desired interface for the client to use it.
 An "adapter" class is defined that publicly inherits the abstract base class and privately inherits
 the implementation of the LegacyDatabase.
 This adapter class "maps" or "impedance matches" the base interface to the old LegacyDatabase.

 
/////////////////////////// Desired interface for Clients ///////////////////////////
abstract class RDBMS 
{
  public abstract void ManageDB();
};

/////////////////////////// Legacy component ///////////////////////////
class LegacyDatabase
{
  public void StoreTextData();
};

/////////////////////////// Adapter wrapper ///////////////////////////
class LegacyAdapter : public RDBMS, private LegacyDatabase
{
 
  public abstract void ManageDB()
   {
        StoreTextData();//call from another base class
	}
}

public static void main(String [] args)
{
   RDBMS sql = new LegacyAdapter();
   sql.ManageDB();  //internally call the  LegacyDatabase function
}
*/