 
public class FactoryMethodClass
{

    /*     
      The factory method  createComponent creates a JComponent (a button oR a label,depending 
	  on the factory sub class used).
      The  method showFrame() uses the factory methods to show a GUI.
	   
	  User is giving an hint about which  component to create and corresponding factory 
	  subclass object will be returned whivch will be used to create the Component
	  In one case, the created frame contains  a button, in the other case a label.
     */  
	public static GUIComponentFactory getGUIComponentFactory(int hint)
	{
       if(hint==1)
		   return new ButtonFactory();
	   else
		   return new LabelFactory();
	} 
     
    public static void main(String[] args)
	{
        //The user has control on what to create!
        GUIComponentFactory factory  = getGUIComponentFactory(1);        
        factory.showFrame();         
    }
}