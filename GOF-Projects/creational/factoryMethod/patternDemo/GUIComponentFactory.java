 

import javax.swing.*; 
import java.awt.event.*; 
import java.awt.*;

/*
FactroryMethod Pattern
Intent: Define a base abstract class for creating Graphics Components but let subclasses decide
which class to instantiate.
Factory Method lets a class defer instantiation of objects to subclasses. 

Participating objects in this program are  ButtonCreator and LabelCreator.Both extend 
GUIComponentCreator and implement abstract methods
 */

 //Abstract Factory Base class
public abstract class GUIComponentFactory
{  
     
    //The factory method to be implemented by subclasses.    

    public abstract JComponent createComponent();     
     
    //Another factory method to create a title for the GUI frame  
     
    public abstract String getTitle();   
     
     
    public final void showFrame()
	{
        JFrame frame = new JFrame(getTitle());
        
   		frame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			}
		});
		    
		JPanel panel = new JPanel();	
		panel.add(createComponent());		
		frame.add(panel);
		frame.setSize(300,250);    
		frame.setLocation(new Point(0, 0));		 
		frame.setVisible(true);  
    }
}		

    