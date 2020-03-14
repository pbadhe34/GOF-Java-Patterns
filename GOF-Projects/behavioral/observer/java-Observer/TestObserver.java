/*
 Observer design pattern,
 
 Using Java's Observer and Observable
*/
 
import java.util.*;
 
 
//The subject
class SensorSystem extends Observable
{  
	public void modifySesnsorState()
	{
          setChanged();//change the state of Subject
		  //Notify all Observers
		  //notifyObservers();///Base Class
		  notifyObservers("Update YourSelf");
	}
	public String toString()
	{
           return "SensorSystem";
	}
   
}
//The observer implementations
class Lighting implements Observer
{
   public  void update(Observable obj,Object arg) 
   {
	   System.out.println("\nIn Lighting update Observable is   "+obj +" and argument is  "+arg);
	   System.out.println( "Lights up" ); 
	}
}

class Gates implements Observer 
{
   public  void update(Observable obj,Object arg) 
   {
	   System.out.println("\nIn Gates update Observable is   "+obj +" and argument is  "+arg);
	   System.out.println( "Gates close " ); 
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
       
      ss.modifySesnsorState();//notify all the observers
    } 
}

 
