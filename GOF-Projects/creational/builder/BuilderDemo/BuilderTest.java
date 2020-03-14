 

/*
 
 * Intent:  Separate the construction of a complex object from its 
 * representation so that the same construction process can create different 
 * representations 
 *
 *  Participating objects in this program  are TextCreator  and 
 *  XMLCreator  which act as  Builders that implement the
 *  Creator interface 
 *
 * In this program, Main acts as the  Directo that
 * uses two different builders to build string representations of a
 * person.  TextCreator creates a text-like representation,
 * XMLCreator an XML-like one. *
 *  
 * The Builder  has to be an abstract class (as opposed to
 * an interface) to allow to define variables or default implementations. 
 * Consequently, all  ConcreteBuilders  have to have that
 * class as their superclass, making it impossible to be part of another
 * class hierarchy.
 *  
 */

public class BuilderTest
{
     
     //Builds a string representation of a person using a given builder.     

    protected static void buildText(TextBuilder builder)
	{
        builder.buildType("Person");
        builder.buildAttribute("Name");
        builder.buildValue("James Bond");
        builder.buildAttribute("Age");
        builder.buildValue("28");
        builder.buildAttribute("Occupation");
        builder.buildValue("SA"); 
    }     

    public static void main(String[] args) 
	{        
        TextBuilder textB = new StringBuilder();
        TextBuilder xmlB = new XMLBuilder();
        
        buildText(textB);
        buildText(xmlB);
        
        System.out.println(textB.getResult());
        System.out.println(xmlB.getResult());
    }
}