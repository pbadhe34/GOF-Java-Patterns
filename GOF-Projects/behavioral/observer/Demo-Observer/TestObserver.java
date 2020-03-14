/*
Observer design pattern,
 
Description : SensorSystem is the "subject". Lighting, Gates, and Surveillance are the
"views". The subject is only coupled to the "abstraction" of AlarmListener.

Class inheritance vs interface type inheritance
An object's class defines how the object is implemented.In contrast, an
object's type only refers to its interface.
Class inheritance defines an object's implementation in terms of another object's implementation. 
Type inheritance describes when an object can be used in place of another.
*/
 
import java.util.*;
//The observer
interface SensorObserver
{ 
	public void setAlarm();
}
//The subject
class SensorSystem 
{
	//Collection to contain list of Observers
   private java.util.Vector observers = new java.util.Vector();

  //Add the observer to list
   public void addObserver(SensorObserver al)
	{ 
	   observers.addElement( al );
	}
	//Notify all Observers
   public void soundTheAlarm()
	{
	   Enumeration e=observers.elements();
       while(e.hasMoreElements())
		{ 
         SensorObserver al =(SensorObserver)e.nextElement();
		 al.setAlarm();
		}
   }  
}
//The observer implementations
class Lighting implements SensorObserver
{
   public void setAlarm() { System.out.println( "\nLights up" ); }
}

class Gates implements SensorObserver 
{
   public void setAlarm() { System.out.println( "\nGates close" ); }
}

// Reusable Base class as Observer
class CheckList   
{
   public void checkAndAlarm() 
   {  
      localize();
      isolate();
      identify(); 
	}
   protected void localize() 
   {
      System.out.println( "   establish a perimeter" );
	}
   protected void isolate() 
	{
      System.out.println( "   isolate the grid" );
	}
   protected void identify() 
	{
      System.out.println( "   identify the source" );
	}
}
    
// class inheri and type inheritance
class Surveillance extends CheckList implements SensorObserver
{
   public void setAlarm() 
   {
      System.out.println( "Surveillance - by the checkAndAlarm:" );
      checkAndAlarm(); 
   }
   protected void isolate() 
   {
	   System.out.println( "   train the cameras" );
  }
}
//Test class
public class TestObserver
{
   public static void main( String[] args )
	{
      SensorSystem ss = new SensorSystem();
      ss.addObserver( new Gates()        );//add observer1
      ss.addObserver( new Lighting()     );//add observer2
      ss.addObserver( new Surveillance() );//add observer3
      ss.soundTheAlarm();//notify all the observers
    } 
}

 
