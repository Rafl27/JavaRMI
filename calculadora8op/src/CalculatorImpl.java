import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {

//    The super() statement is critical because it ensures that the UnicastRemoteObject class is correctly initialized, allowing remote invocation to work.
    public CalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public double operations(double a, double b, String operator) throws RemoteException {
        switch(operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            case "%":
                return a % b;
            default:
                throw new RemoteException("invalid option");
        }
    }
}
