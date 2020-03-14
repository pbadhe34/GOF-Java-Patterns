 

import javax.swing.*; 
import java.awt.Dimension;
   
   /*
   AbstractFactory pattern
   Intent:  Provide a factory for creating families of related objects or 
   dependent objects without specifying their concrete classes. 
  
   This abstract factory  defines two factory methods 
   createLabel()  and  createButton() 
   that create related graphic components. 
 
   This program is a swing GUI Frame that allows the user to choose between the two 
   concrete factories  RegularFactory and  FramedFactory
   and creates a new GUI with elements from the respective factory.
 
   The RegularFactory creates standard Swing GUI components while
   The  FramedFactory creates components which are framed.
   */
 
 
public abstract class ComponentFactory 
{
        
    //Create Label.       
     
	public abstract JLabel createLabel(); 
   
    //Create Button.    
     
	public abstract JButton createButton(); 
    
    //Return the name of the factory.  
	
	public abstract String getName(); 

	//defiine default Dimension/size for the components
     	  
	public Dimension getSize(int type)
	{
        if(type==1)//label size
		{
            return new Dimension(90,25);
		}
		else //button size
		{
			return new Dimension(55,35);
		}
	}

}