import java.awt.*;
import javax.swing.*;
public class Decorator extends JComponent 
{
 public Decorator(JComponent c)
 {
   setLayout(new BorderLayout());
   //add component to container
   add("Center", c);
  }
}