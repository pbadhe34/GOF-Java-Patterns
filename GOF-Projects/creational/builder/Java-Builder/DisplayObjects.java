
import java.io.*;
class student implements Serializable
  {
   String name;
   int num;
   double bal;

   public String toString()
   {
     String info = "This is Student  "+name +" with  number =  "+num+" and Balance =  "+bal;
     return info;
   }
  }


  class Account implements Serializable
  {
    String type;
    int number;
    float salary;

	public Account()
	{

	}

   public Account(String ac,int no,float amt)
	{
	   type = ac;
	   number = no;
	   salary = amt;
	}

   public String toString()
   {
     String data = "This is  "+type +" Account  having  number =  "+number+" and Salary  =  "+salary;
     return data;
   }
  }    

public class DisplayObjects
{

	public static void saveObjects()throws IOException
    {
     student s = new student();
     s.name = "Suresh";
     s.num = 200;
     s.bal = 300.00;
	 //Save Student object
		FileOutputStream fo = new FileOutputStream("data.dat"); 
		ObjectOutputStream objout = new  ObjectOutputStream(fo);
		objout.writeObject(s);


     Account ac = new Account("Savings",101,456.78f);
	//Save Account object
    fo = new FileOutputStream("account.dat"); 
    objout = new  ObjectOutputStream(fo);
    objout.writeObject(ac);
    //System.out.println("Objects saved");
   }
   public static void main(String ar[])throws IOException,ClassNotFoundException
   {
        saveObjects();
      
		System.out.println("Reading the Objects...  \n");
		FileInputStream fi = new FileInputStream("data.dat"); 
		ObjectInputStream objin = new  ObjectInputStream(fi);
		Object obj = objin.readObject();
		System.out.println("First Object Read is  "+obj);
		System.out.println("\n");

	   fi = new FileInputStream("account.dat"); 
	   objin = new  ObjectInputStream(fi);
	   obj = objin.readObject();
	   System.out.println("Second Object Read is  "+obj); 
   }
 }
   
