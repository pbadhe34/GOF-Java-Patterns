 

import javax.swing.*; 
import java.awt.event.*;
 
 //Another subclass for abstract factory base class to create the buttons
public class ButtonFactory extends GUIComponentFactory
{
   
    public JComponent createComponent()
	{
        final JButton button = new JButton("Click!");
        button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				button.setText("Thanks!");
			}
        });
        return button;            
    }
    
     
    //Return a title value explaining this control.      

    public String getTitle()
	{
        return "A JButton Component";
    }
}		
