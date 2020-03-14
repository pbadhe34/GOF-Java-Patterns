

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class GraphicsFrame extends JFrame
{
	public GraphicsFrame(String title)		 
	{
       super(title);
	   JButton bt1 = new JButton("Decorated");
	   JButton bt2 = new JButton("Normal");
	   CoolDecorator cd = new CoolDecorator(bt1);
	   add(cd,BorderLayout.NORTH);
	   add(bt2,BorderLayout.SOUTH);	
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	public static void main(String[] args) 
	{
		GraphicsFrame gf = new GraphicsFrame("Decorated Button");
		gf.setSize(300,300);
		gf.show(); 
		
	}
}
