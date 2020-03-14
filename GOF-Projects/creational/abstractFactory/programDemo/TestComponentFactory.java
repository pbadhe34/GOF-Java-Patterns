 
import javax.swing.*;

import java.awt.event.*;          
 

public class TestComponentFactory 
{	
    /*
     * Creates the initial GUI that allows the user to choose a factory object
     * and generate a new GUI with the elements that the respective
     * factory provides.   
     */

	  //The factory object to create GUI components
	private static ComponentFactory factory;
     
	private static JPanel createGUI()
	{	
		JPanel panel = new JPanel();
		JRadioButton factoryButton1 = new JRadioButton("Use FramedFactory"); 
		JRadioButton factoryButton2 = new JRadioButton("Use RegularFactory");
		factoryButton1.setActionCommand("framed");
		factoryButton2.setActionCommand("regular");	
		
		ButtonGroup choices = new ButtonGroup();
		choices.add(factoryButton1);
		choices.add(factoryButton2);

		/*
		actionlistener for radio buttons which selects one of ComponentFactory
		subclasses to create the GUI components
		*/
		ActionListener radioListener = new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				if (e.getActionCommand().equals("framed"))
					factory = new FramedFactory();
				else 
					factory = new RegularFactory();
			}
		};

		factoryButton1.addActionListener(radioListener);
		factoryButton2.addActionListener(radioListener);		
			
		JButton create = new JButton("Create GUI");	
		create.addActionListener( new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{ 
				GUIFrame frame = new GUIFrame(factory);
			}
		});		

		panel.add(factoryButton1);
		panel.add(factoryButton2);
		panel.add(create);		
		return panel;
	}   		
		
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Abstract Factory Pattern");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );  
		JPanel panel = createGUI();
		frame.add(panel);
		
		frame.setSize(350,250);
		frame.setVisible(true);
	}
}