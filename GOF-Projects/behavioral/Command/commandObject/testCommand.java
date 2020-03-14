
//here we will be using the Command interface to 
//Encapsulate the command functionailty
//The Command object carries different functionailty as per the object returned in
//the ActionListerner actionPerformed method

import java.awt.*;
import java.awt.event.*;

public class testCommand extends Frame  implements ActionListener
{
   Menu mnuFile;
   fileOpenCommand mnuOpen;
   fileExitCommand mnuExit;
   btnRedCommand btnRed;
   Panel p;
   Frame fr;

   //Command implementation classes as Inner classes
   //The inner classes can access outer class parameters directly
   //Button Command
   class btnRedCommand extends Button implements Command
   {
      boolean flag = false;
      public btnRedCommand(String caption)
      {
         super(caption);
      }
      public void Execute()
      {
		  if(flag)
		  {
			  p.setBackground(Color.red);
			  setLabel("Green");
			  flag = false;
		  }
		  else
		  {
			  p.setBackground(Color.green);
			  setLabel("Red");
			  flag = true;
		  }
      }
   }

   //FileDialog Command
   class fileOpenCommand extends MenuItem implements Command
   {
      public fileOpenCommand(String caption)
      {
         super(caption);
      }
      public void Execute()
      {
         FileDialog fDlg=new FileDialog(fr,"Open file");
         fDlg.show();
		 System.out.println("File selected is  "+fDlg.getFile());
      }
   }
   //ExitMenu Command
   class fileExitCommand extends MenuItem implements Command
   {
      public fileExitCommand(String caption)
      {
         super(caption);
      }
      public void Execute()
      {
		 System.out.println("Exiting through fileExitCommand..");
         System.exit(0);
      }
   }
   
   public testCommand()
   {
      super("Frame with command objects");
      fr = this;     //save frame object
      MenuBar mbar = new MenuBar();
      setMenuBar(mbar);

      mnuFile = new Menu("File", true);
      mbar.add(mnuFile);

      mnuOpen = new fileOpenCommand("Open...");
      mnuFile.add(mnuOpen);
      mnuExit = new fileExitCommand("Exit");
      mnuFile.add(mnuExit);

      mnuOpen.addActionListener(this);
      mnuExit.addActionListener(this);
      
      btnRed = new btnRedCommand("Red");
      p = new Panel();
      add(p);
      p.add(btnRed);

      btnRed.addActionListener(this);
      setBounds(100,100,200,100);
      setVisible(true);
   }
    //Universal Command Receiver
   public void actionPerformed(ActionEvent e)
   {
      Command obj = (Command)e.getSource();
	  //Different execute versions as per the current Command object will be invoked.
      obj.Execute();
   }
   
   public static void main(String argv[])
   {
      testCommand tc = new testCommand();
   }
   
}
 


