package Day8;
// src/TestMaxFinder.java
public class TestMaxFinder {
    public static void main(String[] args) {
        testIntegerMaximum();
        testFloatMaximum();
        testStringMaximum();
    }

    public static void testIntegerMaximum() {
        MaxFinder<Integer> integerMaxFinder1 = new MaxFinder<>(5, 3, 2);
        System.out.println("Max: " + integerMaxFinder1.testMaximum()); // Max at 1st position

        MaxFinder<Integer> integerMaxFinder2 = new MaxFinder<>(3, 7, 2);
        System.out.println("Max: " + integerMaxFinder2.testMaximum()); // Max at 2nd position

        MaxFinder<Integer> integerMaxFinder3 = new MaxFinder<>(1, 4, 9);
        System.out.println("Max: " + integerMaxFinder3.testMaximum()); // Max at 3rd position
    }

    public static void testFloatMaximum() {
        MaxFinder<Float> floatMaxFinder1 = new MaxFinder<>(5.5f, 3.3f, 2.2f);
        System.out.println("Max: " + floatMaxFinder1.testMaximum()); // Max at 1st position

        MaxFinder<Float> floatMaxFinder2 = new MaxFinder<>(3.3f, 7.7f, 2.2f);
        System.out.println("Max: " + floatMaxFinder2.testMaximum()); // Max at 2nd position

        MaxFinder<Float> floatMaxFinder3 = new MaxFinder<>(1.1f, 4.4f, 9.9f);
        System.out.println("Max: " + floatMaxFinder3.testMaximum()); // Max at 3rd position
    }

    public static void testStringMaximum() {
        MaxFinder<String> stringMaxFinder1 = new MaxFinder<>("Apple", "Peach", "Banana");
        System.out.println("Max: " + stringMaxFinder1.testMaximum()); // Max at 1st position

        MaxFinder<String> stringMaxFinder2 = new MaxFinder<>("Peach", "Zebra", "Banana");
        System.out.println("Max: " + stringMaxFinder2.testMaximum()); // Max at 2nd position

        MaxFinder<String> stringMaxFinder3 = new MaxFinder<>("Grapes", "Banana", "Orange");
        System.out.println("Max: " + stringMaxFinder3.testMaximum()); // Max at 3rd position
    }
}
