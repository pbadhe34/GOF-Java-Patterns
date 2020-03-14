 

 /*
   Defines a ConcreteBuilder that builds textual descriptions
   of complex objects consisting of type, attributes and values.
   This version makes use of the implementation of  getResult()in base class
  */

public class StringBuilder extends TextBuilder
{

       //Defines a buildPart() operation for type parts.

    public void buildType(String newType)
	{
        data = "This is a new "+newType+":\n";
    }
    
     // Defines a  buildPart() operation for attribute parts.

    public void buildAttribute(String newAttribute) 
	{
        data += ("Its " + newAttribute + " is ");
    }
    
     
  //Defines a  buildPart(  operation for value parts.
    public void buildValue(String newValue)
	{
        data += (newValue + ".\n");
    }
}  
