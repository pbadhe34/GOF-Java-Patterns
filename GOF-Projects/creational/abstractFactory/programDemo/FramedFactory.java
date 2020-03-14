 
 
import javax.swing.*; 
import javax.swing.border.Border;
import java.awt.*;

 
 //This class extends the ComponentFactory  class to provide framed Graphic components.
 

public class FramedFactory extends ComponentFactory
{
 
	 //Factory method to create framed  JLabel  object.	 

	public JLabel createLabel()
	{
		JLabel label = new JLabel("This Label is created by " +getName());
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		label.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));	
		//get the size
		Dimension dimn = getSize(1);
		label.setSize(dimn);
		return label;
	} 
	
	 //Factory method to create framed JButton object. 
 
     public JButton createButton()
	 {
		JButton button = new JButton("Framed Button");
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		button.setBorder(BorderFactory.createCompoundBorder(raisedbevel, loweredbevel));
		Dimension dimn = getSize(2);
		button.setSize(dimn);
		return button;
	 }	
     
    //Returns the name of the current factory.    
 
 	public String getName()
	{
		return "FramedFactory";
	} 
}