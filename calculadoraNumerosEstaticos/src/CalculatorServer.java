import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {
    public static void main(String[] args) throws Exception {
        //new registry(new server actually)
        Registry registry = LocateRegistry.createRegistry(7777);
        CalculatorImpl calculator = new CalculatorImpl();
        //basically the "endpoint"
        registry.bind("CalculatorService", calculator);
        System.out.println("The server is running *bebop* *bebop*");
    }
}
