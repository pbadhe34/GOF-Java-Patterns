
  import java.io.*;

  public class InputRead
    {
    public static void main(String [] args)throws Exception
     {
       int i;
       InputStream input;       
     try
       {
		 
         input = new FileInputStream("data.dat");          
		 //Read from File
         do
           {
           i = input.read();
           if(i!=-1)
            System.out.println(i);
           } while(i != -1);
         
           input.close();

		    //Read from Keyboard

			input = System.in;

			System.out.println("Pl. enter key...");
			i = input.read();
			System.out.println("Key entered code is  "+i);
		    input.close();            
        }        
          
        catch(Exception e)
         {
           System.out.println("Error  "+e.getMessage());
          } 
   }
}
