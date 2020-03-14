
import java.awt.*;
import java.awt.event.*;

//Having inner command classes allows for access of private methods in main class

public class CommandActionFarme extends Frame
{
   Menu mnuFile;
   MenuItem mnuOpen, mnuExit;
   Button btn;
   Panel p;
   Frame fr;


   //Command Handler inner classes 
   class fileOpen implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         FileDialog fDlg = new FileDialog(fr, "Open a file", FileDialog.LOAD);
         fDlg.show();
      }
   }
   
   class btnRed implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
          p.setBackground(Color.red);
      }
   }
    
   class fileExit implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   }
   
   public CommandActionFarme()
   {
      super("Frame with inner command classes");
      fr = this;         
      MenuBar mbar = new MenuBar();
      setMenuBar(mbar);

      mnuFile = new Menu("File", true);
      mbar.add(mnuFile);

      mnuOpen = new MenuItem("Open...");
      mnuFile.add(mnuOpen);
      mnuExit = new MenuItem("Exit");
      mnuFile.add(mnuExit);

      mnuOpen.addActionListener(new fileOpen());
      mnuExit.addActionListener(new fileExit());
      
      btn =new Button("Red");
      p = new Panel();
      add(p);
      p.add(btn);
      btn.addActionListener(new btnRed());      
   }  
    
   
   static public void main(String argv[])
   {
      CommandActionFarme cf = new CommandActionFarme();
	  cf.setBounds(100,100,200,100);
      cf.setVisible(true);
   }
   
}
 


