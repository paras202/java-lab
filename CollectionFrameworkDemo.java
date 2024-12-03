import java.util.ArrayList;
import java.util.LinkedList;
public class CollectionFrameworkDemo {
    public static void main(String[] args) {
        // Demonstrate ArrayList
        System.out.println("Demonstrating ArrayList:");
        ArrayList<String> arrayList = new ArrayList<>();
        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        
        // Displaying the ArrayList
        System.out.println("ArrayList: " + arrayList);
        
        // Removing an element
        arrayList.remove("Banana");
        System.out.println("After removing 'Banana': " + arrayList);
        
        // Iterating through the ArrayList
        System.out.println("Iterating through ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
        System.out.println("\n---------------------------------\n");
        // Demonstrate LinkedList
        System.out.println("Demonstrating LinkedList:");
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Adding elements to the LinkedList
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        
        // Displaying the LinkedList
        System.out.println("LinkedList: " + linkedList);
        
        // Removing an element
        linkedList.removeFirst(); // Removes the first element
        System.out.println("After removing the first element: " + linkedList);
        
        // Iterating through the LinkedList
        System.out.println("Iterating through LinkedList:");
        for (Integer number : linkedList) {
            System.out.println(number);
        }
    }
}
