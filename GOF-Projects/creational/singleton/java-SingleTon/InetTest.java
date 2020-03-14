
  import java.net.*;
  class InetTest  
  {
   public static void main(String[] as)throws Exception
	{
	  //InetAddress  inew = new InetAddress();  
	   
	  InetAddress in2 = InetAddress.getByName("LocalHost");
	  System.out.println("InetAddress by LocalHost Name  "+in2);

	  InetAddress in3 = InetAddress.getByName("LocalHost");
	  System.out.println("InetAddress by Name  "+in3);	  


	  System.out.println("\nAre these two InetAddress instances equal by References?");
	  System.out.println(in3==in2); 
	   
	}
}