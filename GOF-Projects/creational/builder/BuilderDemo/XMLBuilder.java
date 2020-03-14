   
 
 
 //Defines a ConcreteBuilder  that builds XML descriptions
 //of complex objects consisting of type, attributes and values.
 

public class XMLBuilder extends TextBuilder 
{

    protected String type = null;
    protected String attribute = null;

     
     //Defines a buildPart() operation for type parts.
     

    public void buildType(String newType) 
	{
        data = "<"+newType+">\n";
        type = newType;
    }
    
    
    // Defines a  buildPart() operation for attribute parts.
      

    public void buildAttribute(String newAttribute)
	{
        if (attribute != null) {
            data += ("</" + attribute + ">\n");
        }
        data += ("\t<" + newAttribute + ">");
        this.attribute = newAttribute;
    }
    
    
     //Defines a  buildPart(  operation for value parts.
     

    public void buildValue(String newValue)
	{
        data += (newValue);
    }
    
    
     //Defines the getResult()  operation for  Builders. Includes
     // a default implementation.
     

    public String getResult()
	{
        if (attribute != null) 
		{
            data += ("</" + attribute + ">\n");
            attribute = null;
        }
        if (type != null)
		{
            data += ("</" + type + ">\n");
            type = null;
        }
        return data;
    }
}  
