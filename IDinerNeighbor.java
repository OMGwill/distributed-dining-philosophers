import java.rmi.Remote;
import java.rmi.RemoteException;


public interface IDinerNeighbor extends Remote {
	public void requestFromRight() throws RemoteException;
	public void requestFromLeft() throws RemoteException;
	public void forkFromRight() throws RemoteException;
	public void forkFromLeft() throws RemoteException;
}
