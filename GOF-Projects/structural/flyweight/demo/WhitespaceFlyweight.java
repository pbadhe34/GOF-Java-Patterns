  
 
 
 //A  ConcreteFlyweight storing a single whitespace character
  

public class WhitespaceFlyweight implements PrintableFlyweight
{
    
    // The character this flyweight represents     
     
	private char c;	
    
     //Creates a new flyweight and sets it to represent a particular whitespace character     

	public WhitespaceFlyweight(char c)
	{
		this.c = c;
	}	
	 
	 //Prints the stored character.	 
     
	public void printChar(boolean uppercase)
	{
		System.out.print(uppercase ? Character.toUpperCase(c) : c);
	}
}