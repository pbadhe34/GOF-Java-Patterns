  
  
import javax.swing.*; 
import java.awt.event.*;
import java.awt.*;
 
 
// Set up and display a GUI with the given concrete ComponentFactory object.
 
  
public class GUIFrame extends JFrame implements ActionListener
{ 
    
    /*
     Sets up the frame with a label and a button created by the current
     concrete factory object.  
     The parameter factory is the factory object used to create GUI elements
	 Which type of button and lable to create is not specified here but is decided
	 by the ComponentFactory subclass injected into the GUIFrame constructor
     */ 

	public GUIFrame(ComponentFactory factory)
	{
		//super("Frame GUI"); 		 
		JLabel label = factory.createLabel(); 
		JButton button = factory.createButton();
		button.addActionListener(this);		 
		add(label,BorderLayout.NORTH);
		add(button,BorderLayout.SOUTH);		 
		setSize(300,250);
		setTitle(factory.getName());
		setVisible(true);	 
	} 
	  
	 // The button listener that closes the	frame 
	 
	    public void actionPerformed(ActionEvent e)
		{ 
			dispose();
		}
	 
}