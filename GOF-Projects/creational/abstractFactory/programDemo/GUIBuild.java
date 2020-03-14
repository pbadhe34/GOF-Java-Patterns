  
  
import javax.swing.*; 
import java.awt.event.*;
 
 
// Set up and display a GUI with the given concrete ComponentFactory object.
 
  
public class GUIFrame extends JFrame 
{ 
    
    /*
     Sets up the frame with a label and a button created by the respective
     concrete factories. Both button and frame receive their appropriate 
     listeners to close the frame when either the button is clicked or the frame is closing.
     method parameter factory is the factory object used to create GUI elements
     */ 

	public GUIFrame(ComponentFactory factory)
	{
		super("Frame GUI"); 
		JLabel label = factory.createLabel(); 
		JButton button = factory.createButton("OK");
		button.addActionListener(new myActionListener(this));
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(button);
		this.getContentPane().add(panel);
		this.pack();
		this.setVisible(true); 
		this.addWindowListener(new myListener(this));
	}
	
	 
	 //The window listener that closes the frame on demand 
	 
	
	private class myListener extends WindowAdapter
	{
		
		GUIFrame display = null;
		
		protected myListener(GUIFrame display)
		{
			//super();
			this.display = display;   
		}
		
		public void windowClosing(WindowEvent e)
		{
			display.setVisible(false);
		}
	}
	
	 
	 // The button listener that makes the 	frame visible/invisible 

	private class myActionListener implements ActionListener
	{
	    
	    GUIFrame display;
	    
	    protected myActionListener(GUIFrame display)
		{
	        //super();
	        this.display = display;
	    }
	    
	    public void actionPerformed(ActionEvent e)
		{ 
			display.setVisible(false);
		}
	}
}