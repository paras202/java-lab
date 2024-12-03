// Import the package and interface
import mypackage.MyInterface;

// Class implementing the interface
class MyImplementation implements MyInterface {
    @Override
    public void displayMessage() {
        System.out.println("Hello from the implemented interface method!");
    }
}

// Main class to demonstrate packages and interfaces
public class MainClass {
    public static void main(String[] args) {
        // Create an object of the implementing class
        MyImplementation obj = new MyImplementation();
        
        // Call the method
        obj.displayMessage();
    }
}
