 
 
/*
   Decorator Pattern
   Intent:  Attach additional responsibilities to an object dynamically. 
   Decorators provide a flexible alternative to subclassing for extending 
   functionality. 
 
   Participating classes are  Output as  Components,
   ConcreteOutput as  ConcreteComponent. 
   The decorators  are  OutputDecorator  as  Decorator, and StarDecorator  and  BracketDecorator as ConcreteDecorators.
 
   The concrete decorator (ConcreteOutput) prints a string, Decorators (StarDecorator and BracketDecorator) wrap other
   output around it. Output should be: "[ *** <String> *** ]"
  
 */
 
public class TestDecorator
{
  /*
    The concrete decorator (ConcreteOutput) prints a string, 
	Decorators (StarDecorator and BracketDecorator) wrap the
    ConcreteOutput around it.  
   */
	
	public static void main(String[] args)
	{
	    
		Output original = new ConcreteOutput();
		Output bracketed= new BracketDecorator(original);
		Output stared   = new StarDecorator(bracketed);

		original.print("Welcome!"); 
		System.out.println();

		stared.print("Welcome!"); 
		System.out.println();

		bracketed.print("Welcome!"); 		
		System.out.println();
	}
}