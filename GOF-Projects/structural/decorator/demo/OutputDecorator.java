  
/* 
 This is the  Decorator  interface. It is realized as an abstract 
 class to allow for default implementations (set varible "output", 
 to provide default implementation for  print(String).  
 */  
                       
public abstract class OutputDecorator implements Output 
{
     
   //Component to decorate    

	protected Output outputComponent;

	 //Define the constructor.     
 
 	public OutputDecorator(Output comp) 
	{
		outputComponent = comp;
	}
	
     /*
     Print the argument string to System.out. This method is
     overriden by concrete subclass decorators. The default implementation
     forwards the method call to the decorated Component.     
     */

	  /*
	  provides a default implementation so that concrete decorators subclasses don't have to 
      re-implement it. Subclasses  can just call  super(..)  and don't have to deal with setting the 
	  variable themselves.
      */

	public void print(String s) 
	{ 
		System.out.println("Before Printing");
		outputComponent.print(s);
		System.out.println("After Printing");
	}
	
    
    
}