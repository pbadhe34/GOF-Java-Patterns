

/*
The program here uses individual ActionListeners for each MenuItam nad Button
Where we wrire the listener logic.
Lot of code duplication happens here.
For a small program with limited lieneters it is fine.
But for large prigarms to update the individual functions is digfficult
Where the Command object provides uniform interface to invoke standard methods.
*/
 
import java.awt.*;
import java.awt.event.*;

public class FrameActions extends Frame
{
   Menu mnuFile;
   MenuItem mnuOpen, mnuExit;
   Button btnRed;
   Panel p;
   Frame fr;
   
   public FrameActions()
   {
      super("Frame without commands");
      fr = this;
      MenuBar mbar = new MenuBar();
      setMenuBar(mbar);

      mnuFile = new Menu("File", true);
      mbar.add(mnuFile);

      mnuOpen = new MenuItem("Open...");
      mnuFile.add(mnuOpen);
      mnuExit = new MenuItem("Exit");
      mnuFile.add(mnuExit);

      mnuOpen.addActionListener(new ActionListener()
              {  
		        public void actionPerformed(ActionEvent e)
					{
					FileDialog fDlg = new FileDialog(fr, "Open a file", FileDialog.LOAD);
					fDlg.show();
					}
              }
			);

      mnuExit.addActionListener(new ActionListener()
              {
				  public void actionPerformed(ActionEvent e)
				   {
				   System.exit(0);
				   }

               }
			  );
      
      btnRed=new Button("Red");
      p = new Panel();
      add(p);
      p.add(btnRed);

      btnRed.addActionListener(new ActionListener()
              {
				  public void actionPerformed(ActionEvent e)
				   {
					p.setBackground(Color.red);
				   }
                              
              }  
			);
      setBounds(100,100,200,100);
      setVisible(true);
   }
   
   
   static public void main(String argv[])
   {
      FrameActions fa = new FrameActions();
   }
   
}
 

