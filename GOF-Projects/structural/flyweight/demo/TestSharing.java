 
/**
 
 
   Intent: Use sharing to support large numbers of fine-grained objects efficiently. 
 
   Participating  Flyweight  classes are  CharacterFlyweight 
   and  WhitespaceFlyweight.Both implement the PrintableFlyweight interface.
   Flyweights are generated via the PrintableFlyweightFactory.
      
   These are the Participating components roles: 
  
   CharacterFlyweightFactory: FlyweightFactory
   PritableFlyweight: Flyweight
   CharacterFlyweight:	ConcreteFlyweight
   WhitespaceFlyweight: ConcreteFlyweight
   TestSharing: Client  
 
   Intrinsic state: The character to print, 
   Extrinsic state: Whether the char is upper case or lower case 
   This program creates a sentence out of PrintableFlyweights
   (characters and whitespaces) by sharing those objects.
  
  
   Here we only use two classes for the flyweights CharacterFlyweight and WhitespaceFlyweight.
   This implementation uses an optimized factory that keeps a hashtable of created Flyweights
   and follows creation of demand nmad sharing
  
 */

public class TestSharing 
{

    // This program creates a sentence out of PrintableFlyweights
    //(characters and whitespaces) by sharing those objects.

	public static void main(String[] args)
	{
	
		System.out.println("This is a test for the java Flyweight pattern ");
		    
		System.out.println("The client will use char flyweights to print the phrase");
		 
		System.out.println("Testing Pattern: Flyweight - STARTING\n");

		PrintableFlyweightFactory pff = new PrintableFlyweightFactory();
		
		PrintableFlyweight T = pff.getPrintableFlyweight('t');
		PrintableFlyweight H = pff.getPrintableFlyweight('h');
		PrintableFlyweight I = pff.getPrintableFlyweight('i');
		PrintableFlyweight S = pff.getPrintableFlyweight('s');
		PrintableFlyweight A = pff.getPrintableFlyweight('a');
		PrintableFlyweight E = pff.getPrintableFlyweight('e');
		PrintableFlyweight Empty = pff.getPrintableFlyweight(' '); 
		
	   // Printing: "This Is A Test"
	
		T.printChar(true);//Uppercase
		H.printChar(false);
		I.printChar(false);
		S.printChar(false);//Lowercase
		
		Empty.printChar(true);
		
		I.printChar(true);
		S.printChar(false);
		
		Empty.printChar(true);
		
		A.printChar(true);
		
		Empty.printChar(true);
		
		T.printChar(true);
		E.printChar(false);
		S.printChar(false);
		T.printChar(false);	
		System.out.println("");		
		 
	}
}	