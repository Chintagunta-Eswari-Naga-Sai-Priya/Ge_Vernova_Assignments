package Day8;
// src/TestMaxFinder.java
public class TestMaxFinder {
    public static void main(String[] args) {
        testIntegerMaximum();
        testFloatMaximum();
        testStringMaximum();
    }

    public static void testIntegerMaximum() {
        System.out.println("Test Case 1.1: Max at 1st Position");
        System.out.println("Max: " + MaxFinder.testMaximum(5, 3, 2)); // Max at 1st position

        System.out.println("Test Case 1.2: Max at 2nd Position");
        System.out.println("Max: " + MaxFinder.testMaximum(3, 7, 2)); // Max at 2nd position

        System.out.println("Test Case 1.3: Max at 3rd Position");
        System.out.println("Max: " + MaxFinder.testMaximum(1, 4, 9)); // Max at 3rd position
    }

    public static void testFloatMaximum() {
        System.out.println("Test Case 2.1: Max at 1st Position");
        System.out.println("Max: " + MaxFinder.testMaximum(5.5f, 3.3f, 2.2f)); // Max at 1st position

        System.out.println("Test Case 2.2: Max at 2nd Position");
        System.out.println("Max: " + MaxFinder.testMaximum(3.3f, 7.7f, 2.2f)); // Max at 2nd position

        System.out.println("Test Case 2.3: Max at 3rd Position");
        System.out.println("Max: " + MaxFinder.testMaximum(1.1f, 4.4f, 9.9f)); // Max at 3rd position
    }

    public static void testStringMaximum() {
        System.out.println("Test Case 3.1: Max at 1st Position");
        System.out.println("Max: " + MaxFinder.testMaximum("Apple", "Peach", "Banana")); // Max at 1st position

        System.out.println("Test Case 3.2: Max at 2nd Position");
        System.out.println("Max: " + MaxFinder.testMaximum("Peach", "Zebra", "Banana")); // Max at 2nd position

        System.out.println("Test Case 3.3: Max at 3rd Position");
        System.out.println("Max: " + MaxFinder.testMaximum("Grapes", "Banana", "Orange")); // Max at 3rd position
    }
}
