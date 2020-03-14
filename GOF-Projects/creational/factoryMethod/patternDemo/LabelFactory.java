 
 

import javax.swing.*;
 
 
 
public class LabelFactory extends GUIComponentFactory
{     
   //Factory method implementation that creates a label component      
    public JComponent createComponent()
	{
        JLabel label = new JLabel("JLabel with Text.");
        return label;            
    }    

    public String getTitle()
	{
        return "A JLabel Component";
    }
}		
