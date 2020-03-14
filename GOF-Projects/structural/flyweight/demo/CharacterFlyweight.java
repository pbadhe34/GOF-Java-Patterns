 
/*
 A  ConcreteFlyweight storing a single regular character 
 */

public class CharacterFlyweight implements PrintableFlyweight
{

     
    //The character this ConcreteFlyweight represents      
     
	private char c;	

    /* 
     Creates a new CharacterFlyweight and sets it to represent a particular character      
     */
     
	public CharacterFlyweight(char c)
	{
		this.c = c;
	}
	
    /*
     Prints the stored character.
     The param uppercase determines whether the character should be printed in
     uppercase
     */ 
     
	public void printChar(boolean uppercase) 
	{
		if(uppercase)
		  System.out.print(Character.toUpperCase(c));
		else
		 System.out.print(c);
	}
}