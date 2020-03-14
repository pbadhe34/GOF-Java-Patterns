//this class decorates a Button so that
//the borders are invisible when the mouse
//is not over the button
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CoolDecorator extends Decorator
{
 boolean mouse_over; //true when mouse over button
 JComponent  Comp;
public CoolDecorator(JComponent c)
{
	super(c);
	mouse_over = false;
	Comp = this; //save this component
	//catch mouse movements in inner class
	c.addMouseListener(new MouseAdapter()
	{
		public void mouseEntered(MouseEvent e)
		{
			mouse_over=false; //set flag when mouse over
			Comp.repaint();
		}
		public void mouseExited(MouseEvent e) 
		{
		 mouse_over=true; //clear if mouse not over
		 Comp.repaint();		 
		}
});
}
//paint the button
public void paint(Graphics g)
	{
		super.paint(g); //first draw the parent button
		if(! mouse_over)
		{
		//if the mouse is not over the button
		//erase the borders
		Dimension size = super.getSize();
		g.setColor(Color.green);
		g.drawRect(2, 2, size.width-2, size.height-2);
		g.drawLine(size.width-1, 0, size.width-2,size.height-1);
		g.drawLine(0, size.height-2, size.width-2,size.height-2);
	   }
	}
}