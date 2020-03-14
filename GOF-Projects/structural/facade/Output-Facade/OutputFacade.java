 

/*
   Implements the Facade role in the pattern by providing a 
   higher-level class invoking the operations provided by 
   RegularScreen, Decoration and StringConverter classes.  
 */
 
public class OutputFacade
{     
    //Prints a string using  RegularScreen     

    public void printNormal(String s)
	{
        RegularScreen.print(s);
        RegularScreen.newline();
    }                        
    
     //Prints a two versions of string with decorations 
     //using  RegularScreen  and  Decoration.      

    public void printFancy(String s)
	{
		printDecoration();

        RegularScreen.print(StringConverter.convertToUpper(s+" (uppercase)"));
        RegularScreen.newline();

		printDecoration();

        RegularScreen.print(StringConverter.convertToLower(s+" (LOwER)"));
        RegularScreen.newline();        
		printDecoration();
    }

	 
	 // Prints a decorator string.	  

	public void printDecoration()
	{
		RegularScreen.print(Decoration.getDecoration());
		RegularScreen.newline();
		RegularScreen.newline();
	}
}