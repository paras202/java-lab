import java.util.Vector;

public class VectorVsArray {
    public static void main(String[] args) {
        // Array Example
        System.out.println("Array Example:");
        int[] numbers = new int[5]; // Fixed-size array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.println(num); // Prints 0 for unassigned elements
        }

        // Adding and resizing manually
        System.out.println("Adding a new element to an array is not directly possible without resizing.");
        
        // Vector Example
        System.out.println("\nVector Example:");
        Vector<Integer> vector = new Vector<>(); // Dynamic-size Vector
        vector.add(10);
        vector.add(20);
        vector.add(30);

        System.out.println("Vector elements:");
        for (int num : vector) {
            System.out.println(num);
        }

        // Adding new elements dynamically
        vector.add(40);
        vector.add(50);
        System.out.println("Vector after adding new elements: " + vector);

        // Removing elements
        vector.remove(2); // Removes element at index 2
        System.out.println("Vector after removing element at index 2: " + vector);

        // Capacity of the vector
        System.out.println("Capacity of the Vector: " + vector.capacity());
    }
}

