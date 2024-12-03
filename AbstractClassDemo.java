// Abstract Class
abstract class Shape {
    // Abstract method
    abstract void draw();

    // Non-abstract method
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

// Subclass 1: Circle
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Subclass 2: Rectangle
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

// Main Class
public class AbstractClassDemo {
    public static void main(String[] args) {
        // Create objects of subclasses
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Call methods
        System.out.println("Circle Object:");
        circle.displayShape();
        circle.draw();

        System.out.println("\nRectangle Object:");
        rectangle.displayShape();
        rectangle.draw();
    }
}
