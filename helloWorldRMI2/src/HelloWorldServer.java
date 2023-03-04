import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class HelloWorldServer {
    public static void main(String[] args) throws Exception {
        //new registry(new server actually)
        Registry registry = LocateRegistry.createRegistry(7777);
        HelloWorldImpl helloWorld = new HelloWorldImpl();
        //basically the "endpoint"
        registry.bind("helloWorld", helloWorld);
        System.out.println("The server is running *bebop* *bebop*");
    }
}
