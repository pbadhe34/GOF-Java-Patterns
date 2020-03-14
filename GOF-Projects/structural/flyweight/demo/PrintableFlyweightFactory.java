 

import java.util.Hashtable;

 
 //Defines a  FlyweightFactory that follows a creation-on-demand policy.
 

public class PrintableFlyweightFactory
{ 
    
     
   //stores the existing flyweights by character they represent   

	private Hashtable printables = new Hashtable();

    /* 
     Returns the flyweight representing the argument character.
     If the appropriate flyweight does not yet exist, it is created 
     on demand.
     parameter c the character for which the the flyweight is returned
     returns the  Flyweight  representing the argument character
     */

	public PrintableFlyweight getPrintableFlyweight(char c)
	{
		Character ch = new Character(c); 
		
		if (printables.containsKey(ch))
		{
			System.out.println("The char is available in Flyweight   "+ch);
			PrintableFlyweight pw = (PrintableFlyweight) printables.get(ch); 
			return pw;
		} 
	else {
			PrintableFlyweight flyweight = null;
			if (Character.isWhitespace(c))
			{
				System.out.println("The char is Whitespace   "+c);
				flyweight = new WhitespaceFlyweight(c);
			} 
			else 
			{ 				
				flyweight = new CharacterFlyweight(c);
			}
		   System.out.println("The char is added in Flyweight   "+ch);
		   printables.put(ch, flyweight);
		   return flyweight; 
		} 
	}
}			