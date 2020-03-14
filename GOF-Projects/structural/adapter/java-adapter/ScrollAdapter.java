import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/* ListDemo.java is a 1.4 application that requires no other files. */
public class ScrollAdapter extends JFrame
{
    

    public ScrollAdapter(String caption)
	{
		super(caption);
        String[] data = {"one String is always matters here ", "two", "three", "four","five","six","seven","eight","nine"};
        JList list = new JList(data);       
 
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(0);         
        list.setVisibleRowCount(5);
        JScrollPane Scroller = new JScrollPane(list); 
	    Scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(list, BorderLayout.CENTER);         
    } 
     
   

    public static void main(String[] args)
	{         
        //Create and set up the frame window.
        ScrollAdapter frame = new ScrollAdapter("ScrollAdapter listFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
         
         
        //Display the window.
        frame.setSize(250,150);
        frame.setVisible(true);
	}
}
