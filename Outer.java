
public class Outer {
    private static int outerStaticField;

    // Static nested class
    static class Nested {
        void display() {
            System.out.println("Value of outerStaticField: " + outerStaticField);
        }
    }
}








public class Main {
    public static void main(String[] args) {
        // Create an instance of the Outer class
        Outer outerObj = new Outer();

        // Call the outerMethod() which instantiates and calls the display() method of Inner class
        outerObj.outerMethod();
    }
}
