 

import javax.swing.JLabel;
import javax.swing.JButton; 

 

public class RegularFactory extends ComponentFactory 
{  
	 
	 //Factroy method to create regular  JLabel objects. 	 
 
	public JLabel createLabel()
	{
		return new JLabel("This Label is created by " +getName());
	}
	
	 
	 //Factory method to create regular  JButton  objects. 
	 
 
	public JButton createButton()
	{
		return new JButton("Regular Button");
	}
    
    // Returns the name of the factory object.   
     	  
 	public String getName()
	{
		return ("Regular Factory");
	} 
	
}