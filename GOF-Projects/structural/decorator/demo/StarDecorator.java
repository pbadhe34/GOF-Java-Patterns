 
 /*
 Implements a decorator that adds stars (" *** ") before and after the
 string to decorate. 
 */  
         

public class StarDecorator extends OutputDecorator 
{

   // Creates a StarDecorator for the given output component      

	public StarDecorator(Output output)
	{
		super(output);
	}

     /*
     Adds three stars before and after the argument string before passing
     the call on to the component this decorator decorates.       
     */

	public void print(String s)
	{
		outputComponent.print(" *** " + s + " *** ");
	}

    
   

}