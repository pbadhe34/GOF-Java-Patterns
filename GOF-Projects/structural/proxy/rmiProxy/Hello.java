 
import java.rmi.Remote; 
import java.rmi.RemoteException; 
//The remote interface for communication between client and server
public interface Hello extends Remote 
{ 
    String sayHello() throws RemoteException; 
}
