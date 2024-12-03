class BusinessLogic {
    // Business logic: Calculates sum
    int calculateSum(int a, int b) {
        return a + b;
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Programming logic: Execution begins here
        BusinessLogic logic = new BusinessLogic();
        int result = logic.calculateSum(5, 10);
        System.out.println("Sum: " + result);
    }
}
