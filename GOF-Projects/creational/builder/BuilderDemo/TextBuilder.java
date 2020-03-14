 

 // Define the abstract class for the Builder pattern. 
 

public abstract class TextBuilder 
{
         
    // An inheritable variable that carries the result of the build.
     
    
    protected String data;

    
     //Defines a  buildPart()  operation for type parts.
     

    public abstract void buildType(String type);

    
     //Define a  buildPart() operation for attribute parts.
     

    public abstract void buildAttribute(String newAttribute);

    
    //Define a buildPart( ) operation for value parts.
      

    public abstract void buildValue(String newValue);
    
    
     //Define a getResult() operation for  Builder.           

    public  String getResult() 
	{
        return data;
    }  
}
    