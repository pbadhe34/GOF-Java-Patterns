//Strategy design pattern

/*
 1. Define the interface of an interchangeable family of algorithms
 2. Bury algorithm implementation details in derived classes
 3. Derived classes could be implemented using the Template Method pattern
 4. Clients of the algorithm couple themselves strictly to the interface
 5. Algorithm details can be changed without disturbing the client program
 */


//The interface of the algorithm
interface Strategy 
{
// The Main algorithm Method 
  public void solve(); 
}          
   
 //Bury implementation in subclasses
abstract class FirstAlgorithm implements Strategy 
{  
   public final void solve()  // The Main algorithm Method 
   {     
	  System.out.println("FirstAlgorithm");
      start();
      while (nextTry() && ! isSolution())
         ;
      stop();
   }
   //Other helper algorithms to be implemented by subclasses
   protected abstract void    start();
   protected abstract boolean nextTry();
   protected abstract boolean isSolution();
   protected abstract void    stop();
}

class First extends FirstAlgorithm 
{
   private int state = 1;
   protected void   start() 
   { 
     System.out.print( "\nstart  " ); 
   }
   protected void   stop()   
   {
    System.out.println( "stop" ); 
   }
   protected boolean nextTry() 
   {
      System.out.print( "nextTry - " + state++ + "  " );
      return true;
    }
   protected boolean isSolution()
   {
      System.out.print( "isSolution-" + (state == 3) + "  " );
      return (state == 3);
   }
}

//Bury implementation for second algorithm 
abstract class SecondAlgorithm implements Strategy 
 { 
   public void solve() 
   {     
	  System.out.println("\nSecondAlgorithm"); 
      while (true)
      {
         preProcess();
         if (search())
		  {
             System.out.println("");
			 break;
		  }
         postProcess();
      } 
   }
   protected abstract void    preProcess();
   protected abstract boolean search();
   protected abstract void    postProcess();
}

class Second extends SecondAlgorithm
{
   private int state = 1;
   protected void    preProcess()  
   {
   System.out.print( "\npreProcess  " ); 
   }
   protected void    postProcess() 
   { 
    System.out.print( "postProcess  " ); 
   }
   protected boolean search()
   {
      System.out.print( "search-" + state++ + "  " );
      return state == 3 ? true : false;
   } 
}

public class StrategyDemo 
{  
  // Clients couple strictly to the interface
   public static void findSolution( Strategy strat )
   { 
      strat.solve();
    }
   public static void main( String[] args )
   {
      Strategy[] algorithms = { new First(), new Second() };
      for (int i=0; i < algorithms.length; i++)
         findSolution( algorithms[i] );
   }  
}

 
