 

 
 //Follows Prototype pattern and imitates a simple String object.
  

public class StringPrototypeA extends ProtoBase implements Cloneable
{

    
    /// encapsulated string  object  
         
    protected String text;    
    

    public StringPrototypeA(String init)throws Exception
	{
		System.out.println("StringPrototypeA constructor..\n");
        text = init;
    }
    
     
    public void setText(String newText)
	{
        text = newText;
    }
    
     
    public String toString()
	{
        return "StringPrototypeA:  "+ text;
    }        
    
    public StringPrototypeA getCopy() throws CloneNotSupportedException 
	{
        System.out.println("\nCloning the StringPrototypeA ..\n");
		return (StringPrototypeA)super.clone();
    }
}
   