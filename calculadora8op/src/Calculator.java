import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    double operations(double a, double b, String operator) throws RemoteException;
}
