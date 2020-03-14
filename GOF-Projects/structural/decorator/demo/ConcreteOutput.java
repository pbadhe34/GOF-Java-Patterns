  

//Implements the  Component interface 'Output' to print strings to System.out 
                 
 
public class ConcreteOutput implements Output
{    
   // Prints the argument string to System.out     

	public void print(String s)
	{
		System.out.print(s);
	}
}