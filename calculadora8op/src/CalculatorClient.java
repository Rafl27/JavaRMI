import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) throws Exception {

        try{
            //connects to the server
            Registry registry = LocateRegistry.getRegistry("localhost", 7777);
            //connects to the "endpoint"
            Calculator calculator = (Calculator) registry.lookup("CalculatorService");
            Scanner scanner = new Scanner(System.in);
            System.out.println("---Mathnu---");
            System.out.println("Options available [ +, -, *, /, % ]");
            System.out.print("Enter the first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter the operator [ +, -, *, /, % ] : ");
            String operator = scanner.next();
            System.out.print("Enter the second number: ");
            double b = scanner.nextDouble();
            System.out.println("Result: " + calculator.operations(a, b,operator));
        }catch(Exception e){
            System.out.println("The server is probably not running!!");
        }
    }}
