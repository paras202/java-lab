public class ControlStructuresDemo {
    public static void main(String[] args) {
        int x = 15, y = 30;
        
        // Conditional structure
        if (x < y) {
            System.out.println("x is less than y");
        } else {
            System.out.println("x is greater than or equal to y");
        }

        // Loop structure
        System.out.print("Loop: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Operator demonstration
        int sum = x + y;
        System.out.println("Sum: " + sum);
        System.out.println("Post-increment: " + x++);
        System.out.println("Pre-increment: " + ++y);
    }
}
