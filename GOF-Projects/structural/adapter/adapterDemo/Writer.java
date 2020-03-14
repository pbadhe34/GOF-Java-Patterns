 

 
 //This is  the target interface with a general output method. 
 //Acts as the Target in the Adpater pattern.
  
 
public interface Writer
{
	   
   //Prints the argument string,this is the request() method on the Target      
     
	public void write(String s);
}