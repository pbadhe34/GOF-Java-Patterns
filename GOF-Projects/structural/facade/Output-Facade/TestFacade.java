 
/* 
   Intent: Provide a unified interface to a set of interfaces in a 
   subsystem. Facade defines a higher-level interface that makes the 
   subsystem easier to use. 
 
   The  subsystem consists of three classes that provide low-level
   string manipulation and output functionality: RegularScreen,Decoration
   and StringConverter. The  Facade class OutputFacade provides a higher-level interface
   to output strings for the user. This class calls methods on that higer-level interface. 
 */

 
public class TestFacade {
    
     
    //Tests the higher-level class object OutputFacade 
      
    public static void main(String[] args) 
	{
        OutputFacade facade = new OutputFacade();
    
        System.out.println("Testing Facade...");
		System.out.println("Printing Decorated Characters..");
        facade.printDecoration();
         
        facade.printNormal("Facade: this is normal printing");
        facade.printFancy ("Facade: this is fancy  printing");
    }

}