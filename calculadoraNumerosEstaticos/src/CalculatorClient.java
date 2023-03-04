import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) throws Exception {
        try{
            //connects to the server
            Registry registry = LocateRegistry.getRegistry("localhost", 7777);
            //looks for the calculatorService registry in the server
            Calculator calculator = (Calculator) registry.lookup("CalculatorService");
            System.out.println("According to the server, 2 + 3 is:  " + calculator.add(2, 3));
        }catch(Exception e){
            System.out.println("The server is probably not running!!");
        }

    }
}
