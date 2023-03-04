import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {
    public static void main(String[] args) throws Exception {
        //starts the server
        Registry registry = LocateRegistry.createRegistry(7777);
        CalculatorImpl calculator = new CalculatorImpl();
        //binds the object calculator to calculatorService
        registry.bind("CalculatorService", calculator);
        System.out.println("The server is running *bebop* *bebop*");
    }
}
