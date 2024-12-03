// Base class (parent)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
// Derived class (child) - Inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
// Interface
interface Pet {
    void play(); // Abstract method in interface
}

// Class implementing an interface
class Cat extends Animal implements Pet {
    @Override
    void eat() {
        System.out.println("The cat eats fish.");
    }

    @Override
    public void play() {
        System.out.println("The cat plays with a ball.");
    }
}

// Main class to demonstrate inheritance and interface
public class InheritanceAndInterfaceDemo {
    public static void main(String[] args) {
        // Inheritance example
        System.out.println("Inheritance Example:");
        Dog dog = new Dog();
        dog.eat();  // Inherited method from Animal
        dog.bark(); // Method from Dog class

        // Interface implementation example
        System.out.println("\nInterface Example:");
        Cat cat = new Cat();
        cat.eat();  // Overridden method from Animal
        cat.play(); // Method from Pet interface
    }
}
