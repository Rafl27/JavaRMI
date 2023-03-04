import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class HelloWorldClient {
    public static void main(String[] args) throws Exception {
        try{
            //connects to the server
            Registry registry = LocateRegistry.getRegistry("localhost", 7777);
            //looks for the helloWOrld registry in the server
            HelloWorld helloWorld = (HelloWorld) registry.lookup("helloWorld");
            System.out.println(helloWorld.sayHello());
        }catch(Exception e){
            System.out.println("The server is probably not running!!");
        }
    }
}
