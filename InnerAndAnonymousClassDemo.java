class OuterClass {
    private String message = "Hello from OuterClass!";

    // Regular Inner Class
    class InnerClass {
        void display() {
            System.out.println("Message from InnerClass: " + message);
        }
    }

    // Static Inner Class
    static class StaticInnerClass {
        void display() {
            System.out.println("Message from StaticInnerClass: Hello from a static inner class!");
        }
    }

    // Method demonstrating Anonymous Class
    void demonstrateAnonymousClass() {
        // Creating an anonymous class implementing Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Message from Anonymous Class: Running in an anonymous class!");
            }
        };
        runnable.run();
    }
}

public class InnerAndAnonymousClassDemo {
    public static void main(String[] args) {
        // Regular Inner Class
        System.out.println("Regular Inner Class:");
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass(); // Create an object of InnerClass
        inner.display();

        // Static Inner Class
        System.out.println("\nStatic Inner Class:");
        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
        staticInner.display();

        // Anonymous Class
        System.out.println("\nAnonymous Class:");
        outer.demonstrateAnonymousClass();
    }
}
