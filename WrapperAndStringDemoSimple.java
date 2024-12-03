public class WrapperAndStringDemoSimple {
    public static void main(String[] args) {
        // Wrapper Class Example
        System.out.println("Wrapper Class Example:");
        Integer intObj = 52; // Auto-boxing
        int intValue = intObj; // Auto-unboxing
        System.out.println("Wrapped Integer: " + intObj);
        System.out.println("Unwrapped Integer: " + intValue);

        // String Class Example
        System.out.println("\nString Methods Example:");
        String str = "Hello, Paras!";
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Character at Index 4: " + str.charAt(4));
        System.out.println("Substring (7 to end): " + str.substring(7));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Replaced 'World' with 'Java': " + str.replace("World", "Java"));
    }
}
