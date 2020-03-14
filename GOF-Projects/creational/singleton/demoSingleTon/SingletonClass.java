 //Follows SingletonClass design pattern: can never instantiate more than one.
 

final class SingletonClass 
{
  private static SingletonClass  s = new SingletonClass(47);
  private int i;

  //Make the constructor private
  private SingletonClass(int x) { i = x; }

  public static SingletonClass getObject() 
  { 
    return s; 
  }

  public int getValue() { return i; }
  public void setValue(int x) { i = x; } 
   
}  
