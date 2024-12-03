public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // 1. Basic Try-Catch
        System.out.println("1. Basic Try-Catch:");
        try {
            int result = 10 / 0; // Division by zero causes ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // 2. Multiple Catch Blocks
        System.out.println("\n2. Multiple Catch Blocks:");
        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }

        // 3. Finally Block
        System.out.println("\n3. Finally Block:");
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        // 4. Throw Statement
        System.out.println("\n4. Throw Statement:");
        try {
            validateAge(15); // Throws an exception if age < 18
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // 5. Throws Keyword
        System.out.println("\n5. Throws Keyword:");
        try {
            riskyOperation(); // Method that declares an exception
        } catch (Exception e) {
            System.out.println("Caught Exception from riskyOperation: " + e.getMessage());
        }
    }

    // Method demonstrating throw statement
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18.");
        }
        System.out.println("Age is valid: " + age);
    }

    // Method demonstrating throws keyword
    static void riskyOperation() throws Exception {
        throw new Exception("This is a custom exception from riskyOperation.");
    }
}
