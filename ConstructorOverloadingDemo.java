class Student {
    private String name;
    private int age;
    private String course;

    // Default Constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.course = "Not Enrolled";
        System.out.println("Default Constructor called.");
    }

    // Parameterized Constructor with 1 parameter
    public Student(String name) {
        this.name = name;
        this.age = 0;
        this.course = "Not Enrolled";
        System.out.println("Constructor with 1 parameter called.");
    }

    // Parameterized Constructor with 2 parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = "Not Enrolled";
        System.out.println("Constructor with 2 parameters called.");
    }

    // Parameterized Constructor with 3 parameters
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Constructor with 3 parameters called.");
    }

    // Display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println();
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        // Using Default Constructor
        Student student1 = new Student();
        student1.display();

        // Using Constructor with 1 parameter
        Student student2 = new Student("Alice");
        student2.display();

        // Using Constructor with 2 parameters
        Student student3 = new Student("Bob", 21);
        student3.display();

        // Using Constructor with 3 parameters
        Student student4 = new Student("Charlie", 22, "Computer Science");
        student4.display();
    }
}
