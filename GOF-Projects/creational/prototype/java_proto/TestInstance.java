
import java.util.*;

class TestInstance 
{
	public static void main(String[] args) 
	{
		GregorianCalendar calender1 = (GregorianCalendar)GregorianCalendar.getInstance();

		GregorianCalendar calender2 = (GregorianCalendar)GregorianCalendar.getInstance();
		System.out.println("Are these two calender instances equal by reference?");

		System.out.println(calender1==calender2);

		System.out.println("\nAre these two calender instances equal by values?");

		System.out.println(calender1.equals(calender2));



	}
}
