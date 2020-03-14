
import java.awt.*;
import java.awt.event.*;

public class NoCommandFrame extends Frame  implements ActionListener
{
   Menu mnuFile;
   MenuItem mnuOpen, mnuExit;
   Button btnRed;
   Panel p;
   
   public NoCommandFrame()
   {
      super("Frame without commands");
      MenuBar mbar = new MenuBar();
      setMenuBar(mbar);

      mnuFile = new Menu("File", true);
      mbar.add(mnuFile);

      mnuOpen = new MenuItem("Open...");
      mnuFile.add(mnuOpen);
      mnuExit = new MenuItem("Exit");
      mnuFile.add(mnuExit);

      mnuOpen.addActionListener(this);
      mnuExit.addActionListener(this);
      
      btnRed=new Button("Red");
      p = new Panel();
      add(p);
      p.add(btnRed);

      btnRed.addActionListener(this);
      setBounds(100,100,200,100);
      setVisible(true);
   }
   
   public void actionPerformed(ActionEvent e)
   {
	   //Compare the event source and call individual methods
	   //adding a new Source is tedious
      Object obj = e.getSource();
      if(obj == mnuOpen)
         fileOpen();
      if (obj == mnuExit) 
         exitClicked();
      if (obj == btnRed)
         redClicked();
   }
   
   private void exitClicked()
   {
	  System.out.println("Exiting through fileExitCommand..");
      System.exit(0);
   }
   
   private void fileOpen()
   {
      FileDialog fDlg = new FileDialog(this, "Open a file", FileDialog.LOAD);
      fDlg.show();
	  System.out.println("File selected is  "+fDlg.getFile());
   }
   boolean flag = false;
   private void redClicked()
   {
	    if(flag)
		  {
			  p.setBackground(Color.red);
			  btnRed.setLabel("Green");
			  flag = false;
		  }
		  else
		  {
			  p.setBackground(Color.green);
			  btnRed.setLabel("Red");
			  flag = true;
		  }
       
   }
   
   static public void main(String argv[])
   {
      NoCommandFrame frame = new NoCommandFrame();
   }
}

