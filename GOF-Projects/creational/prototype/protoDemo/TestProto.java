 

/* 
 Intent:  Specify the kinds of objects to create using a prototypical 
 instance, and create new objects by copying this prototype. 
 
 Participating objects are  StringPrototypeA  and 
 StringPrototypeB  as  Prototype 

 In this program, both StringPrototypeA and StringPrototypeB 
 implement cloneable classes emulating limited String behavior. 
 This class creates an object of each class and clones it. 
 Both originals and clones are manipulated to show that they are 
 different objects. 
 
 */ 
 
public class TestProto
{

    public static void main(String[] args)throws Exception
	{
        
        try {
    
            System.out.println("Testing the Prototype design pattern implementation...");
            
            StringPrototypeA originalA;
            StringPrototypeB originalB;
            StringPrototypeA copyA;
            StringPrototypeB copyB;
            
            originalA = new StringPrototypeA("First String");
            originalB = new StringPrototypeB("Second String"); 
            
            System.out.println("These are the two Original objects :\n");
            System.out.println(originalA.display());
            System.out.println(originalB.display());//base class methods
            
            copyA =  originalA.getCopy();
            copyB =  originalB.getCopy();
    
            System.out.println("\nThese are copies of the originals :");
            System.out.println("Cloned objectA is  "+copyA.display());
            System.out.println("Cloned objectB is  "+copyB.display());
    
            System.out.println("\nNow First object property is changed. Here are first object and its former copy:");
			originalA.setText("This is original object modified ");
            System.out.println(originalA.display());
            System.out.println("Cloned objectA is  "+copyA.display());
           
            System.out.println("\nAre Original and Cloned Objects equal ?");
			 
            System.out.println(copyA.equals(originalA));
            System.out.println(copyB.equals(originalB));             
             
        
        } 
		catch (CloneNotSupportedException ex) 
		{
            System.err.println("Can't clone prototype objects  "+ex);
        }
    }
}