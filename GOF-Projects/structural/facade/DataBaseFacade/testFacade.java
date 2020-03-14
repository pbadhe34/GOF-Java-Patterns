
import com.data.*;

public class testFacade 
{
	public static void main(String[] args) 
	{
		//UserDB db = new UserDB();cannot be accessed directly
		 User user = new User(112,"Doba",23.98); 
		 DBFacade dbf = UserFactory.getFacade();
		 //access UserDb functions via UerFacade
		 dbf.addUser(user);
		 dbf.removeUser(101);
		 
	}
}
