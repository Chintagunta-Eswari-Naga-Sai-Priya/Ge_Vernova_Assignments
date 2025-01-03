package Day8;
// src/TestMaxFinder.java
public class TestMaxFinder {
    public static void main(String[] args) {
        testIntegerMaximum();
        testFloatMaximum();
        testStringMaximum();
    }

    public static void testIntegerMaximum() {
        MaxFinder<Integer> integerMaxFinder = new MaxFinder<>(5, 3, 2, 7, 8);
        System.out.println("Max: " + integerMaxFinder.testMaximum()); // Test with more than 3 integers
    }

    public static void testFloatMaximum() {
        MaxFinder<Float> floatMaxFinder = new MaxFinder<>(5.5f, 3.3f, 2.2f, 7.7f);
        System.out.println("Max: " + floatMaxFinder.testMaximum()); // Test with more than 3 floats
    }

    public static void testStringMaximum() {
        MaxFinder<String> stringMaxFinder = new MaxFinder<>("Apple", "Peach", "Banana", "Zebra");
        System.out.println("Max: " + stringMaxFinder.testMaximum()); // Test with more than 3 strings
    }
}
