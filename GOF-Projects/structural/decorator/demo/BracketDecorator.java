 
 
 
 //Implements a decorator that adds brackets ("[", "]") before and after the string to decorate.
  
         
public class BracketDecorator extends OutputDecorator
{
 
  //Creates a BracketDecorator for the given output component     

	public BracketDecorator(Output output)
	{
		super(output);
	}

    /*
     Adds brackets before and after the argument string before passing
     the call on to the component this decorator decorates.      
     */

	public void print(String s)
	{
		outputComponent.print("[");
		outputComponent.print(s);
		outputComponent.print("]");
	}
     
    
}