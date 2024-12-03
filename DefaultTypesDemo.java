public class DefaultTypesDemo {
    // Fields with default values
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public static void main(String[] args) {
        DefaultTypesDemo demo = new DefaultTypesDemo();
        System.out.println("Default Values:");
        System.out.println("byte: " + demo.b);
        System.out.println("short: " + demo.s);
        System.out.println("int: " + demo.i);
        System.out.println("long: " + demo.l);
        System.out.println("float: " + demo.f);
        System.out.println("double: " + demo.d);
        System.out.println("char: '" + demo.c + "'");
        System.out.println("boolean: " + demo.bool);
    }
}
