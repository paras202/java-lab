import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Insert
        int newValue = 6;
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = newValue;
        System.out.println("After insertion: " + Arrays.toString(arr));

        // Delete
        int deleteIndex = 2; // Remove 3rd element
        for (int i = deleteIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr = Arrays.copyOf(arr, arr.length - 1);
        System.out.println("After deletion: " + Arrays.toString(arr));

        // Search
        int searchValue = 4;
        boolean found = false;
        for (int num : arr) {
            if (num == searchValue) {
                found = true;
                break;
            }
        }
        System.out.println("Search result for " + searchValue + ": " + (found ? "Found" : "Not Found"));
    }
}
