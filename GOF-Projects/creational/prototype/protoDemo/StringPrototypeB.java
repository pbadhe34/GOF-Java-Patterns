 

 //Another ProtoType

public class StringPrototypeB extends ProtoBase implements Cloneable
{
    
    // encapsulated string  object  
         
    protected String text;  
    

    public StringPrototypeB(String init)throws Exception
	{
		System.out.println("StringPrototypeB constructor..\n");
        text = init;
    }     
    
    public void setText(String newText)
	{
		System.out.println("StringPrototypeB constructor..\n");
        text = newText;
    }  
    
    
    public String toString() 
	{
        return "StringPrototypeB: " + text;
    }       
    
    public StringPrototypeB getCopy() throws CloneNotSupportedException
	{
		System.out.println("Cloning the StringPrototypeB ..\n");
        return (StringPrototypeB)super.clone();
    }
}