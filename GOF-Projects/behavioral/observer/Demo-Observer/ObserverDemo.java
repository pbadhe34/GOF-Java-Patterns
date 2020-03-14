/*
Observer design pattern

 1. Model the "independent" functionality with a "subject" abstraction
 2. Model the "dependent" functionality with "observer" hierarchy
 3. The Subject is coupled only to the Observer base class
 4. Observers register themselves with the Subject
 5. The Subject broadcasts events to all registered Observers
 6. Observers "pull" the information they need from the Subject
 7. Client configures the number and type of Observers
 */

/*
 Java has inbuilt implemenations available in the form of Observer interface 
 and Observable class type.
*/

class Subject 
{                                      
   private Observer[] observers = new Observer[9];  // 3. Coupled to base class
   private int     totalObs  = 0;
   private int     state;
   public void attach( Observer o )
   {
     observers[totalObs++] = o; 
    }  
   public int  getState() 
   {
     return state; 
   }
   public void setState( int in ) 
   {
      state = in;
      notifyObservers(); //notify all current observers
   }
   private void notifyObservers()
   {
      for (int i=0; i < totalObs; i++)
         observers[i].update();       // 5. Broadcast events to observers
   } 
 }                                    

// Root of the "dependent" hierarchy
abstract class Observer     
{               
   protected Subject subj;
   public abstract void update();
 }

// Concrete class of the "dependent" hierarchy
class HexObserver extends Observer 
{    
   public HexObserver( Subject s )
   {    
      subj = s;  
      subj.attach( this );   // Observers register themselves
    } 
   public void update() 
   {
     //Observers "pulls" the updated information 
      System.out.print( "  " + Integer.toHexString( subj.getState() ) );   
}  }                                   

// Another Concrete Observer
class OctObserver extends Observer
{
   public OctObserver( Subject s )
   {
      subj = s;  
      subj.attach( this ); // Observers register themselves
    } 
   public void update() 
   {
    //Observers "pull" the updated information 
      System.out.print( "  " + Integer.toOctalString( subj.getState() ) );
   } 
}                                    

class BinObserver extends Observer
{
   public BinObserver( Subject s ) 
   {
      subj = s;  
      subj.attach( this ); // Observers register themselves
    } 
   public void update()
   {
     //Observers "pull" updated information 
      System.out.print( "  " + Integer.toBinaryString( subj.getState() ) );
   } 
 }                                    

public class ObserverDemo 
{
   public static void main( String[] args )
   {
      Subject sub = new Subject();
      //configures the number and type of Observers
      new HexObserver( sub ); 
      new OctObserver( sub ); 
      new BinObserver( sub );
      while (true)
      {         
		 int val = Console.readInt("\nEnter a number: ");
         sub.setState(val);
       } 
	 }  
}

 


 